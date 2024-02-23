package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 出库单id
     */
    private long id;

    /**
     * 业务类型 0其他出厂 1销售发运 2 采购退料
     */
    private int bizType;

    /**
     * 来源类型 0-无源出库 1-协同发货单 2-协调采购退货单
     */
    private int sourceType;

    /**
     * 出库单编号 长度小于等于255
     */
    private String code;

    /**
     * 本次入库仓库id
     */
    private long wareHouseId;

    /**
     * 客户
     */
    private Long customerId;

    /**
     * 单据备注
     */
    private String remark;

    /**
     * 出库单明细
     */
    private List<OutboundOrderItemUpdateRequestDTO> items;

    /**
     * 计划出库时间  小于当前时间
     */
    private Long planTime;

    public long getId() {
        return id;
    }

    public int getBizType() {
        return bizType;
    }

    public int getSourceType() {
        return sourceType;
    }

    public String getCode() {
        return code;
    }

    public long getWareHouseId() {
        return wareHouseId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getRemark() {
        return remark;
    }

    public List<OutboundOrderItemUpdateRequestDTO> getItems() {
        return items;
    }

    public Long getPlanTime() {
        return planTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setWareHouseId(long wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItems(List<OutboundOrderItemUpdateRequestDTO> items) {
        this.items = items;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }
}
