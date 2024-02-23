package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ReceiveNoteMaterialItemResponseDTO {
    /**
     * 物料行ID
     */
    private Long id;

    /**
     * 收货单ID
     */
    private Long receiveNoteId;

    /**
     * 序号
     */
    private String seqNum;

    /**
     * 收货单编号
     */
    private String code;

    /**
     * 来源:0普通收货，1协同收货
     */
    private Integer source;

    /**
     * 状态:0执行中，1已结束
     */
    private Integer execStatus;

    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 供应商编号
     */
    private String supplierCode;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 协同发货单号
     */
    private String shipmentNoteCode;

    /**
     * 物料
     */
    private MaterialResponseDTO material;

    /**
     * 应收数
     */
    private BaseAmountDisplay planReceiveAmount;

    /**
     * 应收时间
     */
    private Long planReceiveTime;

    /**
     * 计划入库数
     */
    private BaseAmountDisplay planStorageAmount;

    /**
     * 发出数
     */
    private BaseAmountDisplay deliverAmount;

    /**
     * 接收数
     */
    private BaseAmountDisplay receiveAmount;

    /**
     * 入库单：应收数量
     */
    private BaseAmountDisplay inboundReceiveAmount;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 更新时间
     */
    private Long updatedAt;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 更新人
     */
    private UserSimpleResponseDTO operator;

    public Long getId() {
        return id;
    }

    public Long getReceiveNoteId() {
        return receiveNoteId;
    }

    public String getSeqNum() {
        return seqNum;
    }

    public String getCode() {
        return code;
    }

    public Integer getSource() {
        return source;
    }

    public Integer getExecStatus() {
        return execStatus;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getShipmentNoteCode() {
        return shipmentNoteCode;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BaseAmountDisplay getPlanReceiveAmount() {
        return planReceiveAmount;
    }

    public Long getPlanReceiveTime() {
        return planReceiveTime;
    }

    public BaseAmountDisplay getPlanStorageAmount() {
        return planStorageAmount;
    }

    public BaseAmountDisplay getDeliverAmount() {
        return deliverAmount;
    }

    public BaseAmountDisplay getReceiveAmount() {
        return receiveAmount;
    }

    public BaseAmountDisplay getInboundReceiveAmount() {
        return inboundReceiveAmount;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReceiveNoteId(Long receiveNoteId) {
        this.receiveNoteId = receiveNoteId;
    }

    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setExecStatus(Integer execStatus) {
        this.execStatus = execStatus;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setShipmentNoteCode(String shipmentNoteCode) {
        this.shipmentNoteCode = shipmentNoteCode;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setPlanReceiveAmount(BaseAmountDisplay planReceiveAmount) {
        this.planReceiveAmount = planReceiveAmount;
    }

    public void setPlanReceiveTime(Long planReceiveTime) {
        this.planReceiveTime = planReceiveTime;
    }

    public void setPlanStorageAmount(BaseAmountDisplay planStorageAmount) {
        this.planStorageAmount = planStorageAmount;
    }

    public void setDeliverAmount(BaseAmountDisplay deliverAmount) {
        this.deliverAmount = deliverAmount;
    }

    public void setReceiveAmount(BaseAmountDisplay receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public void setInboundReceiveAmount(BaseAmountDisplay inboundReceiveAmount) {
        this.inboundReceiveAmount = inboundReceiveAmount;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }
}
