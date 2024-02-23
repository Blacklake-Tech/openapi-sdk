package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialBatchDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 工厂id
     */
    private long orgId;

    /**
     * 业务id
     */
    private long id;

    /**
     * 物料id
     */
    private long materialId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 供应商批次
     */
    private String supplierBatch;

    /**
     * 供应商id
     */
    private long supplierId;

    /**
     * 客户id
     */
    private long customerId;

    /**
     * 供应商
     */
    private SupplierResponseDTO supplier;

    /**
     * 客户
     */
    private CustomerResponseDTO customer;

    /**
     * 生产日期（时间戳）
     */
    private Long produceAt;

    /**
     * 有效期至（时间戳）
     */
    private Long validTo;

    /**
     * 物料信息
     */
    private MaterialInfoResponseDTO materialInfo;

    /**
     * 创建时间
     */
    private Long createdAt;

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public long getMaterialId() {
        return materialId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public SupplierResponseDTO getSupplier() {
        return supplier;
    }

    public CustomerResponseDTO getCustomer() {
        return customer;
    }

    public Long getProduceAt() {
        return produceAt;
    }

    public Long getValidTo() {
        return validTo;
    }

    public MaterialInfoResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setSupplier(SupplierResponseDTO supplier) {
        this.supplier = supplier;
    }

    public void setCustomer(CustomerResponseDTO customer) {
        this.customer = customer;
    }

    public void setProduceAt(Long produceAt) {
        this.produceAt = produceAt;
    }

    public void setValidTo(Long validTo) {
        this.validTo = validTo;
    }

    public void setMaterialInfo(MaterialInfoResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
