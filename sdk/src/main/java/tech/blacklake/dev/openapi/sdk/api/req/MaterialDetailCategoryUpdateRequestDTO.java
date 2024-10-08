package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialDetailCategoryUpdateRequestDTO {
    /**
     * 物料分类关联ID，必填
     */
    private Long relationId;

    /**
     * 分类ID，必填
     */
    private List<Long> categoryIds;

    public Long getRelationId() {
        return relationId;
    }

    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setCategoryIds(List<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
