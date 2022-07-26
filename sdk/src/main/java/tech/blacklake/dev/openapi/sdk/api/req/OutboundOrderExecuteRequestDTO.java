package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderExecuteRequestDTO {
    /**
     * 执行数量
     */
    private ExecuteAmountRequestDTO amount;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 出库单信息
     */
    private OutboundOrderInfoRequestDTO outboundOrder;

    /**
     * 库存明细key
     */
    private OutboundOrderInventoryKeyRequestDTO inventoryKey;

    /**
     * 出库单明细自定义字段
     */
    private CustomFieldBaseRequestDTO outboundOrderItemCustomField;

    public ExecuteAmountRequestDTO getAmount() {
        return amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public OutboundOrderInfoRequestDTO getOutboundOrder() {
        return outboundOrder;
    }

    public OutboundOrderInventoryKeyRequestDTO getInventoryKey() {
        return inventoryKey;
    }

    public CustomFieldBaseRequestDTO getOutboundOrderItemCustomField() {
        return outboundOrderItemCustomField;
    }

    public void setAmount(ExecuteAmountRequestDTO amount) {
        this.amount = amount;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setOutboundOrder(OutboundOrderInfoRequestDTO outboundOrder) {
        this.outboundOrder = outboundOrder;
    }

    public void setInventoryKey(OutboundOrderInventoryKeyRequestDTO inventoryKey) {
        this.inventoryKey = inventoryKey;
    }

    public void setOutboundOrderItemCustomField(CustomFieldBaseRequestDTO outboundOrderItemCustomField) {
        this.outboundOrderItemCustomField = outboundOrderItemCustomField;
    }
}

