package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderImportRequestDTO extends CustomFieldBaseCO {
    /**
     * 计划订单编号,支持字母、数字和符号,不可超过255个字符,前后不支持空格
     */
    private String planOrderCode;

    /**
     * 状态,如不填写,默认:计划确认
     */
    private String status;

    /**
     * 需求类型,如不填写,默认:独立需求
     */
    private String requirementType;

    /**
     * 投放类型,如不填写,默认:生产工单
     */
    private String launchType;

    /**
     * 需求时间 格式: yyyy-MM-dd HH:mm:ss
     */
    private String requirementTime;

    /**
     * 计划部门编号
     */
    private String planningDptCode;

    /**
     * 计划员编号
     */
    private String planningUserCode;

    /**
     * 计划开始时间 格式: yyyy-MM-dd HH:mm:ss
     */
    private String planStartTime;

    /**
     * 计划完工时间 格式: yyyy-MM-dd HH:mm:ss
     */
    private String planFinishTime;

    /**
     * 生产部门编号
     */
    private String productionDptCode;

    /**
     * 生产主管编号
     */
    private String productionSupervisorCode;

    /**
     * 班次名称
     */
    private String shiftName;

    /**
     * 备注 不可超过1000字符
     */
    private String remark;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 计划生产数 必须大于0,小于10,000,000
     */
    private String plannedAmount;

    /**
     * 版本号
     */
    private String version;

    /**
     * 单位名称
     */
    private String unitName;

    public String getPlanOrderCode() {
        return planOrderCode;
    }

    public String getStatus() {
        return status;
    }

    public String getRequirementType() {
        return requirementType;
    }

    public String getLaunchType() {
        return launchType;
    }

    public String getRequirementTime() {
        return requirementTime;
    }

    public String getPlanningDptCode() {
        return planningDptCode;
    }

    public String getPlanningUserCode() {
        return planningUserCode;
    }

    public String getPlanStartTime() {
        return planStartTime;
    }

    public String getPlanFinishTime() {
        return planFinishTime;
    }

    public String getProductionDptCode() {
        return productionDptCode;
    }

    public String getProductionSupervisorCode() {
        return productionSupervisorCode;
    }

    public String getShiftName() {
        return shiftName;
    }

    public String getRemark() {
        return remark;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getPlannedAmount() {
        return plannedAmount;
    }

    public String getVersion() {
        return version;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setPlanOrderCode(String planOrderCode) {
        this.planOrderCode = planOrderCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    public void setRequirementTime(String requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setPlanningDptCode(String planningDptCode) {
        this.planningDptCode = planningDptCode;
    }

    public void setPlanningUserCode(String planningUserCode) {
        this.planningUserCode = planningUserCode;
    }

    public void setPlanStartTime(String planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setPlanFinishTime(String planFinishTime) {
        this.planFinishTime = planFinishTime;
    }

    public void setProductionDptCode(String productionDptCode) {
        this.productionDptCode = productionDptCode;
    }

    public void setProductionSupervisorCode(String productionSupervisorCode) {
        this.productionSupervisorCode = productionSupervisorCode;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setPlannedAmount(String plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
