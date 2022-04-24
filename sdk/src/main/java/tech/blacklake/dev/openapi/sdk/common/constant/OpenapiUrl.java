package tech.blacklake.dev.openapi.sdk.common.constant;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:59:00
 */
public enum OpenapiUrl implements BaseEnum<OpenapiUrl> {
    ;

    OpenapiUrl(String message) {
        this.message = message;
    }

    @Override
    public OpenapiUrl get() {
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
