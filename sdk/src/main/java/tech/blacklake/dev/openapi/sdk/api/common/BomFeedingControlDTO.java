package tech.blacklake.dev.openapi.sdk.api.common;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomFeedingControlDTO  {
    /**
     * 父项物料编号,不可超过255个字符
     */
    private String bomMaterialCode = "";

    /**
     * 版本号,不可超过255个字符
     */
    private String bomVersion = "";

    /**
     * 项次,必须是所属物料清单中存在的项次,若没有拆分工序投料则填写子项物料表中的项次,若拆分工序投料则填写子项物料拆分工序投料中的项次
     */
    private String belongSeq = "";

    /**
     * 子项物料编号,不可超过255个字符
     */
    private String materialCode = "";

    /**
     * 物料名称,不可超过255个字符
     */
    private String materialName;

    /**
     * 子行号,整数,必须大于等于0,默认为1
     */
    private String lineSeq = "";

    /**
     * 用量:分子,默认值为所属子项物料行的用量分子,必须大于0
     */
    private String inputAmountNumerator;

    /**
     * 投料控件编号,不超过64字符
     */
    private String inputSopControlCode;

    /**
     * 是否必投,默认值为必投,是1否0,当指定工序投料=否,非必投
     */
    private Integer inputMaterialControlInt;

    /**
     * 是否必投,默认值为必投,当指定工序投料=否,非必投
     */
    private String inputMaterialControl;

    /**
     * 投料上下限类型 key = FeedingLimitEnum
     */
    private String inputBoundType;

    /**
     * 投料上限(比例%),默认值为0,当投料上下限类型=固定值时,必须大于等于0,当投料上下限类型=按比例时,必须大于等于0,小于等于100
     */
    private String upperLimit;

    /**
     * 投料下限(比例%),默认值为0,当投料上下限类型=固定值时,必须大于等于0,当投料上下限类型=按比例时,必须大于等于0,小于等于100
     */
    private String lowerLimit;

    /**
     * 投料质量状态,key = QualityStatusEnum
     */
    private String inputQcState;

    public String getBomMaterialCode() {
        return bomMaterialCode;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public String getBelongSeq() {
        return belongSeq;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getLineSeq() {
        return lineSeq;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputSopControlCode() {
        return inputSopControlCode;
    }

    public Integer getInputMaterialControlInt() {
        return inputMaterialControlInt;
    }

    public String getInputMaterialControl() {
        return inputMaterialControl;
    }

    public String getInputBoundType() {
        return inputBoundType;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public String getInputQcState() {
        return inputQcState;
    }

    public void setBomMaterialCode(String bomMaterialCode) {
        this.bomMaterialCode = bomMaterialCode;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public void setBelongSeq(String belongSeq) {
        this.belongSeq = belongSeq;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setLineSeq(String lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputSopControlCode(String inputSopControlCode) {
        this.inputSopControlCode = inputSopControlCode;
    }

    public void setInputMaterialControlInt(Integer inputMaterialControlInt) {
        this.inputMaterialControlInt = inputMaterialControlInt;
    }

    public void setInputMaterialControl(String inputMaterialControl) {
        this.inputMaterialControl = inputMaterialControl;
    }

    public void setInputBoundType(String inputBoundType) {
        this.inputBoundType = inputBoundType;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setInputQcState(String inputQcState) {
        this.inputQcState = inputQcState;
    }
}

