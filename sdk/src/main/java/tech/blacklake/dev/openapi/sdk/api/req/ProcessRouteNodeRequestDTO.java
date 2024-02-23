package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessRouteNodeRequestDTO {
    /**
     * 业务id 详情返回有值就重新传回 没值不用传
     */
    private Long id;

    /**
     * 工序顺序号
     */
    private long processSeq;

    /**
     * 工序号
     */
    private String processNum;

    /**
     * 工序ID
     */
    private long processId;

    /**
     * 工作中心ID
     */
    private long workCenterId;

    /**
     * 工作中心资源信息
     */
    private List<WorkCenterGroupRequestDTO> workCenterGroupCOList;

    /**
     * 工序说明
     */
    private String description;

    /**
     * 文件id list
     */
    private List<Long> fileIds;

    /**
     * sopID
     */
    private Long sop;

    /**
     * 报告模版id
     */
    private List<Long> reportIds;

    /**
     * 计划报工数量管控
     */
    private int planWorkReportQuantityControl;

    /**
     * 生产任务状态操作管控
     */
    private int productionStatusControl;

    public Long getId() {
        return id;
    }

    public long getProcessSeq() {
        return processSeq;
    }

    public String getProcessNum() {
        return processNum;
    }

    public long getProcessId() {
        return processId;
    }

    public long getWorkCenterId() {
        return workCenterId;
    }

    public List<WorkCenterGroupRequestDTO> getWorkCenterGroupCOList() {
        return workCenterGroupCOList;
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

    public List<Long> getReportIds() {
        return reportIds;
    }

    public int getPlanWorkReportQuantityControl() {
        return planWorkReportQuantityControl;
    }

    public int getProductionStatusControl() {
        return productionStatusControl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProcessSeq(long processSeq) {
        this.processSeq = processSeq;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setProcessId(long processId) {
        this.processId = processId;
    }

    public void setWorkCenterId(long workCenterId) {
        this.workCenterId = workCenterId;
    }

    public void setWorkCenterGroupCOList(List<WorkCenterGroupRequestDTO> workCenterGroupCOList) {
        this.workCenterGroupCOList = workCenterGroupCOList;
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

    public void setReportIds(List<Long> reportIds) {
        this.reportIds = reportIds;
    }

    public void setPlanWorkReportQuantityControl(int planWorkReportQuantityControl) {
        this.planWorkReportQuantityControl = planWorkReportQuantityControl;
    }

    public void setProductionStatusControl(int productionStatusControl) {
        this.productionStatusControl = productionStatusControl;
    }
}
