package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ImportPurchaseReturnOrderItemRequestDTO {
    /**
     * 采购订单物料行编号。长度为1-255位utf-8字符
     */
    private String code;

    /**
     * 采购订单编号。长度为1-255位utf-8字符
     */
    private String purchaseOrderCode;

    /**
     * 采购订单物料行序号
     */
    private String purchaseOrderItemSeq;

    /**
     * 应退时间。请按YYYY-MM-DD HH:MM:SS格式填写，需保证内容格式为文本
     */
    private String returnTime;

    /**
     * 应退数
     */
    private String returnAmount;

    public String getCode() {
        return code;
    }

    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    public String getPurchaseOrderItemSeq() {
        return purchaseOrderItemSeq;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public String getReturnAmount() {
        return returnAmount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPurchaseOrderCode(String purchaseOrderCode) {
        this.purchaseOrderCode = purchaseOrderCode;
    }

    public void setPurchaseOrderItemSeq(String purchaseOrderItemSeq) {
        this.purchaseOrderItemSeq = purchaseOrderItemSeq;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public void setReturnAmount(String returnAmount) {
        this.returnAmount = returnAmount;
    }
}
