package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomFeedingControlRequestDTO  {
    /**
     * 投料管控Id
     */
    private Long id;

    /**
     * 子行行号
     */
    private int lineSeq;

    /**
     * 分子
     */
    private String inputAmountNumerator;

    /**
     * 分母
     */
    private String inputAmountDenominator;

    /**
     * 投料控件Code
     */
    private String inputSopControlCode;

    /**
     * 是否必投
     */
    private int inputMaterialControl;

    /**
     * 投料上下限类型
     */
    private int inputBoundType;

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
    private int feedType;

    public Long getId() {
        return id;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputAmountDenominator() {
        return inputAmountDenominator;
    }

    public String getInputSopControlCode() {
        return inputSopControlCode;
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

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputAmountDenominator(String inputAmountDenominator) {
        this.inputAmountDenominator = inputAmountDenominator;
    }

    public void setInputSopControlCode(String inputSopControlCode) {
        this.inputSopControlCode = inputSopControlCode;
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

