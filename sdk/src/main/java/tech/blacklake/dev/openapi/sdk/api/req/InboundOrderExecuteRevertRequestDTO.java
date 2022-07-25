package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderExecuteRevertRequestDTO {
    /**
     * 入库单ID
     */
    private long inboundOrderId;

    /**
     * 入库单行ID
     */
    private long inboundOrderItemId;

    /**
     * 冲销执行明细
     */
    private List<InboundOrderExecuteRevertItemRequestDTO> executeItemList;

    public long getInboundOrderId() {
        return inboundOrderId;
    }

    public long getInboundOrderItemId() {
        return inboundOrderItemId;
    }

    public List<InboundOrderExecuteRevertItemRequestDTO> getExecuteItemList() {
        return executeItemList;
    }

    public void setInboundOrderId(long inboundOrderId) {
        this.inboundOrderId = inboundOrderId;
    }

    public void setInboundOrderItemId(long inboundOrderItemId) {
        this.inboundOrderItemId = inboundOrderItemId;
    }

    public void setExecuteItemList(List<InboundOrderExecuteRevertItemRequestDTO> executeItemList) {
        this.executeItemList = executeItemList;
    }
}

