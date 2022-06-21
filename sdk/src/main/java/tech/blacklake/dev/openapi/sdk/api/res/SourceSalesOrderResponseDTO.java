package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SourceSalesOrderResponseDTO  {
    /**
     * 业务id
     */
    private long id = 0;

    /**
     * 销售订单信息
     */
    private SalesOrderValueResponseDTO salesOrderValue;

    /**
     * 销售订单行号
     */
    private String salesOrderLine;

    /**
     * 交货日期
     */
    private Long deliveryTime;

    public long getId() {
        return id;
    }

    public SalesOrderValueResponseDTO getSalesOrderValue() {
        return salesOrderValue;
    }

    public String getSalesOrderLine() {
        return salesOrderLine;
    }

    public Long getDeliveryTime() {
        return deliveryTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSalesOrderValue(SalesOrderValueResponseDTO salesOrderValue) {
        this.salesOrderValue = salesOrderValue;
    }

    public void setSalesOrderLine(String salesOrderLine) {
        this.salesOrderLine = salesOrderLine;
    }

    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}

