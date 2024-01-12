package tech.blacklake.dev.openapi.sdk.event.model;

import tech.blacklake.dev.openapi.domain.service.mq.dto.Header;

public class BaseCallbackDTO {
    private Header header;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
