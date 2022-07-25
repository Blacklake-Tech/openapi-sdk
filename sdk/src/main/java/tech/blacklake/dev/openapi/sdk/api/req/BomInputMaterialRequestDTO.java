package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomInputMaterialRequestDTO extends CustomFieldBaseCO  {
    /**
     * 父项物料编号,不可超过255个字符
     */
    private String bomMaterialCode = "";

    /**
     * 版本号,父项物料的版本号
     */
    private String bomVersion = "";

    /**
     * 项次,默认以10开始,以10递增,同一物料清单内的多行子项物料(第一层+第二层,非替代件),项次+物料编号不支持重复
     */
    private String seq = "";

    /**
     * 物料编号,不可超过255个字符
     */
    private String materialCode = "";

    /**
     * 物料名称,不可超过255个字符
     */
    private String materialName;

    /**
     * 用量:分子,默认值为1,必须大于0
     */
    private String inputAmountNumerator;

    /**
     * 用量:分母,默认值为1,必须大于0
     */
    private String inputAmountDenominator;

    /**
     * 单位名称,不可超过255个字符
     */
    private String unit;

    /**
     * 损耗率(%),默认值为0,必须大于等于0
     */
    private String lossRate;

    /**
     * 展开版本号,不可超过255个字符
     */
    private String version;

    /**
     * 领料方式,key = PickModeEnum
     */
    private String pickMode;

    /**
     * 行备注,不可超过1000个字符,支持换行
     */
    private String remark;

    /**
     * 指定工序投料,单选,默认值为1
     */
    private Integer specificProcessInputInt;

    /**
     * 指定工序投料,是1否0默认值为是
     */
    private String specificProcessInput;

    /**
     * 拆分工序投料,是1否0,当前子项物料行有子行为1
     */
    private Integer splitProcessInputInt;

    /**
     * 拆分工序投料,当前子项物料行有子行为是
     */
    private String splitProcessInput;

    /**
     * 投料工序号,指定投料工序=是时,不可超过255个字符
     */
    private String inputProcessNum;

    /**
     * 子项物料行
     */
    private List<BomInputMaterialLineRequestDTO> bomInputMaterialLines;

    /**
     * 投料管控行
     */
    private List<BomFeedingControlRequestDTO> bomFeedingControls;

    public String getBomMaterialCode() {
        return bomMaterialCode;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public String getSeq() {
        return seq;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
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

    public String getVersion() {
        return version;
    }

    public String getPickMode() {
        return pickMode;
    }

    public String getRemark() {
        return remark;
    }

    public Integer getSpecificProcessInputInt() {
        return specificProcessInputInt;
    }

    public String getSpecificProcessInput() {
        return specificProcessInput;
    }

    public Integer getSplitProcessInputInt() {
        return splitProcessInputInt;
    }

    public String getSplitProcessInput() {
        return splitProcessInput;
    }

    public String getInputProcessNum() {
        return inputProcessNum;
    }

    public List<BomInputMaterialLineRequestDTO> getBomInputMaterialLines() {
        return bomInputMaterialLines;
    }

    public List<BomFeedingControlRequestDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public void setBomMaterialCode(String bomMaterialCode) {
        this.bomMaterialCode = bomMaterialCode;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
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

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPickMode(String pickMode) {
        this.pickMode = pickMode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSpecificProcessInputInt(Integer specificProcessInputInt) {
        this.specificProcessInputInt = specificProcessInputInt;
    }

    public void setSpecificProcessInput(String specificProcessInput) {
        this.specificProcessInput = specificProcessInput;
    }

    public void setSplitProcessInputInt(Integer splitProcessInputInt) {
        this.splitProcessInputInt = splitProcessInputInt;
    }

    public void setSplitProcessInput(String splitProcessInput) {
        this.splitProcessInput = splitProcessInput;
    }

    public void setInputProcessNum(String inputProcessNum) {
        this.inputProcessNum = inputProcessNum;
    }

    public void setBomInputMaterialLines(List<BomInputMaterialLineRequestDTO> bomInputMaterialLines) {
        this.bomInputMaterialLines = bomInputMaterialLines;
    }

    public void setBomFeedingControls(List<BomFeedingControlRequestDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }
}

