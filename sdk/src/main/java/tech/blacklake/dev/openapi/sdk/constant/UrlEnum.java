package tech.blacklake.dev.openapi.sdk.constant;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:59:00
 */
public enum UrlEnum implements BaseEnum<UrlEnum> {
    OPENAPI_HOST("/api/openapi/domain/web/v1/route"),

    REFRESH_ACCESS_TOKEN("/api/openapi/domain/web/v1/system/_refreshToken");

    UrlEnum(String message) {
        this.message = message;
    }

    @Override
    public UrlEnum get() {
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
