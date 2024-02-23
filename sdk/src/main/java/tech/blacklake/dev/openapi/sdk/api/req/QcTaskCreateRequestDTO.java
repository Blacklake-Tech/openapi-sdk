package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskCreateRequestDTO extends CustomFieldBaseCO {
    /**
     * id
     */
    private Long id;

    /**
     * 检验类型 1.入厂检 2.出厂检 3.首检 4.生产检 5.巡检 6.通用检）
     */
    private Integer checkType;

    /**
     * 任务编号
     */
    private String code;

    /**
     * 检验任务工序id
     */
    private Long processId;

    /**
     * 检验任务物料id
     */
    private Long materialId;

    /**
     * 检验任务设备id
     */
    private Long resourceId;

    /**
     * 检验任务供应商id
     */
    private Long supplierId;

    /**
     * 检验任务客户id
     */
    private Long customerId;

    /**
     * 批号id
     */
    private Long batchNoId;

    /**
     * 检验方案模版Id
     */
    private Long configId;

    /**
     * 可领取人(候选人)
     */
    private List<Long> candidateIds;

    /**
     * 创建人
     */
    private Long creatorId;

    /**
     * 创建时间
     */
    private Long createdAt;

    public Long getId() {
        return id;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public String getCode() {
        return code;
    }

    public Long getProcessId() {
        return processId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getBatchNoId() {
        return batchNoId;
    }

    public Long getConfigId() {
        return configId;
    }

    public List<Long> getCandidateIds() {
        return candidateIds;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setBatchNoId(Long batchNoId) {
        this.batchNoId = batchNoId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public void setCandidateIds(List<Long> candidateIds) {
        this.candidateIds = candidateIds;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
