package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailRangeResponseDTO {
    /**
     * 检验范围id
     */
    private Long id;

    /**
     * 检验范围code
     */
    private String code;

    /**
     * 物料
     */
    private QcTaskWebDetailRangeMaterialResponseDTO material;

    /**
     * 批号
     */
    private List<QcTaskWebDetailRangeBatchNumberResponseDTO> batchNumbers;

    /**
     * 供应商
     */
    private List<QcTaskWebDetailRangeSupplierResponseDTO> suppliers;

    /**
     * 供应商批次
     */
    private List<QcTaskWebDetailRangeSupplierBatchResponseDTO> supplierBatchs;

    /**
     * 客户
     */
    private List<QcTaskWebDetailRangeCustomerResponseDTO> customers;

    /**
     * 存储位置
     */
    private List<QcTaskWebDetailRangeStorageResponseDTO> storages;

    /**
     * 生产日期
     */
    private Date manufactureDate;

    /**
     * 有效期至
     */
    private Date expirationDate;

    /**
     * 质量状态（1合格, 2让步合格, 3待检, 4不合格）
     */
    private List<Integer> qcStatus;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public QcTaskWebDetailRangeMaterialResponseDTO getMaterial() {
        return material;
    }

    public List<QcTaskWebDetailRangeBatchNumberResponseDTO> getBatchNumbers() {
        return batchNumbers;
    }

    public List<QcTaskWebDetailRangeSupplierResponseDTO> getSuppliers() {
        return suppliers;
    }

    public List<QcTaskWebDetailRangeSupplierBatchResponseDTO> getSupplierBatchs() {
        return supplierBatchs;
    }

    public List<QcTaskWebDetailRangeCustomerResponseDTO> getCustomers() {
        return customers;
    }

    public List<QcTaskWebDetailRangeStorageResponseDTO> getStorages() {
        return storages;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public List<Integer> getQcStatus() {
        return qcStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMaterial(QcTaskWebDetailRangeMaterialResponseDTO material) {
        this.material = material;
    }

    public void setBatchNumbers(List<QcTaskWebDetailRangeBatchNumberResponseDTO> batchNumbers) {
        this.batchNumbers = batchNumbers;
    }

    public void setSuppliers(List<QcTaskWebDetailRangeSupplierResponseDTO> suppliers) {
        this.suppliers = suppliers;
    }

    public void setSupplierBatchs(List<QcTaskWebDetailRangeSupplierBatchResponseDTO> supplierBatchs) {
        this.supplierBatchs = supplierBatchs;
    }

    public void setCustomers(List<QcTaskWebDetailRangeCustomerResponseDTO> customers) {
        this.customers = customers;
    }

    public void setStorages(List<QcTaskWebDetailRangeStorageResponseDTO> storages) {
        this.storages = storages;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setQcStatus(List<Integer> qcStatus) {
        this.qcStatus = qcStatus;
    }
}

