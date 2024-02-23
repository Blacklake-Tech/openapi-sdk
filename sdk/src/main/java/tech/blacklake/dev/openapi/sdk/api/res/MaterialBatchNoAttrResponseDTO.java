package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialBatchNoAttrResponseDTO {
    /**
     * 工厂id
     */
    private Long orgId;

    /**
     * 业务id
     */
    private Long id;

    /**
     * 物料id
     */
    private Long materialId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 供应商批次
     */
    private String supplierBatch;

    /**
     * 供应商
     */
    private Long supplier;

    /**
     * 客户
     */
    private Long customer;

    /**
     * 生产日期（时间戳）
     */
    private Long produceAt;

    /**
     * 有效期至（时间戳）
     */
    private Long validTo;

    public Long getOrgId() {
        return orgId;
    }

    public Long getId() {
        return id;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public Long getSupplier() {
        return supplier;
    }

    public Long getCustomer() {
        return customer;
    }

    public Long getProduceAt() {
        return produceAt;
    }

    public Long getValidTo() {
        return validTo;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }

    public void setProduceAt(Long produceAt) {
        this.produceAt = produceAt;
    }

    public void setValidTo(Long validTo) {
        this.validTo = validTo;
    }
}
