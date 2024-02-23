package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialInventoryBizKeyResponseDTO {
    /**
     * orgId
     */
    private Long orgId;

    /**
     * 业务ID
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 批次ID
     */
    private Long batchNoId;

    /**
     * 货主
     */
    private Long ownerId;

    /**
     * 载具ID
     */
    private Long handlingEqId;

    /**
     * 供应商
     */
    private SimpleResponseDTO supplier;

    /**
     * 供应商批次
     */
    private String supplierBatchNo;

    /**
     * 客户
     */
    private SimpleResponseDTO customer;

    /**
     * 入厂日期
     */
    private Long inboundTime;

    /**
     * 生产日期
     */
    private Long productTime;

    /**
     * 有效期至
     */
    private Long validityPeriod;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 创建时间
     */
    private Long createdAt;

    public Long getOrgId() {
        return orgId;
    }

    public Long getId() {
        return id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Long getBatchNoId() {
        return batchNoId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Long getHandlingEqId() {
        return handlingEqId;
    }

    public SimpleResponseDTO getSupplier() {
        return supplier;
    }

    public String getSupplierBatchNo() {
        return supplierBatchNo;
    }

    public SimpleResponseDTO getCustomer() {
        return customer;
    }

    public Long getInboundTime() {
        return inboundTime;
    }

    public Long getProductTime() {
        return productTime;
    }

    public Long getValidityPeriod() {
        return validityPeriod;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setBatchNoId(Long batchNoId) {
        this.batchNoId = batchNoId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setHandlingEqId(Long handlingEqId) {
        this.handlingEqId = handlingEqId;
    }

    public void setSupplier(SimpleResponseDTO supplier) {
        this.supplier = supplier;
    }

    public void setSupplierBatchNo(String supplierBatchNo) {
        this.supplierBatchNo = supplierBatchNo;
    }

    public void setCustomer(SimpleResponseDTO customer) {
        this.customer = customer;
    }

    public void setInboundTime(Long inboundTime) {
        this.inboundTime = inboundTime;
    }

    public void setProductTime(Long productTime) {
        this.productTime = productTime;
    }

    public void setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
