package tech.blacklake.dev.openapi.sdk.client;

import com.fasterxml.jackson.core.type.TypeReference;
import okhttp3.*;
import tech.blacklake.dev.openapi.sdk.client.req.GetAccessTokenCO;
import tech.blacklake.dev.openapi.sdk.client.res.AppAccessTokenVO;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.infra.boot.common.data.Result;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.OK_HTTP_TIMEOUT_SECONDS;
import static tech.blacklake.infra.boot.common.util.ObjectMapperConfigure.objectMapper;

public class OkhttpOpenapiClient {
    private String baseUrl;

    private final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(OK_HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(OK_HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .callTimeout(OK_HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .connectTimeout(OK_HTTP_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .build();

    public OkhttpOpenapiClient(Config config) {
        this.baseUrl = config.getBaseUrl();
    }

    public Result<AppAccessTokenVO> getAccessToken(GetAccessTokenCO co) throws IOException {
        MediaType mediaType = MediaType.parse("application/json; charset=UTF-8");
        RequestBody requestBody = RequestBody.create(mediaType, objectMapper.writeValueAsString(co));
        String url = baseUrl + "/api/openapi/domain/web/v1/access_token/_get_access_token";
        Request request = new Request.Builder().url(url).post(requestBody).build();
        Response response = okHttpClient.newCall(request).execute();
        return objectMapper.readValue(response.body().string(), new TypeReference<>() {});
    }
}
