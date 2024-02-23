package tech.blacklake.dev.openapi.sdk.api.common;

public class BizConstantDisplay {
    /**
     * 枚举 code
     */
    private Integer code;

    /**
     * 枚举 message
     */
    private String message;

    public BizConstantDisplay() {}

    public BizConstantDisplay(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
