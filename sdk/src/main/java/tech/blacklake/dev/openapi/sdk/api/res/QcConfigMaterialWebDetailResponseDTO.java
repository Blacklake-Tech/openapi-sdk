package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcConfigMaterialWebDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 物料id
     */
    private Long id;

    /**
     * 物料编号
     */
    private String code;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料分类
     */
    private QcConfigWebDetailMaterialCategoryResponseDTO category;

    /**
     * 物料单位
     */
    private QcConfigWebDetailUnitResponseDTO unit;

    /**
     * 物料检验单位
     */
    private QcConfigWebDetailUnitResponseDTO qcUnit;

    /**
     * 物料属性
     */
    private List<MaterialAttributeResponseDTO> attributes;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public QcConfigWebDetailMaterialCategoryResponseDTO getCategory() {
        return category;
    }

    public QcConfigWebDetailUnitResponseDTO getUnit() {
        return unit;
    }

    public QcConfigWebDetailUnitResponseDTO getQcUnit() {
        return qcUnit;
    }

    public List<MaterialAttributeResponseDTO> getAttributes() {
        return attributes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(QcConfigWebDetailMaterialCategoryResponseDTO category) {
        this.category = category;
    }

    public void setUnit(QcConfigWebDetailUnitResponseDTO unit) {
        this.unit = unit;
    }

    public void setQcUnit(QcConfigWebDetailUnitResponseDTO qcUnit) {
        this.qcUnit = qcUnit;
    }

    public void setAttributes(List<MaterialAttributeResponseDTO> attributes) {
        this.attributes = attributes;
    }
}

