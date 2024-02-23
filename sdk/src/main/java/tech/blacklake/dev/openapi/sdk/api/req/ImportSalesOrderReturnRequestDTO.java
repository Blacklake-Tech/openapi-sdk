package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ImportSalesOrderReturnRequestDTO {
    /**
     * 销售退货单编号,长度为1-255位utf-8字符
     */
    private String code;

    /**
     * 客户编号,长度为1-255位utf-8字符
     */
    private String customerCode;

    /**
     * 销售退货单备注
     */
    private String remark;

    /**
     * 销售退货单行
     */
    private List<ImportSalesOrderReturnItemRequestDTO> items;

    public String getCode() {
        return code;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<ImportSalesOrderReturnItemRequestDTO> getItems() {
        return items;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItems(List<ImportSalesOrderReturnItemRequestDTO> items) {
        this.items = items;
    }
}
