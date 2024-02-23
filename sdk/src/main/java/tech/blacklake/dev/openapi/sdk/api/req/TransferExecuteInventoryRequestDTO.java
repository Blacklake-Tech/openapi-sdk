package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferExecuteInventoryRequestDTO {
    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 发出仓位ID
     */
    private long locationId;

    /**
     * 质检状态
     */
    private int qcStatus;

    /**
     * 仓储状态
     */
    private int storageStatus;

    /**
     * 执行数量
     */
    private ExecuteAmountRequestDTO amount;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 库存关键属性
     */
    private TransferExecuteInventoryBizKeyRequestDTO bizKey;

    public long getMaterialId() {
        return materialId;
    }

    public long getLocationId() {
        return locationId;
    }

    public int getQcStatus() {
        return qcStatus;
    }

    public int getStorageStatus() {
        return storageStatus;
    }

    public ExecuteAmountRequestDTO getAmount() {
        return amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public TransferExecuteInventoryBizKeyRequestDTO getBizKey() {
        return bizKey;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public void setQcStatus(int qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setStorageStatus(int storageStatus) {
        this.storageStatus = storageStatus;
    }

    public void setAmount(ExecuteAmountRequestDTO amount) {
        this.amount = amount;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setBizKey(TransferExecuteInventoryBizKeyRequestDTO bizKey) {
        this.bizKey = bizKey;
    }
}
