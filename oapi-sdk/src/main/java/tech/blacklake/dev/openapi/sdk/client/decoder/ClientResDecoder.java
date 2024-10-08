package tech.blacklake.dev.openapi.sdk.client.decoder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import feign.FeignException;
import feign.Response;
import feign.RetryableException;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.springframework.http.HttpStatus;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;
import tech.blacklake.infra.boot.common.data.Result;
import tech.blacklake.infra.boot.common.data.ResultList;
import tech.blacklake.infra.boot.common.exception.FeignBizException;
import tech.blacklake.infra.boot.observability.BlackBootTraceUtil;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ClientResDecoder implements Decoder {

    private TokenManager tokenManager;

    private Config config;

    public ClientResDecoder(TokenManager tokenManager, Config config) {
        this.config = config;
        this.tokenManager = tokenManager;
    }

    public static final ObjectMapper objectMapper;

    static {
        objectMapper = (new ObjectMapper())
                .enable(SerializationFeature.INDENT_OUTPUT)
                .enable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)
                .enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)
                .disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .setSerializationInclusion(Include.NON_EMPTY)
                .setSerializationInclusion(Include.NON_NULL);
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule
                .addSerializer(
                        LocalDateTime.class,
                        new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                .addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .addSerializer(LocalTime.class, new LocalTimeSerializer(DateTimeFormatter.ofPattern("HH:mm:ss")));
        objectMapper.registerModule(javaTimeModule);
    }

    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        if (response.status() == 404 || response.status() == 204) {
            return Util.emptyValueOf(type);
        }

        if (response.status() == HttpStatus.OK.value()) {

            if (response.body() == null) {
                return null;
            }

            Result result = objectMapper.readValue(response.body().asInputStream(), new TypeReference<>() {});

            if (result.getCode() == 200) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) type;
                    if (pt.getRawType().equals(Result.class) || pt.getRawType().equals(ResultList.class)) {
                        return objectMapper.readValue(
                                objectMapper.writeValueAsBytes(result), objectMapper.constructType(type));
                    }
                }
                return result;
            } else if ("OPENAPI-DOMAIN/ACCESS_TOKEN_EXPIRED".equals(result.getSubCode())) {
                // token过期，重新获取token
                tokenManager.getAppAccessToken();
                throw new RetryableException(
                        response.status(),
                        result.getMessage(),
                        response.request().httpMethod(),
                        new Date(),
                        response.request());
            } else {
                return result;
                //                throw FeignBizException.build(result);
            }
        } else {
            FeignBizException internal_error =
                    FeignBizException.build(new Result("INTERNAL_ERROR", "Fiegn internal error", 500));
            BlackBootTraceUtil.logException(internal_error);
            throw internal_error;
        }
    }
}
