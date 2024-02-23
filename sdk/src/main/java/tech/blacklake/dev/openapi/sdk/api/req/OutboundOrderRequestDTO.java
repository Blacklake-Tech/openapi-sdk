package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderRequestDTO extends CustomFieldBaseCO {
    /**
     * id
     */
    private Long id;

    /**
     * 编号,支持字母、数字和符号，不可超过255个字符，前后支持空格
     */
    private String code;

    /**
     * 业务类型 支持填写“销售出库，退厂出库，其他出库”,若不填写则默认为“其他出库”
     */
    private String bizType;

    /**
     * 来源类型
     */
    private String sourceType;

    /**
     * 仓库编号 请填写本次出库的仓库编号
     */
    private String wareHouseCode;

    /**
     * 计划时间 请填写本次出库的计划时间，如2021-11-11 11:11
     */
    private String planTime;

    /**
     * 客户编号 请填写本次出库的客户编号 必须是系统内存在且已启用
     */
    private String customerCode;

    /**
     * 备注 不可超过1000字符
     */
    private String remark;

    /**
     * 出库单明细
     */
    private List<OutboundOrderItemRequestDTO> items;

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

    public String getWareHouseCode() {
        return wareHouseCode;
    }

    public String getPlanTime() {
        return planTime;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<OutboundOrderItemRequestDTO> getItems() {
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

    public void setWareHouseCode(String wareHouseCode) {
        this.wareHouseCode = wareHouseCode;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItems(List<OutboundOrderItemRequestDTO> items) {
        this.items = items;
    }
}
