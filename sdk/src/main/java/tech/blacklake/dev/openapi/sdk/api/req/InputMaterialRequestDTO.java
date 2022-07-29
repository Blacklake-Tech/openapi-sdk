package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InputMaterialRequestDTO  {
    /**
     * 项次
     */
    private int seq = 0;

    /**
     * 物料ID
     */
    private long materialId = 0L;

    /**
     * 子项类型
     */
    private int inputType = 0;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 分子
     */
    private String inputAmountNumerator;

    /**
     * 分母
     */
    private String inputAmountDenominator;

    /**
     * 单位
     */
    private long unitId = 0L;

    /**
     * 损耗率
     */
    private String lossRate;

    /**
     * 展开物料清单ID
     */
    private Long bomId;

    /**
     * 需求时间
     */
    private Long requirementTime;

    /**
     * 领料方式
     */
    private Integer pickMode;

    /**
     * 是否指定工序投料
     */
    private int specificProcessInput = 0;

    /**
     * 供应商ID list
     */
    private List<Long> supplierIds;

    /**
     * 是否拆分控件投料
     */
    private int splitSopControlInput = 0;

    /**
     * 投料工序号
     */
    private String inputProcessNum;

    /**
     * 投料管控
     */
    private List<InputMaterialControlRequestDTO> bomFeedingControls;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 替代方案
     */
    private WorkOrderAlternativePlanRequestDTO workOrderAlternativePlan;

    public int getSeq() {
        return seq;
    }

    public long getMaterialId() {
        return materialId;
    }

    public int getInputType() {
        return inputType;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputAmountDenominator() {
        return inputAmountDenominator;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getLossRate() {
        return lossRate;
    }

    public Long getBomId() {
        return bomId;
    }

    public Long getRequirementTime() {
        return requirementTime;
    }

    public Integer getPickMode() {
        return pickMode;
    }

    public int getSpecificProcessInput() {
        return specificProcessInput;
    }

    public List<Long> getSupplierIds() {
        return supplierIds;
    }

    public int getSplitSopControlInput() {
        return splitSopControlInput;
    }

    public String getInputProcessNum() {
        return inputProcessNum;
    }

    public List<InputMaterialControlRequestDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public String getRemark() {
        return remark;
    }

    public WorkOrderAlternativePlanRequestDTO getWorkOrderAlternativePlan() {
        return workOrderAlternativePlan;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setInputType(int inputType) {
        this.inputType = inputType;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputAmountDenominator(String inputAmountDenominator) {
        this.inputAmountDenominator = inputAmountDenominator;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setRequirementTime(Long requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setPickMode(Integer pickMode) {
        this.pickMode = pickMode;
    }

    public void setSpecificProcessInput(int specificProcessInput) {
        this.specificProcessInput = specificProcessInput;
    }

    public void setSupplierIds(List<Long> supplierIds) {
        this.supplierIds = supplierIds;
    }

    public void setSplitSopControlInput(int splitSopControlInput) {
        this.splitSopControlInput = splitSopControlInput;
    }

    public void setInputProcessNum(String inputProcessNum) {
        this.inputProcessNum = inputProcessNum;
    }

    public void setBomFeedingControls(List<InputMaterialControlRequestDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setWorkOrderAlternativePlan(WorkOrderAlternativePlanRequestDTO workOrderAlternativePlan) {
        this.workOrderAlternativePlan = workOrderAlternativePlan;
    }
}

