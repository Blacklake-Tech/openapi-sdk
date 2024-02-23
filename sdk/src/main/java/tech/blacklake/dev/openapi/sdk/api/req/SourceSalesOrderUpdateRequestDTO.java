package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class SourceSalesOrderUpdateRequestDTO {
    /**
     * 业务ID
     */
    private Long id;

    /**
     * 销售订单id
     */
    private long salesOrderId;

    /**
     * 销售订单行号
     */
    private String salesOrderLine;

    /**
     * 交货日期
     */
    private Long deliveryTime;

    public Long getId() {
        return id;
    }

    public long getSalesOrderId() {
        return salesOrderId;
    }

    public String getSalesOrderLine() {
        return salesOrderLine;
    }

    public Long getDeliveryTime() {
        return deliveryTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSalesOrderId(long salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public void setSalesOrderLine(String salesOrderLine) {
        this.salesOrderLine = salesOrderLine;
    }

    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
