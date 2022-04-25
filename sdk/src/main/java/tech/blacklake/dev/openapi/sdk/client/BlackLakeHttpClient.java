package tech.blacklake.dev.openapi.sdk.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import okhttp3.*;
import tech.blacklake.dev.openapi.sdk.client.factory.OkHttpClientFactory;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;
import tech.blacklake.dev.openapi.sdk.client.data.BlackLakeRequest;
import tech.blacklake.dev.openapi.sdk.client.data.BlackLakeResult;
import tech.blacklake.dev.openapi.sdk.constant.ErrorCodeEnum;
import tech.blacklake.dev.openapi.sdk.constant.UrlEnum;
import tech.blacklake.dev.openapi.sdk.exception.BlackLakeHttpClientException;
import tech.blacklake.dev.openapi.sdk.util.Preconditions;

import java.io.IOException;
import java.util.concurrent.Future;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:40:54
 */
public class BlackLakeHttpClient {
    private final OkHttpClient okHttpClient;
    private final String appKey;
    private final String appSecret;
    private final String factoryNumber;
    private String token;

    private static final String ACCESS_TOKEN = "access_token";

    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    private final static int BLACK_LAKE_CODE_OK = 200;

    private final static String TOKEN_EXPIRED_SUBCODE = "SSO_TOKEN_FAIL";

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber) {
        this(appKey, appSecret, factoryNumber, null);
    }

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber, BlackLakeHttpClientConfig blackLakeHttpClientConfig) {
        Preconditions.checkNotNull(appKey, ErrorCodeEnum.APP_KEY_IS_NOT_NULLABLE);
        Preconditions.checkNotNull(appSecret, ErrorCodeEnum.APP_SECRET_IS_NOT_NULLABLE);

        this.appKey = appKey;
        this.appSecret = appSecret;
        this.factoryNumber = factoryNumber;
        okHttpClient = OkHttpClientFactory.getHttpClient(blackLakeHttpClientConfig);
        manualRefreshToken();
    }

    /**
     * 同步调用
     *
     * @param request request
     * @param <T>     request body类型
     * @param <U>     response body类型
     */
    public <T, U> BlackLakeResult<U> syncInvoke(BlackLakeRequest<T, U> request) {
        return doSyncInvoke(request, true);
    }

    /**
     * 异步调用
     *
     * @param request request
     * @param <T>     request body类型
     * @param <U>     response body类型
     */
    public <T, U> Future<U> asyncInvoke(BlackLakeRequest<T, U> request) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * 刷新token
     */
    public String manualRefreshToken() {
        BlackLakeRequest<RefreshTokenRequestDTO, RefreshTokenResponseDTO> request = new BlackLakeRequest<>(UrlEnum.REFRESH_ACCESS_TOKEN.getMessage(), new RefreshTokenRequestDTO(appKey, appSecret, factoryNumber));
        BlackLakeResult<RefreshTokenResponseDTO> result = syncInvoke(request);
        this.token = result.getData().token;
        return token;
    }

    private <T, U> BlackLakeResult<U> doSyncInvoke(BlackLakeRequest<T, U> request, boolean autoRefreshToken) {
        String url = handleUrl(request.getUrl());
        byte[] responseBodyBytes = doPost(request.getRequestBody(), url);

        BlackLakeResult<U> result;
        try {
            // TODO 反序列化有点问题，会反序列化成LinkedHashMap，泛型U没接到
            result = OBJECT_MAPPER.readValue(responseBodyBytes, new TypeReference<BlackLakeResult<U>>() {
            });
        } catch (IOException e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.RESPONSE_BODY_DESERIALIZE_FAILED, e.getMessage());
        }

        // 黑湖自定义错误信息处理
        if (result.getCode() != BLACK_LAKE_CODE_OK) {
            if (TOKEN_EXPIRED_SUBCODE.equals(result.getSubCode()) && autoRefreshToken) {
                // 刷新token并重新调用open api
                token = manualRefreshToken();
                // 只尝试刷新一次token，避免死循环
                return doSyncInvoke(request, false);
            } else {
                throw new BlackLakeHttpClientException(ErrorCodeEnum.BLACK_LAKE_ERROR_MESSAGE, result.getMessage());
            }
        }

        return result;
    }

    private <T> byte[] doPost(T requestBody, String url) {
        HttpUrl oriHttpUrl = HttpUrl.parse(url);
        Preconditions.checkNotNull(oriHttpUrl, ErrorCodeEnum.URL_PARSE_FAILED, url);
        HttpUrl.Builder httpUrlBuilder = oriHttpUrl.newBuilder();
        if (token != null) {
            httpUrlBuilder.addQueryParameter(ACCESS_TOKEN, token);
        }
        HttpUrl httpUrl = httpUrlBuilder.build();

        byte[] responseBodyBytes;
        try {
            String str = OBJECT_MAPPER.writeValueAsString(requestBody);
            System.out.println(str);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .post(RequestBody.create(MEDIA_TYPE_JSON, OBJECT_MAPPER.writeValueAsString(requestBody)))
                    .build();

            Response response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful() || null == response.body()) {
                throw new BlackLakeHttpClientException(ErrorCodeEnum.CALL_OPENAPI_FAILED, response.code());
            }
            responseBodyBytes = response.body().bytes();

        } catch (JsonProcessingException e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.REQUEST_BODY_SERIALIZATION_FAILED, e.getMessage());
        } catch (IOException e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.CALL_OPENAPI_FAILED, e.getMessage());
        }
        return responseBodyBytes;
    }

    @SuppressWarnings("AlibabaPojoMustOverrideToString")
    private static class RefreshTokenRequestDTO {
        @JsonProperty("appKey")
        String appKey;
        @JsonProperty("appSecret")
        String appSecret;
        @JsonProperty("factoryNumber")
        String factoryNumber;

        public RefreshTokenRequestDTO(String appKey, String appSecret, String factoryNumber) {
            this.appKey = appKey;
            this.appSecret = appSecret;
            this.factoryNumber = factoryNumber;
        }
    }

    @SuppressWarnings("AlibabaPojoMustOverrideToString")
    private static class RefreshTokenResponseDTO {
        @JsonProperty("token")
        String token;
    }

    private static String handleUrl(String url) {
        // TODO hrl的预处理、判断等
        return url;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
