package tech.blacklake.dev.openapi.sdk.constants.enums;

public enum BaseUrlEnum {
    // TODO: 替换成真实url，且增加其他环境url枚举
    BLACKLAKE_OPENAPI_ALI_PROD("ali_prod_to_be_filled"),
    BLACKLAKE_OPENAPI_HW_PROD("hw_prod_to_be_filled"),
    ;

    private String url;

    BaseUrlEnum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
