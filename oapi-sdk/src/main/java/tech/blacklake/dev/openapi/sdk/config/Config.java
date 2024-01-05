package tech.blacklake.dev.openapi.sdk.config;

import tech.blacklake.dev.openapi.sdk.cache.ICache;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;

public class Config {
    private ICache cache;
    private String baseUrl;
    private AppTypeEnum appTypeEnum;
    private String appKey;
    private String appSecret;
    private boolean logReqAtDebug;

    public ICache getCache() {
        return cache;
    }

    public void setCache(ICache cache) {
        this.cache = cache;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public AppTypeEnum getAppTypeEnum() {
        return appTypeEnum;
    }

    public void setAppTypeEnum(AppTypeEnum appTypeEnum) {
        this.appTypeEnum = appTypeEnum;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public boolean isLogReqAtDebug() {
        return logReqAtDebug;
    }

    public void setLogReqAtDebug(boolean logReqAtDebug) {
        this.logReqAtDebug = logReqAtDebug;
    }
}
