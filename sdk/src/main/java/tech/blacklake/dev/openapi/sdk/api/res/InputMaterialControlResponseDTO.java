package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InputMaterialControlResponseDTO  {
    /**
     * 业务ID
     */
    private long id;

    /**
     * 用料清单行ID
     */
    private long bomInputMaterialLineId;

    /**
     * 行号
     */
    private int lineSeq;

    /**
     * sop投料控件id
     */
    private Long inputSopControlId;

    /**
     * sop投料控件信息
     */
    private SopControlResponseDTO inputSopControlDTO;

    /**
     * 基准用量分子
     */
    private String inputAmountNumerator;

    /**
     * 基准用量分母
     */
    private String inputAmountDenominator;

    /**
     * 投料管控 true 必投，false 非必投
     */
    private int inputMaterialControl;

    /**
     * 投料上下限类型 key = inputBoundType
     */
    private BizConstantDisplay inputBoundType;

    /**
     * 投料上限
     */
    private String inputUpperLimit;

    /**
     * 投料下限
     */
    private String inputLowerLimit;

    /**
     * 投料上限比例
     */
    private String inputUpperLimitRatio;

    /**
     * 投料下限比例
     */
    private String inputLowerLimitRatio;

    /**
     * 投料质量状态 key = material_qc
     */
    private List<BizConstantDisplay> inputQcState;

    /**
     * 投料类型 key = FeedTypeEnum
     */
    private BizConstantDisplay feedType;

    public long getId() {
        return id;
    }

    public long getBomInputMaterialLineId() {
        return bomInputMaterialLineId;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public Long getInputSopControlId() {
        return inputSopControlId;
    }

    public SopControlResponseDTO getInputSopControlDTO() {
        return inputSopControlDTO;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputAmountDenominator() {
        return inputAmountDenominator;
    }

    public int getInputMaterialControl() {
        return inputMaterialControl;
    }

    public BizConstantDisplay getInputBoundType() {
        return inputBoundType;
    }

    public String getInputUpperLimit() {
        return inputUpperLimit;
    }

    public String getInputLowerLimit() {
        return inputLowerLimit;
    }

    public String getInputUpperLimitRatio() {
        return inputUpperLimitRatio;
    }

    public String getInputLowerLimitRatio() {
        return inputLowerLimitRatio;
    }

    public List<BizConstantDisplay> getInputQcState() {
        return inputQcState;
    }

    public BizConstantDisplay getFeedType() {
        return feedType;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBomInputMaterialLineId(long bomInputMaterialLineId) {
        this.bomInputMaterialLineId = bomInputMaterialLineId;
    }

    public void setLineSeq(int lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setInputSopControlId(Long inputSopControlId) {
        this.inputSopControlId = inputSopControlId;
    }

    public void setInputSopControlDTO(SopControlResponseDTO inputSopControlDTO) {
        this.inputSopControlDTO = inputSopControlDTO;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputAmountDenominator(String inputAmountDenominator) {
        this.inputAmountDenominator = inputAmountDenominator;
    }

    public void setInputMaterialControl(int inputMaterialControl) {
        this.inputMaterialControl = inputMaterialControl;
    }

    public void setInputBoundType(BizConstantDisplay inputBoundType) {
        this.inputBoundType = inputBoundType;
    }

    public void setInputUpperLimit(String inputUpperLimit) {
        this.inputUpperLimit = inputUpperLimit;
    }

    public void setInputLowerLimit(String inputLowerLimit) {
        this.inputLowerLimit = inputLowerLimit;
    }

    public void setInputUpperLimitRatio(String inputUpperLimitRatio) {
        this.inputUpperLimitRatio = inputUpperLimitRatio;
    }

    public void setInputLowerLimitRatio(String inputLowerLimitRatio) {
        this.inputLowerLimitRatio = inputLowerLimitRatio;
    }

    public void setInputQcState(List<BizConstantDisplay> inputQcState) {
        this.inputQcState = inputQcState;
    }

    public void setFeedType(BizConstantDisplay feedType) {
        this.feedType = feedType;
    }
}

