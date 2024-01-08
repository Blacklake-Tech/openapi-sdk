package tech.blacklake.dev.openapi.sdk;

import tech.blacklake.dev.openapi.sdk.cache.ICache;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.constants.enums.BaseUrlEnum;
import tech.blacklake.dev.openapi.sdk.token.GlobalTokenManager;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;

public class Client {
    private Config config;
    // TODO: add services

    public static Builder newBuilder(String appKey, String appSecret) {
        return new Builder(appKey, appSecret);
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public static final class Builder {
        private Config config = new Config();
        public Builder(String appKey, String appSecret) {
            config.setAppKey(appKey);
            config.setAppSecret(appSecret);
            config.setAppTypeEnum(AppTypeEnum.SELF_BUILT);
            config.setBaseUrl(BaseUrlEnum.BLACKLAKE_OPENAPI_ALI_PROD.getUrl());
            config.setLogReqAtDebug(false);
        }

        public Builder appType(AppTypeEnum appTypeEnum) {
            config.setAppTypeEnum(appTypeEnum);
            return this;
        }

        public Builder openBaseUrl(String baseUrl) {
            config.setBaseUrl(baseUrl);
            return this;
        }

        public Builder openBaseUrl(BaseUrlEnum baseUrl) {
            config.setBaseUrl(baseUrl.getUrl());
            return this;
        }

        public Builder logReqAtDebug(boolean logReqRespInfoAtDebugLevel) {
            config.setLogReqAtDebug(logReqRespInfoAtDebugLevel);
            return this;
        }

        public Builder tokenCache(ICache cache) {
            config.setCache(cache);
            return this;
        }

        private void initCache(Config config) {
            if (config.getCache() != null) {
                GlobalTokenManager.setTokenManager(new TokenManager(config.getCache()));
            }
        }

        public Client build() {
            Client client = new Client();
            client.setConfig(config);
            initCache(config);
            // TODO: add services to client fields
            return client;
        }
    }
}
