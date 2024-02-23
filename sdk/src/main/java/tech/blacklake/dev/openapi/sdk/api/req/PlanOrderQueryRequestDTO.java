package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderQueryRequestDTO extends BasePage {
    /**
     * 计划订单编号快捷搜索
     */
    private String quickSearch;

    /**
     * 生产计划订单编号
     */
    private String planOrderCode;

    /**
     * 计划订单投放类型
     */
    private List<Integer> planOrderLaunchTypeList;

    /**
     * 计划订单业务状态
     */
    private List<Integer> planOrderStatusList;

    /**
     * 需求时间-开始
     */
    private Long requirementTimeFrom;

    /**
     * 需求时间-结束
     */
    private Long requirementTimeTo;

    /**
     * 计划部门
     */
    private List<Long> planningDepartmentIdList;

    /**
     * 计划员
     */
    private List<Long> planningUserIdList;

    /**
     * 计划开始时间-起始
     */
    private Long plannedStartTimeFrom;

    /**
     * 计划开始时间-结束
     */
    private Long plannedStartTimeTo;

    /**
     * 计划完工时间-开始
     */
    private Long plannedEndTimeFrom;

    /**
     * 计划完工时间-结束
     */
    private Long plannedEndTimeTo;

    /**
     * 生产部门
     */
    private List<Long> productionDepartmentIdList;

    /**
     * 生产主管
     */
    private List<Long> productionSupervisorIdList;

    /**
     * 班次
     */
    private List<Long> shiftIdList;

    /**
     * 主产出物料编号
     */
    private List<String> mainOutputMaterialCodeList;

    /**
     * 生成方式
     */
    private Integer generationMethod;

    /**
     * 创建人
     */
    private List<Long> creatorIdList;

    /**
     * 创建时间-开始
     */
    private Long createdAtFrom;

    /**
     * 创建时间-结束
     */
    private Long createdAtTo;

    /**
     * 操作人
     */
    private List<Long> operatorIdList;

    /**
     * 更新时间
     */
    private Long updatedAtFrom;

    /**
     * 更新人
     */
    private Long updatedAtTo;

    /**
     * 需求类型
     */
    private List<Long> planOrderRequirementTypeList;

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getPlanOrderCode() {
        return planOrderCode;
    }

    public List<Integer> getPlanOrderLaunchTypeList() {
        return planOrderLaunchTypeList;
    }

    public List<Integer> getPlanOrderStatusList() {
        return planOrderStatusList;
    }

    public Long getRequirementTimeFrom() {
        return requirementTimeFrom;
    }

    public Long getRequirementTimeTo() {
        return requirementTimeTo;
    }

    public List<Long> getPlanningDepartmentIdList() {
        return planningDepartmentIdList;
    }

    public List<Long> getPlanningUserIdList() {
        return planningUserIdList;
    }

    public Long getPlannedStartTimeFrom() {
        return plannedStartTimeFrom;
    }

    public Long getPlannedStartTimeTo() {
        return plannedStartTimeTo;
    }

    public Long getPlannedEndTimeFrom() {
        return plannedEndTimeFrom;
    }

    public Long getPlannedEndTimeTo() {
        return plannedEndTimeTo;
    }

    public List<Long> getProductionDepartmentIdList() {
        return productionDepartmentIdList;
    }

    public List<Long> getProductionSupervisorIdList() {
        return productionSupervisorIdList;
    }

    public List<Long> getShiftIdList() {
        return shiftIdList;
    }

    public List<String> getMainOutputMaterialCodeList() {
        return mainOutputMaterialCodeList;
    }

    public Integer getGenerationMethod() {
        return generationMethod;
    }

    public List<Long> getCreatorIdList() {
        return creatorIdList;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTo() {
        return createdAtTo;
    }

    public List<Long> getOperatorIdList() {
        return operatorIdList;
    }

    public Long getUpdatedAtFrom() {
        return updatedAtFrom;
    }

    public Long getUpdatedAtTo() {
        return updatedAtTo;
    }

    public List<Long> getPlanOrderRequirementTypeList() {
        return planOrderRequirementTypeList;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setPlanOrderCode(String planOrderCode) {
        this.planOrderCode = planOrderCode;
    }

    public void setPlanOrderLaunchTypeList(List<Integer> planOrderLaunchTypeList) {
        this.planOrderLaunchTypeList = planOrderLaunchTypeList;
    }

    public void setPlanOrderStatusList(List<Integer> planOrderStatusList) {
        this.planOrderStatusList = planOrderStatusList;
    }

    public void setRequirementTimeFrom(Long requirementTimeFrom) {
        this.requirementTimeFrom = requirementTimeFrom;
    }

    public void setRequirementTimeTo(Long requirementTimeTo) {
        this.requirementTimeTo = requirementTimeTo;
    }

    public void setPlanningDepartmentIdList(List<Long> planningDepartmentIdList) {
        this.planningDepartmentIdList = planningDepartmentIdList;
    }

    public void setPlanningUserIdList(List<Long> planningUserIdList) {
        this.planningUserIdList = planningUserIdList;
    }

    public void setPlannedStartTimeFrom(Long plannedStartTimeFrom) {
        this.plannedStartTimeFrom = plannedStartTimeFrom;
    }

    public void setPlannedStartTimeTo(Long plannedStartTimeTo) {
        this.plannedStartTimeTo = plannedStartTimeTo;
    }

    public void setPlannedEndTimeFrom(Long plannedEndTimeFrom) {
        this.plannedEndTimeFrom = plannedEndTimeFrom;
    }

    public void setPlannedEndTimeTo(Long plannedEndTimeTo) {
        this.plannedEndTimeTo = plannedEndTimeTo;
    }

    public void setProductionDepartmentIdList(List<Long> productionDepartmentIdList) {
        this.productionDepartmentIdList = productionDepartmentIdList;
    }

    public void setProductionSupervisorIdList(List<Long> productionSupervisorIdList) {
        this.productionSupervisorIdList = productionSupervisorIdList;
    }

    public void setShiftIdList(List<Long> shiftIdList) {
        this.shiftIdList = shiftIdList;
    }

    public void setMainOutputMaterialCodeList(List<String> mainOutputMaterialCodeList) {
        this.mainOutputMaterialCodeList = mainOutputMaterialCodeList;
    }

    public void setGenerationMethod(Integer generationMethod) {
        this.generationMethod = generationMethod;
    }

    public void setCreatorIdList(List<Long> creatorIdList) {
        this.creatorIdList = creatorIdList;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTo(Long createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public void setOperatorIdList(List<Long> operatorIdList) {
        this.operatorIdList = operatorIdList;
    }

    public void setUpdatedAtFrom(Long updatedAtFrom) {
        this.updatedAtFrom = updatedAtFrom;
    }

    public void setUpdatedAtTo(Long updatedAtTo) {
        this.updatedAtTo = updatedAtTo;
    }

    public void setPlanOrderRequirementTypeList(List<Long> planOrderRequirementTypeList) {
        this.planOrderRequirementTypeList = planOrderRequirementTypeList;
    }
}
