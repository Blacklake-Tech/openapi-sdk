package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class MaterialAttributeResponseDTO {
    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 物料属性项ID
     */
    private Long id;

    /**
     * 物料属性项名称
     */
    private String name;

    /**
     * Web物料属性值返回值
     */
    private MaterialAttributeItemResponseDTO attributeItem;

    public Long getMaterialId() {
        return materialId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MaterialAttributeItemResponseDTO getAttributeItem() {
        return attributeItem;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttributeItem(MaterialAttributeItemResponseDTO attributeItem) {
        this.attributeItem = attributeItem;
    }
}

