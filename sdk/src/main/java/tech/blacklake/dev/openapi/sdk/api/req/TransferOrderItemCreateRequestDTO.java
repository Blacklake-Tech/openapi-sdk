package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderItemCreateRequestDTO extends CustomFieldBaseCO {
    /**
     * id
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
     * 指定批号
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
     * 申请数量
     */
    private BigDecimal planAmount;

    /**
     * 发出数量
     */
    private BigDecimal issueAmount;

    /**
     * 接收数量
     */
    private BigDecimal receiveAmount;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 行备注
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

    public BigDecimal getIssueAmount() {
        return issueAmount;
    }

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
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

    public void setIssueAmount(BigDecimal issueAmount) {
        this.issueAmount = issueAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

