package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialDetailCategoryListResponseDTO {
    /**
     * 物料分类关联ID
     */
    private Long relationId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 分类ID
     */
    private List<Long> categoryIds;

    /**
     * 分类名称
     */
    private String categoryName;

    public Long getRelationId() {
        return relationId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setCategoryIds(List<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

