package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InventoryBizKeyResponseDTO {
    /**
     * 业务id
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 货主id
     */
    private Long ownerId;

    /**
     * 载具id
     */
    private Long handlingEqId;

    /**
     * 供应商id
     */
    private Long supplierId;

    /**
     * 供应商批次
     */
    private String supplierBatchNo;

    /**
     * 客户id
     */
    private Long customerId;

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

    public Long getId() {
        return id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Long getHandlingEqId() {
        return handlingEqId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getSupplierBatchNo() {
        return supplierBatchNo;
    }

    public Long getCustomerId() {
        return customerId;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setHandlingEqId(Long handlingEqId) {
        this.handlingEqId = handlingEqId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierBatchNo(String supplierBatchNo) {
        this.supplierBatchNo = supplierBatchNo;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
}
