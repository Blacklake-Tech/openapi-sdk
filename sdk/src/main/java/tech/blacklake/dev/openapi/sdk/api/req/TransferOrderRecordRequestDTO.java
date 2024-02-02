package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderRecordRequestDTO extends BasePage {
    /**
     * 调拨单业务类型 0仓储调拨 1领料调拨
     */
    private List<Integer> bizTypes;

    /**
     * 调拨记录 业务类型 0:按单调拨，1:普通调拨
     */
    private List<Integer> recordBizTypes;

    /**
     * 调拨单编号
     */
    private List<String> transferOrderCodes;

    /**
     * 调拨单行号
     */
    private List<String> transferOrderLineNos;

    /**
     * 调拨单行id
     */
    private Long transferOrderItemId;

    /**
     * 物料ID
     */
    private List<Long> materialIds;

    /**
     * 发出仓位
     */
    private List<Long> sourceLocationIds;

    /**
     * 接收仓位
     */
    private List<Long> targetLocationIds;

    /**
     * 质量状态
     */
    private List<Integer> qcStatus;

    /**
     * 批次号
     */
    private List<String> batchNos;

    /**
     * 标识码（精确查询）
     */
    private List<String> qrCodes;

    /**
     * 标识码（模糊查询）
     */
    private String quickSearch;

    /**
     * 创建人
     */
    private List<Long> creatorIds;

    /**
     * 创建起始时间（时间戳）如果创建起始时间，创建结束时间都不为空 创建起始时间>创建结束时间 
     */
    private Long createdAtFrom;

    /**
     * 创建结束时间（时间戳）如果创建起始时间，创建结束时间都不为空 创建起始时间>创建结束时间 
     */
    private Long createdAtTill;

    public List<Integer> getBizTypes() {
        return bizTypes;
    }

    public List<Integer> getRecordBizTypes() {
        return recordBizTypes;
    }

    public List<String> getTransferOrderCodes() {
        return transferOrderCodes;
    }

    public List<String> getTransferOrderLineNos() {
        return transferOrderLineNos;
    }

    public Long getTransferOrderItemId() {
        return transferOrderItemId;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public List<Long> getSourceLocationIds() {
        return sourceLocationIds;
    }

    public List<Long> getTargetLocationIds() {
        return targetLocationIds;
    }

    public List<Integer> getQcStatus() {
        return qcStatus;
    }

    public List<String> getBatchNos() {
        return batchNos;
    }

    public List<String> getQrCodes() {
        return qrCodes;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public List<Long> getCreatorIds() {
        return creatorIds;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTill() {
        return createdAtTill;
    }

    public void setBizTypes(List<Integer> bizTypes) {
        this.bizTypes = bizTypes;
    }

    public void setRecordBizTypes(List<Integer> recordBizTypes) {
        this.recordBizTypes = recordBizTypes;
    }

    public void setTransferOrderCodes(List<String> transferOrderCodes) {
        this.transferOrderCodes = transferOrderCodes;
    }

    public void setTransferOrderLineNos(List<String> transferOrderLineNos) {
        this.transferOrderLineNos = transferOrderLineNos;
    }

    public void setTransferOrderItemId(Long transferOrderItemId) {
        this.transferOrderItemId = transferOrderItemId;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setSourceLocationIds(List<Long> sourceLocationIds) {
        this.sourceLocationIds = sourceLocationIds;
    }

    public void setTargetLocationIds(List<Long> targetLocationIds) {
        this.targetLocationIds = targetLocationIds;
    }

    public void setQcStatus(List<Integer> qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setBatchNos(List<String> batchNos) {
        this.batchNos = batchNos;
    }

    public void setQrCodes(List<String> qrCodes) {
        this.qrCodes = qrCodes;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setCreatorIds(List<Long> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTill(Long createdAtTill) {
        this.createdAtTill = createdAtTill;
    }
}

