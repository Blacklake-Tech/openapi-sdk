package tech.blacklake.dev.openapi.sdk.client;

import com.fasterxml.jackson.annotation.JsonInclude;
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

    private static final String ACCESS_TOKEN = "access_token";

    private static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

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
    }

    /**
     * 同步调用
     *
     * @param request     request
     * @param accessToken access token
     * @param <T>         request body类型
     * @param <U>         response body类型
     */
    public <T, U> BlackLakeResult<U> syncInvoke(BlackLakeRequest<T, U> request, String accessToken) {
        String url = handleUrl(request.getUrl());
        byte[] responseBodyBytes = doPost(request.getRequestBody(), url, accessToken);

        U responseBody;
        try {
            responseBody = OBJECT_MAPPER.readValue(responseBodyBytes, new TypeReference<U>() {
            });
        } catch (Exception e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.RESPONSE_BODY_SERIALIZATION_FAILED);
        }
        return new BlackLakeResult<>(responseBody);
    }

    /**
     * 异步调用
     *
     * @param request     request
     * @param accessToken access token
     * @param <T>         request body类型
     * @param <U>         response body类型
     */
    public <T, U> Future<U> asyncInvoke(BlackLakeRequest<T, U> request, String accessToken) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * 获取access_token
     */
    public String getAccessToken() {
        byte[] responseBody = doPost(
                new RefreshTokenDTO(appKey, appSecret, factoryNumber),
                UrlEnum.REFRESH_ACCESS_TOKEN.getMessage(),
                null
        );

        String accessToken;
        try {
            accessToken = OBJECT_MAPPER.readValue(responseBody, String.class);
        } catch (Exception e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.JSON_PARSE_FAILED);
        }
        return accessToken;
    }

    private <T> byte[] doPost(T requestBody, String url, String accessToken) {
        HttpUrl oriHttpUrl = HttpUrl.parse(url);
        Preconditions.checkNotNull(oriHttpUrl, ErrorCodeEnum.URL_PARSE_FAILED, url);
        HttpUrl httpUrl = oriHttpUrl.newBuilder()
                .addQueryParameter(ACCESS_TOKEN, accessToken)
                .build();

        byte[] responseBodyBytes;
        try {
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .post(RequestBody.create(MEDIA_TYPE_JSON, OBJECT_MAPPER.writeValueAsBytes(requestBody)))
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful() || null == response.body()) {
                throw new BlackLakeHttpClientException(ErrorCodeEnum.CALL_OPENAPI_FAILED, response.code() + " " + response.message());
            }
            responseBodyBytes = response.body().bytes();

        } catch (JsonProcessingException e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.REQUEST_BODY_SERIALIZATION_FAILED);
        } catch (IOException e) {
            throw new BlackLakeHttpClientException(ErrorCodeEnum.CALL_OPENAPI_FAILED, e.getMessage());
        }
        return responseBodyBytes;
    }

    private static byte[] handleAccessTokenExpired() {
        //TODO
        return null;
    }

    @SuppressWarnings("AlibabaPojoMustOverrideToString")
    private static class RefreshTokenDTO {
        String appKey;
        String appSecret;
        String factoryNumber;

        public RefreshTokenDTO(String appKey, String appSecret, String factoryNumber) {
            this.appKey = appKey;
            this.appSecret = appSecret;
            this.factoryNumber = factoryNumber;
        }
    }

    private static String handleUrl(String url) {
        // TODO
        return url;
    }
}
