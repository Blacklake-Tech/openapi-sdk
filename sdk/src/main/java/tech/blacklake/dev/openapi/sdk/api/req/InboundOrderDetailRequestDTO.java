package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderDetailRequestDTO {
    /**
     * 入库单ID
     */
    private long inboundOrderId;

    public long getInboundOrderId() {
        return inboundOrderId;
    }

    public void setInboundOrderId(long inboundOrderId) {
        this.inboundOrderId = inboundOrderId;
    }
}

