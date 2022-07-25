package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InputMaterialRequestDTO {
    /**
     * 工单编号
     */
    private String workOrderCode;

    /**
     * 项次,默认以10开始,以10递增
     */
    private String seq;

    /**
     * 子项物料编号
     */
    private String materialCode;

    /**
     * 子项物料名称
     */
    private String materialName;

    /**
     * 版本号
     */
    private String version;

    /**
     * 分子,默认值为1,必须大于等于0
     */
    private String subInputAmountNumerator;

    /**
     * 分母,默认值为1,必须大于等于0
     */
    private String subInputAmountDenominator;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 损耗率,不填默认值为0,必须大于等于0,小数点后位数不可超过4位,必须小于100
     */
    private String lossRate;

    /**
     * 需求时间,默认为生产工单开始时间,格式为YYYY/mm/DD HH:MM:SS的毫秒数
     */
    private Long requirementTime;

    /**
     * 领料方式,单选,默认为按需领料,key = PickModeEnum
     */
    private Integer pickMode;

    /**
     * 是否指定工序投料,是1否0,默认值为1
     */
    private int specificProcessInputInt = 0;

    /**
     * 是否指定工序投料,单选,默认值为是
     */
    private String specificProcessInput;

    /**
     * 供应商IDs,多选
     */
    private String suppliers;

    /**
     * 是否拆分控件投料,是1否0
     */
    private int splitSopControlInputInt = 0;

    /**
     * 是否拆分控件投料
     */
    private String splitSopControlInput;

    /**
     * 当指定投料工序=是时,必须为主产出所选工艺路线中已有的工序号
     */
    private String inputProcessNum;

    /**
     * 行备注,不可超过1000个字符,支持换行
     */
    private String remark;

    public String getWorkOrderCode() {
        return workOrderCode;
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

    public String getVersion() {
        return version;
    }

    public String getSubInputAmountNumerator() {
        return subInputAmountNumerator;
    }

    public String getSubInputAmountDenominator() {
        return subInputAmountDenominator;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getLossRate() {
        return lossRate;
    }

    public Long getRequirementTime() {
        return requirementTime;
    }

    public Integer getPickMode() {
        return pickMode;
    }

    public int getSpecificProcessInputInt() {
        return specificProcessInputInt;
    }

    public String getSpecificProcessInput() {
        return specificProcessInput;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public int getSplitSopControlInputInt() {
        return splitSopControlInputInt;
    }

    public String getSplitSopControlInput() {
        return splitSopControlInput;
    }

    public String getInputProcessNum() {
        return inputProcessNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
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

    public void setVersion(String version) {
        this.version = version;
    }

    public void setSubInputAmountNumerator(String subInputAmountNumerator) {
        this.subInputAmountNumerator = subInputAmountNumerator;
    }

    public void setSubInputAmountDenominator(String subInputAmountDenominator) {
        this.subInputAmountDenominator = subInputAmountDenominator;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }

    public void setRequirementTime(Long requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setPickMode(Integer pickMode) {
        this.pickMode = pickMode;
    }

    public void setSpecificProcessInputInt(int specificProcessInputInt) {
        this.specificProcessInputInt = specificProcessInputInt;
    }

    public void setSpecificProcessInput(String specificProcessInput) {
        this.specificProcessInput = specificProcessInput;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public void setSplitSopControlInputInt(int splitSopControlInputInt) {
        this.splitSopControlInputInt = splitSopControlInputInt;
    }

    public void setSplitSopControlInput(String splitSopControlInput) {
        this.splitSopControlInput = splitSopControlInput;
    }

    public void setInputProcessNum(String inputProcessNum) {
        this.inputProcessNum = inputProcessNum;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

