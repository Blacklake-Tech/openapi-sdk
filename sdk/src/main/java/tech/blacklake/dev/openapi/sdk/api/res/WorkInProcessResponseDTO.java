package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkInProcessResponseDTO  {
    /**
     * 工序在制品快照ID
     */
    private long id;

    /**
     * 工艺路线下工序ID
     */
    private long processRouteNodeId;

    /**
     * 物料id
     */
    private long materialId;

    /**
     * 物料信息
     */
    private MaterialResponseDTO material;

    /**
     * 单位id
     */
    private long unitId;

    /**
     * 单位
     */
    private UnitDetailResponseDTO unit;

    /**
     * 单次报工数量
     */
    private BigDecimal singleWorkReportNum;

    /**
     * sop报工控件ID
     */
    private Long workReportControlId;

    /**
     * sop报工控件Code
     */
    private String workReportControlCode;

    /**
     * 是否入库
     */
    private int warehousing;

    /**
     * 投料单位id
     */
    private long feedUnitId;

    /**
     * 投料单位
     */
    private UnitDetailResDO feedUnit;

    /**
     * sop投料控件ID
     */
    private Long materialFeedControlId;

    /**
     * sop投料控件Code
     */
    private String materialFeedControlCode;

    /**
     * 是否必投
     */
    private int feeding;

    /**
     * 投料上下限类型 key= input
     */
    private BizConstantDisplay limit;

    /**
     * 投料下限
     */
    private BigDecimal lowerLimit;

    /**
     * 投料上限
     */
    private BigDecimal upperLimit;

    /**
     * 投料下限比例
     */
    private BigDecimal lowerLimitRatio;

    /**
     * 投料上限比例
     */
    private BigDecimal upperLimitRatio;

    /**
     * 投料质量状态
     */
    private List<Integer> feedingQualityStatus;

    /**
     * 计划生产数
     */
    private BaseAmountDisplay plannedAmount;

    /**
     * 基准数
     */
    private String standardAmount;

    /**
     * 已下发数
     */
    private BaseAmountDisplay dispatchedAmount;

    /**
     * 正在下发数
     */
    private BaseAmountDisplay nowDispatchedAmount;

    /**
     * 可下发数
     */
    private BaseAmountDisplay dispatchedRemainAmount;

    /**
     * 总报工数
     */
    private BaseAmountDisplay totalReportAmount;

    /**
     * 合格报工数
     */
    private BaseAmountDisplay qualifiedAmount;

    /**
     * 不良报工数
     */
    private BaseAmountDisplay disqualifiedAmount;

    /**
     * 投料数
     */
    private BaseAmountDisplay inputAmount;

    /**
     * 入库数
     */
    private BaseAmountDisplay warehousedAmount;

    /**
     * 是否报工
     */
    private int reportFlag;

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
    private BizConstantDisplay feedType;

    public long getId() {
        return id;
    }

    public long getProcessRouteNodeId() {
        return processRouteNodeId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public long getUnitId() {
        return unitId;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public BigDecimal getSingleWorkReportNum() {
        return singleWorkReportNum;
    }

    public Long getWorkReportControlId() {
        return workReportControlId;
    }

    public String getWorkReportControlCode() {
        return workReportControlCode;
    }

    public int getWarehousing() {
        return warehousing;
    }

    public long getFeedUnitId() {
        return feedUnitId;
    }

    public UnitDetailResDO getFeedUnit() {
        return feedUnit;
    }

    public Long getMaterialFeedControlId() {
        return materialFeedControlId;
    }

    public String getMaterialFeedControlCode() {
        return materialFeedControlCode;
    }

    public int getFeeding() {
        return feeding;
    }

    public BizConstantDisplay getLimit() {
        return limit;
    }

    public BigDecimal getLowerLimit() {
        return lowerLimit;
    }

    public BigDecimal getUpperLimit() {
        return upperLimit;
    }

    public BigDecimal getLowerLimitRatio() {
        return lowerLimitRatio;
    }

    public BigDecimal getUpperLimitRatio() {
        return upperLimitRatio;
    }

    public List<Integer> getFeedingQualityStatus() {
        return feedingQualityStatus;
    }

    public BaseAmountDisplay getPlannedAmount() {
        return plannedAmount;
    }

    public String getStandardAmount() {
        return standardAmount;
    }

    public BaseAmountDisplay getDispatchedAmount() {
        return dispatchedAmount;
    }

    public BaseAmountDisplay getNowDispatchedAmount() {
        return nowDispatchedAmount;
    }

    public BaseAmountDisplay getDispatchedRemainAmount() {
        return dispatchedRemainAmount;
    }

    public BaseAmountDisplay getTotalReportAmount() {
        return totalReportAmount;
    }

    public BaseAmountDisplay getQualifiedAmount() {
        return qualifiedAmount;
    }

    public BaseAmountDisplay getDisqualifiedAmount() {
        return disqualifiedAmount;
    }

    public BaseAmountDisplay getInputAmount() {
        return inputAmount;
    }

    public BaseAmountDisplay getWarehousedAmount() {
        return warehousedAmount;
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

    public BizConstantDisplay getFeedType() {
        return feedType;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProcessRouteNodeId(long processRouteNodeId) {
        this.processRouteNodeId = processRouteNodeId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setSingleWorkReportNum(BigDecimal singleWorkReportNum) {
        this.singleWorkReportNum = singleWorkReportNum;
    }

    public void setWorkReportControlId(Long workReportControlId) {
        this.workReportControlId = workReportControlId;
    }

    public void setWorkReportControlCode(String workReportControlCode) {
        this.workReportControlCode = workReportControlCode;
    }

    public void setWarehousing(int warehousing) {
        this.warehousing = warehousing;
    }

    public void setFeedUnitId(long feedUnitId) {
        this.feedUnitId = feedUnitId;
    }

    public void setFeedUnit(UnitDetailResDO feedUnit) {
        this.feedUnit = feedUnit;
    }

    public void setMaterialFeedControlId(Long materialFeedControlId) {
        this.materialFeedControlId = materialFeedControlId;
    }

    public void setMaterialFeedControlCode(String materialFeedControlCode) {
        this.materialFeedControlCode = materialFeedControlCode;
    }

    public void setFeeding(int feeding) {
        this.feeding = feeding;
    }

    public void setLimit(BizConstantDisplay limit) {
        this.limit = limit;
    }

    public void setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setUpperLimit(BigDecimal upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void setLowerLimitRatio(BigDecimal lowerLimitRatio) {
        this.lowerLimitRatio = lowerLimitRatio;
    }

    public void setUpperLimitRatio(BigDecimal upperLimitRatio) {
        this.upperLimitRatio = upperLimitRatio;
    }

    public void setFeedingQualityStatus(List<Integer> feedingQualityStatus) {
        this.feedingQualityStatus = feedingQualityStatus;
    }

    public void setPlannedAmount(BaseAmountDisplay plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setStandardAmount(String standardAmount) {
        this.standardAmount = standardAmount;
    }

    public void setDispatchedAmount(BaseAmountDisplay dispatchedAmount) {
        this.dispatchedAmount = dispatchedAmount;
    }

    public void setNowDispatchedAmount(BaseAmountDisplay nowDispatchedAmount) {
        this.nowDispatchedAmount = nowDispatchedAmount;
    }

    public void setDispatchedRemainAmount(BaseAmountDisplay dispatchedRemainAmount) {
        this.dispatchedRemainAmount = dispatchedRemainAmount;
    }

    public void setTotalReportAmount(BaseAmountDisplay totalReportAmount) {
        this.totalReportAmount = totalReportAmount;
    }

    public void setQualifiedAmount(BaseAmountDisplay qualifiedAmount) {
        this.qualifiedAmount = qualifiedAmount;
    }

    public void setDisqualifiedAmount(BaseAmountDisplay disqualifiedAmount) {
        this.disqualifiedAmount = disqualifiedAmount;
    }

    public void setInputAmount(BaseAmountDisplay inputAmount) {
        this.inputAmount = inputAmount;
    }

    public void setWarehousedAmount(BaseAmountDisplay warehousedAmount) {
        this.warehousedAmount = warehousedAmount;
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

    public void setFeedType(BizConstantDisplay feedType) {
        this.feedType = feedType;
    }
}

