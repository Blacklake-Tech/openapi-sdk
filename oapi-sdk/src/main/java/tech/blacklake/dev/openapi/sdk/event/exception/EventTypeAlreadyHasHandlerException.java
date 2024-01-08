package tech.blacklake.dev.openapi.sdk.event.exception;

import tech.blacklake.dev.openapi.sdk.constants.enums.EventTypeEnum;

public class EventTypeAlreadyHasHandlerException extends RuntimeException {

    public EventTypeAlreadyHasHandlerException(EventTypeEnum eventTypeEnum) {
        super(String.format("The event type  of %s already has handler", eventTypeEnum.getEventTypeStr()));
    }
}
