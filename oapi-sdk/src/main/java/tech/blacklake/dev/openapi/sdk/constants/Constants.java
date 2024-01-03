package tech.blacklake.dev.openapi.sdk.constants;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Constants {
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String JSON_CONTENT_TYPE = APPLICATION_JSON + "; charset=utf-8";
    public static final String DEFAULT_REQUEST_ID = "unknown";
    public static final int SUCCESS_HTTP_CODE = 200;
    public static final int INTERNAL_ERROR_HTTP_CODE = 500;
    public static final Charset SYSTEM_CHARSET = StandardCharsets.UTF_8;
}
