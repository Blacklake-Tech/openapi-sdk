package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderItemDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 工厂ID
     */
    private long orgId;

    /**
     * 业务ID
     */
    private long id;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 业务状态 0新建 1已下发 2执行中 3已完成 4已关闭
     */
    private BizConstantDisplay bizStatus;

    /**
     * 申请数量
     */
    private String planAmount;

    /**
     * 发出数量
     */
    private String issueAmount;

    /**
     * 接收数量
     */
    private String receiveAmount;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 物料批次信息
     */
    private MaterialBatchNoAttrResponseDTO materialBatchInfo;

    /**
     * 调拨单关联对象信息
     */
    private TransferOrderItemEntityDetailResponseDTO entity;

    /**
     * 单位信息
     */
    private UnitDetailResponseDTO unit;

    /**
     * 供应商信息
     */
    private SupplierSimpleResponseDTO supplier;

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public String getLineNo() {
        return lineNo;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public String getPlanAmount() {
        return planAmount;
    }

    public String getIssueAmount() {
        return issueAmount;
    }

    public String getReceiveAmount() {
        return receiveAmount;
    }

    public String getRemark() {
        return remark;
    }

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public MaterialBatchNoAttrResponseDTO getMaterialBatchInfo() {
        return materialBatchInfo;
    }

    public TransferOrderItemEntityDetailResponseDTO getEntity() {
        return entity;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public SupplierSimpleResponseDTO getSupplier() {
        return supplier;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public void setIssueAmount(String issueAmount) {
        this.issueAmount = issueAmount;
    }

    public void setReceiveAmount(String receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setMaterialBatchInfo(MaterialBatchNoAttrResponseDTO materialBatchInfo) {
        this.materialBatchInfo = materialBatchInfo;
    }

    public void setEntity(TransferOrderItemEntityDetailResponseDTO entity) {
        this.entity = entity;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setSupplier(SupplierSimpleResponseDTO supplier) {
        this.supplier = supplier;
    }
}
