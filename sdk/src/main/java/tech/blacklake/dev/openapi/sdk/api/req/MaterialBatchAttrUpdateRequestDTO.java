package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialBatchAttrUpdateRequestDTO {
    /**
     * id，必填
     */
    private Long id;

    /**
     * 是否系统默认，必填，1是 0否，默认1
     */
    private int isDefault;

    /**
     * 属性名称，必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 属性类型，必填，0单行文本 1关联关系 2日期时间
     */
    private int type;

    /**
     * 是否启用，非必填，0不启用 1启用 默认1
     */
    private int displayEnable;

    /**
     * 是否可空，非必填，0不可空 1可空 默认1
     */
    private int nullEnable;

    /**
     * 排序字段，必填，默认0 起始0
     */
    private long serialNo;

    public Long getId() {
        return id;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getDisplayEnable() {
        return displayEnable;
    }

    public int getNullEnable() {
        return nullEnable;
    }

    public long getSerialNo() {
        return serialNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDisplayEnable(int displayEnable) {
        this.displayEnable = displayEnable;
    }

    public void setNullEnable(int nullEnable) {
        this.nullEnable = nullEnable;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }
}

