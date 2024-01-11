package tech.blacklake.dev.openapi.sdk.client;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.blacklake.dev.openapi.sdk.client.req.GetAccessTokenCO;
import tech.blacklake.dev.openapi.sdk.client.req.GetUserInfoCO;
import tech.blacklake.dev.openapi.sdk.client.req.GetUserTokenCO;
import tech.blacklake.dev.openapi.sdk.client.res.AppAccessTokenVO;
import tech.blacklake.dev.openapi.sdk.client.res.UserInfoVO;
import tech.blacklake.dev.openapi.sdk.client.res.UserTokenVO;
import tech.blacklake.infra.boot.common.data.Result;

@RequestMapping("/api/openapi/domain/web/v1/access_token")
public interface OpenapiClient {

    @PostMapping("/_get_access_token")
    Result<AppAccessTokenVO> getAccessToken(@RequestBody GetAccessTokenCO co);

    @PostMapping("/_get_user_token")
    Result<UserTokenVO> getUserToken(@RequestBody GetUserTokenCO co);

    @PostMapping("/_get_user_info")
    Result<UserInfoVO> getUserInfo(@RequestBody GetUserInfoCO co);
}
