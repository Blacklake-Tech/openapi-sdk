package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SalesOrderItemResponseDTO extends CustomFieldBaseVO {
    /**
     * 销售订单行id
     */
    private long id = 0L;

    /**
     * 销售订单id
     */
    private long orderId = 0L;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 物料Id
     */
    private long material = 0L;

    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 销售单位Id
     */
    private long unit = 0L;

    /**
     * 交货日期
     */
    private long deliveryDate = 0L;

    public long getId() {
        return id;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getLineNo() {
        return lineNo;
    }

    public long getMaterial() {
        return material;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public long getUnit() {
        return unit;
    }

    public long getDeliveryDate() {
        return deliveryDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterial(long material) {
        this.material = material;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public void setDeliveryDate(long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}

