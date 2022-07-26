package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PlanOrderBaseResponseDTO extends CustomFieldBaseVO  {
    /**
     * 业务id
     */
    private long id = 0;

    /**
     * 计划订单code
     */
    private String code;

    /**
     * 计划订单需求类型
     */
    private BizConstantDisplay requirementType;

    /**
     * 计划订单投放类型
     */
    private BizConstantDisplay launchType;

    /**
     * 计划订单业务状态
     */
    private BizConstantDisplay status;

    /**
     * 需求时间
     */
    private Long requirementTime;

    /**
     * 计划部门
     */
    private DepartmentResponseDTO planningDepartment;

    /**
     * 计划员
     */
    private UserResponseDTO planningUser;

    /**
     * 计划生产时间
     */
    private Long planStartTime;

    /**
     * 计划完工时间
     */
    private Long planFinishTime;

    /**
     * 生产部门
     */
    private DepartmentResponseDTO productionDepartment;

    /**
     * 生产主管
     */
    private UserResponseDTO productionSupervisor;

    /**
     * 班次
     */
    private ShiftResponseDTO shiftResponseDTO;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private UserResponseDTO creator;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 更新人
     */
    private UserResponseDTO operator;

    /**
     * 更新时间
     */
    private Long updatedAt;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public BizConstantDisplay getRequirementType() {
        return requirementType;
    }

    public BizConstantDisplay getLaunchType() {
        return launchType;
    }

    public BizConstantDisplay getStatus() {
        return status;
    }

    public Long getRequirementTime() {
        return requirementTime;
    }

    public DepartmentResponseDTO getPlanningDepartment() {
        return planningDepartment;
    }

    public UserResponseDTO getPlanningUser() {
        return planningUser;
    }

    public Long getPlanStartTime() {
        return planStartTime;
    }

    public Long getPlanFinishTime() {
        return planFinishTime;
    }

    public DepartmentResponseDTO getProductionDepartment() {
        return productionDepartment;
    }

    public UserResponseDTO getProductionSupervisor() {
        return productionSupervisor;
    }

    public ShiftResponseDTO getShiftResponseDTO() {
        return shiftResponseDTO;
    }

    public String getRemark() {
        return remark;
    }

    public UserResponseDTO getCreator() {
        return creator;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public UserResponseDTO getOperator() {
        return operator;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRequirementType(BizConstantDisplay requirementType) {
        this.requirementType = requirementType;
    }

    public void setLaunchType(BizConstantDisplay launchType) {
        this.launchType = launchType;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }

    public void setRequirementTime(Long requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setPlanningDepartment(DepartmentResponseDTO planningDepartment) {
        this.planningDepartment = planningDepartment;
    }

    public void setPlanningUser(UserResponseDTO planningUser) {
        this.planningUser = planningUser;
    }

    public void setPlanStartTime(Long planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setPlanFinishTime(Long planFinishTime) {
        this.planFinishTime = planFinishTime;
    }

    public void setProductionDepartment(DepartmentResponseDTO productionDepartment) {
        this.productionDepartment = productionDepartment;
    }

    public void setProductionSupervisor(UserResponseDTO productionSupervisor) {
        this.productionSupervisor = productionSupervisor;
    }

    public void setShiftResponseDTO(ShiftResponseDTO shiftResponseDTO) {
        this.shiftResponseDTO = shiftResponseDTO;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreator(UserResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setOperator(UserResponseDTO operator) {
        this.operator = operator;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}

