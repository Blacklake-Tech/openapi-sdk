package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderOperateRecordResponseDTO extends CustomFieldBaseVO {
    /**
     * 入库单号
     */
    private String inboundOrderCode;

    /**
     * 入库记录Id
     */
    private Long inboundOrderOperateId;

    /**
     * 冲销关联的入库记录id
     */
    private Long linkedOpId;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 入库单 业务类型 0其他入库 1采购收货 2销售退货
     */
    private BizConstantDisplay bizType;

    /**
     * 入库类型 1:按单入库/2:普通入库/3:生产入库/4:冲销入库
     */
    private BizConstantDisplay executeType;

    /**
     * 入库类型 1:按单入库/2:普通入库/3:生产入库/4:冲销入库/5:跨厂入库
     */
    private BizConstantDisplay entityType;

    /**
     * 来源类型 0无源入库 1协同收货单 2协同销售退货单
     */
    private BizConstantDisplay sourceType;

    /**
     * 关联对象
     */
    private String relationObjStr;

    /**
     * 库存关键业务属性
     */
    private MaterialInventoryBizKeyResponseDTO bizKsyAttr;

    /**
     * 质量状态 1:合格/2:让步合格/3:待检/4:不合格/99:未知
     */
    private BizConstantDisplay qcStatus;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 物料
     */
    private MaterialCommonInfoResponseDTO material;

    /**
     * 仓位
     */
    private SimpleLocationResponseDTO storageLocation;

    /**
     * 入库数量
     */
    private ExecuteAmountResponseDTO amount;

    /**
     * 操作人
     */
    private UserSimpleResponseDTO operator;

    /**
     * 操作时间
     */
    private long operateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 附件
     */
    private List<Long> attachmentIdList;

    /**
     * 库存变更关联单据id
     */
    private Long changeLogOrderId;

    /**
     * 库存变更关联单据行id
     */
    private Long changeLogItemId;

    /**
     * 库存变更关联单据类型 1生产任务
     */
    private BizConstantDisplay changeLogOrderType;

    public String getInboundOrderCode() {
        return inboundOrderCode;
    }

    public Long getInboundOrderOperateId() {
        return inboundOrderOperateId;
    }

    public Long getLinkedOpId() {
        return linkedOpId;
    }

    public String getLineNo() {
        return lineNo;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getExecuteType() {
        return executeType;
    }

    public BizConstantDisplay getEntityType() {
        return entityType;
    }

    public BizConstantDisplay getSourceType() {
        return sourceType;
    }

    public String getRelationObjStr() {
        return relationObjStr;
    }

    public MaterialInventoryBizKeyResponseDTO getBizKsyAttr() {
        return bizKsyAttr;
    }

    public BizConstantDisplay getQcStatus() {
        return qcStatus;
    }

    public String getQrCode() {
        return qrCode;
    }

    public MaterialCommonInfoResponseDTO getMaterial() {
        return material;
    }

    public SimpleLocationResponseDTO getStorageLocation() {
        return storageLocation;
    }

    public ExecuteAmountResponseDTO getAmount() {
        return amount;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
    }

    public long getOperateTime() {
        return operateTime;
    }

    public String getRemark() {
        return remark;
    }

    public List<Long> getAttachmentIdList() {
        return attachmentIdList;
    }

    public Long getChangeLogOrderId() {
        return changeLogOrderId;
    }

    public Long getChangeLogItemId() {
        return changeLogItemId;
    }

    public BizConstantDisplay getChangeLogOrderType() {
        return changeLogOrderType;
    }

    public void setInboundOrderCode(String inboundOrderCode) {
        this.inboundOrderCode = inboundOrderCode;
    }

    public void setInboundOrderOperateId(Long inboundOrderOperateId) {
        this.inboundOrderOperateId = inboundOrderOperateId;
    }

    public void setLinkedOpId(Long linkedOpId) {
        this.linkedOpId = linkedOpId;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setExecuteType(BizConstantDisplay executeType) {
        this.executeType = executeType;
    }

    public void setEntityType(BizConstantDisplay entityType) {
        this.entityType = entityType;
    }

    public void setSourceType(BizConstantDisplay sourceType) {
        this.sourceType = sourceType;
    }

    public void setRelationObjStr(String relationObjStr) {
        this.relationObjStr = relationObjStr;
    }

    public void setBizKsyAttr(MaterialInventoryBizKeyResponseDTO bizKsyAttr) {
        this.bizKsyAttr = bizKsyAttr;
    }

    public void setQcStatus(BizConstantDisplay qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setMaterial(MaterialCommonInfoResponseDTO material) {
        this.material = material;
    }

    public void setStorageLocation(SimpleLocationResponseDTO storageLocation) {
        this.storageLocation = storageLocation;
    }

    public void setAmount(ExecuteAmountResponseDTO amount) {
        this.amount = amount;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }

    public void setOperateTime(long operateTime) {
        this.operateTime = operateTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAttachmentIdList(List<Long> attachmentIdList) {
        this.attachmentIdList = attachmentIdList;
    }

    public void setChangeLogOrderId(Long changeLogOrderId) {
        this.changeLogOrderId = changeLogOrderId;
    }

    public void setChangeLogItemId(Long changeLogItemId) {
        this.changeLogItemId = changeLogItemId;
    }

    public void setChangeLogOrderType(BizConstantDisplay changeLogOrderType) {
        this.changeLogOrderType = changeLogOrderType;
    }
}

