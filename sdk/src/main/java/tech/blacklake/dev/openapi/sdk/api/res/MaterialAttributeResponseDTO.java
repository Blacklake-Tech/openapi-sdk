package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialAttributeResponseDTO  {
    /**
     * id
     */
    private long id = 0;

    /**
     * 内容
     */
    private String name;

    /**
     * 属性项
     */
    private MaterialAttributeItemResponseDTO attributeItem;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MaterialAttributeItemResponseDTO getAttributeItem() {
        return attributeItem;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttributeItem(MaterialAttributeItemResponseDTO attributeItem) {
        this.attributeItem = attributeItem;
    }
}

