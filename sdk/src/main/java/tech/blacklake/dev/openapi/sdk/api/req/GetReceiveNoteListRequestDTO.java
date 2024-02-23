package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class GetReceiveNoteListRequestDTO extends BasePage {
    /**
     * 编号
     */
    private String code;

    /**
     * 来源(0普通收货，1协同收货，可多选)
     */
    private List<Integer> sourceList;

    /**
     * 执行状态(0执行中，1已结束，可多选)
     */
    private List<Integer> execStatusList;

    /**
     * 协同发货单号
     */
    private String shipmentNoteCode;

    /**
     * 供应商编号(模糊查询)
     */
    private String supplierCode;

    /**
     * 供应商名称(模糊查询)
     */
    private String supplierName;

    /**
     * 创建时间-开始
     */
    private Long createdAtFrom;

    /**
     * 创建时间-结束
     */
    private Long createdAtTo;

    /**
     * 创建人IDs
     */
    private List<Long> creatorIds;

    /**
     * 更新时间-开始
     */
    private Long updatedAtFrom;

    /**
     * 更新时间-结束
     */
    private Long updatedAtTo;

    /**
     * 操作人IDs
     */
    private List<Long> operatorIds;

    public String getCode() {
        return code;
    }

    public List<Integer> getSourceList() {
        return sourceList;
    }

    public List<Integer> getExecStatusList() {
        return execStatusList;
    }

    public String getShipmentNoteCode() {
        return shipmentNoteCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTo() {
        return createdAtTo;
    }

    public List<Long> getCreatorIds() {
        return creatorIds;
    }

    public Long getUpdatedAtFrom() {
        return updatedAtFrom;
    }

    public Long getUpdatedAtTo() {
        return updatedAtTo;
    }

    public List<Long> getOperatorIds() {
        return operatorIds;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSourceList(List<Integer> sourceList) {
        this.sourceList = sourceList;
    }

    public void setExecStatusList(List<Integer> execStatusList) {
        this.execStatusList = execStatusList;
    }

    public void setShipmentNoteCode(String shipmentNoteCode) {
        this.shipmentNoteCode = shipmentNoteCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTo(Long createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public void setCreatorIds(List<Long> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public void setUpdatedAtFrom(Long updatedAtFrom) {
        this.updatedAtFrom = updatedAtFrom;
    }

    public void setUpdatedAtTo(Long updatedAtTo) {
        this.updatedAtTo = updatedAtTo;
    }

    public void setOperatorIds(List<Long> operatorIds) {
        this.operatorIds = operatorIds;
    }
}
