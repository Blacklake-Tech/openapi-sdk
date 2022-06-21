package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomBasicResponseDTO  {
    /**
     * 业务ID
     */
    private long id = 0;

    /**
     * 启用状态 key = ActiveEnum
     */
    private BizConstantDisplay active;

    /**
     * 父项物料ID
     */
    private long materialId = 0;

    /**
     * 父项物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 是否是虚拟件 key = BooleanEnum
     */
    private BizConstantDisplay virtual;

    /**
     * 单位ID
     */
    private long unitId = 0;

    /**
     * 版本号
     */
    private String version;

    /**
     * 是否是默认版本 key = BooleanEnum
     */
    private BizConstantDisplay defaultVersion;

    /**
     * 版本说明
     */
    private String versionDescription;

    /**
     * 行备注
     */
    private String remark;

    public long getId() {
        return id;
    }

    public BizConstantDisplay getActive() {
        return active;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BizConstantDisplay getVirtual() {
        return virtual;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getVersion() {
        return version;
    }

    public BizConstantDisplay getDefaultVersion() {
        return defaultVersion;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setActive(BizConstantDisplay active) {
        this.active = active;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setVirtual(BizConstantDisplay virtual) {
        this.virtual = virtual;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDefaultVersion(BizConstantDisplay defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

