package tech.blacklake.dev.openapi.sdk.token;

import tech.blacklake.dev.openapi.sdk.cache.ICache;
import tech.blacklake.dev.openapi.sdk.client.OpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.req.GetAccessTokenCO;
import tech.blacklake.dev.openapi.sdk.client.res.AppAccessTokenVO;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.exception.UnsupportedAppTypeException;

import java.util.concurrent.TimeUnit;
import tech.blacklake.infra.boot.common.data.Result;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.APP_ACCESS_TOKEN_PREFIX;
import static tech.blacklake.dev.openapi.sdk.constants.Constants.EXPIRE_DELTA_OF_SECONDS;

public class TokenManager {

    private ICache cache;

    private OpenapiClient openapiClient;

    public TokenManager(ICache cache, OpenapiClient openapiClient) {
        this.cache = cache;
        this.openapiClient = openapiClient;
    }

    private String getAppAccessTokenKey(String appID) {
        return String.format("%s-%s", APP_ACCESS_TOKEN_PREFIX, appID);
    }

    public String getAppAccessToken(Config config) {
        // 缓存里存在则直接返回
        String token = cache.get(getAppAccessTokenKey(config.getAppKey()));
        if (!token.isEmpty()) {
            return token;
        }
        // 否则发起请求，获取token，然后缓存
        if (AppTypeEnum.SELF_BUILT == config.getAppTypeEnum()) {
            AppAccessTokenVO internalAppAccessToken = this.getInternalAppAccessToken(config);
            token = internalAppAccessToken.getAppAccessToken();
            Long timeOut = internalAppAccessToken.getExpire();
            // 缓存
            cache.set(getAppAccessTokenKey(config.getAppKey()), token, (int)(timeOut - EXPIRE_DELTA_OF_SECONDS), TimeUnit.SECONDS);
            return token;
        } else {
            throw new UnsupportedAppTypeException(config.getAppTypeEnum());
        }
    }

    private AppAccessTokenVO getInternalAppAccessToken(Config config) {
        GetAccessTokenCO getAccessTokenCO = new GetAccessTokenCO();
        getAccessTokenCO.setAppKey(config.getAppKey());
        getAccessTokenCO.setAppSecret(config.getAppSecret());
        return openapiClient.getAccessToken(getAccessTokenCO).getData();
    }
}
