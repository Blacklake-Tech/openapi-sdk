package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderInRequestDTO {
    /**
     * 入库单执行信息(可空,以自动生成入库单编号的方式入库)
     */
    private InboundOrderExistOrderRequestDTO inboundOrderType;

    /**
     * 执行数量CO
     */
    private InboundOrderExecuteWayRequestDTO execute;

    /**
     * 批号信息(可空)
     */
    private BatchNoKeyRequestDTO batchNoKey;

    /**
     * 入库信息
     */
    private InventoryKeyRequestDTO inventoryKey;

    /**
     * 附件ID集合
     */
    private List<Long> attachmentIds;

    /**
     * 指定供应商
     */
    private Long supplierId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 入库单自定义字段
     */
    private CustomFieldBaseCO inboundOrderCustomField;

    /**
     * 入库单明细自定义字段
     */
    private CustomFieldBaseCO inboundOrderItemCustomField;

    public InboundOrderExistOrderRequestDTO getInboundOrderType() {
        return inboundOrderType;
    }

    public InboundOrderExecuteWayRequestDTO getExecute() {
        return execute;
    }

    public BatchNoKeyRequestDTO getBatchNoKey() {
        return batchNoKey;
    }

    public InventoryKeyRequestDTO getInventoryKey() {
        return inventoryKey;
    }

    public List<Long> getAttachmentIds() {
        return attachmentIds;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getRemark() {
        return remark;
    }

    public CustomFieldBaseCO getInboundOrderCustomField() {
        return inboundOrderCustomField;
    }

    public CustomFieldBaseCO getInboundOrderItemCustomField() {
        return inboundOrderItemCustomField;
    }

    public void setInboundOrderType(InboundOrderExistOrderRequestDTO inboundOrderType) {
        this.inboundOrderType = inboundOrderType;
    }

    public void setExecute(InboundOrderExecuteWayRequestDTO execute) {
        this.execute = execute;
    }

    public void setBatchNoKey(BatchNoKeyRequestDTO batchNoKey) {
        this.batchNoKey = batchNoKey;
    }

    public void setInventoryKey(InventoryKeyRequestDTO inventoryKey) {
        this.inventoryKey = inventoryKey;
    }

    public void setAttachmentIds(List<Long> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setInboundOrderCustomField(CustomFieldBaseCO inboundOrderCustomField) {
        this.inboundOrderCustomField = inboundOrderCustomField;
    }

    public void setInboundOrderItemCustomField(CustomFieldBaseCO inboundOrderItemCustomField) {
        this.inboundOrderItemCustomField = inboundOrderItemCustomField;
    }
}

