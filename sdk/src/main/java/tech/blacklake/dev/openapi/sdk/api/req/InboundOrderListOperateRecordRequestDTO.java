package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InboundOrderListOperateRecordRequestDTO extends BasePage {
    /**
     *
     */
    private String quickSearch;

    /**
     *
     */
    private Integer bizType;

    /**
     *
     */
    private Integer executeType;

    /**
     *
     */
    private Integer recordEntityType;

    /**
     * 来源类型 0无源入库 1协同收货单 2协同销售退货单
     */
    private Integer sourceType;

    /**
     *
     */
    private Long inboundOrderId;

    /**
     *
     */
    private Long inboundOrderItemId;

    /**
     *
     */
    private List<Long> materialId;

    /**
     *
     */
    private List<Long> locationId;

    /**
     *
     */
    private List<Integer> qcStatus;

    /**
     *
     */
    private String batchNo;

    /**
     * 指定供应商
     */
    private List<Long> supplierIds;

    /**
     *
     */
    private String qrCode;

    /**
     *
     */
    private Long creator;

    /**
     *
     */
    private Long createdAtFrom;

    /**
     *
     */
    private Long createdAtTill;

    public String getQuickSearch() {
        return quickSearch;
    }

    public Integer getBizType() {
        return bizType;
    }

    public Integer getExecuteType() {
        return executeType;
    }

    public Integer getRecordEntityType() {
        return recordEntityType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public Long getInboundOrderId() {
        return inboundOrderId;
    }

    public Long getInboundOrderItemId() {
        return inboundOrderItemId;
    }

    public List<Long> getMaterialId() {
        return materialId;
    }

    public List<Long> getLocationId() {
        return locationId;
    }

    public List<Integer> getQcStatus() {
        return qcStatus;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public List<Long> getSupplierIds() {
        return supplierIds;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Long getCreator() {
        return creator;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTill() {
        return createdAtTill;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setExecuteType(Integer executeType) {
        this.executeType = executeType;
    }

    public void setRecordEntityType(Integer recordEntityType) {
        this.recordEntityType = recordEntityType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public void setInboundOrderId(Long inboundOrderId) {
        this.inboundOrderId = inboundOrderId;
    }

    public void setInboundOrderItemId(Long inboundOrderItemId) {
        this.inboundOrderItemId = inboundOrderItemId;
    }

    public void setMaterialId(List<Long> materialId) {
        this.materialId = materialId;
    }

    public void setLocationId(List<Long> locationId) {
        this.locationId = locationId;
    }

    public void setQcStatus(List<Integer> qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setSupplierIds(List<Long> supplierIds) {
        this.supplierIds = supplierIds;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTill(Long createdAtTill) {
        this.createdAtTill = createdAtTill;
    }
}
