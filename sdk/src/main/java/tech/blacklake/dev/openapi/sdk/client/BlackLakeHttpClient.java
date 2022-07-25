package tech.blacklake.dev.openapi.sdk.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import tech.blacklake.dev.openapi.sdk.annotation.ApiPath;
import tech.blacklake.dev.openapi.sdk.api.TemplateController;
import tech.blacklake.dev.openapi.sdk.api.common.Result;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;
import tech.blacklake.dev.openapi.sdk.client.factory.OkHttpClientFactory;
import tech.blacklake.dev.openapi.sdk.constant.ErrorCodeEnum;
import tech.blacklake.dev.openapi.sdk.constant.UrlEnum;
import tech.blacklake.dev.openapi.sdk.exception.BlackLakeException;
import tech.blacklake.dev.openapi.sdk.util.Preconditions;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:40:54
 */
public class BlackLakeHttpClient extends TemplateController {
    private final OkHttpClient okHttpClient;
    private final RefreshTokenRequestDTO refreshTokenRequestDTO;
    private String token;

    /**
     * 网关地追
     */
    private final String endpoint;

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

    private final static String EMPTY_JSON = "{}";

    /**
     * 获取BlackLakeHttpClient代理对象
     */
    public static BlackLakeHttpClient getBlackLakeHttpClient(String appKey, String appSecret, String factoryNumber, String endpoint) {
        return getBlackLakeHttpClient(appKey, appSecret, factoryNumber, endpoint, null);
    }

    /**
     * 获取BlackLakeHttpClient代理对象
     */
    public static BlackLakeHttpClient getBlackLakeHttpClient(String appKey, String appSecret, String factoryNumber, String endpoint, BlackLakeHttpClientConfig blackLakeHttpClientConfig) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BlackLakeHttpClient.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // 如果是TemplateController接口定义的方法, 则发起openapi调用
                if (method.getDeclaringClass() == TemplateController.class) {
                    BlackLakeHttpClient blackLakeHttpClient = (BlackLakeHttpClient) o;
                    // 获取token
                    if (blackLakeHttpClient.token == null) {
                        blackLakeHttpClient.refreshToken();
                    }

                    // 获取请求地址
                    String url = method.getAnnotation(ApiPath.class).value();
                    url = blackLakeHttpClient.handleUrl(url);

                    try {
                        byte[] bytes = blackLakeHttpClient.doSyncInvoke(objects[0], url);
                        Result<?> result = (Result<?>) OBJECT_MAPPER.readValue(bytes, method.getReturnType());
                        // 当token过期时，自动刷新token并重新请求
                        if (blackLakeHttpClient.handleResult(result)) {
                            blackLakeHttpClient.refreshToken();
                            bytes = blackLakeHttpClient.doSyncInvoke(objects[0], url);
                            result = (Result<?>) OBJECT_MAPPER.readValue(bytes, method.getReturnType());
                            blackLakeHttpClient.handleResult(result);
                        }
                        return result;

                    } catch (IOException e) {
                        throw new BlackLakeException(ErrorCodeEnum.RESPONSE_BODY_DESERIALIZE_FAILED,
                                e.getMessage());
                    }
                } else {
                    return methodProxy.invokeSuper(o, objects);
                }
            }
        });

        Class<?>[] argumentTypes = {String.class, String.class, String.class, String.class, BlackLakeHttpClientConfig.class};
        Object[] arguments = {appKey, appSecret, factoryNumber, endpoint, blackLakeHttpClientConfig};
        return (BlackLakeHttpClient) enhancer.create(argumentTypes, arguments);
    }

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber, String endpoint, BlackLakeHttpClientConfig blackLakeHttpClientConfig) {
        Preconditions.checkNotNull(appKey, ErrorCodeEnum.APP_KEY_IS_NOT_NULLABLE);
        Preconditions.checkNotNull(appSecret, ErrorCodeEnum.APP_SECRET_IS_NOT_NULLABLE);
        Preconditions.checkNotNull(factoryNumber, ErrorCodeEnum.FACTORY_NUMBER_IS_NOT_NULLABLE);
        Preconditions.checkNotNull(factoryNumber, ErrorCodeEnum.CLIENT_ENDPOINT_NULL);

        refreshTokenRequestDTO = new RefreshTokenRequestDTO(appKey, appSecret, factoryNumber);
        okHttpClient = OkHttpClientFactory.getHttpClient(blackLakeHttpClientConfig);
        this.endpoint = endpoint;
    }

    /**
     * okhttp发起一次同步post请求
     */
    public <T> byte[] doSyncInvoke(T requestBody, String url) {
        // url添加access_token参数
        HttpUrl oriHttpUrl = HttpUrl.parse(url);
        Preconditions.checkNotNull(oriHttpUrl, ErrorCodeEnum.URL_PARSE_FAILED, url);
        HttpUrl.Builder httpUrlBuilder = oriHttpUrl.newBuilder();
        if (token != null) {
            httpUrlBuilder.addQueryParameter(ACCESS_TOKEN, token);
        }
        HttpUrl httpUrl = httpUrlBuilder.build();

        // 发起post请求
        byte[] responseBodyBytes;
        try {
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .post(RequestBody.create(MEDIA_TYPE_JSON, requestBody == null ? EMPTY_JSON : OBJECT_MAPPER.writeValueAsString(requestBody)))
                    .build();

            Response response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful() || null == response.body()) {
                throw new BlackLakeException(ErrorCodeEnum.CALL_OPENAPI_FAILED, response.code());
            }
            responseBodyBytes = response.body().bytes();

        } catch (JsonProcessingException e) {
            throw new BlackLakeException(ErrorCodeEnum.REQUEST_BODY_SERIALIZATION_FAILED, e.getMessage());
        } catch (IOException e) {
            throw new BlackLakeException(ErrorCodeEnum.CALL_OPENAPI_FAILED, e.getMessage());
        }

        return responseBodyBytes;
    }

    /**
     * url预处理
     */
    private String handleUrl(String url) {
        Preconditions.checkNotNull(url, ErrorCodeEnum.URL_IS_NOT_NULLABLE);
        return this.endpoint + UrlEnum.OPENAPI_PATH.getMessage() + url;
    }

    /**
     * 处理黑湖自定义错误信息
     *
     * @param result open api返回结果
     * @return 请求成功时，返回false；请求失败时，如果是token过期异常，返回true，否则抛出异常
     */
    private boolean handleResult(Result<?> result) {
        if (result.getCode() != BLACK_LAKE_CODE_OK) {
            if (TOKEN_EXPIRED_SUBCODE.equals(result.getSubCode())) {
                return true;
            } else {
                throw new BlackLakeException(ErrorCodeEnum.BLACK_LAKE_ERROR_MESSAGE, result.getSubCode(), result.getMessage());
            }
        }
        return false;
    }

    /**
     * 刷新token
     */
    private void refreshToken() {
        byte[] bytes = this.doSyncInvoke(refreshTokenRequestDTO, this.endpoint + UrlEnum.REFRESH_ACCESS_TOKEN.getMessage());
        Result<RefreshTokenResponseDTO> result;
        try {
            result = OBJECT_MAPPER.readValue(bytes, new TypeReference<Result<RefreshTokenResponseDTO>>() {
            });
        } catch (IOException e) {
            throw new BlackLakeException(ErrorCodeEnum.RESPONSE_BODY_DESERIALIZE_FAILED,
                    e.getMessage());
        }
        this.handleResult(result);
        this.token = result.getData().token;
    }

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

    private static class RefreshTokenResponseDTO {
        @JsonProperty("token")
        String token;
    }
}
