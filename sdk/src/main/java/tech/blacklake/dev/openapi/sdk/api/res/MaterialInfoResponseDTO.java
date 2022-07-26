package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialInfoResponseDTO {
    /**
     * 物料基本信息
     */
    private MaterialBaseInfoResponseDTO baseInfo;

    /**
     * 物料属性信息
     */
    private List<MaterialAttributeResponseDTO> attribute;

    /**
     * 物料分类信息
     */
    private MaterialCategoryResponseDTO category;

    public MaterialBaseInfoResponseDTO getBaseInfo() {
        return baseInfo;
    }

    public List<MaterialAttributeResponseDTO> getAttribute() {
        return attribute;
    }

    public MaterialCategoryResponseDTO getCategory() {
        return category;
    }

    public void setBaseInfo(MaterialBaseInfoResponseDTO baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setAttribute(List<MaterialAttributeResponseDTO> attribute) {
        this.attribute = attribute;
    }

    public void setCategory(MaterialCategoryResponseDTO category) {
        this.category = category;
    }
}

