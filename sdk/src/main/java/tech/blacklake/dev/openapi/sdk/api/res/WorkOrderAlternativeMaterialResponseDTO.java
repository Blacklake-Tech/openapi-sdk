package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderAlternativeMaterialResponseDTO  {
    /**
     * id
     */
    private long id = 0;

    /**
     * 工单替代方案ID
     */
    private long workOrderAlternativePlanId = 0;

    /**
     * 优先级
     */
    private int priority = 0;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 标准用量
     */
    private BaseAmountDisplay standardUseAmount;

    /**
     * 需求数
     */
    private BaseAmountDisplay requirementAmount;

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
     * 替代物料信息
     */
    private MaterialResponseDTO materialDO;

    /**
     * 主料 0 否 1是
     */
    private BizConstantDisplay mainFlag;

    /**
     * 数量分子
     */
    private String amountNumerator;

    /**
     * 数量分母
     */
    private String amountDenominator;

    /**
     * 单位信息
     */
    private UnitDetailResponseDTO unit;

    /**
     * 领料方式 key=InputMaterialListVO_pickMode
     */
    private BizConstantDisplay pickMode;

    /**
     * 投料质量状态 key = QualityStatusEnum
     */
    private List<BizConstantDisplay> feedingQualityStatus;

    /**
     * 使用比例上限
     */
    private String useUpperLimitRatio;

    /**
     * 行备注
     */
    private String remark;

    public long getId() {
        return id;
    }

    public long getWorkOrderAlternativePlanId() {
        return workOrderAlternativePlanId;
    }

    public int getPriority() {
        return priority;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public BaseAmountDisplay getStandardUseAmount() {
        return standardUseAmount;
    }

    public BaseAmountDisplay getRequirementAmount() {
        return requirementAmount;
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

    public MaterialResponseDTO getMaterialDO() {
        return materialDO;
    }

    public BizConstantDisplay getMainFlag() {
        return mainFlag;
    }

    public String getAmountNumerator() {
        return amountNumerator;
    }

    public String getAmountDenominator() {
        return amountDenominator;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public BizConstantDisplay getPickMode() {
        return pickMode;
    }

    public List<BizConstantDisplay> getFeedingQualityStatus() {
        return feedingQualityStatus;
    }

    public String getUseUpperLimitRatio() {
        return useUpperLimitRatio;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWorkOrderAlternativePlanId(long workOrderAlternativePlanId) {
        this.workOrderAlternativePlanId = workOrderAlternativePlanId;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setStandardUseAmount(BaseAmountDisplay standardUseAmount) {
        this.standardUseAmount = standardUseAmount;
    }

    public void setRequirementAmount(BaseAmountDisplay requirementAmount) {
        this.requirementAmount = requirementAmount;
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

    public void setMaterialDO(MaterialResponseDTO materialDO) {
        this.materialDO = materialDO;
    }

    public void setMainFlag(BizConstantDisplay mainFlag) {
        this.mainFlag = mainFlag;
    }

    public void setAmountNumerator(String amountNumerator) {
        this.amountNumerator = amountNumerator;
    }

    public void setAmountDenominator(String amountDenominator) {
        this.amountDenominator = amountDenominator;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setPickMode(BizConstantDisplay pickMode) {
        this.pickMode = pickMode;
    }

    public void setFeedingQualityStatus(List<BizConstantDisplay> feedingQualityStatus) {
        this.feedingQualityStatus = feedingQualityStatus;
    }

    public void setUseUpperLimitRatio(String useUpperLimitRatio) {
        this.useUpperLimitRatio = useUpperLimitRatio;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

