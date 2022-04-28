package tech.blacklake.dev.openapi.sdk.constant;

/**
 * @author cuiyichen
 * @date 2022/4/23 20:31:33
 */
public enum ErrorCodeEnum implements BaseEnum<ErrorCodeEnum> {
    APP_KEY_IS_NOT_NULLABLE("appKey不能为空，可以从黑湖开放平台应用页面获取appKey"),
    APP_SECRET_IS_NOT_NULLABLE("appSecret不能为空，可以从黑湖开放平台应用页面获取appKey"),
    FACTORY_NUMBER_IS_NOT_NULLABLE("工厂号不能为空"),
    URL_IS_NOT_NULLABLE("url不能为空"),
    URL_PARSE_FAILED("{0}解析失败，请规范url格式"),
    REQUEST_BODY_SERIALIZATION_FAILED("request body序列化失败: {0}"),
    CALL_OPENAPI_FAILED("调用黑湖Open API失败: {0}"),
    RESPONSE_BODY_DESERIALIZE_FAILED("response body反序列化失败: {0}"),
    BLACK_LAKE_ERROR_MESSAGE("{0}"),
    CLIENT_ENDPOINT_NULL("客户端endpoint不能为空"),
    ;


    ErrorCodeEnum(String message) {
        this.message = message;
    }

    @Override
    public ErrorCodeEnum get() {
        return this;
    }

    @Override
    public String getName() {
        return this.name();
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private final String message;
}
