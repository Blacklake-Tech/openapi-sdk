package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BatchNoAttrRequestDTO {
    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 供应商批次
     */
    private String supplierBatchNo;

    /**
     * 客户
     */
    private Long customerId;

    /**
     * 生产日期
     */
    private Long productTime;

    /**
     * 有效期至
     */
    private Long validityPeriod;

    public Long getSupplierId() {
        return supplierId;
    }

    public String getSupplierBatchNo() {
        return supplierBatchNo;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getProductTime() {
        return productTime;
    }

    public Long getValidityPeriod() {
        return validityPeriod;
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

    public void setProductTime(Long productTime) {
        this.productTime = productTime;
    }

    public void setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
    }
}

