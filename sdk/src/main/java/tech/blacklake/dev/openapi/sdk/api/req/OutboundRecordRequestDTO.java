package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundRecordRequestDTO extends BasePage {
    /**
     * 标识码模糊查询
     */
    private String quickSearch;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 质量状态
     */
    private Integer qcStatus;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 客户
     */
    private List<Long> customerIds;

    /**
     * 出库单业务类型(0其他出厂 1销售发运 2 采购退料)
     */
    private List<Integer> bizType;

    /**
     * 来源类型(0-无源出库 1-协同发货单 2-协调采购退货单)
     */
    private List<Integer> sourceType;

    /**
     * 出库记录 业务类型 0:普通出库 1:生产投料 2:出库冲销 3:按单出库 4:投料撤回  9:其他
     */
    private Integer executeType;

    /**
     * 出库单行id
     */
    private Long outboundOrderItemId;

    /**
     * 物料id集合
     */
    private List<Long> materialIds;

    /**
     * 创建时间起
     */
    private Long createdAtFrom;

    /**
     * 创建时间止
     */
    private Long createdAtTill;

    /**
     * 创建人ids
     */
    private List<Long> creator;

    /**
     * 仓位id集合
     */
    private List<Long> storageLocationIds;

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Integer getQcStatus() {
        return qcStatus;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public List<Long> getCustomerIds() {
        return customerIds;
    }

    public List<Integer> getBizType() {
        return bizType;
    }

    public List<Integer> getSourceType() {
        return sourceType;
    }

    public Integer getExecuteType() {
        return executeType;
    }

    public Long getOutboundOrderItemId() {
        return outboundOrderItemId;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTill() {
        return createdAtTill;
    }

    public List<Long> getCreator() {
        return creator;
    }

    public List<Long> getStorageLocationIds() {
        return storageLocationIds;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setQcStatus(Integer qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setCustomerIds(List<Long> customerIds) {
        this.customerIds = customerIds;
    }

    public void setBizType(List<Integer> bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(List<Integer> sourceType) {
        this.sourceType = sourceType;
    }

    public void setExecuteType(Integer executeType) {
        this.executeType = executeType;
    }

    public void setOutboundOrderItemId(Long outboundOrderItemId) {
        this.outboundOrderItemId = outboundOrderItemId;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTill(Long createdAtTill) {
        this.createdAtTill = createdAtTill;
    }

    public void setCreator(List<Long> creator) {
        this.creator = creator;
    }

    public void setStorageLocationIds(List<Long> storageLocationIds) {
        this.storageLocationIds = storageLocationIds;
    }
}
