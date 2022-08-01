package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialListAttributeDetailResponseDTO {
    /**
     * 物料属性项ID
     */
    private long attributeId;

    /**
     * 物料属性项名称
     */
    private String attributeName;

    /**
     * 物料属性值ID
     */
    private long attributeItemId;

    /**
     * 物料属性值名称
     */
    private String attributeItemName;

    /**
     * 顺序
     */
    private Integer index;

    public long getAttributeId() {
        return attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public long getAttributeItemId() {
        return attributeItemId;
    }

    public String getAttributeItemName() {
        return attributeItemName;
    }

    public Integer getIndex() {
        return index;
    }

    public void setAttributeId(long attributeId) {
        this.attributeId = attributeId;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void setAttributeItemId(long attributeItemId) {
        this.attributeItemId = attributeItemId;
    }

    public void setAttributeItemName(String attributeItemName) {
        this.attributeItemName = attributeItemName;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}

