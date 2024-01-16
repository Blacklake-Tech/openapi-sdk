package tech.blacklake.dev.openapi.sdk.client.decoder;

import static tech.blacklake.infra.boot.common.util.ObjectMapperConfigure.objectMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import feign.FeignException;
import feign.Response;
import feign.RetryableException;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import org.springframework.http.HttpStatus;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;
import tech.blacklake.infra.boot.common.data.Result;
import tech.blacklake.infra.boot.common.data.ResultList;
import tech.blacklake.infra.boot.common.exception.FeignBizException;
import tech.blacklake.infra.boot.observability.BlackBootTraceUtil;

public class ClientResDecoder implements Decoder {

    private TokenManager tokenManager;

    private Config config;

    public ClientResDecoder(TokenManager tokenManager,Config config){
        this.config = config;
        this.tokenManager = tokenManager;
    }

    @Override
    public Object decode(Response response, Type type)
        throws IOException, DecodeException, FeignException {
        if (response.status() == 404 || response.status() == 204) {
            return Util.emptyValueOf(type);
        }

        if (response.status() == HttpStatus.OK.value()) {

            if (response.body() == null) {
                return null;
            }

            Result result = objectMapper.readValue(response.body().asInputStream(), new TypeReference<Result>() {});

            if (result.getCode() == 200) {

                if (type instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) type;
                    if (pt.getRawType().equals(Result.class) || pt.getRawType().equals(ResultList.class)) {
                        return objectMapper.readValue(
                            objectMapper.writeValueAsBytes(result), objectMapper.constructType(type));
                    }
                }
                return result;
            } else if("OPENAPI-DOMAIN/ACCESS_TOKEN_EXPIRED".equals(result.getSubCode())){
                //token过期，重新获取token
                tokenManager.getAppAccessToken(config);
                throw new RetryableException(
                    response.status(),
                    result.getMessage(),
                    response.request().httpMethod(),
                    new Date(),
                    response.request());
            }else  {
                throw FeignBizException.build(result);
            }
        } else {
            FeignBizException internal_error =
                FeignBizException.build(new Result("INTERNAL_ERROR", "Fiegn internal error", 500));
            BlackBootTraceUtil.logException(internal_error);
            throw internal_error;
        }
    }
}
