package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InboundOrderItemListResponseDTO extends CustomFieldBaseVO {
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
     * 执行状态 0:待执行/1:执行中/2:已完成/3:已关闭
     */
    private int bizStatus;

    /**
     * 位置
     */
    private SimpleLocationResponseDTO storageLocation;

    /**
     * 计划数量
     */
    private String planAmount;

    /**
     * 执行数量
     */
    private String doneAmount;

    /**
     * 单位
     */
    private UnitDetailResponseDTO unit;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 关联对象
     */
    private List<InboundOrderItemRelResponseDTO> relationList;

    public long getId() {
        return id;
    }

    public String getLineNo() {
        return lineNo;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public int getBizStatus() {
        return bizStatus;
    }

    public SimpleLocationResponseDTO getStorageLocation() {
        return storageLocation;
    }

    public String getPlanAmount() {
        return planAmount;
    }

    public String getDoneAmount() {
        return doneAmount;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public String getRemark() {
        return remark;
    }

    public List<InboundOrderItemRelResponseDTO> getRelationList() {
        return relationList;
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

    public void setBizStatus(int bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setStorageLocation(SimpleLocationResponseDTO storageLocation) {
        this.storageLocation = storageLocation;
    }

    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public void setDoneAmount(String doneAmount) {
        this.doneAmount = doneAmount;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRelationList(List<InboundOrderItemRelResponseDTO> relationList) {
        this.relationList = relationList;
    }
}
