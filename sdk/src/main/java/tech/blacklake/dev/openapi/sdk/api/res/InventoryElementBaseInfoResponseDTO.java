package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InventoryElementBaseInfoResponseDTO {
    /**
     * 业务id
     */
    private long id;

    /**
     * 物料基础信息
     */
    private MaterialBaseInfoResponseDTO material;

    /**
     * 仓位id
     */
    private long storageLocationId;

    /**
     * 质量状态
     */
    private BizConstantDisplay qcStatus;

    /**
     * 业务状态
     */
    private BizConstantDisplay bizStatus;

    /**
     * 仓储状态
     */
    private BizConstantDisplay storageStatus;

    /**
     * 库存关键属性
     */
    private InventoryBizKeyResponseDTO bizKeyAttr;

    /**
     * 物料批次属性
     */
    private MaterialBatchNoAttrResponseDTO batchNoAttr;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 主单位数量
     */
    private BaseAmountResponseDTO amount;

    /**
     * 辅助单位数量
     */
    private List<BaseAmountResponseDTO> auxAmounts;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 操作人id
     */
    private Long operatorId;

    /**
     * 创建人id
     */
    private Long creatorId;

    public long getId() {
        return id;
    }

    public MaterialBaseInfoResponseDTO getMaterial() {
        return material;
    }

    public long getStorageLocationId() {
        return storageLocationId;
    }

    public BizConstantDisplay getQcStatus() {
        return qcStatus;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public BizConstantDisplay getStorageStatus() {
        return storageStatus;
    }

    public InventoryBizKeyResponseDTO getBizKeyAttr() {
        return bizKeyAttr;
    }

    public MaterialBatchNoAttrResponseDTO getBatchNoAttr() {
        return batchNoAttr;
    }

    public String getQrCode() {
        return qrCode;
    }

    public BaseAmountResponseDTO getAmount() {
        return amount;
    }

    public List<BaseAmountResponseDTO> getAuxAmounts() {
        return auxAmounts;
    }

    public Long getVersion() {
        return version;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMaterial(MaterialBaseInfoResponseDTO material) {
        this.material = material;
    }

    public void setStorageLocationId(long storageLocationId) {
        this.storageLocationId = storageLocationId;
    }

    public void setQcStatus(BizConstantDisplay qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setStorageStatus(BizConstantDisplay storageStatus) {
        this.storageStatus = storageStatus;
    }

    public void setBizKeyAttr(InventoryBizKeyResponseDTO bizKeyAttr) {
        this.bizKeyAttr = bizKeyAttr;
    }

    public void setBatchNoAttr(MaterialBatchNoAttrResponseDTO batchNoAttr) {
        this.batchNoAttr = batchNoAttr;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setAmount(BaseAmountResponseDTO amount) {
        this.amount = amount;
    }

    public void setAuxAmounts(List<BaseAmountResponseDTO> auxAmounts) {
        this.auxAmounts = auxAmounts;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}

