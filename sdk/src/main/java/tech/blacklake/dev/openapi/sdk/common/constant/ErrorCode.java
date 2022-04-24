package tech.blacklake.dev.openapi.sdk.common.constant;

/**
 * @author cuiyichen
 * @date 2022/4/23 20:31:33
 */
public enum ErrorCode implements BaseEnum<ErrorCode> {
    ;

    ErrorCode(String message) {
        this.message = message;
    }

    @Override
    public ErrorCode get() {
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
