package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderItemKeyRequestDTO {
    /**
     * 入库单ID
     */
    private long inboundOrderId;

    /**
     * 入库单明细ID
     */
    private long inboundOrderItemId;

    /**
     * 入库单Version
     */
    private Integer inboundOrderVersion;

    public long getInboundOrderId() {
        return inboundOrderId;
    }

    public long getInboundOrderItemId() {
        return inboundOrderItemId;
    }

    public Integer getInboundOrderVersion() {
        return inboundOrderVersion;
    }

    public void setInboundOrderId(long inboundOrderId) {
        this.inboundOrderId = inboundOrderId;
    }

    public void setInboundOrderItemId(long inboundOrderItemId) {
        this.inboundOrderItemId = inboundOrderItemId;
    }

    public void setInboundOrderVersion(Integer inboundOrderVersion) {
        this.inboundOrderVersion = inboundOrderVersion;
    }
}

