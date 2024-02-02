package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PlanOrderBaseRequestDTO extends CustomFieldBaseCO  {
    /**
     * 业务ID
     */
    private Long id;

    /**
     * 计划订单编号
     */
    private String code;

    /**
     * 计划订单需求类型（1-独立需求；2-相关需求)
     */
    private int requirementType;

    /**
     * 计划订单投放类型（1-生产工单；2-采购申请 3-委外订单)
     */
    private int launchType;

    /**
     * 计划订单业务状态（1-计划；2-计划确认；3-已投放；4-已关闭）
     */
    private Integer status;

    /**
     * 需求时间
     */
    private Long requirementTime;

    /**
     * 计划部门id
     */
    private Long planningDepartmentId;

    /**
     * 计划员id
     */
    private Long planningUserId;

    /**
     * 计划开始时间
     */
    private Long planStartTime;

    /**
     * 计划完工时间
     */
    private Long planFinishTime;

    /**
     * 生产部门id
     */
    private Long productionDepartmentId;

    /**
     * 生产主管id
     */
    private Long productionSupervisorId;

    /**
     * 班次
     */
    private Long shiftId;

    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public int getRequirementType() {
        return requirementType;
    }

    public int getLaunchType() {
        return launchType;
    }

    public Integer getStatus() {
        return status;
    }

    public Long getRequirementTime() {
        return requirementTime;
    }

    public Long getPlanningDepartmentId() {
        return planningDepartmentId;
    }

    public Long getPlanningUserId() {
        return planningUserId;
    }

    public Long getPlanStartTime() {
        return planStartTime;
    }

    public Long getPlanFinishTime() {
        return planFinishTime;
    }

    public Long getProductionDepartmentId() {
        return productionDepartmentId;
    }

    public Long getProductionSupervisorId() {
        return productionSupervisorId;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRequirementType(int requirementType) {
        this.requirementType = requirementType;
    }

    public void setLaunchType(int launchType) {
        this.launchType = launchType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRequirementTime(Long requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setPlanningDepartmentId(Long planningDepartmentId) {
        this.planningDepartmentId = planningDepartmentId;
    }

    public void setPlanningUserId(Long planningUserId) {
        this.planningUserId = planningUserId;
    }

    public void setPlanStartTime(Long planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setPlanFinishTime(Long planFinishTime) {
        this.planFinishTime = planFinishTime;
    }

    public void setProductionDepartmentId(Long productionDepartmentId) {
        this.productionDepartmentId = productionDepartmentId;
    }

    public void setProductionSupervisorId(Long productionSupervisorId) {
        this.productionSupervisorId = productionSupervisorId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

