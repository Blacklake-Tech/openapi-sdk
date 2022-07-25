package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProgressReportRequestRequestDTO {
    /**
     * 生产任务ID
     */
    private long taskId = 0;

    /**
     * 工单id
     */
    private long workOrderId = 0;

    /**
     * 工序ID
     */
    private long processId = 0;

    /**
     * 报工方式
     */
    private int reportType = 0;

    /**
     * 是否入库
     */
    private boolean warehousingFlag = false;

    /**
     * 是否自动入库
     */
    private boolean autoWarehousingFlag = false;

    /**
     * 是否一码到底
     */
    private boolean qrCodeReusedFlag = false;

    /**
     * 标示码
     */
    private String qrCode;

    /**
     * sop任务id
     */
    private Long sopTaskId;

    /**
     * 步骤id
     */
    private Long stepId;

    /**
     * 控件id
     */
    private Long controlId;

    /**
     * 循环维度id
     */
    private Long sopExecRecordId;

    /**
     * sop执行次数
     */
    private Integer execTimes;

    /**
     * 质量状态 1-合格 2-让步合格 3-代检 4-不合格
     */
    private int qcStatus = 0;

    /**
     * 入库位置（仓位id）
     */
    private Long storageLocationId;

    /**
     * 报工开始时间
     */
    private Long reportStartTime;

    /**
     * 报工结束时间
     */
    private Long reportEndTime;

    /**
     * 报工工时
     */
    private BigDecimal workHour;

    /**
     * 执行人
     */
    private List<Long> actualExecutorIds;

    /**
     * 设备列表
     */
    private List<Long> actualEquipmentIds;

    /**
     * 生产部门列表
     */
    private List<Long> actualDepartmentIds;

    /**
     * 其他资源列表
     */
    private List<ResourceGroupRequestDTO> resourceList;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 批次号Id
     */
    private Long batchNoId;

    /**
     * 物料id
     */
    private long materialId = 0;

    /**
     * 物料行id
     */
    private long lineId = 0;

    /**
     * 报工物料信息列表
     */
    private List<ProgressReportMaterialAmountRequestDTO> progressReportMaterialAmountCOList;

    /**
     * 追溯相关投料信息
     */
    private List<TraceNodeRequestDTO> traceFeedNodeList;

    /**
     * 可跳过规则
     */
    private List<String> skipWeakControlRule;

    public long getTaskId() {
        return taskId;
    }

    public long getWorkOrderId() {
        return workOrderId;
    }

    public long getProcessId() {
        return processId;
    }

    public int getReportType() {
        return reportType;
    }

    public boolean getWarehousingFlag() {
        return warehousingFlag;
    }

    public boolean getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public boolean getQrCodeReusedFlag() {
        return qrCodeReusedFlag;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Long getSopTaskId() {
        return sopTaskId;
    }

    public Long getStepId() {
        return stepId;
    }

    public Long getControlId() {
        return controlId;
    }

    public Long getSopExecRecordId() {
        return sopExecRecordId;
    }

    public Integer getExecTimes() {
        return execTimes;
    }

    public int getQcStatus() {
        return qcStatus;
    }

    public Long getStorageLocationId() {
        return storageLocationId;
    }

    public Long getReportStartTime() {
        return reportStartTime;
    }

    public Long getReportEndTime() {
        return reportEndTime;
    }

    public BigDecimal getWorkHour() {
        return workHour;
    }

    public List<Long> getActualExecutorIds() {
        return actualExecutorIds;
    }

    public List<Long> getActualEquipmentIds() {
        return actualEquipmentIds;
    }

    public List<Long> getActualDepartmentIds() {
        return actualDepartmentIds;
    }

    public List<ResourceGroupRequestDTO> getResourceList() {
        return resourceList;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Long getBatchNoId() {
        return batchNoId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public long getLineId() {
        return lineId;
    }

    public List<ProgressReportMaterialAmountRequestDTO> getProgressReportMaterialAmountCOList() {
        return progressReportMaterialAmountCOList;
    }

    public List<TraceNodeRequestDTO> getTraceFeedNodeList() {
        return traceFeedNodeList;
    }

    public List<String> getSkipWeakControlRule() {
        return skipWeakControlRule;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setWorkOrderId(long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setProcessId(long processId) {
        this.processId = processId;
    }

    public void setReportType(int reportType) {
        this.reportType = reportType;
    }

    public void setWarehousingFlag(boolean warehousingFlag) {
        this.warehousingFlag = warehousingFlag;
    }

    public void setAutoWarehousingFlag(boolean autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }

    public void setQrCodeReusedFlag(boolean qrCodeReusedFlag) {
        this.qrCodeReusedFlag = qrCodeReusedFlag;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setSopTaskId(Long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public void setControlId(Long controlId) {
        this.controlId = controlId;
    }

    public void setSopExecRecordId(Long sopExecRecordId) {
        this.sopExecRecordId = sopExecRecordId;
    }

    public void setExecTimes(Integer execTimes) {
        this.execTimes = execTimes;
    }

    public void setQcStatus(int qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setStorageLocationId(Long storageLocationId) {
        this.storageLocationId = storageLocationId;
    }

    public void setReportStartTime(Long reportStartTime) {
        this.reportStartTime = reportStartTime;
    }

    public void setReportEndTime(Long reportEndTime) {
        this.reportEndTime = reportEndTime;
    }

    public void setWorkHour(BigDecimal workHour) {
        this.workHour = workHour;
    }

    public void setActualExecutorIds(List<Long> actualExecutorIds) {
        this.actualExecutorIds = actualExecutorIds;
    }

    public void setActualEquipmentIds(List<Long> actualEquipmentIds) {
        this.actualEquipmentIds = actualEquipmentIds;
    }

    public void setActualDepartmentIds(List<Long> actualDepartmentIds) {
        this.actualDepartmentIds = actualDepartmentIds;
    }

    public void setResourceList(List<ResourceGroupRequestDTO> resourceList) {
        this.resourceList = resourceList;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setBatchNoId(Long batchNoId) {
        this.batchNoId = batchNoId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public void setProgressReportMaterialAmountCOList(List<ProgressReportMaterialAmountRequestDTO> progressReportMaterialAmountCOList) {
        this.progressReportMaterialAmountCOList = progressReportMaterialAmountCOList;
    }

    public void setTraceFeedNodeList(List<TraceNodeRequestDTO> traceFeedNodeList) {
        this.traceFeedNodeList = traceFeedNodeList;
    }

    public void setSkipWeakControlRule(List<String> skipWeakControlRule) {
        this.skipWeakControlRule = skipWeakControlRule;
    }
}

