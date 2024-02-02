package tech.blacklake.dev.openapi.sdk.client.res;

public class AppAccessTokenVO {
    private String appAccessToken;

    private Long expire;

    public String getAppAccessToken() {
        return appAccessToken;
    }

    public void setAppAccessToken(String appAccessToken) {
        this.appAccessToken = appAccessToken;
    }

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }
}
