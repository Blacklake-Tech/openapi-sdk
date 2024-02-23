package tech.blacklake.dev.openapi.sdk.client.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;

public class ClientReqInterceptor implements RequestInterceptor {

    public TokenManager tokenManager;

    public Config config;

    public ClientReqInterceptor(TokenManager tokenManager, Config config) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    @Override
    public void apply(RequestTemplate template) {
        if (template.url().endsWith("_get_access_token")) {
            return;
        }
        template.query("access_token", tokenManager.getAppAccessToken());
    }
}
