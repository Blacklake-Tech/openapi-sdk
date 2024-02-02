package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ImportSalesOrderReturnItemRequestDTO {
    /**
     * 销售退货单编号
     */
    private String code;

    /**
     * 销售订单编号
     */
    private String salesOrderCode;

    /**
     * 销售订单明细行号
     */
    private String salesOrderLineNo;

    /**
     * 计划退货数
     */
    private String amount;

    /**
     * 备注
     */
    private String remark;

    public String getCode() {
        return code;
    }

    public String getSalesOrderCode() {
        return salesOrderCode;
    }

    public String getSalesOrderLineNo() {
        return salesOrderLineNo;
    }

    public String getAmount() {
        return amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSalesOrderCode(String salesOrderCode) {
        this.salesOrderCode = salesOrderCode;
    }

    public void setSalesOrderLineNo(String salesOrderLineNo) {
        this.salesOrderLineNo = salesOrderLineNo;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

