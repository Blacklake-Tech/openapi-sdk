package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderListRequestDTO extends BasePage {
    /**
     * 快速搜索
     */
    private String quickSearch;

    /**
     * 状态
     */
    private List<Integer> bizStatus;

    /**
     * 业务类型
     */
    private List<Integer> bizType;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 指定供应商
     */
    private List<Long> supplierIds;

    /**
     * 创建人ID
     */
    private List<Long> creator;

    /**
     * 创建时间起始
     */
    private Long createdAtFrom;

    /**
     * 创建时间截止
     */
    private Long createdAtTill;

    /**
     * 更新时间起始
     */
    private Long updatedAtFrom;

    /**
     * 更新时间截止
     */
    private Long updatedAtTill;

    public String getQuickSearch() {
        return quickSearch;
    }

    public List<Integer> getBizStatus() {
        return bizStatus;
    }

    public List<Integer> getBizType() {
        return bizType;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public List<Long> getSupplierIds() {
        return supplierIds;
    }

    public List<Long> getCreator() {
        return creator;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTill() {
        return createdAtTill;
    }

    public Long getUpdatedAtFrom() {
        return updatedAtFrom;
    }

    public Long getUpdatedAtTill() {
        return updatedAtTill;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setBizStatus(List<Integer> bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setBizType(List<Integer> bizType) {
        this.bizType = bizType;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setSupplierIds(List<Long> supplierIds) {
        this.supplierIds = supplierIds;
    }

    public void setCreator(List<Long> creator) {
        this.creator = creator;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTill(Long createdAtTill) {
        this.createdAtTill = createdAtTill;
    }

    public void setUpdatedAtFrom(Long updatedAtFrom) {
        this.updatedAtFrom = updatedAtFrom;
    }

    public void setUpdatedAtTill(Long updatedAtTill) {
        this.updatedAtTill = updatedAtTill;
    }
}

