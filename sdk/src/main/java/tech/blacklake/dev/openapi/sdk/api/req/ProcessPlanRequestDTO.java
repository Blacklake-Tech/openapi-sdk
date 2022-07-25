package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessPlanRequestDTO {
    /**
     * 工单编号
     */
    private String workOrderCode = "";

    /**
     * 工序号,不可超过255字符;多个工序的工序号不支持重复
     */
    private String processNum = "";

    /**
     * 工序编号
     */
    private String code = "";

    /**
     * 工序标识码,默认为工单号$工序号,同工厂租户下,工序标识码不支持重复
     */
    private String identifier;

    /**
     * 工序名称
     */
    private String name;

    /**
     * 工作中心编号
     */
    private String workCenterCode;

    /**
     * 工序说明,默认为工序上维护的工序说明,不可超过1000字符
     */
    private String description;

    /**
     * 工序计划开始时间,格式为YYYY/mm/DD HH:MM:SS
     */
    private String processPlannedStartTime;

    /**
     * 工序计划完工时间,格式为YYYY/mm/DD HH:MM:SS,计划完工时间必须大于计划开始时间,默认为生产工单的计划结束时间
     */
    private String processPlannedFinishTime;

    /**
     * SOP方案,支持一个启用中的SOP方案编号
     */
    private String sop;

    /**
     * 报告模板,同工艺路线同工序下,SOP方案和报告模板只能填一个
     */
    private String report;

    /**
     * 计划报工数量管控,key = PlanWorkReportQuantityControlEnum
     */
    private String planWorkReportQuantityControl;

    /**
     * 生产任务状态操作管控,key = ProductionStatusControlEnum
     */
    private String productionStatusControl;

    /**
     * 报工方式,key = ReportingMethodEnum
     */
    private String reportingMethod;

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public String getProcessNum() {
        return processNum;
    }

    public String getCode() {
        return code;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getWorkCenterCode() {
        return workCenterCode;
    }

    public String getDescription() {
        return description;
    }

    public String getProcessPlannedStartTime() {
        return processPlannedStartTime;
    }

    public String getProcessPlannedFinishTime() {
        return processPlannedFinishTime;
    }

    public String getSop() {
        return sop;
    }

    public String getReport() {
        return report;
    }

    public String getPlanWorkReportQuantityControl() {
        return planWorkReportQuantityControl;
    }

    public String getProductionStatusControl() {
        return productionStatusControl;
    }

    public String getReportingMethod() {
        return reportingMethod;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkCenterCode(String workCenterCode) {
        this.workCenterCode = workCenterCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProcessPlannedStartTime(String processPlannedStartTime) {
        this.processPlannedStartTime = processPlannedStartTime;
    }

    public void setProcessPlannedFinishTime(String processPlannedFinishTime) {
        this.processPlannedFinishTime = processPlannedFinishTime;
    }

    public void setSop(String sop) {
        this.sop = sop;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public void setPlanWorkReportQuantityControl(String planWorkReportQuantityControl) {
        this.planWorkReportQuantityControl = planWorkReportQuantityControl;
    }

    public void setProductionStatusControl(String productionStatusControl) {
        this.productionStatusControl = productionStatusControl;
    }

    public void setReportingMethod(String reportingMethod) {
        this.reportingMethod = reportingMethod;
    }
}

