package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AlternativeMaterialDetailResponseDTO  {
    /**
     * 替代料Id
     */
    private long id = 0;

    /**
     * 优先级
     */
    private int priority = 0;

    /**
     * 物料Id
     */
    private long materialId = 0;

    /**
     * 被替代料物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 替代主料 key = BooleanEnum
     */
    private BizConstantDisplay mainFlag;

    /**
     * 分子
     */
    private String amountNumerator;

    /**
     * 分母
     */
    private String amountDenominator;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 单位Id
     */
    private long unitId = 0;

    /**
     * 单位name
     */
    private String unitName;

    /**
     * 领料方式 key = PickModeEnum
     */
    private BizConstantDisplay pickMode;

    /**
     * 投料质量状态 key = FeedingQualityStatusEnum
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

    public int getPriority() {
        return priority;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
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

    public String getUseRatio() {
        return useRatio;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
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

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
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

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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

