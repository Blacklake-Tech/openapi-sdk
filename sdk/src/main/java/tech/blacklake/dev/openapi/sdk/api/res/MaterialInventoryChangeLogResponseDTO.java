package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialInventoryChangeLogResponseDTO {
    /**
     * 库存明细ID
     */
    private long inventoryElementId;

    /**
     * 仓位ID
     */
    private long storageLocationId;

    /**
     * 物料ID
     */
    private long skuId;

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
     * 库存关键业务属性
     */
    private MaterialInventoryBizKeyResponseDTO bizKey;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 修改后数量(仓储单位)
     */
    private BigDecimal afterAmount;

    /**
     * 仓储变更数量(主单位)
     */
    private BigDecimal amount;

    /**
     * 仓储单位ID
     */
    private Long storageUnitId;

    /**
     * 仓储变更数量(操作单位)
     */
    private BigDecimal operateAmount;

    /**
     * 操作单位ID
     */
    private long operateUnitId;

    /**
     * 变更后库存明细的版本号
     */
    private long version;

    /**
     * 操作记录ID
     */
    private Long actId;

    /**
     * 操作记录类型
     */
    private String actType;

    /**
     * 是否已被回滚
     */
    private boolean revertFlag;

    /**
     * 辅助单位数量
     */
    private List<SimpleAmountResponseDTO> auxAmounts;

    /**
     * 追溯id
     */
    private Long traceId;

    /**
     * 关联单据ID
     */
    private Long orderId;

    /**
     * 关联单据行ID
     */
    private Long itemId;

    /**
     * 关联单据类型
     */
    private BizConstantDisplay orderType;

    /**
     * 库存明细变更记录id
     */
    private long id;

    /**
     * 操作人id
     */
    private Long operatorId;

    /**
     * 操作时间
     */
    private Long updatedAt;

    public long getInventoryElementId() {
        return inventoryElementId;
    }

    public long getStorageLocationId() {
        return storageLocationId;
    }

    public long getSkuId() {
        return skuId;
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

    public MaterialInventoryBizKeyResponseDTO getBizKey() {
        return bizKey;
    }

    public String getQrCode() {
        return qrCode;
    }

    public BigDecimal getAfterAmount() {
        return afterAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Long getStorageUnitId() {
        return storageUnitId;
    }

    public BigDecimal getOperateAmount() {
        return operateAmount;
    }

    public long getOperateUnitId() {
        return operateUnitId;
    }

    public long getVersion() {
        return version;
    }

    public Long getActId() {
        return actId;
    }

    public String getActType() {
        return actType;
    }

    public boolean getRevertFlag() {
        return revertFlag;
    }

    public List<SimpleAmountResponseDTO> getAuxAmounts() {
        return auxAmounts;
    }

    public Long getTraceId() {
        return traceId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getItemId() {
        return itemId;
    }

    public BizConstantDisplay getOrderType() {
        return orderType;
    }

    public long getId() {
        return id;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setInventoryElementId(long inventoryElementId) {
        this.inventoryElementId = inventoryElementId;
    }

    public void setStorageLocationId(long storageLocationId) {
        this.storageLocationId = storageLocationId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
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

    public void setBizKey(MaterialInventoryBizKeyResponseDTO bizKey) {
        this.bizKey = bizKey;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStorageUnitId(Long storageUnitId) {
        this.storageUnitId = storageUnitId;
    }

    public void setOperateAmount(BigDecimal operateAmount) {
        this.operateAmount = operateAmount;
    }

    public void setOperateUnitId(long operateUnitId) {
        this.operateUnitId = operateUnitId;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }

    public void setRevertFlag(boolean revertFlag) {
        this.revertFlag = revertFlag;
    }

    public void setAuxAmounts(List<SimpleAmountResponseDTO> auxAmounts) {
        this.auxAmounts = auxAmounts;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setOrderType(BizConstantDisplay orderType) {
        this.orderType = orderType;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
