package tech.blacklake.dev.openapi.sdk.token;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.blacklake.dev.openapi.sdk.cache.ICache;
import tech.blacklake.dev.openapi.sdk.client.OkhttpOpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.req.GetAccessTokenCO;
import tech.blacklake.dev.openapi.sdk.client.res.AppAccessTokenVO;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.exception.GetAppAccessTokenFailException;
import tech.blacklake.dev.openapi.sdk.exception.UnsupportedAppTypeException;
import tech.blacklake.infra.boot.common.data.Result;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.*;
import static tech.blacklake.infra.boot.common.util.ObjectMapperConfigure.objectMapper;

public class TokenManager {

    private ICache cache;

    private OkhttpOpenapiClient okhttpOpenapiClient;

    private Config config;

    private static final Logger logger = LoggerFactory.getLogger(TokenManager.class);

    public TokenManager(ICache cache, OkhttpOpenapiClient okhttpOpenapiClient, Config config) {
        this.cache = cache;
        this.okhttpOpenapiClient = okhttpOpenapiClient;
        this.config = config;
    }

    private String getAppAccessTokenKey(String appID) {
        return String.format("%s-%s", APP_ACCESS_TOKEN_PREFIX, appID);
    }

    public String getAppAccessToken() {
        // 缓存里存在则直接返回
        String token = cache.get(getAppAccessTokenKey(config.getAppKey()));
        if (!token.isEmpty()) {
            return token;
        }
        // 否则发起请求，获取token，然后缓存
        if (AppTypeEnum.SELF_BUILT == config.getAppTypeEnum()) {
            AppAccessTokenVO internalAppAccessToken = this.getInternalAppAccessToken();
            token = internalAppAccessToken.getAppAccessToken();
            Long timeOut = internalAppAccessToken.getExpire();
            // 缓存
            cache.set(
                    getAppAccessTokenKey(config.getAppKey()),
                    token,
                    (int) (timeOut - EXPIRE_DELTA_OF_SECONDS),
                    TimeUnit.SECONDS);
            return token;
        } else {
            throw new UnsupportedAppTypeException(config.getAppTypeEnum());
        }
    }

    private AppAccessTokenVO getInternalAppAccessToken() {
        GetAccessTokenCO getAccessTokenCO = new GetAccessTokenCO();
        getAccessTokenCO.setAppKey(config.getAppKey());
        getAccessTokenCO.setAppSecret(config.getAppSecret());
        try {
            Result<AppAccessTokenVO> result = okhttpOpenapiClient.getAccessToken(getAccessTokenCO);
            if (result.getCode() == SUCCESS_RESULT_CODE) {
                return result.getData();
            }
            logger.error("get access token fails with result {}", objectMapper.writeValueAsString(result));
            throw new GetAppAccessTokenFailException(result.getSubCode());
        } catch (IOException e) {
            logger.error("get access token fails with exception: ", e);
            throw new GetAppAccessTokenFailException(e.getMessage());
        }
    }
}
