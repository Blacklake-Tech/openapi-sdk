package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessInfoResponseDTO  {
    /**
     * 工单工序业务 ID
     */
    private long id = 0L;

    /**
     * 工序定义业务 ID
     */
    private long processId = 0L;

    /**
     * 工艺路线工序业务 ID
     */
    private long processSnapshotId = 0L;

    /**
     * 工序号
     */
    private String processNum;

    /**
     * 顺序
     */
    private long processSeq = 0L;

    /**
     * 前序工序号
     */
    private String preProcessNum;

    /**
     * 工序编号
     */
    private String processCode;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序标识码
     */
    private String identifier;

    /**
     * 工作中心ID
     */
    private long workCenterId = 0L;

    /**
     * 工作中心模板ID
     */
    private long workCenterSampleId = 0L;

    /**
     * 工作中心名称
     */
    private String workCenterName;

    /**
     * 工序说明
     */
    private String description;

    /**
     * 文件
     */
    private List<Long> files;

    /**
     * 计划开始时间
     */
    private Long plannedStartTime;

    /**
     * 计划结束时间
     */
    private Long plannedEndTime;

    /**
     * 实际开始时间
     */
    private Long actualStartTime;

    /**
     * 实际结束时间
     */
    private Long actualEndTime;

    /**
     * sop方案
     */
    private SopResponseDTO sop;

    /**
     * 报告模板ID
     */
    private List<ReportTemplateResponseDTO> reportTemplates;

    /**
     * 计划报工数量管控枚举值 key = planWorkReportQuantityControl
     */
    private BizConstantDisplay planWorkReportQuantityControl;

    /**
     * 生产任务状态操作管控枚举值 key = productionStatusControl 
     */
    private BizConstantDisplay productionStatusControl;

    /**
     * 资源清单
     */
    private List<WorkCenterGroupResponseDTO> workCenterGroupCOList;

    public long getId() {
        return id;
    }

    public long getProcessId() {
        return processId;
    }

    public long getProcessSnapshotId() {
        return processSnapshotId;
    }

    public String getProcessNum() {
        return processNum;
    }

    public long getProcessSeq() {
        return processSeq;
    }

    public String getPreProcessNum() {
        return preProcessNum;
    }

    public String getProcessCode() {
        return processCode;
    }

    public String getProcessName() {
        return processName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public long getWorkCenterId() {
        return workCenterId;
    }

    public long getWorkCenterSampleId() {
        return workCenterSampleId;
    }

    public String getWorkCenterName() {
        return workCenterName;
    }

    public String getDescription() {
        return description;
    }

    public List<Long> getFiles() {
        return files;
    }

    public Long getPlannedStartTime() {
        return plannedStartTime;
    }

    public Long getPlannedEndTime() {
        return plannedEndTime;
    }

    public Long getActualStartTime() {
        return actualStartTime;
    }

    public Long getActualEndTime() {
        return actualEndTime;
    }

    public SopResponseDTO getSop() {
        return sop;
    }

    public List<ReportTemplateResponseDTO> getReportTemplates() {
        return reportTemplates;
    }

    public BizConstantDisplay getPlanWorkReportQuantityControl() {
        return planWorkReportQuantityControl;
    }

    public BizConstantDisplay getProductionStatusControl() {
        return productionStatusControl;
    }

    public List<WorkCenterGroupResponseDTO> getWorkCenterGroupCOList() {
        return workCenterGroupCOList;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProcessId(long processId) {
        this.processId = processId;
    }

    public void setProcessSnapshotId(long processSnapshotId) {
        this.processSnapshotId = processSnapshotId;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setProcessSeq(long processSeq) {
        this.processSeq = processSeq;
    }

    public void setPreProcessNum(String preProcessNum) {
        this.preProcessNum = preProcessNum;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setWorkCenterId(long workCenterId) {
        this.workCenterId = workCenterId;
    }

    public void setWorkCenterSampleId(long workCenterSampleId) {
        this.workCenterSampleId = workCenterSampleId;
    }

    public void setWorkCenterName(String workCenterName) {
        this.workCenterName = workCenterName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFiles(List<Long> files) {
        this.files = files;
    }

    public void setPlannedStartTime(Long plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public void setPlannedEndTime(Long plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public void setActualStartTime(Long actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public void setActualEndTime(Long actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    public void setSop(SopResponseDTO sop) {
        this.sop = sop;
    }

    public void setReportTemplates(List<ReportTemplateResponseDTO> reportTemplates) {
        this.reportTemplates = reportTemplates;
    }

    public void setPlanWorkReportQuantityControl(BizConstantDisplay planWorkReportQuantityControl) {
        this.planWorkReportQuantityControl = planWorkReportQuantityControl;
    }

    public void setProductionStatusControl(BizConstantDisplay productionStatusControl) {
        this.productionStatusControl = productionStatusControl;
    }

    public void setWorkCenterGroupCOList(List<WorkCenterGroupResponseDTO> workCenterGroupCOList) {
        this.workCenterGroupCOList = workCenterGroupCOList;
    }
}

