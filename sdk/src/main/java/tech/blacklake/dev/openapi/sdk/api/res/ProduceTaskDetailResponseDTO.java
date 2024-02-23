package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProduceTaskDetailResponseDTO {
    /**
     * 任务ID
     */
    private long taskId;

    /**
     * SOP任务ID
     */
    private Long sopTaskId;

    /**
     * 任务号
     */
    private String taskCode;

    /**
     * 任务状态
     */
    private BizConstantDisplay taskStatus;

    /**
     * 工单ID
     */
    private long relatedWorkOrderId;

    /**
     * 工单编号
     */
    private String relatedWorkOrderCode;

    /**
     * 工单是否指定物料
     */
    private boolean specifiedMaterial;

    /**
     * 工作中心
     */
    private WorkCenterResponseDTO workCenterResponseDTO;

    /**
     * 工序ID
     */
    private long relatedProcessId;

    /**
     * 工序序号
     */
    private String relatedProcessNum;

    /**
     * 工序名称
     */
    private String relatedProcessName;

    /**
     * 工序编号
     */
    private String relatedProcessCode;

    /**
     * 批号
     */
    private String materialBatchNo;

    /**
     * 可执行人
     */
    private List<UserBaseResponseDTO> executors;

    /**
     * 设备
     */
    private List<ResourceResponseDTO> equipments;

    /**
     * 可执行部门
     */
    private List<ResourceResponseDTO> departments;

    /**
     * 其他资源
     */
    private List<ResourceGroupResponseDTO> otherResources;

    /**
     * 实际开始时间
     */
    private Long planStartTime;

    /**
     * 实际开工时间
     */
    private Long actualStartTime;

    /**
     * 计划结束时间
     */
    private Long planEndTime;

    /**
     * 附件
     */
    private List<Long> appendixIds;

    /**
     * 备注
     */
    private String remark;

    /**
     * 销售订单信息列表
     */
    private List<SalesOrderResponseDTO> salesOrderList;

    /**
     * 报告模版ID列表
     */
    private List<Long> reportTemplateIds;

    public long getTaskId() {
        return taskId;
    }

    public Long getSopTaskId() {
        return sopTaskId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public BizConstantDisplay getTaskStatus() {
        return taskStatus;
    }

    public long getRelatedWorkOrderId() {
        return relatedWorkOrderId;
    }

    public String getRelatedWorkOrderCode() {
        return relatedWorkOrderCode;
    }

    public boolean getSpecifiedMaterial() {
        return specifiedMaterial;
    }

    public WorkCenterResponseDTO getWorkCenterResponseDTO() {
        return workCenterResponseDTO;
    }

    public long getRelatedProcessId() {
        return relatedProcessId;
    }

    public String getRelatedProcessNum() {
        return relatedProcessNum;
    }

    public String getRelatedProcessName() {
        return relatedProcessName;
    }

    public String getRelatedProcessCode() {
        return relatedProcessCode;
    }

    public String getMaterialBatchNo() {
        return materialBatchNo;
    }

    public List<UserBaseResponseDTO> getExecutors() {
        return executors;
    }

    public List<ResourceResponseDTO> getEquipments() {
        return equipments;
    }

    public List<ResourceResponseDTO> getDepartments() {
        return departments;
    }

    public List<ResourceGroupResponseDTO> getOtherResources() {
        return otherResources;
    }

    public Long getPlanStartTime() {
        return planStartTime;
    }

    public Long getActualStartTime() {
        return actualStartTime;
    }

    public Long getPlanEndTime() {
        return planEndTime;
    }

    public List<Long> getAppendixIds() {
        return appendixIds;
    }

    public String getRemark() {
        return remark;
    }

    public List<SalesOrderResponseDTO> getSalesOrderList() {
        return salesOrderList;
    }

    public List<Long> getReportTemplateIds() {
        return reportTemplateIds;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setSopTaskId(Long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public void setTaskStatus(BizConstantDisplay taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setRelatedWorkOrderId(long relatedWorkOrderId) {
        this.relatedWorkOrderId = relatedWorkOrderId;
    }

    public void setRelatedWorkOrderCode(String relatedWorkOrderCode) {
        this.relatedWorkOrderCode = relatedWorkOrderCode;
    }

    public void setSpecifiedMaterial(boolean specifiedMaterial) {
        this.specifiedMaterial = specifiedMaterial;
    }

    public void setWorkCenterResponseDTO(WorkCenterResponseDTO workCenterResponseDTO) {
        this.workCenterResponseDTO = workCenterResponseDTO;
    }

    public void setRelatedProcessId(long relatedProcessId) {
        this.relatedProcessId = relatedProcessId;
    }

    public void setRelatedProcessNum(String relatedProcessNum) {
        this.relatedProcessNum = relatedProcessNum;
    }

    public void setRelatedProcessName(String relatedProcessName) {
        this.relatedProcessName = relatedProcessName;
    }

    public void setRelatedProcessCode(String relatedProcessCode) {
        this.relatedProcessCode = relatedProcessCode;
    }

    public void setMaterialBatchNo(String materialBatchNo) {
        this.materialBatchNo = materialBatchNo;
    }

    public void setExecutors(List<UserBaseResponseDTO> executors) {
        this.executors = executors;
    }

    public void setEquipments(List<ResourceResponseDTO> equipments) {
        this.equipments = equipments;
    }

    public void setDepartments(List<ResourceResponseDTO> departments) {
        this.departments = departments;
    }

    public void setOtherResources(List<ResourceGroupResponseDTO> otherResources) {
        this.otherResources = otherResources;
    }

    public void setPlanStartTime(Long planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setActualStartTime(Long actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public void setPlanEndTime(Long planEndTime) {
        this.planEndTime = planEndTime;
    }

    public void setAppendixIds(List<Long> appendixIds) {
        this.appendixIds = appendixIds;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSalesOrderList(List<SalesOrderResponseDTO> salesOrderList) {
        this.salesOrderList = salesOrderList;
    }

    public void setReportTemplateIds(List<Long> reportTemplateIds) {
        this.reportTemplateIds = reportTemplateIds;
    }
}
