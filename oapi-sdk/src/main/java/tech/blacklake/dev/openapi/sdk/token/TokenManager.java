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
import static tech.blacklake.infra.boot.common.util.ObjectMapperConfigure.objectMapper;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import tech.blacklake.infra.boot.common.data.Result;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.*;

public class TokenManager {

    private ICache cache;

    private OkhttpOpenapiClient okhttpOpenapiClient;

    private static final Logger logger = LoggerFactory.getLogger(TokenManager.class);

    public TokenManager(ICache cache, OkhttpOpenapiClient okhttpOpenapiClient) {
        this.cache = cache;
        this.okhttpOpenapiClient = okhttpOpenapiClient;
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
