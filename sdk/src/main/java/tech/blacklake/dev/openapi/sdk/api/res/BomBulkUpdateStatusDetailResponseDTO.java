package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomBulkUpdateStatusDetailResponseDTO  {
    /**
     * 失败详情
     */
    private String failReason;

    /**
     * 业务ID
     */
    private Long id;

    /**
     * 父项物料ID
     */
    private Long materialId;

    /**
     * 父项物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 版本号
     */
    private String version;

    public String getFailReason() {
        return failReason;
    }

    public Long getId() {
        return id;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public String getVersion() {
        return version;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

