package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AmountAdjustRecListResponseDTO {
    /**
     * 调整记录ID
     */
    private long id;

    /**
     * 业务类型 1:库存调整 2:质检报废
     */
    private BizConstantDisplay bizType;

    /**
     * 物料
     */
    private MaterialCommonInfoResponseDTO material;

    /**
     * 备注
     */
    private String remark;

    /**
     * 库存属性
     */
    private AttrDetailResponseDTO invElement;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 创建时间
     */
    private Long createdAt;

    public long getId() {
        return id;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public MaterialCommonInfoResponseDTO getMaterial() {
        return material;
    }

    public String getRemark() {
        return remark;
    }

    public AttrDetailResponseDTO getInvElement() {
        return invElement;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setMaterial(MaterialCommonInfoResponseDTO material) {
        this.material = material;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setInvElement(AttrDetailResponseDTO invElement) {
        this.invElement = invElement;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}

