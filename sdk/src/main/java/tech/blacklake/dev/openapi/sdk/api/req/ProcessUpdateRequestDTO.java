package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessUpdateRequestDTO  {
    /**
     * id
     */
    private Long id;

    /**
     * 工序号
     */
    private String processNum;

    /**
     * 顺序号
     */
    private long processSeq;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序编码
     */
    private String processCode;

    /**
     * 工序定义 ID
     */
    private Long processId;

    /**
     * 工艺路线快照工序 ID
     */
    private Long processSnapshotId;

    /**
     * 工序标识码
     */
    private String identifier;

    /**
     * 工作中心 ID
     */
    private long workCenterId;

    /**
     * 工序说明
     */
    private String description;

    /**
     * 关联文件 ID 列表
     */
    private List<Long> fileIds;

    /**
     * 关联的sop方案ID
     */
    private Long sop;

    /**
     * 关联的sop方案快照ID
     */
    private Long sopSnapshotId;

    /**
     * 报告模版id
     */
    private List<Long> reportIds;

    /**
     * 计划开始时间
     */
    private Long plannedStartTime;

    /**
     * 计划结束时间
     */
    private Long plannedEndTime;

    /**
     * 计划报工数量管控
     */
    private int planWorkReportQuantityControl;

    /**
     * 生产任务状态操作管控
     */
    private int productionStatusControl;

    /**
     * 报工方式
     */
    private List<Integer> reportingMethod;

    /**
     * 工作中心资源组信息
     */
    private List<WorkCenterResourceGroupRequestDTO> workCenterGroupCOList;

    public Long getId() {
        return id;
    }

    public String getProcessNum() {
        return processNum;
    }

    public long getProcessSeq() {
        return processSeq;
    }

    public String getProcessName() {
        return processName;
    }

    public String getProcessCode() {
        return processCode;
    }

    public Long getProcessId() {
        return processId;
    }

    public Long getProcessSnapshotId() {
        return processSnapshotId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public long getWorkCenterId() {
        return workCenterId;
    }

    public String getDescription() {
        return description;
    }

    public List<Long> getFileIds() {
        return fileIds;
    }

    public Long getSop() {
        return sop;
    }

    public Long getSopSnapshotId() {
        return sopSnapshotId;
    }

    public List<Long> getReportIds() {
        return reportIds;
    }

    public Long getPlannedStartTime() {
        return plannedStartTime;
    }

    public Long getPlannedEndTime() {
        return plannedEndTime;
    }

    public int getPlanWorkReportQuantityControl() {
        return planWorkReportQuantityControl;
    }

    public int getProductionStatusControl() {
        return productionStatusControl;
    }

    public List<Integer> getReportingMethod() {
        return reportingMethod;
    }

    public List<WorkCenterResourceGroupRequestDTO> getWorkCenterGroupCOList() {
        return workCenterGroupCOList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setProcessSeq(long processSeq) {
        this.processSeq = processSeq;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public void setProcessSnapshotId(Long processSnapshotId) {
        this.processSnapshotId = processSnapshotId;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setWorkCenterId(long workCenterId) {
        this.workCenterId = workCenterId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFileIds(List<Long> fileIds) {
        this.fileIds = fileIds;
    }

    public void setSop(Long sop) {
        this.sop = sop;
    }

    public void setSopSnapshotId(Long sopSnapshotId) {
        this.sopSnapshotId = sopSnapshotId;
    }

    public void setReportIds(List<Long> reportIds) {
        this.reportIds = reportIds;
    }

    public void setPlannedStartTime(Long plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public void setPlannedEndTime(Long plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public void setPlanWorkReportQuantityControl(int planWorkReportQuantityControl) {
        this.planWorkReportQuantityControl = planWorkReportQuantityControl;
    }

    public void setProductionStatusControl(int productionStatusControl) {
        this.productionStatusControl = productionStatusControl;
    }

    public void setReportingMethod(List<Integer> reportingMethod) {
        this.reportingMethod = reportingMethod;
    }

    public void setWorkCenterGroupCOList(List<WorkCenterResourceGroupRequestDTO> workCenterGroupCOList) {
        this.workCenterGroupCOList = workCenterGroupCOList;
    }
}

