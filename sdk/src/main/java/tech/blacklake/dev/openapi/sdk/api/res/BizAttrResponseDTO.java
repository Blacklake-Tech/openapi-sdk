package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BizAttrResponseDTO {
    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 供应商批次
     */
    private String supplierBatch;

    /**
     * 客户
     */
    private String customer;

    /**
     * 入厂日期
     */
    private Long inboundTime;

    /**
     * 出厂日期
     */
    private Long productTime;

    /**
     * 保质期至
     */
    private Long validityPeriod;

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public String getCustomer() {
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

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setCustomer(String customer) {
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
}
