package tech.blacklake.dev.openapi.sdk.event;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

public interface IEventHandler<E extends BaseCallbackDTO> {

    E getEvent();

    Object handle(E event) throws Exception;
}
