package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRetractRecordListResponseDTO {
    /**
     * 投料回撤记录ID
     */
    private long retractRecordId = 0;

    /**
     * 投料记录ID
     */
    private long feedRecordId = 0;

    /**
     * 投料详情记录ID
     */
    private long feedRecordDetailId = 0;

    /**
     * 生产任务id
     */
    private long taskId = 0;

    /**
     * 工单id
     */
    private long workOrderId = 0;

    /**
     * 回撤仓位
     */
    private StorageLocationResponseDTO retractLocation;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 原投料标识码
     */
    private String feedIdentifier;

    /**
     * 回撤标识码
     */
    private String retractIdentifier;

    /**
     * 回撤质量状态（1-合格；2-让步合格；3-待检；4-不合格）
     */
    private BizConstantDisplay qcStatus;

    /**
     * 批次号ID
     */
    private Long batchNoId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 回撤数量
     */
    private BaseAmountDisplay retractAmount;

    /**
     * 辅助单位1数量
     */
    private BaseAmountDisplay auxAmount1;

    /**
     * 辅助单位2数量
     */
    private BaseAmountDisplay auxAmount2;

    /**
     * 回撤人员
     */
    private UserBaseResponseDTO retractUser;

    /**
     * 回撤时间
     */
    private long retractTime = 0;

    /**
     * 原因
     */
    private String retractReason;

    public long getRetractRecordId() {
        return retractRecordId;
    }

    public long getFeedRecordId() {
        return feedRecordId;
    }

    public long getFeedRecordDetailId() {
        return feedRecordDetailId;
    }

    public long getTaskId() {
        return taskId;
    }

    public long getWorkOrderId() {
        return workOrderId;
    }

    public StorageLocationResponseDTO getRetractLocation() {
        return retractLocation;
    }

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public String getFeedIdentifier() {
        return feedIdentifier;
    }

    public String getRetractIdentifier() {
        return retractIdentifier;
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

    public BaseAmountDisplay getRetractAmount() {
        return retractAmount;
    }

    public BaseAmountDisplay getAuxAmount1() {
        return auxAmount1;
    }

    public BaseAmountDisplay getAuxAmount2() {
        return auxAmount2;
    }

    public UserBaseResponseDTO getRetractUser() {
        return retractUser;
    }

    public long getRetractTime() {
        return retractTime;
    }

    public String getRetractReason() {
        return retractReason;
    }

    public void setRetractRecordId(long retractRecordId) {
        this.retractRecordId = retractRecordId;
    }

    public void setFeedRecordId(long feedRecordId) {
        this.feedRecordId = feedRecordId;
    }

    public void setFeedRecordDetailId(long feedRecordDetailId) {
        this.feedRecordDetailId = feedRecordDetailId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setWorkOrderId(long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setRetractLocation(StorageLocationResponseDTO retractLocation) {
        this.retractLocation = retractLocation;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setFeedIdentifier(String feedIdentifier) {
        this.feedIdentifier = feedIdentifier;
    }

    public void setRetractIdentifier(String retractIdentifier) {
        this.retractIdentifier = retractIdentifier;
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

    public void setRetractAmount(BaseAmountDisplay retractAmount) {
        this.retractAmount = retractAmount;
    }

    public void setAuxAmount1(BaseAmountDisplay auxAmount1) {
        this.auxAmount1 = auxAmount1;
    }

    public void setAuxAmount2(BaseAmountDisplay auxAmount2) {
        this.auxAmount2 = auxAmount2;
    }

    public void setRetractUser(UserBaseResponseDTO retractUser) {
        this.retractUser = retractUser;
    }

    public void setRetractTime(long retractTime) {
        this.retractTime = retractTime;
    }

    public void setRetractReason(String retractReason) {
        this.retractReason = retractReason;
    }
}

