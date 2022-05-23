package tech.blacklake.dev.openapi.sdk.api.common;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class ProcessManufacturedGoodsDTO {
    /**
     * 工艺路线编号,不可超过255个字符
     */
    private String processRouteCode = "";

    /**
     * 工序号,不可超过255个字符
     */
    private String processNum = "";

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 数量,默认值为1,大于0
     */
    private String amount;

    /**
     * 报工控件编号,不超过64字符
     */
    private String workReportControlCode;

    /**
     * 单次报工数量,当是否报工=否时;值为null;disable;当是否报工=是时,单次报工数量,默认值为null,必须大于0
     */
    private String singleWorkReportNum;

    /**
     * 是否入库,是1否0,当是否报工=否时;值为null;disable,当是否报工=是时;支持选择是/否;默认为1
     */
    private Integer warehousingInt;

    /**
     * 是否入库,当是否报工=否时;值为null;disable,当是否报工=是时;支持选择是/否;默认为是
     */
    private String warehousing;

    /**
     * 投料控件编号,不超过64字符
     */
    private String materialFeedControlCode;

    /**
     * 投料上下限类型,key = FeedingLimitEnum
     */
    private String limit;

    /**
     * 投料上限(比例%),默认值为0,当投料上下限类型=固定值时,必须大于等于0,当投料上下限类型=按比例时,必须大于等于0,小于等于100
     */
    private String upperLimitRatio;

    /**
     * 投料下限(比例%),默认值为0,当投料上下限类型=固定值时,必须大于等于0,当投料上下限类型=按比例时,必须大于等于0,小于等于100
     */
    private String lowerLimitRatio;

    /**
     * 投料质量状态,key = QualityStatusEnum
     */
    private String feedingQualityStatus;

    public String getProcessRouteCode() {
        return processRouteCode;
    }

    public String getProcessNum() {
        return processNum;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getAmount() {
        return amount;
    }

    public String getWorkReportControlCode() {
        return workReportControlCode;
    }

    public String getSingleWorkReportNum() {
        return singleWorkReportNum;
    }

    public Integer getWarehousingInt() {
        return warehousingInt;
    }

    public String getWarehousing() {
        return warehousing;
    }

    public String getMaterialFeedControlCode() {
        return materialFeedControlCode;
    }

    public String getLimit() {
        return limit;
    }

    public String getUpperLimitRatio() {
        return upperLimitRatio;
    }

    public String getLowerLimitRatio() {
        return lowerLimitRatio;
    }

    public String getFeedingQualityStatus() {
        return feedingQualityStatus;
    }

    public void setProcessRouteCode(String processRouteCode) {
        this.processRouteCode = processRouteCode;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setWorkReportControlCode(String workReportControlCode) {
        this.workReportControlCode = workReportControlCode;
    }

    public void setSingleWorkReportNum(String singleWorkReportNum) {
        this.singleWorkReportNum = singleWorkReportNum;
    }

    public void setWarehousingInt(Integer warehousingInt) {
        this.warehousingInt = warehousingInt;
    }

    public void setWarehousing(String warehousing) {
        this.warehousing = warehousing;
    }

    public void setMaterialFeedControlCode(String materialFeedControlCode) {
        this.materialFeedControlCode = materialFeedControlCode;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public void setUpperLimitRatio(String upperLimitRatio) {
        this.upperLimitRatio = upperLimitRatio;
    }

    public void setLowerLimitRatio(String lowerLimitRatio) {
        this.lowerLimitRatio = lowerLimitRatio;
    }

    public void setFeedingQualityStatus(String feedingQualityStatus) {
        this.feedingQualityStatus = feedingQualityStatus;
    }
}

