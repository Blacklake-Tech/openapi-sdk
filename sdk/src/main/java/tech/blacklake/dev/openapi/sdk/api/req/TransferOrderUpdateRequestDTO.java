package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 调拨单ID
     */
    private long id;

    /**
     * 调拨单编号 支持字母，数字和符号，不可超过255个字符，前后支持空格
     */
    private String code;

    /**
     * 发出仓库id
     */
    private long sourceWarehouseId;

    /**
     * 接收仓库id
     */
    private long targetWarehouseId;

    /**
     * 备注 不超过1000字
     */
    private String remark;

    /**
     * 调拨单明细列表
     */
    private List<TransferOrderItemUpdateRequestDTO> transferOrderItems;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public long getSourceWarehouseId() {
        return sourceWarehouseId;
    }

    public long getTargetWarehouseId() {
        return targetWarehouseId;
    }

    public String getRemark() {
        return remark;
    }

    public List<TransferOrderItemUpdateRequestDTO> getTransferOrderItems() {
        return transferOrderItems;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSourceWarehouseId(long sourceWarehouseId) {
        this.sourceWarehouseId = sourceWarehouseId;
    }

    public void setTargetWarehouseId(long targetWarehouseId) {
        this.targetWarehouseId = targetWarehouseId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTransferOrderItems(List<TransferOrderItemUpdateRequestDTO> transferOrderItems) {
        this.transferOrderItems = transferOrderItems;
    }
}

