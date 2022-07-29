package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InputMaterialResponseDTO  {
    /**
     * 业务ID
     */
    private long id = 0L;

    /**
     * 项次
     */
    private int seq = 0;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 需求时间
     */
    private Long requirementTime;

    /**
     * 供应商list
     */
    private List<SupplierResponseDTO> supplierList;

    /**
     * 物料ID
     */
    private long materialId = 0L;

    /**
     * 物料信息
     */
    private MaterialResponseDTO material;

    /**
     * 子项类型 key =inputType 
     */
    private BizConstantDisplay inputType;

    /**
     * 单位ID
     */
    private long unitId = 0L;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 分子
     */
    private String inputAmountNumerator;

    /**
     * 分母
     */
    private String inputAmountDenominator;

    /**
     * 损耗率
     */
    private String lossRate;

    /**
     * 是否指定工序投料
     */
    private int specificProcessInput = 0;

    /**
     * 是否拆分控件投料
     */
    private int splitSopControlInput = 0;

    /**
     * 投料工序ID
     */
    private Long inputProcessId;

    /**
     * 投料工序号
     */
    private String inputProcessNum;

    /**
     * sop方案ID
     */
    private Long sopId;

    /**
     * 投料管控
     */
    private List<InputMaterialControlResponseDTO> bomFeedingControls;

    /**
     * 版本号
     */
    private String version;

    /**
     * bomId
     */
    private Long bomId;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 领料方式 key =pickMode
     */
    private BizConstantDisplay pickMode;

    /**
     * 申请数
     */
    private BaseAmountDisplay requestPickAmount;

    /**
     * 领料发料数
     */
    private BaseAmountDisplay pickOrderIssuedAmount;

    /**
     * 领料收料数
     */
    private BaseAmountDisplay receivePickAmount;

    /**
     * 实际投料数
     */
    private BaseAmountDisplay inputAmount;

    /**
     * 替代方案
     */
    private WorkOrderAlternativePlanResponseDTO workOrderAlternativePlan;

    public long getId() {
        return id;
    }

    public int getSeq() {
        return seq;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public Long getRequirementTime() {
        return requirementTime;
    }

    public List<SupplierResponseDTO> getSupplierList() {
        return supplierList;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BizConstantDisplay getInputType() {
        return inputType;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputAmountDenominator() {
        return inputAmountDenominator;
    }

    public String getLossRate() {
        return lossRate;
    }

    public int getSpecificProcessInput() {
        return specificProcessInput;
    }

    public int getSplitSopControlInput() {
        return splitSopControlInput;
    }

    public Long getInputProcessId() {
        return inputProcessId;
    }

    public String getInputProcessNum() {
        return inputProcessNum;
    }

    public Long getSopId() {
        return sopId;
    }

    public List<InputMaterialControlResponseDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public String getVersion() {
        return version;
    }

    public Long getBomId() {
        return bomId;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getPickMode() {
        return pickMode;
    }

    public BaseAmountDisplay getRequestPickAmount() {
        return requestPickAmount;
    }

    public BaseAmountDisplay getPickOrderIssuedAmount() {
        return pickOrderIssuedAmount;
    }

    public BaseAmountDisplay getReceivePickAmount() {
        return receivePickAmount;
    }

    public BaseAmountDisplay getInputAmount() {
        return inputAmount;
    }

    public WorkOrderAlternativePlanResponseDTO getWorkOrderAlternativePlan() {
        return workOrderAlternativePlan;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setRequirementTime(Long requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setSupplierList(List<SupplierResponseDTO> supplierList) {
        this.supplierList = supplierList;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setInputType(BizConstantDisplay inputType) {
        this.inputType = inputType;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputAmountDenominator(String inputAmountDenominator) {
        this.inputAmountDenominator = inputAmountDenominator;
    }

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }

    public void setSpecificProcessInput(int specificProcessInput) {
        this.specificProcessInput = specificProcessInput;
    }

    public void setSplitSopControlInput(int splitSopControlInput) {
        this.splitSopControlInput = splitSopControlInput;
    }

    public void setInputProcessId(Long inputProcessId) {
        this.inputProcessId = inputProcessId;
    }

    public void setInputProcessNum(String inputProcessNum) {
        this.inputProcessNum = inputProcessNum;
    }

    public void setSopId(Long sopId) {
        this.sopId = sopId;
    }

    public void setBomFeedingControls(List<InputMaterialControlResponseDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setPickMode(BizConstantDisplay pickMode) {
        this.pickMode = pickMode;
    }

    public void setRequestPickAmount(BaseAmountDisplay requestPickAmount) {
        this.requestPickAmount = requestPickAmount;
    }

    public void setPickOrderIssuedAmount(BaseAmountDisplay pickOrderIssuedAmount) {
        this.pickOrderIssuedAmount = pickOrderIssuedAmount;
    }

    public void setReceivePickAmount(BaseAmountDisplay receivePickAmount) {
        this.receivePickAmount = receivePickAmount;
    }

    public void setInputAmount(BaseAmountDisplay inputAmount) {
        this.inputAmount = inputAmount;
    }

    public void setWorkOrderAlternativePlan(WorkOrderAlternativePlanResponseDTO workOrderAlternativePlan) {
        this.workOrderAlternativePlan = workOrderAlternativePlan;
    }
}

