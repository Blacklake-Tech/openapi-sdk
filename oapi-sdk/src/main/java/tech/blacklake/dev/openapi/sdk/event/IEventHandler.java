package tech.blacklake.dev.openapi.sdk.event;

import tech.blacklake.dev.openapi.sdk.event.model.EventReq;

public interface IEventHandler {
    void handle(EventReq eventReq) throws Exception;
}
