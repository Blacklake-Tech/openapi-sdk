package tech.blacklake.dev.openapi.sdk.api.res;

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
     * 物料文件信息
     */
    private List<MaterialDocumentRelResponseDTO> documents;

    /**
     * 物料分类信息
     */
    private MaterialCategoryResponseDTO category;

    /**
     * 物料主单位信息
     */
    private UnitDetailResponseDTO unit;

    /**
     * 物料所有单位信息
     */
    private List<UnitDetailResponseDTO> unitList;

    /**
     * 物料单位转换关系(fromUnitId固定为主单位)
     */
    private List<UnitConversionResponseDTO> conversions;

    /**
     * 物料所有辅助单位
     */
    private List<UnitConversionResponseDTO> auxUnitList;

    /**
     * 物料生产信息
     */
    private MaterialProductionInfoResponseDTO productionInfo;

    /**
     * 物料采购信息
     */
    private MaterialPurchaseResResponseDTO purchaseInfo;

    /**
     * 是否启用批次管理，0不启用，1启用
     */
    private BizConstantDisplay batchManagementEnable;

    /**
     * 批次号规则ID
     */
    private Long batchNoRuleId;

    /**
     * 批次属性
     */
    private List<MaterialBatchAttrResponseDTO> batchAttrs;

    /**
     * 库存属性
     */
    private List<MaterialInventoryAttrResponseDTO> inventoryAttrs;

    /**
     * 库存属性
     */
    private MaterialInventoryManageAttrDTO inventoryManageAttrDTO;

    /**
     * 仓储转换单位
     */
    private Long inventoryConvertUnitId;

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

    public List<UnitConversionResponseDTO> getAuxUnitList() {
        return auxUnitList;
    }

    public MaterialProductionInfoResponseDTO getProductionInfo() {
        return productionInfo;
    }

    public MaterialPurchaseResResponseDTO getPurchaseInfo() {
        return purchaseInfo;
    }

    public BizConstantDisplay getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public Long getBatchNoRuleId() {
        return batchNoRuleId;
    }

    public List<MaterialBatchAttrResponseDTO> getBatchAttrs() {
        return batchAttrs;
    }

    public List<MaterialInventoryAttrResponseDTO> getInventoryAttrs() {
        return inventoryAttrs;
    }

    public MaterialInventoryManageAttrDTO getInventoryManageAttrDTO() {
        return inventoryManageAttrDTO;
    }

    public Long getInventoryConvertUnitId() {
        return inventoryConvertUnitId;
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

    public void setAuxUnitList(List<UnitConversionResponseDTO> auxUnitList) {
        this.auxUnitList = auxUnitList;
    }

    public void setProductionInfo(MaterialProductionInfoResponseDTO productionInfo) {
        this.productionInfo = productionInfo;
    }

    public void setPurchaseInfo(MaterialPurchaseResResponseDTO purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }

    public void setBatchManagementEnable(BizConstantDisplay batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setBatchNoRuleId(Long batchNoRuleId) {
        this.batchNoRuleId = batchNoRuleId;
    }

    public void setBatchAttrs(List<MaterialBatchAttrResponseDTO> batchAttrs) {
        this.batchAttrs = batchAttrs;
    }

    public void setInventoryAttrs(List<MaterialInventoryAttrResponseDTO> inventoryAttrs) {
        this.inventoryAttrs = inventoryAttrs;
    }

    public void setInventoryManageAttrDTO(MaterialInventoryManageAttrDTO inventoryManageAttrDTO) {
        this.inventoryManageAttrDTO = inventoryManageAttrDTO;
    }

    public void setInventoryConvertUnitId(Long inventoryConvertUnitId) {
        this.inventoryConvertUnitId = inventoryConvertUnitId;
    }
}

