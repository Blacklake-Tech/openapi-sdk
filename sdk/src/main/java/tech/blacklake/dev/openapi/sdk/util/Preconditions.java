package tech.blacklake.dev.openapi.sdk.util;

import tech.blacklake.dev.openapi.sdk.constant.ErrorCodeEnum;
import tech.blacklake.dev.openapi.sdk.exception.BlackLakeException;

/**
 * @author cuiyichen
 * @date 2022/04/24 16:43:31
 */
public class Preconditions {
    public static void checkNotNull(Object reference, ErrorCodeEnum errorCodeEnum) {
        if (reference == null) {
            throw new BlackLakeException(errorCodeEnum);
        }
    }

    public static void checkNotNull(Object reference, ErrorCodeEnum errorCodeEnum, Object... args) {
        if (reference == null) {
            throw new BlackLakeException(errorCodeEnum, args);
        }
    }
}
