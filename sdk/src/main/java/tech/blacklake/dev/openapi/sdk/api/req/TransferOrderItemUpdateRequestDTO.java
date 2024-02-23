package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderItemUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 调拨单明细ID
     */
    private Long id;

    /**
     * 行号 不可编辑
     */
    private String lineNo;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 批次号 如果填写必须是该物料已有批次号
     */
    private String batchNo;

    /**
     * 指定供应商
     */
    private Long supplierId;

    /**
     * 调拨单关联对象信息（领料单）
     */
    private Long entityId;

    /**
     * 申请数量 必须为数值,整数部分取值范围：[0，10000000],小数部分不可超过10位
     */
    private BigDecimal planAmount;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 行备注 不超过1000字
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

    public String getBatchNo() {
        return batchNo;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public Long getEntityId() {
        return entityId;
    }

    public BigDecimal getPlanAmount() {
        return planAmount;
    }

    public long getUnitId() {
        return unitId;
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

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public void setPlanAmount(BigDecimal planAmount) {
        this.planAmount = planAmount;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
