package tech.blacklake.dev.openapi.sdk.api.common;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class ProcessRouteNodeDTO {
    /**
     * 工艺路线编号,支持字母、数字和符号,不可超过255个字符
     */
    private String processRouteCode = "";

    /**
     * 工序号,同一个工艺路线下,工序号不支持重复;不可超过255个字符
     */
    private String processNum = "";

    /**
     * 工序编号
     */
    private String processCode = "";

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工作中心编号
     */
    private String workCenterCode;

    /**
     * 工序说明,不可超过1000个字符,支持换行
     */
    private String description;

    /**
     * SOP方案,启用中的且为生产类型的SOP方案编号
     */
    private String sop;

    /**
     * 报告模板名称
     */
    private String reportTemplate;

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

    /**
     * 在制品信息
     */
    private List<ProcessManufacturedGoodsDTO> processManufacturedGoods;

    public String getProcessRouteCode() {
        return processRouteCode;
    }

    public String getProcessNum() {
        return processNum;
    }

    public String getProcessCode() {
        return processCode;
    }

    public String getProcessName() {
        return processName;
    }

    public String getWorkCenterCode() {
        return workCenterCode;
    }

    public String getDescription() {
        return description;
    }

    public String getSop() {
        return sop;
    }

    public String getReportTemplate() {
        return reportTemplate;
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

    public List<ProcessManufacturedGoodsDTO> getProcessManufacturedGoods() {
        return processManufacturedGoods;
    }

    public void setProcessRouteCode(String processRouteCode) {
        this.processRouteCode = processRouteCode;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public void setWorkCenterCode(String workCenterCode) {
        this.workCenterCode = workCenterCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSop(String sop) {
        this.sop = sop;
    }

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
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

    public void setProcessManufacturedGoods(List<ProcessManufacturedGoodsDTO> processManufacturedGoods) {
        this.processManufacturedGoods = processManufacturedGoods;
    }
}

