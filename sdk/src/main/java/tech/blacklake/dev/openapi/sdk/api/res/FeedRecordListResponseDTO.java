package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FeedRecordListResponseDTO {
    /**
     * 生产任务id
     */
    private long taskId;

    /**
     * 投料记录ID
     */
    private long feedRecordId;

    /**
     * 投料记录详情ID
     */
    private long feedRecordDetailId;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 物料行ID
     */
    private Long lineId;

    /**
     * 物料子行ID
     */
    private Long subLineId;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 批次标识码
     */
    private String batchIdentifier;

    /**
     * 库存标识码
     */
    private String inventoryIdentifier;

    /**
     * 物料质量状态（1-合格；2-让步合格；3-待检；4-不合格）
     */
    private BizConstantDisplay qcStatus;

    /**
     * 批次号id
     */
    private Long batchNoId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 投料数量
     */
    private BaseAmountDisplay feedAmount;

    /**
     * 回撤数量
     */
    private BaseAmountDisplay retractAmount;

    /**
     * 剩余可回撤数量
     */
    private BaseAmountDisplay canRetractAmount;

    /**
     * 辅助单位1数量
     */
    private BaseAmountDisplay auxAmount1;

    /**
     * 辅助单位2数量
     */
    private BaseAmountDisplay auxAmount2;

    /**
     * 投料人员
     */
    private UserBaseResponseDTO feedUser;

    /**
     * 投料时间
     */
    private long feedTime;

    /**
     * 投料仓位
     */
    private StorageLocationResponseDTO opeLocation;

    public long getTaskId() {
        return taskId;
    }

    public long getFeedRecordId() {
        return feedRecordId;
    }

    public long getFeedRecordDetailId() {
        return feedRecordDetailId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public Long getLineId() {
        return lineId;
    }

    public Long getSubLineId() {
        return subLineId;
    }

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public String getBatchIdentifier() {
        return batchIdentifier;
    }

    public String getInventoryIdentifier() {
        return inventoryIdentifier;
    }

    public BizConstantDisplay getQcStatus() {
        return qcStatus;
    }

    public Long getBatchNoId() {
        return batchNoId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public BaseAmountDisplay getFeedAmount() {
        return feedAmount;
    }

    public BaseAmountDisplay getRetractAmount() {
        return retractAmount;
    }

    public BaseAmountDisplay getCanRetractAmount() {
        return canRetractAmount;
    }

    public BaseAmountDisplay getAuxAmount1() {
        return auxAmount1;
    }

    public BaseAmountDisplay getAuxAmount2() {
        return auxAmount2;
    }

    public UserBaseResponseDTO getFeedUser() {
        return feedUser;
    }

    public long getFeedTime() {
        return feedTime;
    }

    public StorageLocationResponseDTO getOpeLocation() {
        return opeLocation;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setFeedRecordId(long feedRecordId) {
        this.feedRecordId = feedRecordId;
    }

    public void setFeedRecordDetailId(long feedRecordDetailId) {
        this.feedRecordDetailId = feedRecordDetailId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public void setSubLineId(Long subLineId) {
        this.subLineId = subLineId;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setBatchIdentifier(String batchIdentifier) {
        this.batchIdentifier = batchIdentifier;
    }

    public void setInventoryIdentifier(String inventoryIdentifier) {
        this.inventoryIdentifier = inventoryIdentifier;
    }

    public void setQcStatus(BizConstantDisplay qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBatchNoId(Long batchNoId) {
        this.batchNoId = batchNoId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setFeedAmount(BaseAmountDisplay feedAmount) {
        this.feedAmount = feedAmount;
    }

    public void setRetractAmount(BaseAmountDisplay retractAmount) {
        this.retractAmount = retractAmount;
    }

    public void setCanRetractAmount(BaseAmountDisplay canRetractAmount) {
        this.canRetractAmount = canRetractAmount;
    }

    public void setAuxAmount1(BaseAmountDisplay auxAmount1) {
        this.auxAmount1 = auxAmount1;
    }

    public void setAuxAmount2(BaseAmountDisplay auxAmount2) {
        this.auxAmount2 = auxAmount2;
    }

    public void setFeedUser(UserBaseResponseDTO feedUser) {
        this.feedUser = feedUser;
    }

    public void setFeedTime(long feedTime) {
        this.feedTime = feedTime;
    }

    public void setOpeLocation(StorageLocationResponseDTO opeLocation) {
        this.opeLocation = opeLocation;
    }
}
