package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 明细
     */
    private List<InboundOrderItemListResponseDTO> items;

    /**
     * 供应商
     */
    private Object supplier;

    /**
     * ID
     */
    private long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 业务类型 1:采购收货/2:销售退货/0:其他
     */
    private BizConstantDisplay bizType;

    /**
     * 来源类型 0无源入库 1协同收货单 2协同销售退货单
     */
    private BizConstantDisplay sourceType;

    /**
     * 仓库
     */
    private StorageWarehouseResponseDTO wareHouse;

    /**
     * 状态 0:新建/1:已下发/2:执行中/3:已完成/4:已关闭
     */
    private BizConstantDisplay bizStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 创建时间
     */
    private long createdAt;

    /**
     * 更新人
     */
    private UserSimpleResponseDTO operator;

    /**
     * 更新时间
     */
    private long updatedAt;

    public List<InboundOrderItemListResponseDTO> getItems() {
        return items;
    }

    public Object getSupplier() {
        return supplier;
    }

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

    public Integer getVersion() {
        return version;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setItems(List<InboundOrderItemListResponseDTO> items) {
        this.items = items;
    }

    public void setSupplier(Object supplier) {
        this.supplier = supplier;
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

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}

