package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CreateSalesOrderBaseInfoItemRequestDTO {
    /**
     * id,更新时必填，不填创建新明细行
     */
    private Long id;

    /**
     * 订单编号, 需要和主对象编号保持一致
     */
    private String code;

    /**
     * 行号：必填，支持输入数字、字母和特殊字符，不可超过64个字符
     */
    private String lineNo;

    /**
     * 物料编号：必填，请填写物料编号
     */
    private String materialCode;

    /**
     * 数量：必填，请填写大于0的数字
     */
    private String amount;

    /**
     * 单位：必填，请填写已启用的单位
     */
    private String unit;

    /**
     * 交货日期：必填，请按YYYY-MM-DD HH:MM:SS格式填写，需保证内容格式为文本
     */
    private String deliveryDate;

    /**
     * 备注：非必填，不可超过1000字符； 
     */
    private String remark;

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

    public String getLineNo() {
        return lineNo;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getRemark() {
        return remark;
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

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCustomFields(List<CustomFieldInstanceCreateRequestDTO> customFields) {
        this.customFields = customFields;
    }
}

