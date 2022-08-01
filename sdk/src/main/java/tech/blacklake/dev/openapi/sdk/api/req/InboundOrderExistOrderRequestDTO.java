package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderExistOrderRequestDTO {
    /**
     * 是否按单入库 1:按单入库/2:普通入库
     */
    private int orderType;

    /**
     * 入库单执行主键CO
     */
    private InboundOrderItemKeyRequestDTO inboundOrder;

    /**
     * 编号是否自动生成 1:是/0:否
     */
    private int autoCode;

    /**
     * 入库单编号
     */
    private String inboundOrderCode;

    /**
     * 业务类型 1:采购收货/2:销售退货/0:其他
     */
    private int bizType;

    /**
     * 入库单备注
     */
    private String remark;

    public int getOrderType() {
        return orderType;
    }

    public InboundOrderItemKeyRequestDTO getInboundOrder() {
        return inboundOrder;
    }

    public int getAutoCode() {
        return autoCode;
    }

    public String getInboundOrderCode() {
        return inboundOrderCode;
    }

    public int getBizType() {
        return bizType;
    }

    public String getRemark() {
        return remark;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public void setInboundOrder(InboundOrderItemKeyRequestDTO inboundOrder) {
        this.inboundOrder = inboundOrder;
    }

    public void setAutoCode(int autoCode) {
        this.autoCode = autoCode;
    }

    public void setInboundOrderCode(String inboundOrderCode) {
        this.inboundOrderCode = inboundOrderCode;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

