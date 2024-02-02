package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderUpdateResponseDTO extends CustomFieldBaseCO {
    /**
     * ID
     */
    private long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 业务类型
     */
    private BizConstantDisplay bizType;

    /**
     * 来源类型
     */
    private BizConstantDisplay sourceType;

    /**
     * 仓库
     */
    private StorageWarehouseResponseDTO wareHouse;

    /**
     * 状态
     */
    private BizConstantDisplay bizStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 明细
     */
    private List<OutboundOrderItemUpdateResponseDTO> items;

    /**
     * 计划出库时间
     */
    private LocalDateTime planTime;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getSourceType() {
        return sourceType;
    }

    public StorageWarehouseResponseDTO getWareHouse() {
        return wareHouse;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public String getRemark() {
        return remark;
    }

    public List<OutboundOrderItemUpdateResponseDTO> getItems() {
        return items;
    }

    public LocalDateTime getPlanTime() {
        return planTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setSourceType(BizConstantDisplay sourceType) {
        this.sourceType = sourceType;
    }

    public void setWareHouse(StorageWarehouseResponseDTO wareHouse) {
        this.wareHouse = wareHouse;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setItems(List<OutboundOrderItemUpdateResponseDTO> items) {
        this.items = items;
    }

    public void setPlanTime(LocalDateTime planTime) {
        this.planTime = planTime;
    }
}

