package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InventoryChangeLogResponseDTO {
    /**
     * 物料
     */
    private SimpleCodeNameIdResponseDTO material;

    /**
     * 物料规格
     */
    private String specification;

    /**
     * 物料属性信息
     */
    private List<MaterialAttributeResponseDTO> attrList;

    /**
     * 仓库
     */
    private String warehouse;

    /**
     * 仓位
     */
    private String storageLocation;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 数量
     */
    private ChangeLogAmountResponseDTO amount;

    /**
     * 操作时间
     */
    private Long createdAt;

    /**
     * 操作类型
     */
    private ActionResponseDTO action;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 业务状态
     */
    private BizConstantDisplay bizStatus;

    /**
     * 仓储状态
     */
    private BizConstantDisplay storageStatus;

    /**
     * 质量状态
     */
    private BizConstantDisplay qcStatus;

    /**
     * 关键属性
     */
    private BizAttrResponseDTO bizAttr;

    public SimpleCodeNameIdResponseDTO getMaterial() {
        return material;
    }

    public String getSpecification() {
        return specification;
    }

    public List<MaterialAttributeResponseDTO> getAttrList() {
        return attrList;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public ChangeLogAmountResponseDTO getAmount() {
        return amount;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public ActionResponseDTO getAction() {
        return action;
    }

    public String getOperator() {
        return operator;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public BizConstantDisplay getStorageStatus() {
        return storageStatus;
    }

    public BizConstantDisplay getQcStatus() {
        return qcStatus;
    }

    public BizAttrResponseDTO getBizAttr() {
        return bizAttr;
    }

    public void setMaterial(SimpleCodeNameIdResponseDTO material) {
        this.material = material;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setAttrList(List<MaterialAttributeResponseDTO> attrList) {
        this.attrList = attrList;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setAmount(ChangeLogAmountResponseDTO amount) {
        this.amount = amount;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setAction(ActionResponseDTO action) {
        this.action = action;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setStorageStatus(BizConstantDisplay storageStatus) {
        this.storageStatus = storageStatus;
    }

    public void setQcStatus(BizConstantDisplay qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBizAttr(BizAttrResponseDTO bizAttr) {
        this.bizAttr = bizAttr;
    }
}

