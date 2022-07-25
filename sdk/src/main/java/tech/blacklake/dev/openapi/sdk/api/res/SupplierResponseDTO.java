package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SupplierResponseDTO {
    /**
     * 业务ID
     */
    private Long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 启用状态
     */
    private BizConstantDisplay status;

    /**
     * 注册状态
     */
    private BizConstantDisplay regStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 更新时间
     */
    private Long updatedAt;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BizConstantDisplay getStatus() {
        return status;
    }

    public BizConstantDisplay getRegStatus() {
        return regStatus;
    }

    public String getRemark() {
        return remark;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }

    public void setRegStatus(BizConstantDisplay regStatus) {
        this.regStatus = regStatus;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}

