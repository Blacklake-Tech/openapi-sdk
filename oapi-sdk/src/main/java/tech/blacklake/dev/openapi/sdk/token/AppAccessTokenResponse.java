package tech.blacklake.dev.openapi.sdk.token;

public class AppAccessTokenResponse {
    private String token;

    private int expire;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }
}
