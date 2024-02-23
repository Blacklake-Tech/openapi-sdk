package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class AttrDetailResponseDTO {
    /**
     *
     */
    private StorageLocationDetailInfoResponseDTO location;

    /**
     *
     */
    private BizConstantDisplay qcStatus;

    /**
     *
     */
    private String supplierBatch;

    /**
     *
     */
    private SupplierSimpleResponseDTO supplier;

    /**
     *
     */
    private CustomerSimpleResponseDTO customer;

    /**
     *
     */
    private String batchNo;

    /**
     *
     */
    private Long inboundTime;

    /**
     *
     */
    private Long productTime;

    /**
     *
     */
    private Long validityPeriod;

    /**
     *
     */
    private String qrCode;

    /**
     *
     */
    private BaseAmountDisplay changAmount;

    /**
     *
     */
    private BaseAmountDisplay changeAmountMasterUnit;

    /**
     *
     */
    private BaseAmountDisplay afterAmount;

    /**
     *
     */
    private BaseAmountDisplay beforeAmount;

    public StorageLocationDetailInfoResponseDTO getLocation() {
        return location;
    }

    public BizConstantDisplay getQcStatus() {
        return qcStatus;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public SupplierSimpleResponseDTO getSupplier() {
        return supplier;
    }

    public CustomerSimpleResponseDTO getCustomer() {
        return customer;
    }

    public String getBatchNo() {
        return batchNo;
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

    public String getQrCode() {
        return qrCode;
    }

    public BaseAmountDisplay getChangAmount() {
        return changAmount;
    }

    public BaseAmountDisplay getChangeAmountMasterUnit() {
        return changeAmountMasterUnit;
    }

    public BaseAmountDisplay getAfterAmount() {
        return afterAmount;
    }

    public BaseAmountDisplay getBeforeAmount() {
        return beforeAmount;
    }

    public void setLocation(StorageLocationDetailInfoResponseDTO location) {
        this.location = location;
    }

    public void setQcStatus(BizConstantDisplay qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setSupplier(SupplierSimpleResponseDTO supplier) {
        this.supplier = supplier;
    }

    public void setCustomer(CustomerSimpleResponseDTO customer) {
        this.customer = customer;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setChangAmount(BaseAmountDisplay changAmount) {
        this.changAmount = changAmount;
    }

    public void setChangeAmountMasterUnit(BaseAmountDisplay changeAmountMasterUnit) {
        this.changeAmountMasterUnit = changeAmountMasterUnit;
    }

    public void setAfterAmount(BaseAmountDisplay afterAmount) {
        this.afterAmount = afterAmount;
    }

    public void setBeforeAmount(BaseAmountDisplay beforeAmount) {
        this.beforeAmount = beforeAmount;
    }
}
