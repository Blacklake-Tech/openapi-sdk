package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderInfoRequestDTO {
    /**
     * 出库单ID
     */
    private long outboundOrderId;

    /**
     * 出库单明细ID
     */
    private long outboundOrderItemId;

    public long getOutboundOrderId() {
        return outboundOrderId;
    }

    public long getOutboundOrderItemId() {
        return outboundOrderItemId;
    }

    public void setOutboundOrderId(long outboundOrderId) {
        this.outboundOrderId = outboundOrderId;
    }

    public void setOutboundOrderItemId(long outboundOrderItemId) {
        this.outboundOrderItemId = outboundOrderItemId;
    }
}

