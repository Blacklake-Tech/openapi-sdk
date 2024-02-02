package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderListRequestDTO extends BasePage {
    /**
     * 编号模糊查询
     */
    private String quickSearch;

    /**
     * 编号
     */
    private String code;

    /**
     * 仓库ids
     */
    private List<Long> warehouseIds;

    /**
     * 业务类型(0其他出厂 1销售发运 2 采购退料)
     */
    private List<Integer> bizType;

    /**
     * 来源类型(0-无源出库 1-协同发货单 2-协调采购退货单)
     */
    private List<Integer> sourceType;

    /**
     * 业务状态(0新建 1已下发 2执行中 3已完成 4已关闭)
     */
    private List<Integer> bizStatus;

    /**
     * 客户
     */
    private List<Long> customerIds;

    /**
     * 创建时间起
     */
    private Long createdAtFrom;

    /**
     * 创建时间止
     */
    private Long createdAtTill;

    /**
     * 计划出库时间起
     */
    private Long planAtFrom;

    /**
     * 计划出库时间止
     */
    private Long planAtTill;

    /**
     * 创建人ids
     */
    private List<Long> creator;

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getCode() {
        return code;
    }

    public List<Long> getWarehouseIds() {
        return warehouseIds;
    }

    public List<Integer> getBizType() {
        return bizType;
    }

    public List<Integer> getSourceType() {
        return sourceType;
    }

    public List<Integer> getBizStatus() {
        return bizStatus;
    }

    public List<Long> getCustomerIds() {
        return customerIds;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTill() {
        return createdAtTill;
    }

    public Long getPlanAtFrom() {
        return planAtFrom;
    }

    public Long getPlanAtTill() {
        return planAtTill;
    }

    public List<Long> getCreator() {
        return creator;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setWarehouseIds(List<Long> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public void setBizType(List<Integer> bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(List<Integer> sourceType) {
        this.sourceType = sourceType;
    }

    public void setBizStatus(List<Integer> bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setCustomerIds(List<Long> customerIds) {
        this.customerIds = customerIds;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTill(Long createdAtTill) {
        this.createdAtTill = createdAtTill;
    }

    public void setPlanAtFrom(Long planAtFrom) {
        this.planAtFrom = planAtFrom;
    }

    public void setPlanAtTill(Long planAtTill) {
        this.planAtTill = planAtTill;
    }

    public void setCreator(List<Long> creator) {
        this.creator = creator;
    }
}

