package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderListResponseDTO extends CustomFieldBaseVO {
    /**
     * 计划订单id
     */
    private long planOrderId;

    /**
     * 计划订单code
     */
    private String planOrderCode;

    /**
     * 计划订单需求类型
     */
    private BizConstantDisplay planOrderRequirementType;

    /**
     * 计划订单投放类型
     */
    private BizConstantDisplay planOrderLaunchType;

    /**
     * 计划订单业务状态
     */
    private BizConstantDisplay planOrderStatus;

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
     * 计划开始时间
     */
    private Long plannedStartTime;

    /**
     * 计划完工时间
     */
    private Long plannedEndTime;

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
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 计划生产数
     */
    private BaseAmountDisplay plannedAmount;

    /**
     * 预计生产数
     */
    private BaseAmountDisplay expectedAmount;

    /**
     * 已投放数
     */
    private BaseAmountDisplay launchAmount;

    /**
     * 可投放数
     */
    private BaseAmountDisplay canLaunchAmount;

    /**
     * 版本Id
     */
    private Long bomId;

    /**
     * 版本号
     */
    private String bomVersion;

    /**
     * 创建人
     */
    private UserResponseDTO creator;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * operator
     */
    private UserResponseDTO operator;

    /**
     * updatedAt
     */
    private Long updatedAt;

    /**
     * 生成方式
     */
    private BizConstantDisplay generationMethod;

    /**
     * 备注
     */
    private String remark;

    public long getPlanOrderId() {
        return planOrderId;
    }

    public String getPlanOrderCode() {
        return planOrderCode;
    }

    public BizConstantDisplay getPlanOrderRequirementType() {
        return planOrderRequirementType;
    }

    public BizConstantDisplay getPlanOrderLaunchType() {
        return planOrderLaunchType;
    }

    public BizConstantDisplay getPlanOrderStatus() {
        return planOrderStatus;
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

    public Long getPlannedStartTime() {
        return plannedStartTime;
    }

    public Long getPlannedEndTime() {
        return plannedEndTime;
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

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public BaseAmountDisplay getPlannedAmount() {
        return plannedAmount;
    }

    public BaseAmountDisplay getExpectedAmount() {
        return expectedAmount;
    }

    public BaseAmountDisplay getLaunchAmount() {
        return launchAmount;
    }

    public BaseAmountDisplay getCanLaunchAmount() {
        return canLaunchAmount;
    }

    public Long getBomId() {
        return bomId;
    }

    public String getBomVersion() {
        return bomVersion;
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

    public BizConstantDisplay getGenerationMethod() {
        return generationMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setPlanOrderId(long planOrderId) {
        this.planOrderId = planOrderId;
    }

    public void setPlanOrderCode(String planOrderCode) {
        this.planOrderCode = planOrderCode;
    }

    public void setPlanOrderRequirementType(BizConstantDisplay planOrderRequirementType) {
        this.planOrderRequirementType = planOrderRequirementType;
    }

    public void setPlanOrderLaunchType(BizConstantDisplay planOrderLaunchType) {
        this.planOrderLaunchType = planOrderLaunchType;
    }

    public void setPlanOrderStatus(BizConstantDisplay planOrderStatus) {
        this.planOrderStatus = planOrderStatus;
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

    public void setPlannedStartTime(Long plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public void setPlannedEndTime(Long plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
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

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setPlannedAmount(BaseAmountDisplay plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setExpectedAmount(BaseAmountDisplay expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public void setLaunchAmount(BaseAmountDisplay launchAmount) {
        this.launchAmount = launchAmount;
    }

    public void setCanLaunchAmount(BaseAmountDisplay canLaunchAmount) {
        this.canLaunchAmount = canLaunchAmount;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
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

    public void setGenerationMethod(BizConstantDisplay generationMethod) {
        this.generationMethod = generationMethod;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
