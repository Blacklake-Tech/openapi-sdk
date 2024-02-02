package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ImportPurchaseReturnOrderRequestDTO {
    /**
     * 采购订单编号。长度为1-255位utf-8字符
     */
    private String code;

    /**
     * 供应商编号。长度为1-255位utf-8字符
     */
    private String supplierCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 采购退货单物料行。至少有一行
     */
    private List<ImportPurchaseReturnOrderItemRequestDTO> itemList;

    public String getCode() {
        return code;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<ImportPurchaseReturnOrderItemRequestDTO> getItemList() {
        return itemList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItemList(List<ImportPurchaseReturnOrderItemRequestDTO> itemList) {
        this.itemList = itemList;
    }
}

