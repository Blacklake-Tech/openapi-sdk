package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OriginalAlternativeMaterialRequestRequestDTO  {
    /**
     * 替代方案编号，支持字母、数字、符号，不可超过255字符
     */
    private String alternativePlanCode;

    /**
     * 被替代物料编号，系统中启用且存在的物料编号
     */
    private String originalAlternativeMaterialCode;

    /**
     * 被替代物料名称
     */
    private String originalAlternativeMaterialName;

    /**
     * 被替代料数量:分子,仅支持填写1，不填默认为1
     */
    private String amountNumerator;

    /**
     * 被替代料数量:分母，仅支持填写1，不填默认为1
     */
    private String amountDenominator;

    /**
     * 单位名称，仅支持填写当前物料维护的主单位和转换单位，不填默认为投料单位
     */
    private String unit;

    public String getAlternativePlanCode() {
        return alternativePlanCode;
    }

    public String getOriginalAlternativeMaterialCode() {
        return originalAlternativeMaterialCode;
    }

    public String getOriginalAlternativeMaterialName() {
        return originalAlternativeMaterialName;
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

    public void setAlternativePlanCode(String alternativePlanCode) {
        this.alternativePlanCode = alternativePlanCode;
    }

    public void setOriginalAlternativeMaterialCode(String originalAlternativeMaterialCode) {
        this.originalAlternativeMaterialCode = originalAlternativeMaterialCode;
    }

    public void setOriginalAlternativeMaterialName(String originalAlternativeMaterialName) {
        this.originalAlternativeMaterialName = originalAlternativeMaterialName;
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
}

