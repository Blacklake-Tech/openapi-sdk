package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CreateSalesOrderBaseInfoRequestDTO {
    /**
     * id, 更新时必填
     */
    private Long id;

    /**
     * 订单编号：必填，支持字母、数字和符号，不可超过64个字符，前后不支持空格
     */
    private String code;

    /**
     * 客户编号：必填，请填写客户的编号
     */
    private String customerCode;

    /**
     * 订单所有人：必填，请填写用户的编号
     */
    private String ownerCode;

    /**
     * 订单备注：非必填，不可超过1000字符
     */
    private String remark;

    /**
     * 订单明细行
     */
    private List<CreateSalesOrderBaseInfoItemRequestDTO> items;

    /**
     * 自定义字段，非必填
     */
    private List<CustomFieldInstanceCreateRequestDTO> customFields;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<CreateSalesOrderBaseInfoItemRequestDTO> getItems() {
        return items;
    }

    public List<CustomFieldInstanceCreateRequestDTO> getCustomFields() {
        return customFields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItems(List<CreateSalesOrderBaseInfoItemRequestDTO> items) {
        this.items = items;
    }

    public void setCustomFields(List<CustomFieldInstanceCreateRequestDTO> customFields) {
        this.customFields = customFields;
    }
}

