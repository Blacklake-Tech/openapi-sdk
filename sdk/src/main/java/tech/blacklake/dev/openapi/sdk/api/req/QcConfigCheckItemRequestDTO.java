package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigCheckItemRequestDTO {
    /**
     * 检验方案编号
     */
    private String code;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 检验项编号
     */
    private String checkItemCode;

    /**
     * 是否必填
     */
    private String recordCheckItemType;

    /**
     * 总份数
     */
    private String totalReportCount;

    /**
     * 必填份数
     */
    private String requireReportCount;

    /**
     * 检验项格式
     */
    private String executeItemType;

    /**
     * 抽检类型
     */
    private String checkCountType;

    /**
     * 抽检数值
     */
    private String checkCount;

    /**
     * 抽检方案
     */
    private String customAqlName;

    /**
     * 检验水平
     */
    private String qcAqlInspectionLevel;

    /**
     * 严格度
     */
    private String qcAqlCategory;

    /**
     * 接收质量限
     */
    private String acceptLimit;

    /**
     * 全部选项
     */
    private String radios;

    /**
     * 合格选项
     */
    private String qualityItems;

    /**
     * 标准值类型
     */
    private String logic;

    /**
     * 标准值
     */
    private String base;

    /**
     * 标准单位
     */
    private String unit;

    /**
     * 实测值精度
     */
    private String scale;

    /**
     * 实测值格式
     */
    private String checkValueType;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 不良原因
     */
    private String defectReasons;

    /**
     * 不良等级
     */
    private String defectRanks;

    /**
     * 检验设备编号
     */
    private String equipments;

    /**
     * 备注
     */
    private String remark;

    /**
     * 执行时可填写备注
     */
    private String executeRemark;

    /**
     * 执行时可上传图片
     */
    private String executeUpload;

    /**
     * 附加结论
     */
    private String extraResults;

    public String getCode() {
        return code;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getCheckItemCode() {
        return checkItemCode;
    }

    public String getRecordCheckItemType() {
        return recordCheckItemType;
    }

    public String getTotalReportCount() {
        return totalReportCount;
    }

    public String getRequireReportCount() {
        return requireReportCount;
    }

    public String getExecuteItemType() {
        return executeItemType;
    }

    public String getCheckCountType() {
        return checkCountType;
    }

    public String getCheckCount() {
        return checkCount;
    }

    public String getCustomAqlName() {
        return customAqlName;
    }

    public String getQcAqlInspectionLevel() {
        return qcAqlInspectionLevel;
    }

    public String getQcAqlCategory() {
        return qcAqlCategory;
    }

    public String getAcceptLimit() {
        return acceptLimit;
    }

    public String getRadios() {
        return radios;
    }

    public String getQualityItems() {
        return qualityItems;
    }

    public String getLogic() {
        return logic;
    }

    public String getBase() {
        return base;
    }

    public String getUnit() {
        return unit;
    }

    public String getScale() {
        return scale;
    }

    public String getCheckValueType() {
        return checkValueType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getDefectReasons() {
        return defectReasons;
    }

    public String getDefectRanks() {
        return defectRanks;
    }

    public String getEquipments() {
        return equipments;
    }

    public String getRemark() {
        return remark;
    }

    public String getExecuteRemark() {
        return executeRemark;
    }

    public String getExecuteUpload() {
        return executeUpload;
    }

    public String getExtraResults() {
        return extraResults;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCheckItemCode(String checkItemCode) {
        this.checkItemCode = checkItemCode;
    }

    public void setRecordCheckItemType(String recordCheckItemType) {
        this.recordCheckItemType = recordCheckItemType;
    }

    public void setTotalReportCount(String totalReportCount) {
        this.totalReportCount = totalReportCount;
    }

    public void setRequireReportCount(String requireReportCount) {
        this.requireReportCount = requireReportCount;
    }

    public void setExecuteItemType(String executeItemType) {
        this.executeItemType = executeItemType;
    }

    public void setCheckCountType(String checkCountType) {
        this.checkCountType = checkCountType;
    }

    public void setCheckCount(String checkCount) {
        this.checkCount = checkCount;
    }

    public void setCustomAqlName(String customAqlName) {
        this.customAqlName = customAqlName;
    }

    public void setQcAqlInspectionLevel(String qcAqlInspectionLevel) {
        this.qcAqlInspectionLevel = qcAqlInspectionLevel;
    }

    public void setQcAqlCategory(String qcAqlCategory) {
        this.qcAqlCategory = qcAqlCategory;
    }

    public void setAcceptLimit(String acceptLimit) {
        this.acceptLimit = acceptLimit;
    }

    public void setRadios(String radios) {
        this.radios = radios;
    }

    public void setQualityItems(String qualityItems) {
        this.qualityItems = qualityItems;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setCheckValueType(String checkValueType) {
        this.checkValueType = checkValueType;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setDefectReasons(String defectReasons) {
        this.defectReasons = defectReasons;
    }

    public void setDefectRanks(String defectRanks) {
        this.defectRanks = defectRanks;
    }

    public void setEquipments(String equipments) {
        this.equipments = equipments;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setExecuteRemark(String executeRemark) {
        this.executeRemark = executeRemark;
    }

    public void setExecuteUpload(String executeUpload) {
        this.executeUpload = executeUpload;
    }

    public void setExtraResults(String extraResults) {
        this.extraResults = extraResults;
    }
}
