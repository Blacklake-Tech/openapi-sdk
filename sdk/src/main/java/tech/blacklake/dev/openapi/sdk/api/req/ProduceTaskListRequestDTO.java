package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProduceTaskListRequestDTO extends BasePage {
    /**
     * 快速搜索
     */
    private String quickSearch;

    /**
     * 任务状态
     */
    private List<Integer> taskStatusList;

    /**
     * sop任务ID列表
     */
    private List<Long> sopTaskIdList;

    /**
     * 工序ID列表
     */
    private List<Long> processIdList;

    /**
     * 工序定义ID列表
     */
    private List<Long> processDefIdList;

    /**
     * 物料Code列表
     */
    private List<Long> materialIdList;

    /**
     * 工单Id
     */
    private List<Long> workOrderIdList;

    /**
     * 销售订单ID列表
     */
    private List<Long> salesOrderIdList;

    /**
     * 工作中心ID列表
     */
    private List<Long> workCenterIdList;

    /**
     * 设备ID列表
     */
    private List<Long> equipmentIdList;

    /**
     * 部门ID列表
     */
    private List<Long> departmentIdList;

    /**
     * 可执行人ID列表
     */
    private List<Long> executorIdList;

    /**
     * 计划开始时间-起
     */
    private Long planStartTimeFrom;

    /**
     * 计划开始时间-止
     */
    private Long planStartTimeTo;

    /**
     * 计划结束时间-起
     */
    private Long planEndTimeFrom;

    /**
     * 计划结束时间-止
     */
    private Long planEndTimeTo;

    public String getQuickSearch() {
        return quickSearch;
    }

    public List<Integer> getTaskStatusList() {
        return taskStatusList;
    }

    public List<Long> getSopTaskIdList() {
        return sopTaskIdList;
    }

    public List<Long> getProcessIdList() {
        return processIdList;
    }

    public List<Long> getProcessDefIdList() {
        return processDefIdList;
    }

    public List<Long> getMaterialIdList() {
        return materialIdList;
    }

    public List<Long> getWorkOrderIdList() {
        return workOrderIdList;
    }

    public List<Long> getSalesOrderIdList() {
        return salesOrderIdList;
    }

    public List<Long> getWorkCenterIdList() {
        return workCenterIdList;
    }

    public List<Long> getEquipmentIdList() {
        return equipmentIdList;
    }

    public List<Long> getDepartmentIdList() {
        return departmentIdList;
    }

    public List<Long> getExecutorIdList() {
        return executorIdList;
    }

    public Long getPlanStartTimeFrom() {
        return planStartTimeFrom;
    }

    public Long getPlanStartTimeTo() {
        return planStartTimeTo;
    }

    public Long getPlanEndTimeFrom() {
        return planEndTimeFrom;
    }

    public Long getPlanEndTimeTo() {
        return planEndTimeTo;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setTaskStatusList(List<Integer> taskStatusList) {
        this.taskStatusList = taskStatusList;
    }

    public void setSopTaskIdList(List<Long> sopTaskIdList) {
        this.sopTaskIdList = sopTaskIdList;
    }

    public void setProcessIdList(List<Long> processIdList) {
        this.processIdList = processIdList;
    }

    public void setProcessDefIdList(List<Long> processDefIdList) {
        this.processDefIdList = processDefIdList;
    }

    public void setMaterialIdList(List<Long> materialIdList) {
        this.materialIdList = materialIdList;
    }

    public void setWorkOrderIdList(List<Long> workOrderIdList) {
        this.workOrderIdList = workOrderIdList;
    }

    public void setSalesOrderIdList(List<Long> salesOrderIdList) {
        this.salesOrderIdList = salesOrderIdList;
    }

    public void setWorkCenterIdList(List<Long> workCenterIdList) {
        this.workCenterIdList = workCenterIdList;
    }

    public void setEquipmentIdList(List<Long> equipmentIdList) {
        this.equipmentIdList = equipmentIdList;
    }

    public void setDepartmentIdList(List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    public void setExecutorIdList(List<Long> executorIdList) {
        this.executorIdList = executorIdList;
    }

    public void setPlanStartTimeFrom(Long planStartTimeFrom) {
        this.planStartTimeFrom = planStartTimeFrom;
    }

    public void setPlanStartTimeTo(Long planStartTimeTo) {
        this.planStartTimeTo = planStartTimeTo;
    }

    public void setPlanEndTimeFrom(Long planEndTimeFrom) {
        this.planEndTimeFrom = planEndTimeFrom;
    }

    public void setPlanEndTimeTo(Long planEndTimeTo) {
        this.planEndTimeTo = planEndTimeTo;
    }
}
