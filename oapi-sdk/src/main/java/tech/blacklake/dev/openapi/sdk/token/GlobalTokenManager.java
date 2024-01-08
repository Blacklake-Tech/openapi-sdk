package tech.blacklake.dev.openapi.sdk.token;

import tech.blacklake.dev.openapi.sdk.cache.LocalCache;

public class GlobalTokenManager {

    private static volatile TokenManager globalTokenManager = new TokenManager(LocalCache.getInstance());

    public static TokenManager getTokenManager() {
        return globalTokenManager;
    }

    public static void setTokenManager(TokenManager tokenManager) {
        globalTokenManager = tokenManager;
    }

}
