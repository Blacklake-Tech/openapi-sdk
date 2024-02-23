package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderDetailResponseDTO extends CustomFieldBaseVO {
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
    private List<OutboundOrderItemDetailResponseDTO> items;

    /**
     * 计划出库时间
     */
    private Long planTime;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 操作人
     */
    private UserSimpleResponseDTO operator;

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

    public List<OutboundOrderItemDetailResponseDTO> getItems() {
        return items;
    }

    public Long getPlanTime() {
        return planTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
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

    public void setItems(List<OutboundOrderItemDetailResponseDTO> items) {
        this.items = items;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }
}
