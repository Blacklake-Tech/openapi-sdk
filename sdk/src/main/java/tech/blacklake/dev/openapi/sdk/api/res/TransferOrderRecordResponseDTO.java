package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderRecordResponseDTO extends CustomFieldBaseVO {
    /**
     * 工厂ID
     */
    private long orgId;

    /**
     * 调拨单 业务类型 0仓储调拨 1领料调拨
     */
    private BizConstantDisplay bizType;

    /**
     * 调拨单编号
     */
    private String transferOrderCode;

    /**
     * 调拨单ID
     */
    private long transferOrderId;

    /**
     * 调拨单行ID
     */
    private long transferOrderItemId;

    /**
     * 调拨单行号
     */
    private String transferOrderItemLineNo;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 出库位置
     */
    private StorageLocationSimpleInfoResponseDTO sourceLocation;

    /**
     * 入库位置
     */
    private StorageLocationSimpleInfoResponseDTO targetLocation;

    /**
     * 发出记录
     */
    private MaterialInventoryChangeLogResponseDTO issueRecord;

    /**
     * 调拨记录 业务类型 0:按单调拨，1:普通调拨
     */
    private BizConstantDisplay recordBizType;

    /**
     * 接收记录
     */
    private MaterialInventoryChangeLogResponseDTO receiveRecord;

    /**
     * 发出数量
     */
    private ExecuteAmountResponseDTO issueAmount;

    /**
     * 接收数量
     */
    private ExecuteAmountResponseDTO receiveAmount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 创建时间
     */
    private long createdAt;

    public long getOrgId() {
        return orgId;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public String getTransferOrderCode() {
        return transferOrderCode;
    }

    public long getTransferOrderId() {
        return transferOrderId;
    }

    public long getTransferOrderItemId() {
        return transferOrderItemId;
    }

    public String getTransferOrderItemLineNo() {
        return transferOrderItemLineNo;
    }

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public StorageLocationSimpleInfoResponseDTO getSourceLocation() {
        return sourceLocation;
    }

    public StorageLocationSimpleInfoResponseDTO getTargetLocation() {
        return targetLocation;
    }

    public MaterialInventoryChangeLogResponseDTO getIssueRecord() {
        return issueRecord;
    }

    public BizConstantDisplay getRecordBizType() {
        return recordBizType;
    }

    public MaterialInventoryChangeLogResponseDTO getReceiveRecord() {
        return receiveRecord;
    }

    public ExecuteAmountResponseDTO getIssueAmount() {
        return issueAmount;
    }

    public ExecuteAmountResponseDTO getReceiveAmount() {
        return receiveAmount;
    }

    public String getRemark() {
        return remark;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setTransferOrderCode(String transferOrderCode) {
        this.transferOrderCode = transferOrderCode;
    }

    public void setTransferOrderId(long transferOrderId) {
        this.transferOrderId = transferOrderId;
    }

    public void setTransferOrderItemId(long transferOrderItemId) {
        this.transferOrderItemId = transferOrderItemId;
    }

    public void setTransferOrderItemLineNo(String transferOrderItemLineNo) {
        this.transferOrderItemLineNo = transferOrderItemLineNo;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setSourceLocation(StorageLocationSimpleInfoResponseDTO sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public void setTargetLocation(StorageLocationSimpleInfoResponseDTO targetLocation) {
        this.targetLocation = targetLocation;
    }

    public void setIssueRecord(MaterialInventoryChangeLogResponseDTO issueRecord) {
        this.issueRecord = issueRecord;
    }

    public void setRecordBizType(BizConstantDisplay recordBizType) {
        this.recordBizType = recordBizType;
    }

    public void setReceiveRecord(MaterialInventoryChangeLogResponseDTO receiveRecord) {
        this.receiveRecord = receiveRecord;
    }

    public void setIssueAmount(ExecuteAmountResponseDTO issueAmount) {
        this.issueAmount = issueAmount;
    }

    public void setReceiveAmount(ExecuteAmountResponseDTO receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}

