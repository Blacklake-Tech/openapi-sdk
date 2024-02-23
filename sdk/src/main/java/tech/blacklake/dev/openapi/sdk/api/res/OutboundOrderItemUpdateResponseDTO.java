package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderItemUpdateResponseDTO extends CustomFieldBaseCO {
    /**
     * ID
     */
    private long id;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 物料
     */
    private MaterialResponseDTO material;

    /**
     * 执行状态
     */
    private BizConstantDisplay bizStatus;

    /**
     * 单位
     */
    private UnitDetailResponseDTO unit;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 批号
     */
    private String batchNo;

    public long getId() {
        return id;
    }

    public String getLineNo() {
        return lineNo;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public String getRemark() {
        return remark;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
}
