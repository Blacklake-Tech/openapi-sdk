package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderOperateRecordResponseDTO extends CustomFieldBaseVO {
    /**
     * 出库单执行记录id
     */
    private Long id;

    /**
     * 出库单号
     */
    private String outboundOrderCode;

    /**
     * 关联对象
     */
    private String associationObject;

    /**
     * 出库记录 业务类型 0:普通出库 1:生产投料 2:出库冲销 3:按单出库 4:投料撤回  9:其他
     */
    private BizConstantDisplay executeType;

    /**
     * 出库单 业务类型
     */
    private BizConstantDisplay bizType;

    /**
     * 来源类型(0-无源出库 1-协同发货单 2-协调采购退货单)
     */
    private BizConstantDisplay sourceType;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 行号
     */
    private String lineNo;

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
     * 出库数量
     */
    private ExecuteAmountResponseDTO amount;

    /**
     * 操作人
     */
    private UserSimpleResponseDTO operator;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 操作时间
     */
    private long operateTime;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 附件
     */
    private List<Long> attachmentIdList;

    /**
     * 出库单Id
     */
    private Long outboundOrderId;

    public Long getId() {
        return id;
    }

    public String getOutboundOrderCode() {
        return outboundOrderCode;
    }

    public String getAssociationObject() {
        return associationObject;
    }

    public BizConstantDisplay getExecuteType() {
        return executeType;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getSourceType() {
        return sourceType;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getLineNo() {
        return lineNo;
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

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public long getOperateTime() {
        return operateTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public String getRemark() {
        return remark;
    }

    public List<Long> getAttachmentIdList() {
        return attachmentIdList;
    }

    public Long getOutboundOrderId() {
        return outboundOrderId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOutboundOrderCode(String outboundOrderCode) {
        this.outboundOrderCode = outboundOrderCode;
    }

    public void setAssociationObject(String associationObject) {
        this.associationObject = associationObject;
    }

    public void setExecuteType(BizConstantDisplay executeType) {
        this.executeType = executeType;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(BizConstantDisplay sourceType) {
        this.sourceType = sourceType;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
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

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperateTime(long operateTime) {
        this.operateTime = operateTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAttachmentIdList(List<Long> attachmentIdList) {
        this.attachmentIdList = attachmentIdList;
    }

    public void setOutboundOrderId(Long outboundOrderId) {
        this.outboundOrderId = outboundOrderId;
    }
}
