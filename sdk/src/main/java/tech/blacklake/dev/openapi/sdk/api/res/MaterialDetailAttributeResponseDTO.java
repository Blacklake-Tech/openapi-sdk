package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialDetailAttributeResponseDTO {
    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 物料属性关联ID
     */
    private long relationId;

    /**
     * 属性项ID
     */
    private long id;

    /**
     * 属性项名称
     */
    private String name;

    /**
     * 属性值ID
     */
    private long itemId;

    /**
     * 属性值名称
     */
    private String itemName;

    /**
     * 顺序
     */
    private int index;

    public long getMaterialId() {
        return materialId;
    }

    public long getRelationId() {
        return relationId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getIndex() {
        return index;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setRelationId(long relationId) {
        this.relationId = relationId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
