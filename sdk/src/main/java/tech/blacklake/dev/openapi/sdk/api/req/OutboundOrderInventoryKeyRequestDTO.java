package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderInventoryKeyRequestDTO {
    /**
     * 位置ID
     */
    private long storageLocationId;

    /**
     * 物料(SKU)id
     */
    private long skuId;

    /**
     * 质量状态
     */
    private int qcStatus;

    /**
     * 业务状态
     */
    private int bizStatus;

    /**
     * 业务占用实体ID
     */
    private Long bizEntityId;

    /**
     * 仓储状态
     */
    private int storageStatus;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 批号
     */
    private String batchNo;

    /**
     * 货主id
     */
    private Long ownerId;

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
     * key1
     */
    private String key1;

    /**
     * key2
     */
    private String key2;

    /**
     * key3
     */
    private String key3;

    /**
     * key4
     */
    private String key4;

    /**
     * key5
     */
    private String key5;

    /**
     * key6
     */
    private String key6;

    /**
     * key7
     */
    private String key7;

    /**
     * key8
     */
    private String key8;

    /**
     * key9
     */
    private String key9;

    /**
     * key10
     */
    private String key10;

    public long getStorageLocationId() {
        return storageLocationId;
    }

    public long getSkuId() {
        return skuId;
    }

    public int getQcStatus() {
        return qcStatus;
    }

    public int getBizStatus() {
        return bizStatus;
    }

    public Long getBizEntityId() {
        return bizEntityId;
    }

    public int getStorageStatus() {
        return storageStatus;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Long getOwnerId() {
        return ownerId;
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

    public String getKey1() {
        return key1;
    }

    public String getKey2() {
        return key2;
    }

    public String getKey3() {
        return key3;
    }

    public String getKey4() {
        return key4;
    }

    public String getKey5() {
        return key5;
    }

    public String getKey6() {
        return key6;
    }

    public String getKey7() {
        return key7;
    }

    public String getKey8() {
        return key8;
    }

    public String getKey9() {
        return key9;
    }

    public String getKey10() {
        return key10;
    }

    public void setStorageLocationId(long storageLocationId) {
        this.storageLocationId = storageLocationId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public void setQcStatus(int qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBizStatus(int bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setBizEntityId(Long bizEntityId) {
        this.bizEntityId = bizEntityId;
    }

    public void setStorageStatus(int storageStatus) {
        this.storageStatus = storageStatus;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public void setKey4(String key4) {
        this.key4 = key4;
    }

    public void setKey5(String key5) {
        this.key5 = key5;
    }

    public void setKey6(String key6) {
        this.key6 = key6;
    }

    public void setKey7(String key7) {
        this.key7 = key7;
    }

    public void setKey8(String key8) {
        this.key8 = key8;
    }

    public void setKey9(String key9) {
        this.key9 = key9;
    }

    public void setKey10(String key10) {
        this.key10 = key10;
    }
}
