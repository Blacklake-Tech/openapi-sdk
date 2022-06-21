package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderPickOrderMaterialResponseDTO  {
    /**
     * 物料基础信息
     */
    private MaterialBaseInfoResponseDTO baseInfo;

    /**
     * 物料属性信息
     */
    private List<MaterialAttributeResponseDTO> attribute;

    /**
     * 物料文件信息
     */
    private List<MaterialDocumentRelResponseDTO> documents;

    /**
     * 物料分类信息
     */
    private MaterialCategoryResponseDTO category;

    /**
     * 物料单位信息
     */
    private UnitDetailResponseDTO unit;

    /**
     * 物料所有单位信息
     */
    private List<UnitDetailResponseDTO> unitList;

    /**
     * 物料单位转换关系
     */
    private List<UnitConversionResponseDTO> conversions;

    public MaterialBaseInfoResponseDTO getBaseInfo() {
        return baseInfo;
    }

    public List<MaterialAttributeResponseDTO> getAttribute() {
        return attribute;
    }

    public List<MaterialDocumentRelResponseDTO> getDocuments() {
        return documents;
    }

    public MaterialCategoryResponseDTO getCategory() {
        return category;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public List<UnitDetailResponseDTO> getUnitList() {
        return unitList;
    }

    public List<UnitConversionResponseDTO> getConversions() {
        return conversions;
    }

    public void setBaseInfo(MaterialBaseInfoResponseDTO baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setAttribute(List<MaterialAttributeResponseDTO> attribute) {
        this.attribute = attribute;
    }

    public void setDocuments(List<MaterialDocumentRelResponseDTO> documents) {
        this.documents = documents;
    }

    public void setCategory(MaterialCategoryResponseDTO category) {
        this.category = category;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setUnitList(List<UnitDetailResponseDTO> unitList) {
        this.unitList = unitList;
    }

    public void setConversions(List<UnitConversionResponseDTO> conversions) {
        this.conversions = conversions;
    }
}

