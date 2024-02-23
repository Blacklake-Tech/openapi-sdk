package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BomInputMaterialForErpRequestDTO {
    /**
     * 项次,默认以10开始,以10递增,同一物料清单内的多行子项物料(第一层+第二层,非替代件),项次+物料编号不支持重复
     */
    private String seq;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 用量:分子,默认值为1,必须大于0
     */
    private String inputAmountNumerator;

    /**
     * 用量:分母,默认值为1,必须大于0
     */
    private String inputAmountDenominator;

    /**
     * 单位名称
     */
    private String unit;

    /**
     * 损耗率(%),默认值为0,必须大于等于0
     */
    private String lossRate;

    public String getSeq() {
        return seq;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputAmountDenominator() {
        return inputAmountDenominator;
    }

    public String getUnit() {
        return unit;
    }

    public String getLossRate() {
        return lossRate;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputAmountDenominator(String inputAmountDenominator) {
        this.inputAmountDenominator = inputAmountDenominator;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }
}
