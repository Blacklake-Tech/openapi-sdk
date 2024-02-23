package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderBaseResponseDTO extends CustomFieldBaseVO {
    /**
     * 业务id
     */
    private long id;

    /**
     * 工单编号
     */
    private String code;

    /**
     * 标识码
     */
    private String identifier;

    /**
     * 工单类型,key = produceTaskStatus
     */
    private BizConstantDisplay workOrderType;

    /**
     * 业务状态,key = status
     */
    private BizConstantDisplay status;

    /**
     * 关闭类型
     */
    private BizConstantDisplay workOrderCloseType;

    /**
     * 是否暂停
     */
    private int pauseFlag;

    /**
     * 是否指定用料
     */
    private int specifiedMaterial;

    /**
     * 计划开始时间
     */
    private Long plannedStartTime;

    /**
     * 计划结束时间
     */
    private Long plannedFinishTime;

    /**
     * 生产部门
     */
    private DepartmentResponseDTO productionDepartment;

    /**
     * 生产主管
     */
    private UserResponseDTO productionSupervisor;

    /**
     * 计划部门
     */
    private DepartmentResponseDTO planningDepartment;

    /**
     * 计划员
     */
    private UserResponseDTO planningUser;

    /**
     * 文件ID
     */
    private List<Long> files;

    /**
     * 备注
     */
    private String remark;

    /**
     * 班次
     */
    private ShiftResponseDTO shift;

    /**
     * 创建人
     */
    private UserResponseDTO creator;

    /**
     * 创建时间
     */
    private long createdAt;

    /**
     * 更新人
     */
    private UserResponseDTO operator;

    /**
     * 更新时间
     */
    private Long updatedAt;

    /**
     * 设备
     */
    private ResourceResponseDTO resource;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getIdentifier() {
        return identifier;
    }

    public BizConstantDisplay getWorkOrderType() {
        return workOrderType;
    }

    public BizConstantDisplay getStatus() {
        return status;
    }

    public BizConstantDisplay getWorkOrderCloseType() {
        return workOrderCloseType;
    }

    public int getPauseFlag() {
        return pauseFlag;
    }

    public int getSpecifiedMaterial() {
        return specifiedMaterial;
    }

    public Long getPlannedStartTime() {
        return plannedStartTime;
    }

    public Long getPlannedFinishTime() {
        return plannedFinishTime;
    }

    public DepartmentResponseDTO getProductionDepartment() {
        return productionDepartment;
    }

    public UserResponseDTO getProductionSupervisor() {
        return productionSupervisor;
    }

    public DepartmentResponseDTO getPlanningDepartment() {
        return planningDepartment;
    }

    public UserResponseDTO getPlanningUser() {
        return planningUser;
    }

    public List<Long> getFiles() {
        return files;
    }

    public String getRemark() {
        return remark;
    }

    public ShiftResponseDTO getShift() {
        return shift;
    }

    public UserResponseDTO getCreator() {
        return creator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public UserResponseDTO getOperator() {
        return operator;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public ResourceResponseDTO getResource() {
        return resource;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setWorkOrderType(BizConstantDisplay workOrderType) {
        this.workOrderType = workOrderType;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }

    public void setWorkOrderCloseType(BizConstantDisplay workOrderCloseType) {
        this.workOrderCloseType = workOrderCloseType;
    }

    public void setPauseFlag(int pauseFlag) {
        this.pauseFlag = pauseFlag;
    }

    public void setSpecifiedMaterial(int specifiedMaterial) {
        this.specifiedMaterial = specifiedMaterial;
    }

    public void setPlannedStartTime(Long plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public void setPlannedFinishTime(Long plannedFinishTime) {
        this.plannedFinishTime = plannedFinishTime;
    }

    public void setProductionDepartment(DepartmentResponseDTO productionDepartment) {
        this.productionDepartment = productionDepartment;
    }

    public void setProductionSupervisor(UserResponseDTO productionSupervisor) {
        this.productionSupervisor = productionSupervisor;
    }

    public void setPlanningDepartment(DepartmentResponseDTO planningDepartment) {
        this.planningDepartment = planningDepartment;
    }

    public void setPlanningUser(UserResponseDTO planningUser) {
        this.planningUser = planningUser;
    }

    public void setFiles(List<Long> files) {
        this.files = files;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setShift(ShiftResponseDTO shift) {
        this.shift = shift;
    }

    public void setCreator(UserResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setOperator(UserResponseDTO operator) {
        this.operator = operator;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setResource(ResourceResponseDTO resource) {
        this.resource = resource;
    }
}
