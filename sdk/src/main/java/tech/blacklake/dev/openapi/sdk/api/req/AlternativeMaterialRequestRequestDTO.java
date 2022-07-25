package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AlternativeMaterialRequestRequestDTO  {
    /**
     * 替代方案编号，支持字母、数字、符号，不可超过255字符
     */
    private String alternativePlanCode = "";

    /**
     * 优先级，必须大于0小于等于50，一组替代方案，优先级不支持重复
     */
    private String priority = "";

    /**
     * 替代物料编号，系统中启用且存在的物料编号
     */
    private String alternativeMaterialCode = "";

    /**
     * 替代物料名称
     */
    private String alternativeMaterialName;

    /**
     * 替代料数量:分子，支持维护大于0小于等于10000000的小数或整数，不填默认为1
     */
    private String amountNumerator;

    /**
     * 替代料数量:分母，支持维护大于0小于等于10000000的小数或整数，不填默认为1
     */
    private String amountDenominator;

    /**
     * 单位名称，仅支持填写当前物料维护的主单位和转换单位，不填默认为投料单位
     */
    private String unit;

    /**
     * 领料方式，key = PickModeEnum
     */
    private String pickMode;

    /**
     * 投料质量状态，key = QualityStatusEnum
     */
    private String feedingQualityStatus;

    /**
     * 使用比例上限(%)，不为整批替代时支持填写大于0小于等于100的小数或整数，小数点后不超过4位
     */
    private String useUpperLimitRatio;

    /**
     * 行备注
     */
    private String remark;

    public String getAlternativePlanCode() {
        return alternativePlanCode;
    }

    public String getPriority() {
        return priority;
    }

    public String getAlternativeMaterialCode() {
        return alternativeMaterialCode;
    }

    public String getAlternativeMaterialName() {
        return alternativeMaterialName;
    }

    public String getAmountNumerator() {
        return amountNumerator;
    }

    public String getAmountDenominator() {
        return amountDenominator;
    }

    public String getUnit() {
        return unit;
    }

    public String getPickMode() {
        return pickMode;
    }

    public String getFeedingQualityStatus() {
        return feedingQualityStatus;
    }

    public String getUseUpperLimitRatio() {
        return useUpperLimitRatio;
    }

    public String getRemark() {
        return remark;
    }

    public void setAlternativePlanCode(String alternativePlanCode) {
        this.alternativePlanCode = alternativePlanCode;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setAlternativeMaterialCode(String alternativeMaterialCode) {
        this.alternativeMaterialCode = alternativeMaterialCode;
    }

    public void setAlternativeMaterialName(String alternativeMaterialName) {
        this.alternativeMaterialName = alternativeMaterialName;
    }

    public void setAmountNumerator(String amountNumerator) {
        this.amountNumerator = amountNumerator;
    }

    public void setAmountDenominator(String amountDenominator) {
        this.amountDenominator = amountDenominator;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPickMode(String pickMode) {
        this.pickMode = pickMode;
    }

    public void setFeedingQualityStatus(String feedingQualityStatus) {
        this.feedingQualityStatus = feedingQualityStatus;
    }

    public void setUseUpperLimitRatio(String useUpperLimitRatio) {
        this.useUpperLimitRatio = useUpperLimitRatio;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

