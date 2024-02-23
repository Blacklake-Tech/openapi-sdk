package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderBaseUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * id
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
     * 工单类型（1-普通；2-返工；3-改制；4-维修
     */
    private int workOrderType;

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
     * 计划部门id
     */
    private Long planningDepartmentId;

    /**
     * 计划员id
     */
    private Long planningUserId;

    /**
     * 文件id
     */
    private List<Long> fileIds;

    /**
     * 备注
     */
    private String remark;

    /**
     * 指定用料-默认是
     */
    private int specifiedMaterial;

    /**
     * 班次
     */
    private Long shiftId;

    /**
     * 设备ID
     */
    private Long resourceId;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getWorkOrderType() {
        return workOrderType;
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

    public Long getPlanningDepartmentId() {
        return planningDepartmentId;
    }

    public Long getPlanningUserId() {
        return planningUserId;
    }

    public List<Long> getFileIds() {
        return fileIds;
    }

    public String getRemark() {
        return remark;
    }

    public int getSpecifiedMaterial() {
        return specifiedMaterial;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public Long getResourceId() {
        return resourceId;
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

    public void setWorkOrderType(int workOrderType) {
        this.workOrderType = workOrderType;
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

    public void setPlanningDepartmentId(Long planningDepartmentId) {
        this.planningDepartmentId = planningDepartmentId;
    }

    public void setPlanningUserId(Long planningUserId) {
        this.planningUserId = planningUserId;
    }

    public void setFileIds(List<Long> fileIds) {
        this.fileIds = fileIds;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSpecifiedMaterial(int specifiedMaterial) {
        this.specifiedMaterial = specifiedMaterial;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}
