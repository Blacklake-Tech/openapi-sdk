package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InventoryChangeLogRequestDTO extends BasePage {
    /**
     * 物料ID
     */
    private List<Long> materialIds;

    /**
     * 仓库Id
     */
    private List<Long> warehouseIds;

    /**
     * 仓位Id
     */
    private List<Long> storageLocationIds;

    /**
     * 批次号
     */
    private List<String> batchNos;

    /**
     * 标识码
     */
    private List<String> qrCodes;

    /**
     * 变动方向,true-增加，false-减少
     */
    private Boolean direction;

    /**
     * 操作开始时间
     */
    private long dateStart = 1658485441544L;

    /**
     * 操作结束时间
     */
    private long dateEnd = 1659090241544L;

    /**
     * 操作类型, in-入库，out-出库,receive-转移入库,issue-转移出库,amount_adjust-数量调整,attr_adjust-属性调整
     */
    private String action;

    /**
     * 操作人id
     */
    private Long operatorId;

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public List<Long> getWarehouseIds() {
        return warehouseIds;
    }

    public List<Long> getStorageLocationIds() {
        return storageLocationIds;
    }

    public List<String> getBatchNos() {
        return batchNos;
    }

    public List<String> getQrCodes() {
        return qrCodes;
    }

    public Boolean getDirection() {
        return direction;
    }

    public long getDateStart() {
        return dateStart;
    }

    public long getDateEnd() {
        return dateEnd;
    }

    public String getAction() {
        return action;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setWarehouseIds(List<Long> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public void setStorageLocationIds(List<Long> storageLocationIds) {
        this.storageLocationIds = storageLocationIds;
    }

    public void setBatchNos(List<String> batchNos) {
        this.batchNos = batchNos;
    }

    public void setQrCodes(List<String> qrCodes) {
        this.qrCodes = qrCodes;
    }

    public void setDirection(Boolean direction) {
        this.direction = direction;
    }

    public void setDateStart(long dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(long dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }
}

