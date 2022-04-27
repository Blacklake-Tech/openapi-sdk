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
    private final RefreshTokenRequestDTO refreshTokenRequestDTO;
    private String token;

    private static final String ACCESS_TOKEN = "access_token";

    private static final String TOKEN_KEY = "token";

    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    private final static int BLACK_LAKE_CODE_OK = 200;

    private final static String TOKEN_EXPIRED_SUBCODE = "SSO_TOKEN_FAIL";

    private final static String EMPTY_JSON = "{}";

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber) {
        this(appKey, appSecret, factoryNumber, null);
    }

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber, BlackLakeHttpClientConfig blackLakeHttpClientConfig) {
        Preconditions.checkNotNull(appKey, ErrorCodeEnum.APP_KEY_IS_NOT_NULLABLE);
        Preconditions.checkNotNull(appSecret, ErrorCodeEnum.APP_SECRET_IS_NOT_NULLABLE);
        Preconditions.checkNotNull(factoryNumber, ErrorCodeEnum.FACTORY_NUMBER_IS_NOT_NULLABLE);

        refreshTokenRequestDTO = new RefreshTokenRequestDTO(appKey, appSecret, factoryNumber);
        okHttpClient = OkHttpClientFactory.getHttpClient(blackLakeHttpClientConfig);
    }

    /**
     * 同步调用
     */
    public BlackLakeResult syncInvoke(String url) {
        return syncInvoke(url, null);
    }

    /**
     * 同步调用
     */
    public BlackLakeResult syncInvoke(String url, Object requestBody) {
        // 1. 检查url
        url = handleUrl(url);

        // 2. 检查token
        if (token == null) {
            refreshToken();
        }

        // 3. 请求
        BlackLakeResult result = doSyncInvoke(url, requestBody);

        // 3. 判断是否需要刷新token
        boolean needRefreshToken = handleResult(result);
        if (needRefreshToken) {
            refreshToken();
            result = doSyncInvoke(url, requestBody);
            handleResult(result);
        }

        return result;
    }

    /**
     * 异步调用
     */
    public Future<BlackLakeResult> asyncInvoke(String url, Object requestBody) {
        // TODO
        throw new UnsupportedOperationException();
    }

    private BlackLakeResult doSyncInvoke(String url, Object requestBody) {
        byte[] responseBodyBytes = post(url, requestBody);

        BlackLakeResult result;
        try {
            result = OBJECT_MAPPER.readValue(responseBodyBytes, new TypeReference<BlackLakeResult>() {
            });
        } catch (IOException e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.RESPONSE_BODY_DESERIALIZE_FAILED, e.getMessage());
        }
        return result;
    }

    /**
     * okhttp client发起post请求
     */
    private byte[] post(String url, Object requestBody) {
        HttpUrl oriHttpUrl = HttpUrl.parse(url);
        Preconditions.checkNotNull(oriHttpUrl, ErrorCodeEnum.URL_PARSE_FAILED, url);
        HttpUrl.Builder httpUrlBuilder = oriHttpUrl.newBuilder();
        if (token != null) {
            httpUrlBuilder.addQueryParameter(ACCESS_TOKEN, token);
        }
        HttpUrl httpUrl = httpUrlBuilder.build();

        byte[] responseBodyBytes;
        try {
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .post(RequestBody.create(MEDIA_TYPE_JSON, requestBody == null ? EMPTY_JSON : OBJECT_MAPPER.writeValueAsString(requestBody)))
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

    private static String handleUrl(String url) {
        Preconditions.checkNotNull(url, ErrorCodeEnum.URL_IS_NOT_NULLABLE);
        // TODO hrl的预处理、判断等
        return url;
    }

    /**
     * 处理黑湖自定义错误信息
     *
     * @param result open api返回结果
     * @return needRefreshToken
     */
    private boolean handleResult(BlackLakeResult result) {
        if (result.getCode() != BLACK_LAKE_CODE_OK) {
            if (TOKEN_EXPIRED_SUBCODE.equals(result.getSubCode())) {
                return true;
            } else {
                throw new BlackLakeHttpClientException(ErrorCodeEnum.BLACK_LAKE_ERROR_MESSAGE, result.getMessage());
            }
        }
        return false;
    }

    /**
     * 刷新token
     */
    private void refreshToken() {
        BlackLakeResult result = doSyncInvoke(UrlEnum.REFRESH_ACCESS_TOKEN.getMessage(), refreshTokenRequestDTO);
        handleResult(result);
        this.token = (String) (result.getData().get(TOKEN_KEY));
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

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public String getToken() {
        return token;
    }
}
