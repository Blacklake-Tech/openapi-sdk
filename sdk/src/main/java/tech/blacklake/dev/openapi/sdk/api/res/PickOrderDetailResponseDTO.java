package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PickOrderDetailResponseDTO  {
    /**
     * 领料单编号
     */
    private String pickOrderCode;

    /**
     * 领料单id
     */
    private long pickOrderId = 0L;

    /**
     * 领料类型 key = PickOrderTypeEnum
     */
    private BizConstantDisplay pickOrderType;

    /**
     * 状态
     */
    private int pickOrderStatus = 0;

    /**
     * 物料信息
     */
    private List<PickOrderDetailMaterialLineResponseDTO> materials;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private UserResponseDTO creator;

    /**
     * 创建时间
     */
    private long createdAt = 0L;

    /**
     * 更新人
     */
    private UserResponseDTO operator;

    /**
     * 更新时间
     */
    private long updatedAt = 0L;

    public String getPickOrderCode() {
        return pickOrderCode;
    }

    public long getPickOrderId() {
        return pickOrderId;
    }

    public BizConstantDisplay getPickOrderType() {
        return pickOrderType;
    }

    public int getPickOrderStatus() {
        return pickOrderStatus;
    }

    public List<PickOrderDetailMaterialLineResponseDTO> getMaterials() {
        return materials;
    }

    public String getRemark() {
        return remark;
    }

    public UserResponseDTO getCreator() {
        return creator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public UserResponseDTO getOperator() {
        return operator;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setPickOrderCode(String pickOrderCode) {
        this.pickOrderCode = pickOrderCode;
    }

    public void setPickOrderId(long pickOrderId) {
        this.pickOrderId = pickOrderId;
    }

    public void setPickOrderType(BizConstantDisplay pickOrderType) {
        this.pickOrderType = pickOrderType;
    }

    public void setPickOrderStatus(int pickOrderStatus) {
        this.pickOrderStatus = pickOrderStatus;
    }

    public void setMaterials(List<PickOrderDetailMaterialLineResponseDTO> materials) {
        this.materials = materials;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreator(UserResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setOperator(UserResponseDTO operator) {
        this.operator = operator;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}

