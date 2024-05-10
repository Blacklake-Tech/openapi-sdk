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

    public static final int LOCAL_CACHE_INITIAL_CAPACITY = 64;

    public static final int EXPIRE_DELTA_OF_SECONDS = 180;

    public static final String APP_ACCESS_TOKEN_PREFIX = "app_access_token";

    public static final String ROUTE_URL = "/api/openapi/domain/web/v1/route";

    public static final String HOLYFILE_PREFIX = "/holyfile";
    public static final String ORDER_PREFIX = "/order";
    public static final String SUPPLY_CHAIN_PREFIX = "/supplychain";

    public static final String INVENTORY_PREFIX = "/inventory";

    public static final String QUALITY_PREFIX = "/quality";

    public static final String MATERIAL_PREFIX = "/material";

    public static final String MED_PREFIX = "/med";

    public static final String MFG_PREFIX = "/mfg";

    public static final String SOP_PREFIX = "/sop";

    public static final String PLO_PREFIX = "/plo";

    public static final String RESOURCE_PREFIX = "/resource";

    public static final String LOG_PREFIX = "/log";

    public static final String METADATA_PREFIX = "/metadata";

    public static final String EREPORT_PREFIX = "/e-report";

    public static final String REPORT_PREFIX = "/report";

    public static final String USER_PREFIX = "/user";

    public static final long OK_HTTP_TIMEOUT_SECONDS = 30L;

    public static final int SUCCESS_RESULT_CODE = 200;
}
