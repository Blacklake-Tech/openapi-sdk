package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InboundOrderUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * ID
     */
    private long id;

    /**
     * 入库单编号
     */
    private String code;

    /**
     * 业务类型
     */
    private int bizType;

    /**
     * 来源类型 0无源入库 1协同收货单 2协同销售退货单
     */
    private int sourceType;

    /**
     * 仓库ID
     */
    private long wareHouseId;

    /**
     * 指定供应商
     */
    private Long supplierId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 版本号
     */
    private int version;

    /**
     * 入库单明细
     */
    private List<InboundOrderItemUpdateRequestDTO> items;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public int getBizType() {
        return bizType;
    }

    public int getSourceType() {
        return sourceType;
    }

    public long getWareHouseId() {
        return wareHouseId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getRemark() {
        return remark;
    }

    public int getVersion() {
        return version;
    }

    public List<InboundOrderItemUpdateRequestDTO> getItems() {
        return items;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public void setWareHouseId(long wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setItems(List<InboundOrderItemUpdateRequestDTO> items) {
        this.items = items;
    }
}
