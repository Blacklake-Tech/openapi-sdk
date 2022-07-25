package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ShipmentNoteImportRequestDTO extends CustomFieldBaseCO {
    /**
     * 发货单编号,长度为1-255位utf-8字符
     */
    private String code;

    /**
     * 客户编号
     */
    private String customerCode;

    /**
     * 备注
     */
    private String remark = "";

    /**
     * 来源
     */
    private String origin;

    /**
     * 发货单编号
     */
    private List<ShipmentNoteItemRequestDTO> items;

    public String getCode() {
        return code;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getRemark() {
        return remark;
    }

    public String getOrigin() {
        return origin;
    }

    public List<ShipmentNoteItemRequestDTO> getItems() {
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

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setItems(List<ShipmentNoteItemRequestDTO> items) {
        this.items = items;
    }
}

