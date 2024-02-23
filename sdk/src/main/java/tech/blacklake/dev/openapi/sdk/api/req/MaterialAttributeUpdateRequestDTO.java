package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialAttributeUpdateRequestDTO {
    /**
     * 物料属性项ID
     */
    private long id;

    /**
     * 物料属性项
     */
    private String name;

    /**
     * 物料属性值ID
     */
    private long itemId;

    /**
     * 物料属性值
     */
    private String itemName;

    /**
     * 物料属性关联ID
     */
    private Long relationId;

    /**
     * 顺序
     */
    private long index;

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

    public Long getRelationId() {
        return relationId;
    }

    public long getIndex() {
        return index;
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

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setIndex(long index) {
        this.index = index;
    }
}
