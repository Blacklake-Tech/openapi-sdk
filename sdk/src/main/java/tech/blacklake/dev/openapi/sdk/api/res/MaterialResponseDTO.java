package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class MaterialResponseDTO {
    /**
     * 物料基本信息
     */
    private MaterialBaseInfoResponseDTO baseInfo;

    /**
     * 物料属性信息
     */
    private List<MaterialAttributeResponseDTO> attribute;

    /**
     * 物料分类信息
     */
    private MaterialCategoryResponseDTO category;

    /**
     * 物料主单位信息
     */
    private UnitDetailResponseDTO masterUnit;

    /**
     * 物料生产单位信息
     */
    private UnitDetailResponseDTO productionUnit;

    /**
     * 物料所有可用单位信息
     */
    private List<UnitDetailResponseDTO> unitList;

    /**
     * 物料单位转化信息
     */
    private List<UnitConversionResponseDTO> unitConversionInfo;

    /**
     * 是否启用批次管理
     */
    private BizConstantDisplay batchManagementEnable;

    /**
     * 批次号规则
     */
    private Long batchNoRuleId;

    /**
     * 批次号
     */
    private String batchNo;

    public MaterialBaseInfoResponseDTO getBaseInfo() {
        return baseInfo;
    }

    public List<MaterialAttributeResponseDTO> getAttribute() {
        return attribute;
    }

    public MaterialCategoryResponseDTO getCategory() {
        return category;
    }

    public UnitDetailResponseDTO getMasterUnit() {
        return masterUnit;
    }

    public UnitDetailResponseDTO getProductionUnit() {
        return productionUnit;
    }

    public List<UnitDetailResponseDTO> getUnitList() {
        return unitList;
    }

    public List<UnitConversionResponseDTO> getUnitConversionInfo() {
        return unitConversionInfo;
    }

    public BizConstantDisplay getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public Long getBatchNoRuleId() {
        return batchNoRuleId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBaseInfo(MaterialBaseInfoResponseDTO baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setAttribute(List<MaterialAttributeResponseDTO> attribute) {
        this.attribute = attribute;
    }

    public void setCategory(MaterialCategoryResponseDTO category) {
        this.category = category;
    }

    public void setMasterUnit(UnitDetailResponseDTO masterUnit) {
        this.masterUnit = masterUnit;
    }

    public void setProductionUnit(UnitDetailResponseDTO productionUnit) {
        this.productionUnit = productionUnit;
    }

    public void setUnitList(List<UnitDetailResponseDTO> unitList) {
        this.unitList = unitList;
    }

    public void setUnitConversionInfo(List<UnitConversionResponseDTO> unitConversionInfo) {
        this.unitConversionInfo = unitConversionInfo;
    }

    public void setBatchManagementEnable(BizConstantDisplay batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setBatchNoRuleId(Long batchNoRuleId) {
        this.batchNoRuleId = batchNoRuleId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
}

