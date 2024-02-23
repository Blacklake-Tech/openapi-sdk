package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderItemUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 行id
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
     * 计划数量 出库明细计划数量大于0
     */
    private BigDecimal planAmount;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 批号
     */
    private String batchNo;

    public Long getId() {
        return id;
    }

    public String getLineNo() {
        return lineNo;
    }

    public long getMaterialId() {
        return materialId;
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

    public String getBatchNo() {
        return batchNo;
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

    public void setPlanAmount(BigDecimal planAmount) {
        this.planAmount = planAmount;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
}
