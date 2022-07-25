package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderCreateRequestDTO extends CustomFieldBaseCO {
    /**
     * id
     */
    private Long id;

    /**
     * 调拨单编号
     */
    private String code;

    /**
     * 业务类型 0仓储调拨 1领料调拨
     */
    private int bizType;

    /**
     * 发出仓库
     */
    private long sourceWarehouseId;

    /**
     * 接收仓库
     */
    private long targetWarehouseId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 调拨单明细列表
     */
    private List<TransferOrderItemCreateRequestDTO> transferOrderItems;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public int getBizType() {
        return bizType;
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

    public List<TransferOrderItemCreateRequestDTO> getTransferOrderItems() {
        return transferOrderItems;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
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

    public void setTransferOrderItems(List<TransferOrderItemCreateRequestDTO> transferOrderItems) {
        this.transferOrderItems = transferOrderItems;
    }
}

