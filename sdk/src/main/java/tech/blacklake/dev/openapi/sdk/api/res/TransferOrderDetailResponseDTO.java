package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 工厂ID
     */
    private long orgId;

    /**
     * 业务ID
     */
    private long id;

    /**
     * 调拨单编号
     */
    private String code;

    /**
     * 业务类型 0仓储调拨 1领料调拨
     */
    private BizConstantDisplay bizType;

    /**
     * 业务状态 0新建 1已下发 2执行中 3已完成 4已关闭
     */
    private BizConstantDisplay bizStatus;

    /**
     * 发出仓库
     */
    private StorageWarehouseResponseDTO sourceWarehouse;

    /**
     * 接收仓库
     */
    private StorageWarehouseResponseDTO targetWarehouse;

    /**
     * 调拨单明细列表
     */
    private List<TransferOrderItemDetailResponseDTO> transferOrderItems;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 更新人
     */
    private UserSimpleResponseDTO operator;

    /**
     * 创建时间（时间戳）
     */
    private long createdAt;

    /**
     * 更新时间（时间戳）
     */
    private long updatedAt;

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public StorageWarehouseResponseDTO getSourceWarehouse() {
        return sourceWarehouse;
    }

    public StorageWarehouseResponseDTO getTargetWarehouse() {
        return targetWarehouse;
    }

    public List<TransferOrderItemDetailResponseDTO> getTransferOrderItems() {
        return transferOrderItems;
    }

    public String getRemark() {
        return remark;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setSourceWarehouse(StorageWarehouseResponseDTO sourceWarehouse) {
        this.sourceWarehouse = sourceWarehouse;
    }

    public void setTargetWarehouse(StorageWarehouseResponseDTO targetWarehouse) {
        this.targetWarehouse = targetWarehouse;
    }

    public void setTransferOrderItems(List<TransferOrderItemDetailResponseDTO> transferOrderItems) {
        this.transferOrderItems = transferOrderItems;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
