package tech.blacklake.dev.openapi.sdk.exception;

import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;

public class UnsupportedAppTypeException extends RuntimeException {
    public UnsupportedAppTypeException(AppTypeEnum appTypeEnum) {
        super(String.format("The app type  of %s is not supported", appTypeEnum));
    }
}
