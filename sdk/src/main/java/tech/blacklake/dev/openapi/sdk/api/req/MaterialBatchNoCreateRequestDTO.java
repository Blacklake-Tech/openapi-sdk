package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialBatchNoCreateRequestDTO extends CustomFieldBaseCO {
    /**
     * 物料id，必填
     */
    private long materialId;

    /**
     * 批次号，非必填，支持字母，数字和符号
     */
    private String batchNo;

    /**
     * 批次号规则id，非必填
     */
    private Long numberRuleId;

    /**
     * 供应商批次，非必填，支持字母，数字，符号和中文
     */
    private String supplierBatch;

    /**
     * 供应商ID，非必填
     */
    private Long supplierId;

    /**
     * 客户ID，非必填
     */
    private Long customerId;

    /**
     * 生产日期（时间戳），非必填
     */
    private Long produceAt;

    /**
     * 有效期至（时间戳），非必填
     */
    private Long validTo;

    public long getMaterialId() {
        return materialId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Long getNumberRuleId() {
        return numberRuleId;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getProduceAt() {
        return produceAt;
    }

    public Long getValidTo() {
        return validTo;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setNumberRuleId(Long numberRuleId) {
        this.numberRuleId = numberRuleId;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setProduceAt(Long produceAt) {
        this.produceAt = produceAt;
    }

    public void setValidTo(Long validTo) {
        this.validTo = validTo;
    }
}
