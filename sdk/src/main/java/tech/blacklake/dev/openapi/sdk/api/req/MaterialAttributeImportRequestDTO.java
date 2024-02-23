package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialAttributeImportRequestDTO {
    /**
     * 属性项，必填，不可超过 255个字符，不能重复
     */
    private String attribute;

    /**
     * 属性值，必填，支持填写多个值，用逗号分隔，单个属性值不可超过 255个字符，同一属性项下不能重复
     */
    private String attributeItem;

    public String getAttribute() {
        return attribute;
    }

    public String getAttributeItem() {
        return attributeItem;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setAttributeItem(String attributeItem) {
        this.attributeItem = attributeItem;
    }
}
