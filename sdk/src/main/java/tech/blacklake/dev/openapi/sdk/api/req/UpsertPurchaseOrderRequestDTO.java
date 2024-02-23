package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UpsertPurchaseOrderRequestDTO {
    /**
     * 采购订单编号。长度为1-255位utf-8字符
     */
    private String code;

    /**
     * 采购订单来源。0:普通采购，1:协同采购
     */
    private Integer source;

    /**
     * 供应商编号。长度为1-255位utf-8字符
     */
    private String supplierCode;

    /**
     * 订单所有人。用户编号,长度为1-255位utf-8字符
     */
    private String ownerCode;

    /**
     * 备注。长度为小于1000位的utf-8字符
     */
    private String remark;

    /**
     * 自定义字段，非必填
     */
    private List<CustomFieldInstanceCreateRequestDTO> customFields;

    /**
     * 采购订单物料行。至少有一行
     */
    private List<UpsertPurchaseOrderItemRequestDTO> itemList;

    public String getCode() {
        return code;
    }

    public Integer getSource() {
        return source;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<CustomFieldInstanceCreateRequestDTO> getCustomFields() {
        return customFields;
    }

    public List<UpsertPurchaseOrderItemRequestDTO> getItemList() {
        return itemList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCustomFields(List<CustomFieldInstanceCreateRequestDTO> customFields) {
        this.customFields = customFields;
    }

    public void setItemList(List<UpsertPurchaseOrderItemRequestDTO> itemList) {
        this.itemList = itemList;
    }
}
