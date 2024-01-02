package tech.blacklake.dev.openapi.sdk.token;

import tech.blacklake.dev.openapi.sdk.cache.ICache;

public class TokenManager {

    private ICache cache;

    public TokenManager(ICache cache) {
        this.cache = cache;
    }

}
