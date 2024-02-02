package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialBatchAttrDetailResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 物料id
     */
    private long materialId;

    /**
     * 是否系统默认，1是 0否，默认1
     */
    private int isDefault;

    /**
     * 属性名称 供应商批次、供应商、客户、生产日期、有效期至
     */
    private BizConstantDisplay name;

    /**
     * 属性类型 0单行文本 1关联关系 2日期时间
     */
    private BizConstantDisplay type;

    /**
     * 是否启用 0不启用 1启用
     */
    private BizConstantDisplay displayEnable;

    /**
     * 是否可空 0不可空 1可空
     */
    private BizConstantDisplay nullEnable;

    /**
     * 排序字段 默认0 起始0
     */
    private long serialNo;

    public Long getId() {
        return id;
    }

    public long getMaterialId() {
        return materialId;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public BizConstantDisplay getName() {
        return name;
    }

    public BizConstantDisplay getType() {
        return type;
    }

    public BizConstantDisplay getDisplayEnable() {
        return displayEnable;
    }

    public BizConstantDisplay getNullEnable() {
        return nullEnable;
    }

    public long getSerialNo() {
        return serialNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public void setName(BizConstantDisplay name) {
        this.name = name;
    }

    public void setType(BizConstantDisplay type) {
        this.type = type;
    }

    public void setDisplayEnable(BizConstantDisplay displayEnable) {
        this.displayEnable = displayEnable;
    }

    public void setNullEnable(BizConstantDisplay nullEnable) {
        this.nullEnable = nullEnable;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }
}

