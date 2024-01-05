package tech.blacklake.dev.openapi.sdk.token;

import tech.blacklake.dev.openapi.sdk.cache.ICache;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.exception.UnsupportedAppTypeException;

import java.util.concurrent.TimeUnit;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.APP_ACCESS_TOKEN_PREFIX;
import static tech.blacklake.dev.openapi.sdk.constants.Constants.EXPIRE_DELTA_OF_SECONDS;

public class TokenManager {

    private ICache cache;

    public TokenManager(ICache cache) {
        this.cache = cache;
    }

    private String getAppAccessTokenKey(String appID) {
        return String.format("%s-%s", APP_ACCESS_TOKEN_PREFIX, appID);
    }

    public String getAppAccessToken(Config config) throws Exception {
        // 缓存里存在则直接返回
        String token = cache.get(getAppAccessTokenKey(config.getAppKey()));
        if (!token.isEmpty()) {
            return token;
        }
        // 否则发起请求，获取token，然后缓存
        if (AppTypeEnum.SELF_BUILT == config.getAppTypeEnum()) {
            AppAccessTokenResponse appAccessTokenResponse = getInternalAppAccessToken(config);
            token = appAccessTokenResponse.getToken();
            int timeOut = appAccessTokenResponse.getExpire();
            // 缓存
            cache.set(getAppAccessTokenKey(config.getAppKey()), token, timeOut - EXPIRE_DELTA_OF_SECONDS, TimeUnit.SECONDS);
            return token;

        } else {
            throw new UnsupportedAppTypeException(config.getAppTypeEnum());
        }
    }

    private AppAccessTokenResponse getInternalAppAccessToken(Config config) {
        // TODO To be implemented
        throw new RuntimeException("Not yet implemented");
    }


}
