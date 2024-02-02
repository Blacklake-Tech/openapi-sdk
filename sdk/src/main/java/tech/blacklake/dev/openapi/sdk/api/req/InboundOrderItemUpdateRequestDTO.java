package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderItemUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 入库单明细ID，新加的行ID可空
     */
    private Long id;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 仓位ID
     */
    private Long storageLocationId;

    /**
     * 应入数量
     */
    private BigDecimal planAmount;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public String getLineNo() {
        return lineNo;
    }

    public long getMaterialId() {
        return materialId;
    }

    public long getUnitId() {
        return unitId;
    }

    public Long getStorageLocationId() {
        return storageLocationId;
    }

    public BigDecimal getPlanAmount() {
        return planAmount;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setStorageLocationId(Long storageLocationId) {
        this.storageLocationId = storageLocationId;
    }

    public void setPlanAmount(BigDecimal planAmount) {
        this.planAmount = planAmount;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

