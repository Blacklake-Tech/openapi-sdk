package tech.blacklake.dev.openapi.sdk.exception;

import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;

public class GetAppAccessTokenFailException extends RuntimeException{
    public GetAppAccessTokenFailException(String message) {
        super(message);
    }
}
