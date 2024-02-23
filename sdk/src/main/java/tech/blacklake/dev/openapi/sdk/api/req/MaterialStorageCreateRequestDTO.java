package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialStorageCreateRequestDTO {
    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 转换单位，非必填
     */
    private MaterialStorageUnitCreateRequestDTO convertUnit;

    /**
     * 默认仓库，非必填
     */
    private MaterialStorageWarehouseCreateRequestDTO warehouse;

    /**
     * 默认仓位，非必填
     */
    private MaterialStorageLocationCreateRequestDTO location;

    /**
     * 存储有效期，非必填
     */
    private MaterialStorageValidityCreateRequestDTO validity;

    /**
     * 先进先出，必填，1启用，0不启用
     */
    private Integer fifoEnabled;

    /**
     * 先进先出属性，非必填，0批次号1生产日期2有效期至
     */
    private Integer fifoAttr;

    /**
     * 库存标识码规则，非必填
     */
    private MaterialAttrRuleSaveRequestDTO inventoryQrCodeRule;

    /**
     * 库存属性，非必填
     */
    private List<MaterialStorageAttrCreateRequestDTO> inventoryAttrs;

    /**
     * 调拨批量，非必填
     */
    private BigDecimal transferBatch;

    /**
     * 调拨批量单位，非必填
     */
    private Long transferUnitId;

    public long getMaterialId() {
        return materialId;
    }

    public MaterialStorageUnitCreateRequestDTO getConvertUnit() {
        return convertUnit;
    }

    public MaterialStorageWarehouseCreateRequestDTO getWarehouse() {
        return warehouse;
    }

    public MaterialStorageLocationCreateRequestDTO getLocation() {
        return location;
    }

    public MaterialStorageValidityCreateRequestDTO getValidity() {
        return validity;
    }

    public Integer getFifoEnabled() {
        return fifoEnabled;
    }

    public Integer getFifoAttr() {
        return fifoAttr;
    }

    public MaterialAttrRuleSaveRequestDTO getInventoryQrCodeRule() {
        return inventoryQrCodeRule;
    }

    public List<MaterialStorageAttrCreateRequestDTO> getInventoryAttrs() {
        return inventoryAttrs;
    }

    public BigDecimal getTransferBatch() {
        return transferBatch;
    }

    public Long getTransferUnitId() {
        return transferUnitId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setConvertUnit(MaterialStorageUnitCreateRequestDTO convertUnit) {
        this.convertUnit = convertUnit;
    }

    public void setWarehouse(MaterialStorageWarehouseCreateRequestDTO warehouse) {
        this.warehouse = warehouse;
    }

    public void setLocation(MaterialStorageLocationCreateRequestDTO location) {
        this.location = location;
    }

    public void setValidity(MaterialStorageValidityCreateRequestDTO validity) {
        this.validity = validity;
    }

    public void setFifoEnabled(Integer fifoEnabled) {
        this.fifoEnabled = fifoEnabled;
    }

    public void setFifoAttr(Integer fifoAttr) {
        this.fifoAttr = fifoAttr;
    }

    public void setInventoryQrCodeRule(MaterialAttrRuleSaveRequestDTO inventoryQrCodeRule) {
        this.inventoryQrCodeRule = inventoryQrCodeRule;
    }

    public void setInventoryAttrs(List<MaterialStorageAttrCreateRequestDTO> inventoryAttrs) {
        this.inventoryAttrs = inventoryAttrs;
    }

    public void setTransferBatch(BigDecimal transferBatch) {
        this.transferBatch = transferBatch;
    }

    public void setTransferUnitId(Long transferUnitId) {
        this.transferUnitId = transferUnitId;
    }
}
