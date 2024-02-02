package tech.blacklake.dev.openapi.sdk.api.dto;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialInventoryManageAttrDTO {
    /**
     * 先进先出，1启用，0不启用
     */
    private Integer fifoEnabled;

    /**
     * 先进先出属性，0批次号1生产日期2有效期至
     */
    private Integer fifoAttr;

    /**
     * 库存明细标识码编号规则ID
     */
    private Long inventoryQrCodeRuleId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 仓库编号
     */
    private String warehouseCode;

    /**
     * 仓位ID
     */
    private Long locationId;

    /**
     * 仓位名称
     */
    private String locationName;

    /**
     * 仓位编号
     */
    private String locationCode;

    /**
     * 存储有效期（时间）
     */
    private Integer validity;

    /**
     * 存储有效期（单位）0年、1月、2日、3时、4分
     */
    private Integer validityUnit;

    /**
     * 调拨批量
     */
    private BigDecimal transferBatch;

    /**
     * 调拨批量（返回字符串类型）
     */
    private String transferBatchDisplay;

    /**
     * 调拨批量单位
     */
    private Long transferUnitId;

    public Integer getFifoEnabled() {
        return fifoEnabled;
    }

    public Integer getFifoAttr() {
        return fifoAttr;
    }

    public Long getInventoryQrCodeRuleId() {
        return inventoryQrCodeRuleId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public Long getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public Integer getValidity() {
        return validity;
    }

    public Integer getValidityUnit() {
        return validityUnit;
    }

    public BigDecimal getTransferBatch() {
        return transferBatch;
    }

    public String getTransferBatchDisplay() {
        return transferBatchDisplay;
    }

    public Long getTransferUnitId() {
        return transferUnitId;
    }

    public void setFifoEnabled(Integer fifoEnabled) {
        this.fifoEnabled = fifoEnabled;
    }

    public void setFifoAttr(Integer fifoAttr) {
        this.fifoAttr = fifoAttr;
    }

    public void setInventoryQrCodeRuleId(Long inventoryQrCodeRuleId) {
        this.inventoryQrCodeRuleId = inventoryQrCodeRuleId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public void setValidityUnit(Integer validityUnit) {
        this.validityUnit = validityUnit;
    }

    public void setTransferBatch(BigDecimal transferBatch) {
        this.transferBatch = transferBatch;
    }

    public void setTransferBatchDisplay(String transferBatchDisplay) {
        this.transferBatchDisplay = transferBatchDisplay;
    }

    public void setTransferUnitId(Long transferUnitId) {
        this.transferUnitId = transferUnitId;
    }
}

