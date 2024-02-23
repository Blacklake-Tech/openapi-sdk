package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderListResponseDTO extends CustomFieldBaseVO {
    /**
     * 工单id
     */
    private long workOrderId;

    /**
     * 工单code
     */
    private String workOrderCode;

    /**
     * 工单类型
     */
    private BizConstantDisplay workOrderType;

    /**
     * 工单业务状态
     */
    private BizConstantDisplay workOrderStatus;

    /**
     * 关闭类型
     */
    private BizConstantDisplay workOrderCloseType;

    /**
     * 工单暂停状态
     */
    private int pauseFlag;

    /**
     * 是否指定用料 1:是 0:否
     */
    private int specifiedMaterial;

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
     * 计划部门
     */
    private DepartmentResponseDTO planningDepartment;

    /**
     * 计划员
     */
    private UserResponseDTO planningUser;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 主产出批次号编码/批次号规则名称
     */
    private String mainOutputBatchNumber;

    /**
     * 计划生产数
     */
    private BaseAmountDisplay plannedAmount;

    /**
     * 预计生产数
     */
    private BaseAmountDisplay expectedAmount;

    /**
     * 领料齐套数
     */
    private BaseAmountDisplay pickOrderPreparedAmount;

    /**
     * 总报工数
     */
    private BaseAmountDisplay totalHoldAmount;

    /**
     * 合格报工数
     */
    private BaseAmountDisplay qualifiedHoldAmount;

    /**
     * 不良报工数
     */
    private BaseAmountDisplay disqualifiedHoldAmount;

    /**
     * 入库数
     */
    private BaseAmountDisplay warehousedAmount;

    /**
     * 版本Id
     */
    private Long bomId;

    /**
     * 版本号
     */
    private String bomVersion;

    /**
     * 工艺路线
     */
    private ProcessRouteBasicInfoResponseDTO processRoute;

    /**
     * 班次
     */
    private ShiftResponseDTO shift;

    /**
     * 设备
     */
    private ResourceResponseDTO resource;

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

    public long getWorkOrderId() {
        return workOrderId;
    }

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public BizConstantDisplay getWorkOrderType() {
        return workOrderType;
    }

    public BizConstantDisplay getWorkOrderStatus() {
        return workOrderStatus;
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

    public Long getPlannedEndTime() {
        return plannedEndTime;
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

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public String getMainOutputBatchNumber() {
        return mainOutputBatchNumber;
    }

    public BaseAmountDisplay getPlannedAmount() {
        return plannedAmount;
    }

    public BaseAmountDisplay getExpectedAmount() {
        return expectedAmount;
    }

    public BaseAmountDisplay getPickOrderPreparedAmount() {
        return pickOrderPreparedAmount;
    }

    public BaseAmountDisplay getTotalHoldAmount() {
        return totalHoldAmount;
    }

    public BaseAmountDisplay getQualifiedHoldAmount() {
        return qualifiedHoldAmount;
    }

    public BaseAmountDisplay getDisqualifiedHoldAmount() {
        return disqualifiedHoldAmount;
    }

    public BaseAmountDisplay getWarehousedAmount() {
        return warehousedAmount;
    }

    public Long getBomId() {
        return bomId;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public ProcessRouteBasicInfoResponseDTO getProcessRoute() {
        return processRoute;
    }

    public ShiftResponseDTO getShift() {
        return shift;
    }

    public ResourceResponseDTO getResource() {
        return resource;
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

    public void setWorkOrderId(long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public void setWorkOrderType(BizConstantDisplay workOrderType) {
        this.workOrderType = workOrderType;
    }

    public void setWorkOrderStatus(BizConstantDisplay workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
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

    public void setPlannedEndTime(Long plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
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

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setMainOutputBatchNumber(String mainOutputBatchNumber) {
        this.mainOutputBatchNumber = mainOutputBatchNumber;
    }

    public void setPlannedAmount(BaseAmountDisplay plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setExpectedAmount(BaseAmountDisplay expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public void setPickOrderPreparedAmount(BaseAmountDisplay pickOrderPreparedAmount) {
        this.pickOrderPreparedAmount = pickOrderPreparedAmount;
    }

    public void setTotalHoldAmount(BaseAmountDisplay totalHoldAmount) {
        this.totalHoldAmount = totalHoldAmount;
    }

    public void setQualifiedHoldAmount(BaseAmountDisplay qualifiedHoldAmount) {
        this.qualifiedHoldAmount = qualifiedHoldAmount;
    }

    public void setDisqualifiedHoldAmount(BaseAmountDisplay disqualifiedHoldAmount) {
        this.disqualifiedHoldAmount = disqualifiedHoldAmount;
    }

    public void setWarehousedAmount(BaseAmountDisplay warehousedAmount) {
        this.warehousedAmount = warehousedAmount;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public void setProcessRoute(ProcessRouteBasicInfoResponseDTO processRoute) {
        this.processRoute = processRoute;
    }

    public void setShift(ShiftResponseDTO shift) {
        this.shift = shift;
    }

    public void setResource(ResourceResponseDTO resource) {
        this.resource = resource;
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
