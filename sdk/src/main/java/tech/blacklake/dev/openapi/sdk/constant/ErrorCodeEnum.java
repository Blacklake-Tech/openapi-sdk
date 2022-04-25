package tech.blacklake.dev.openapi.sdk.constant;

/**
 * @author cuiyichen
 * @date 2022/4/23 20:31:33
 */
@SuppressWarnings("AlibabaEnumConstantsMustHaveComment")
public enum ErrorCodeEnum implements BaseEnum<ErrorCodeEnum> {
    APP_KEY_IS_NOT_NULLABLE("appKey不能为空，可以从黑湖开放平台应用页面获取appKey"),
    APP_SECRET_IS_NOT_NULLABLE("appSecret不能为空，可以从黑湖开放平台应用页面获取appKey"),
    URL_IS_NOT_NULLABLE("url不能为空"),
    URL_PARSE_FAILED("{0}解析失败，请规范url格式"),
    REQUEST_BODY_SERIALIZATION_FAILED("request body序列化失败: {0}"),
    CALL_OPENAPI_FAILED("调用黑湖Open API失败: {0}"),
    JSON_PARSE_FAILED("json解析失败: {0}"),
    RESPONSE_BODY_DESERIALIZE_FAILED("response body反序列化失败: {0}"),
    BLACK_LAKE_ERROR_MESSAGE("{0}")
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