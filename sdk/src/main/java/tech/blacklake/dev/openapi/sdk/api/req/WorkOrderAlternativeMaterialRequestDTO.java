package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderAlternativeMaterialRequestDTO  {
    /**
     * id
     */
    private Long id;

    /**
     * 优先级
     */
    private int priority;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 主料 0 否 1是
     */
    private Integer mainFlag;

    /**
     * 数量分子
     */
    private String amountNumerator;

    /**
     * 数量分母
     */
    private String amountDenominator;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 领料方式
     */
    private int pickMode;

    /**
     * 投料质量状态
     */
    private List<Integer> feedingQualityStatus;

    /**
     * 使用比例上限
     */
    private String useUpperLimitRatio;

    /**
     * 行备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public long getMaterialId() {
        return materialId;
    }

    public Integer getMainFlag() {
        return mainFlag;
    }

    public String getAmountNumerator() {
        return amountNumerator;
    }

    public String getAmountDenominator() {
        return amountDenominator;
    }

    public long getUnitId() {
        return unitId;
    }

    public int getPickMode() {
        return pickMode;
    }

    public List<Integer> getFeedingQualityStatus() {
        return feedingQualityStatus;
    }

    public String getUseUpperLimitRatio() {
        return useUpperLimitRatio;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    public void setAmountNumerator(String amountNumerator) {
        this.amountNumerator = amountNumerator;
    }

    public void setAmountDenominator(String amountDenominator) {
        this.amountDenominator = amountDenominator;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setPickMode(int pickMode) {
        this.pickMode = pickMode;
    }

    public void setFeedingQualityStatus(List<Integer> feedingQualityStatus) {
        this.feedingQualityStatus = feedingQualityStatus;
    }

    public void setUseUpperLimitRatio(String useUpperLimitRatio) {
        this.useUpperLimitRatio = useUpperLimitRatio;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

