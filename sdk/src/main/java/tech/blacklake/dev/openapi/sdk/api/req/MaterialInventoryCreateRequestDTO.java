package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialInventoryCreateRequestDTO {
    /**
     * 物料编号，必须填写系统中已存在的物料编号
     */
    private String materialCode;

    /**
     * 仓库编号，租户未启用仓位管理时必填，必须填写系统中已存在的仓库编号
     */
    private String warehouseCode;

    /**
     * 仓位编号，租户启用仓位管理时必填，必须填写系统中已存在的仓位编号
     */
    private String locationCode;

    /**
     * 质量状态，须填写{合格，让步合格，不合格，待检}中的任意值，不填写默认为合格
     */
    private String qcStatus;

    /**
     * 数量，请填写整数或小数，支持填写负数
     */
    private String amount;

    /**
     * 单位名称，必须是该物料上存在且已启用的主单位或转换单位名称，未填写时默认为该物料主单位
     */
    private String unitName;

    /**
     * 辅助数量，请填写正整数或正小数
     */
    private String auxAmount;

    /**
     * 辅助单位，默认物料上当前启用的辅助单位
     */
    private String auxAmountUnit;

    /**
     * 批次号，必须填写系统中已存在的批次对应的批次号
     */
    private String batchNo;

    /**
     * 标识码，必须为空标识码或与本次导入库存完全一致的标识码
     */
    private String qrCode;

    /**
     * 供应商编号，是否必填根据「物料-库存属性」配置决定，必须填写必须填写系统中已存在的供应商编号
     */
    private String supplierCode;

    /**
     * 供应商批次，是否必填根据「物料-库存属性」配置决定，支持字母、数字和符号，不可超过 255 个字符
     */
    private String supplierBatch;

    /**
     * 客户编号，是否必填根据「物料-库存属性」配置决定，必须填写必须填写系统中已存在的客户编号
     */
    private String customerCode;

    /**
     * 生产日期，是否必填根据「物料-库存属性」配置决定，支持填写“YYYY/mm/DD HH:MM:SS”格式的日期时间
     */
    private String productTime;

    /**
     * 保质期至，是否必填根据「物料-库存属性」配置决定，支持填写“YYYY/mm/DD HH:MM:SS”格式的日期时间
     */
    private String validityPeriod;

    /**
     * 入厂日期，是否必填根据「物料-库存属性」配置决定，支持填写“YYYY/mm/DD HH:MM:SS”格式的日期时间
     */
    private String inboundTime;

    public String getMaterialCode() {
        return materialCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public String getQcStatus() {
        return qcStatus;
    }

    public String getAmount() {
        return amount;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getAuxAmount() {
        return auxAmount;
    }

    public String getAuxAmountUnit() {
        return auxAmountUnit;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getProductTime() {
        return productTime;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public String getInboundTime() {
        return inboundTime;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public void setQcStatus(String qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setAuxAmount(String auxAmount) {
        this.auxAmount = auxAmount;
    }

    public void setAuxAmountUnit(String auxAmountUnit) {
        this.auxAmountUnit = auxAmountUnit;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setProductTime(String productTime) {
        this.productTime = productTime;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public void setInboundTime(String inboundTime) {
        this.inboundTime = inboundTime;
    }
}
