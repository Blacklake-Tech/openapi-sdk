package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialResponseDTO  {
    /**
     * 业务id
     */
    private long id = 0;

    /**
     * 物料编码
     */
    private String code;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料标识码
     */
    private String identifier;

    /**
     * 物料分类
     */
    private MaterialCategoryResponseDTO category;

    /**
     * 物料属性
     */
    private List<MaterialAttributeResponseDTO> attribute;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public MaterialCategoryResponseDTO getCategory() {
        return category;
    }

    public List<MaterialAttributeResponseDTO> getAttribute() {
        return attribute;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setCategory(MaterialCategoryResponseDTO category) {
        this.category = category;
    }

    public void setAttribute(List<MaterialAttributeResponseDTO> attribute) {
        this.attribute = attribute;
    }
}

