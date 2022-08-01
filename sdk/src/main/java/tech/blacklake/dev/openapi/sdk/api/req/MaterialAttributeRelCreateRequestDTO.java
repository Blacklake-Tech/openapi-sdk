package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialAttributeRelCreateRequestDTO {
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

    public void setIndex(long index) {
        this.index = index;
    }
}

