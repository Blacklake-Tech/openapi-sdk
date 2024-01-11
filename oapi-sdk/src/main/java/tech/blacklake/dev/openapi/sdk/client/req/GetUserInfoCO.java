package tech.blacklake.dev.openapi.sdk.client.req;

public class GetUserInfoCO {

    private String grantType = "authorization_code";

    private String code;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
