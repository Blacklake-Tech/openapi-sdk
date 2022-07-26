package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialInventorySearchRequestDTO extends BasePage {
    /**
     * 仓库id
     */
    private List<Long> warehouseIds;

    /**
     * 仓位id
     */
    private List<Long> storageLocationIds;

    /**
     * 物料id
     */
    private List<Long> materialIds;

    /**
     * 批次号
     */
    private List<String> batchNos;

    /**
     * 业务状态, 0:无业务，1:质检中
     */
    private List<Integer> bizStatus;

    /**
     * 标识码
     */
    private List<String> qrCodes;

    /**
     * 供应商id
     */
    private List<Long> supplierIds;

    public List<Long> getWarehouseIds() {
        return warehouseIds;
    }

    public List<Long> getStorageLocationIds() {
        return storageLocationIds;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public List<String> getBatchNos() {
        return batchNos;
    }

    public List<Integer> getBizStatus() {
        return bizStatus;
    }

    public List<String> getQrCodes() {
        return qrCodes;
    }

    public List<Long> getSupplierIds() {
        return supplierIds;
    }

    public void setWarehouseIds(List<Long> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public void setStorageLocationIds(List<Long> storageLocationIds) {
        this.storageLocationIds = storageLocationIds;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setBatchNos(List<String> batchNos) {
        this.batchNos = batchNos;
    }

    public void setBizStatus(List<Integer> bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setQrCodes(List<String> qrCodes) {
        this.qrCodes = qrCodes;
    }

    public void setSupplierIds(List<Long> supplierIds) {
        this.supplierIds = supplierIds;
    }
}

