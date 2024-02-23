package tech.blacklake.dev.openapi.sdk.exception;

import tech.blacklake.dev.openapi.sdk.constant.ErrorCodeEnum;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:42:44
 */
public class BlackLakeException extends RuntimeException {
    public BlackLakeException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
    }

    public BlackLakeException(ErrorCodeEnum errorCodeEnum, Object... args) {
        super(errorMessageDecoder(errorCodeEnum.getMessage(), args));
    }

    /**
     * 错误信息占位符替换
     */
    private static String errorMessageDecoder(String errorMessage, Object... args) {
        if (args == null) {
            return errorMessage;
        }
        return new MessageFormat(errorMessage)
                .format(Arrays.stream(args)
                        .filter(Objects::nonNull)
                        .map(Objects::toString)
                        .toArray());
    }
}
