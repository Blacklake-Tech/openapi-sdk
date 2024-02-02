package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskListRequestDTO {
    /**
     * 业务类型1.入厂检, 2.出厂检, 3.首检, 4.生产检, 5巡检
     */
    private Integer checkType;

    /**
     * 质检状态(0:未开始,1:执行中，2:已结束，3:已取消，4:审核中，5:已拒绝)
     */
    private Integer status;

    /**
     * 执行人
     */
    private Long operatorId;

    /**
     * 物料id
     */
    private List<Long> materialIds;

    /**
     * 工序id
     */
    private List<Long> processIds;

    /**
     * 批次id
     */
    private Long batchNoId;

    /**
     * 设备id
     */
    private List<Long> equipmentIds;

    /**
     * 供应商id
     */
    private List<Long> supplierIds;

    /**
     * 客户id
     */
    private List<Long> customerIds;

    /**
     * 创建时间开始
     */
    private Long createdAtFrom;

    /**
     * 创建时间结束
     */
    private Long createdAtTo;

    /**
     * 开始时间开始
     */
    private Long startTimeFrom;

    /**
     * 开始时间结束
     */
    private Long startTimeTo;

    /**
     * 检验方案集合
     */
    private List<Long> qcConfigIds;

    /**
     * 全局搜索参数(任务编号、物料名称、物料编号)
     */
    private String quickSearch;

    public Integer getCheckType() {
        return checkType;
    }

    public Integer getStatus() {
        return status;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public List<Long> getProcessIds() {
        return processIds;
    }

    public Long getBatchNoId() {
        return batchNoId;
    }

    public List<Long> getEquipmentIds() {
        return equipmentIds;
    }

    public List<Long> getSupplierIds() {
        return supplierIds;
    }

    public List<Long> getCustomerIds() {
        return customerIds;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTo() {
        return createdAtTo;
    }

    public Long getStartTimeFrom() {
        return startTimeFrom;
    }

    public Long getStartTimeTo() {
        return startTimeTo;
    }

    public List<Long> getQcConfigIds() {
        return qcConfigIds;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setProcessIds(List<Long> processIds) {
        this.processIds = processIds;
    }

    public void setBatchNoId(Long batchNoId) {
        this.batchNoId = batchNoId;
    }

    public void setEquipmentIds(List<Long> equipmentIds) {
        this.equipmentIds = equipmentIds;
    }

    public void setSupplierIds(List<Long> supplierIds) {
        this.supplierIds = supplierIds;
    }

    public void setCustomerIds(List<Long> customerIds) {
        this.customerIds = customerIds;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTo(Long createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public void setStartTimeFrom(Long startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
    }

    public void setStartTimeTo(Long startTimeTo) {
        this.startTimeTo = startTimeTo;
    }

    public void setQcConfigIds(List<Long> qcConfigIds) {
        this.qcConfigIds = qcConfigIds;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }
}

