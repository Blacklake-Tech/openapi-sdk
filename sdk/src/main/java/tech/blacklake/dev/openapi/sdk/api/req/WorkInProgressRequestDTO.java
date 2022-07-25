package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkInProgressRequestDTO  {
    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 自制单位
     */
    private Long unitId;

    /**
     * 投料单位
     */
    private Long feedUnitId;

    /**
     * 基准数
     */
    private String standardAmount;

    /**
     * 单次报工数量
     */
    private String singleWorkReportNum;

    /**
     * sop投料控件ID
     */
    private Long materialFeedControlId;

    /**
     * sop报工控件ID
     */
    private Long workReportControlId;

    /**
     * 是否入库
     */
    private int warehousing = 0;

    /**
     * 是否必投
     */
    private int feeding = 0;

    /**
     * 投料上下限类型
     */
    private int limit = 0;

    /**
     * 投料下限
     */
    private String lowerLimit;

    /**
     * 投料上限
     */
    private String upperLimit;

    /**
     * 投料下限比例
     */
    private String lowerLimitRatio;

    /**
     * 投料上限比例
     */
    private String upperLimitRatio;

    /**
     * 投料质量状态
     */
    private List<Integer> feedingQualityStatus;

    /**
     * 是否报工
     */
    private int reportFlag = 0;

    /**
     * 报工方式
     */
    private List<Integer> reportingMethods;

    /**
     * 自动入库
     */
    private Integer autoWarehousingFlag;

    /**
     * 投料类型 key = FeedTypeEnum
     */
    private Integer feedType;

    public Long getMaterialId() {
        return materialId;
    }

    public Long getUnitId() {
        return unitId;
    }

    public Long getFeedUnitId() {
        return feedUnitId;
    }

    public String getStandardAmount() {
        return standardAmount;
    }

    public String getSingleWorkReportNum() {
        return singleWorkReportNum;
    }

    public Long getMaterialFeedControlId() {
        return materialFeedControlId;
    }

    public Long getWorkReportControlId() {
        return workReportControlId;
    }

    public int getWarehousing() {
        return warehousing;
    }

    public int getFeeding() {
        return feeding;
    }

    public int getLimit() {
        return limit;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public String getLowerLimitRatio() {
        return lowerLimitRatio;
    }

    public String getUpperLimitRatio() {
        return upperLimitRatio;
    }

    public List<Integer> getFeedingQualityStatus() {
        return feedingQualityStatus;
    }

    public int getReportFlag() {
        return reportFlag;
    }

    public List<Integer> getReportingMethods() {
        return reportingMethods;
    }

    public Integer getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public Integer getFeedType() {
        return feedType;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setFeedUnitId(Long feedUnitId) {
        this.feedUnitId = feedUnitId;
    }

    public void setStandardAmount(String standardAmount) {
        this.standardAmount = standardAmount;
    }

    public void setSingleWorkReportNum(String singleWorkReportNum) {
        this.singleWorkReportNum = singleWorkReportNum;
    }

    public void setMaterialFeedControlId(Long materialFeedControlId) {
        this.materialFeedControlId = materialFeedControlId;
    }

    public void setWorkReportControlId(Long workReportControlId) {
        this.workReportControlId = workReportControlId;
    }

    public void setWarehousing(int warehousing) {
        this.warehousing = warehousing;
    }

    public void setFeeding(int feeding) {
        this.feeding = feeding;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void setLowerLimitRatio(String lowerLimitRatio) {
        this.lowerLimitRatio = lowerLimitRatio;
    }

    public void setUpperLimitRatio(String upperLimitRatio) {
        this.upperLimitRatio = upperLimitRatio;
    }

    public void setFeedingQualityStatus(List<Integer> feedingQualityStatus) {
        this.feedingQualityStatus = feedingQualityStatus;
    }

    public void setReportFlag(int reportFlag) {
        this.reportFlag = reportFlag;
    }

    public void setReportingMethods(List<Integer> reportingMethods) {
        this.reportingMethods = reportingMethods;
    }

    public void setAutoWarehousingFlag(Integer autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }

    public void setFeedType(Integer feedType) {
        this.feedType = feedType;
    }
}

