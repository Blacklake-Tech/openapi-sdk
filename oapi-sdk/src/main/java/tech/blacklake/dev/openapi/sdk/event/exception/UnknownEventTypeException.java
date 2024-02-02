package tech.blacklake.dev.openapi.sdk.event.exception;

public class UnknownEventTypeException extends RuntimeException {

    private final String eventType;

    public UnknownEventTypeException(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String getMessage() {
        return "event type:" + this.eventType + " does not appear in EventTypeEnum";
    }
}
