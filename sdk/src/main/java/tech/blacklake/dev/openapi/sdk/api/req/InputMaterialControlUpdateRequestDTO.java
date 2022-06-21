package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InputMaterialControlUpdateRequestDTO  {
    /**
     * 业务ID
     */
    private Long id;

    /**
     * 行号
     */
    private int lineSeq = 0;

    /**
     * sop投料控件ID
     */
    private Long inputSopControlId;

    /**
     * 基准用量分子
     */
    private String inputAmountNumerator;

    /**
     * 基准用量分母
     */
    private String inputAmountDenominator;

    /**
     * 投料管控 1:true 0:false
     */
    private int inputMaterialControl = 0;

    /**
     * 投料上下限类型
     */
    private int inputBoundType = 0;

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
     * 投料质量状态
     */
    private List<Integer> inputQcState;

    /**
     * 投料类型 key = FeedTypeEnum
     */
    private int feedType = 0;

    public Long getId() {
        return id;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public Long getInputSopControlId() {
        return inputSopControlId;
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

    public int getInputBoundType() {
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

    public List<Integer> getInputQcState() {
        return inputQcState;
    }

    public int getFeedType() {
        return feedType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLineSeq(int lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setInputSopControlId(Long inputSopControlId) {
        this.inputSopControlId = inputSopControlId;
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

    public void setInputBoundType(int inputBoundType) {
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

    public void setInputQcState(List<Integer> inputQcState) {
        this.inputQcState = inputQcState;
    }

    public void setFeedType(int feedType) {
        this.feedType = feedType;
    }
}

