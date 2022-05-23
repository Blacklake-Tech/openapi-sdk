package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class ProduceTaskListResponseDTO {
    /**
     * 任务Id
     */
    private long taskId;

    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * Sop任务Id
     */
    private Long sopTaskId;

    /**
     * 工序ID
     */
    private long processId;

    /**
     * 工单ID
     */
    private long workOrderId;

    /**
     * 工单编号
     */
    private String workOrderCode;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序编号
     */
    private String processCode;

    /**
     * 工作中心
     */
    private WorkCenterResponseDTO workCenterResponseDTO;

    /**
     * 批号
     */
    private String batchNo;

    /**
     * 工单指定物料
     */
    private boolean specifiedMaterial;

    /**
     * 计划开始时间
     */
    private long planStartTime;

    /**
     * 计划结束时间
     */
    private long planEndTime;

    /**
     * 执行人
     */
    private List<UserInfoResponseDTO> executorList;

    /**
     * 任务状态 1 待执行、2 执行中、3 暂停中、4 已结束 5 已取消
     */
    private BizConstantDisplay taskStatus;

    /**
     * 任务进度（主物料）
     */
    private ProduceTaskProgressAppResponseDTO progressReportAppResponseDTO;

    /**
     * 报告模版ids
     */
    private List<Long> reportTemplateIds;

    public long getTaskId() {
        return taskId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public Long getSopTaskId() {
        return sopTaskId;
    }

    public long getProcessId() {
        return processId;
    }

    public long getWorkOrderId() {
        return workOrderId;
    }

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public String getProcessName() {
        return processName;
    }

    public String getProcessCode() {
        return processCode;
    }

    public WorkCenterResponseDTO getWorkCenterResponseDTO() {
        return workCenterResponseDTO;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public boolean getSpecifiedMaterial() {
        return specifiedMaterial;
    }

    public long getPlanStartTime() {
        return planStartTime;
    }

    public long getPlanEndTime() {
        return planEndTime;
    }

    public List<UserInfoResponseDTO> getExecutorList() {
        return executorList;
    }

    public BizConstantDisplay getTaskStatus() {
        return taskStatus;
    }

    public ProduceTaskProgressAppResponseDTO getProgressReportAppResponseDTO() {
        return progressReportAppResponseDTO;
    }

    public List<Long> getReportTemplateIds() {
        return reportTemplateIds;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public void setSopTaskId(Long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }

    public void setProcessId(long processId) {
        this.processId = processId;
    }

    public void setWorkOrderId(long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public void setWorkCenterResponseDTO(WorkCenterResponseDTO workCenterResponseDTO) {
        this.workCenterResponseDTO = workCenterResponseDTO;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setSpecifiedMaterial(boolean specifiedMaterial) {
        this.specifiedMaterial = specifiedMaterial;
    }

    public void setPlanStartTime(long planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setPlanEndTime(long planEndTime) {
        this.planEndTime = planEndTime;
    }

    public void setExecutorList(List<UserInfoResponseDTO> executorList) {
        this.executorList = executorList;
    }

    public void setTaskStatus(BizConstantDisplay taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setProgressReportAppResponseDTO(ProduceTaskProgressAppResponseDTO progressReportAppResponseDTO) {
        this.progressReportAppResponseDTO = progressReportAppResponseDTO;
    }

    public void setReportTemplateIds(List<Long> reportTemplateIds) {
        this.reportTemplateIds = reportTemplateIds;
    }
}

