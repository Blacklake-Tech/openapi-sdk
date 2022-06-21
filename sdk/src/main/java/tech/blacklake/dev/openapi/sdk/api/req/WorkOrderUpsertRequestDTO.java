package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderUpsertRequestDTO {
    /**
     * 工单编号,支持字母、数字和符号,不可超过255个字符,前后不支持空格
     */
    private String code = "";

    /**
     * 工单类型,key = WorkOrderTypeEnum
     */
    private String workOrderType;

    /**
     * 标识码,默认获取工单编号,支持字母、数字和符号,不可超过255个字符,同工厂租户下,工单标识码不支持重复
     */
    private String identifier;

    /**
     * 计划开始时间,格式为YYYY/mm/DD HH:MM:SS
     */
    private String planStartTime = "";

    /**
     * 计划完工时间,格式为YYYY/mm/DD HH:MM:SS
     */
    private String planFinishTime = "";

    /**
     * 生产部门编号,不可超过255个字符
     */
    private String productionDepartmentCode;

    /**
     * 生产主管编号,不可超过255个字符
     */
    private String productionSupervisorCode;

    /**
     * 计划部门编号,不可超过255个字符
     */
    private String planningDepartmentCode;

    /**
     * 计划员编号,不可超过255个字符
     */
    private String planningUserCode;

    /**
     * 指定用料,是1/否0,默认为1
     */
    private Integer specifiedMaterialInt;

    /**
     * 指定用料,是/否,默认为是
     */
    private String specifiedMaterial;

    /**
     * 备注
     */
    private String remark;

    /**
     * 启用SOP,是1/否0,默认为0
     */
    private Integer enableSopInt;

    /**
     * 启用SOP,是1/否0,默认为否
     */
    private String enableSop;

    /**
     * 产出物料
     */
    private List<OutputMaterialRequestDTO> outputMaterialCOs;

    /**
     * 用料清单
     */
    private List<InputMaterialRequestDTO> inputMaterialCOs;

    /**
     * 投料管控
     */
    private List<InputMaterialControlRequestDTO> inputMaterialControlCOs;

    /**
     * 工序计划
     */
    private List<ProcessPlanRequestDTO> processPlanCOs;

    /**
     * 工序在制品
     */
    private List<WorkInProgressRequestDTO> workInProgressCOs;

    /**
     * 来源销售订单
     */
    private List<SourceSalesOrderRequestDTO> sourceSalesOrderCOs;

    public String getCode() {
        return code;
    }

    public String getWorkOrderType() {
        return workOrderType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getPlanStartTime() {
        return planStartTime;
    }

    public String getPlanFinishTime() {
        return planFinishTime;
    }

    public String getProductionDepartmentCode() {
        return productionDepartmentCode;
    }

    public String getProductionSupervisorCode() {
        return productionSupervisorCode;
    }

    public String getPlanningDepartmentCode() {
        return planningDepartmentCode;
    }

    public String getPlanningUserCode() {
        return planningUserCode;
    }

    public Integer getSpecifiedMaterialInt() {
        return specifiedMaterialInt;
    }

    public String getSpecifiedMaterial() {
        return specifiedMaterial;
    }

    public String getRemark() {
        return remark;
    }

    public Integer getEnableSopInt() {
        return enableSopInt;
    }

    public String getEnableSop() {
        return enableSop;
    }

    public List<OutputMaterialRequestDTO> getOutputMaterialCOs() {
        return outputMaterialCOs;
    }

    public List<InputMaterialRequestDTO> getInputMaterialCOs() {
        return inputMaterialCOs;
    }

    public List<InputMaterialControlRequestDTO> getInputMaterialControlCOs() {
        return inputMaterialControlCOs;
    }

    public List<ProcessPlanRequestDTO> getProcessPlanCOs() {
        return processPlanCOs;
    }

    public List<WorkInProgressRequestDTO> getWorkInProgressCOs() {
        return workInProgressCOs;
    }

    public List<SourceSalesOrderRequestDTO> getSourceSalesOrderCOs() {
        return sourceSalesOrderCOs;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setPlanStartTime(String planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setPlanFinishTime(String planFinishTime) {
        this.planFinishTime = planFinishTime;
    }

    public void setProductionDepartmentCode(String productionDepartmentCode) {
        this.productionDepartmentCode = productionDepartmentCode;
    }

    public void setProductionSupervisorCode(String productionSupervisorCode) {
        this.productionSupervisorCode = productionSupervisorCode;
    }

    public void setPlanningDepartmentCode(String planningDepartmentCode) {
        this.planningDepartmentCode = planningDepartmentCode;
    }

    public void setPlanningUserCode(String planningUserCode) {
        this.planningUserCode = planningUserCode;
    }

    public void setSpecifiedMaterialInt(Integer specifiedMaterialInt) {
        this.specifiedMaterialInt = specifiedMaterialInt;
    }

    public void setSpecifiedMaterial(String specifiedMaterial) {
        this.specifiedMaterial = specifiedMaterial;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnableSopInt(Integer enableSopInt) {
        this.enableSopInt = enableSopInt;
    }

    public void setEnableSop(String enableSop) {
        this.enableSop = enableSop;
    }

    public void setOutputMaterialCOs(List<OutputMaterialRequestDTO> outputMaterialCOs) {
        this.outputMaterialCOs = outputMaterialCOs;
    }

    public void setInputMaterialCOs(List<InputMaterialRequestDTO> inputMaterialCOs) {
        this.inputMaterialCOs = inputMaterialCOs;
    }

    public void setInputMaterialControlCOs(List<InputMaterialControlRequestDTO> inputMaterialControlCOs) {
        this.inputMaterialControlCOs = inputMaterialControlCOs;
    }

    public void setProcessPlanCOs(List<ProcessPlanRequestDTO> processPlanCOs) {
        this.processPlanCOs = processPlanCOs;
    }

    public void setWorkInProgressCOs(List<WorkInProgressRequestDTO> workInProgressCOs) {
        this.workInProgressCOs = workInProgressCOs;
    }

    public void setSourceSalesOrderCOs(List<SourceSalesOrderRequestDTO> sourceSalesOrderCOs) {
        this.sourceSalesOrderCOs = sourceSalesOrderCOs;
    }
}

