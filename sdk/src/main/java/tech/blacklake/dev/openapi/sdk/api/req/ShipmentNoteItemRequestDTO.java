package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ShipmentNoteItemRequestDTO extends CustomFieldBaseCO {
    /**
     * 发货单编号，长度为1-255位utf-8字符
     */
    private String code;

    /**
     * 发货单明细行行号
     */
    private String lineNo;

    /**
     * 销售订单编号
     */
    private String salesOrderCode;

    /**
     * 销售订单明细行行号
     */
    private String salesOrderLineNo;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 计划发货数
     */
    private String amount;

    /**
     * 备注
     */
    private String remark = "";

    /**
     * 协同交货计划单编号
     */
    private String customerDeliveryScheduleNoteCode;

    /**
     * 协同交货计划单行号
     */
    private String customerDeliveryScheduleNoteLineNo;

    public String getCode() {
        return code;
    }

    public String getLineNo() {
        return lineNo;
    }

    public String getSalesOrderCode() {
        return salesOrderCode;
    }

    public String getSalesOrderLineNo() {
        return salesOrderLineNo;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getAmount() {
        return amount;
    }

    public String getRemark() {
        return remark;
    }

    public String getCustomerDeliveryScheduleNoteCode() {
        return customerDeliveryScheduleNoteCode;
    }

    public String getCustomerDeliveryScheduleNoteLineNo() {
        return customerDeliveryScheduleNoteLineNo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setSalesOrderCode(String salesOrderCode) {
        this.salesOrderCode = salesOrderCode;
    }

    public void setSalesOrderLineNo(String salesOrderLineNo) {
        this.salesOrderLineNo = salesOrderLineNo;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCustomerDeliveryScheduleNoteCode(String customerDeliveryScheduleNoteCode) {
        this.customerDeliveryScheduleNoteCode = customerDeliveryScheduleNoteCode;
    }

    public void setCustomerDeliveryScheduleNoteLineNo(String customerDeliveryScheduleNoteLineNo) {
        this.customerDeliveryScheduleNoteLineNo = customerDeliveryScheduleNoteLineNo;
    }
}

