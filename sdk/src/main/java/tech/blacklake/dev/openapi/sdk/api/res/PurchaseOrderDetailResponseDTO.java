package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PurchaseOrderDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 采购订单ID
     */
    private Long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 供应商
     */
    private SupplierSimpleResponseDTO supplier;

    /**
     * 订单所有人
     */
    private UserSimpleResponseDTO owner;

    /**
     * 来源
     */
    private BizConstantDisplay source;

    /**
     * 状态
     */
    private Integer execStatus;

    /**
     * 销售订单号
     */
    private String salesOrderCode;

    /**
     * 协同采购申请单号
     */
    private String purchaseRequestCode;

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

    /**
     * 备注
     */
    private String remark;

    /**
     * 附件IDs
     */
    private List<Long> attachments;

    /**
     * 协同附件IDs
     */
    private List<Long> coordinationAttachments;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public SupplierSimpleResponseDTO getSupplier() {
        return supplier;
    }

    public UserSimpleResponseDTO getOwner() {
        return owner;
    }

    public BizConstantDisplay getSource() {
        return source;
    }

    public Integer getExecStatus() {
        return execStatus;
    }

    public String getSalesOrderCode() {
        return salesOrderCode;
    }

    public String getPurchaseRequestCode() {
        return purchaseRequestCode;
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

    public String getRemark() {
        return remark;
    }

    public List<Long> getAttachments() {
        return attachments;
    }

    public List<Long> getCoordinationAttachments() {
        return coordinationAttachments;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSupplier(SupplierSimpleResponseDTO supplier) {
        this.supplier = supplier;
    }

    public void setOwner(UserSimpleResponseDTO owner) {
        this.owner = owner;
    }

    public void setSource(BizConstantDisplay source) {
        this.source = source;
    }

    public void setExecStatus(Integer execStatus) {
        this.execStatus = execStatus;
    }

    public void setSalesOrderCode(String salesOrderCode) {
        this.salesOrderCode = salesOrderCode;
    }

    public void setPurchaseRequestCode(String purchaseRequestCode) {
        this.purchaseRequestCode = purchaseRequestCode;
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

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAttachments(List<Long> attachments) {
        this.attachments = attachments;
    }

    public void setCoordinationAttachments(List<Long> coordinationAttachments) {
        this.coordinationAttachments = coordinationAttachments;
    }
}

