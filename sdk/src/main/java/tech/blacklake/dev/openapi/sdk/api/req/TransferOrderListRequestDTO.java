package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderListRequestDTO extends BasePage {
    /**
     * 调拨单id
     */
    private List<Long> idList;

    /**
     * 调拨单编号
     */
    private String code;

    /**
     * 发出仓库id
     */
    private List<Long> sourceWarehouseIdList;

    /**
     * 接收仓库id
     */
    private List<Long> targetWarehouseIdList;

    /**
     * 业务状态 0新建 1已下发 2执行中 3已完成 4已关闭
     */
    private List<Integer> bizStatus;

    /**
     * 业务类型 0仓储调拨 1领料调拨
     */
    private Integer bizType;

    /**
     * 创建起始时间（时间戳）
     */
    private Long createdAtFrom;

    /**
     * 创建结束时间（时间戳）
     */
    private Long createdAtTill;

    /**
     * 更新起始时间（时间戳）
     */
    private Long updatedAtFrom;

    /**
     * 更新结束时间（时间戳）
     */
    private Long updatedAtTill;

    /**
     * 创建人id
     */
    private List<Long> creatorIdList;

    /**
     * 更新人id
     */
    private List<Long> operatorIdList;

    /**
     * 调拨单编号模糊搜索
     */
    private String quickSearch;

    /**
     * 是否过滤已完成的物料明细 ，默认false， true 过滤已经完成的物料明细
     */
    private boolean appFilterItemBizStatusDone;

    public List<Long> getIdList() {
        return idList;
    }

    public String getCode() {
        return code;
    }

    public List<Long> getSourceWarehouseIdList() {
        return sourceWarehouseIdList;
    }

    public List<Long> getTargetWarehouseIdList() {
        return targetWarehouseIdList;
    }

    public List<Integer> getBizStatus() {
        return bizStatus;
    }

    public Integer getBizType() {
        return bizType;
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

    public List<Long> getCreatorIdList() {
        return creatorIdList;
    }

    public List<Long> getOperatorIdList() {
        return operatorIdList;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public boolean getAppFilterItemBizStatusDone() {
        return appFilterItemBizStatusDone;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSourceWarehouseIdList(List<Long> sourceWarehouseIdList) {
        this.sourceWarehouseIdList = sourceWarehouseIdList;
    }

    public void setTargetWarehouseIdList(List<Long> targetWarehouseIdList) {
        this.targetWarehouseIdList = targetWarehouseIdList;
    }

    public void setBizStatus(List<Integer> bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
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

    public void setCreatorIdList(List<Long> creatorIdList) {
        this.creatorIdList = creatorIdList;
    }

    public void setOperatorIdList(List<Long> operatorIdList) {
        this.operatorIdList = operatorIdList;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setAppFilterItemBizStatusDone(boolean appFilterItemBizStatusDone) {
        this.appFilterItemBizStatusDone = appFilterItemBizStatusDone;
    }
}
