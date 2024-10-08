package tech.blacklake.dev.openapi.sdk.event.exception;

public class HandlerNotFoundException extends RuntimeException {

    private final String eventType;

    public HandlerNotFoundException(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String getMessage() {
        return "event type:" + this.eventType + ", not found handler";
    }
}
