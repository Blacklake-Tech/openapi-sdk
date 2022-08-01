package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderCreateRequestDTO extends CustomFieldBaseCO {
    /**
     * id
     */
    private Long id;

    /**
     * 编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String code;

    /**
     * 业务类型，若不填写则默认为“其他入库”，支持填写“采购入库，退货入库，其他入库
     */
    private String bizType;

    /**
     * 来源类型，若不填写则默认为“无源入库”，支持填写“无源入库” 
     */
    private String sourceType;

    /**
     * 仓库编号，填写本次入库的仓库编号
     */
    private String warehouseCode;

    /**
     * 供应商编号 填写本次入库的仓库编号 必须是系统内存在且已启用
     */
    private String supplierCode;

    /**
     * 备注，不可超过1000字符
     */
    private String remark;

    /**
     * 入库单行
     */
    private List<InboundOrderItemCreateRequestDTO> items;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getBizType() {
        return bizType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<InboundOrderItemCreateRequestDTO> getItems() {
        return items;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItems(List<InboundOrderItemCreateRequestDTO> items) {
        this.items = items;
    }
}

