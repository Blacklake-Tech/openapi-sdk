package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialCommonInfoResponseDTO {
    /**
     * 物料ID
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
     * 物料分类ID
     */
    private Long categoryId;

    /**
     * 物料分类名称
     */
    private String categoryName;

    /**
     * 物料属性信息
     */
    private List<MaterialAttributeResponseDTO> attrList;

    /**
     * customFieldList
     */
    private List<String> customFieldList;

    /**
     * 物料状态描述
     */
    private String status;

    /**
     * 状态，1启用0停用
     */
    private Integer enableFlag;

    /**
     * 物料备注
     */
    private String remark;

    /**
     * 物料文件信息
     */
    private List<MaterialDocumentRelResponseDTO> documents;

    /**
     * 物料主单位信息
     */
    private UnitDetailResponseDTO baseUnit;

    /**
     * 物料单位转换关系(fromUnitId固定为主单位)
     */
    private List<UnitConversionResponseDTO> conversions;

    /**
     * 物料所有单位信息
     */
    private List<UnitDetailResponseDTO> units;

    /**
     * 物料所有辅助单位
     */
    private List<UnitDetailResponseDTO> auxUnitList;

    /**
     * batchAttrCustomFields
     */
    private List<String> batchAttrCustomFields;

    /**
     * unitAttrCustomFields
     */
    private List<String> unitAttrCustomFields;

    /**
     * 是否启用批次管理，0不启用，1启用
     */
    private int batchManagementEnable;

    /**
     * 先进先出，1启用，0不启用
     */
    private Integer fifoEnabled;

    /**
     * 先进先出属性，0批次号1生产日期2有效期至
     */
    private Integer fifoAttr;

    /**
     * 库存明细标识码编号规则ID
     */
    private Long inventoryQrCodeRuleId;

    /**
     * 库存属性
     */
    private List<MaterialInventoryAttrResponseDTO> inventoryAttrs;

    /**
     * 仓储转换单位
     */
    private Long inventoryConvertUnitId;

    /**
     * 物料标识码
     */
    private String qrCode;

    /**
     * 批次属性
     */
    private List<MaterialBatchAttrResponseDTO> batchAttrs;

    /**
     * 物料规格
     */
    private String specification;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MaterialAttributeResponseDTO> getAttrList() {
        return attrList;
    }

    public List<String> getCustomFieldList() {
        return customFieldList;
    }

    public String getStatus() {
        return status;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public String getRemark() {
        return remark;
    }

    public List<MaterialDocumentRelResponseDTO> getDocuments() {
        return documents;
    }

    public UnitDetailResponseDTO getBaseUnit() {
        return baseUnit;
    }

    public List<UnitConversionResponseDTO> getConversions() {
        return conversions;
    }

    public List<UnitDetailResponseDTO> getUnits() {
        return units;
    }

    public List<UnitDetailResponseDTO> getAuxUnitList() {
        return auxUnitList;
    }

    public List<String> getBatchAttrCustomFields() {
        return batchAttrCustomFields;
    }

    public List<String> getUnitAttrCustomFields() {
        return unitAttrCustomFields;
    }

    public int getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public Integer getFifoEnabled() {
        return fifoEnabled;
    }

    public Integer getFifoAttr() {
        return fifoAttr;
    }

    public Long getInventoryQrCodeRuleId() {
        return inventoryQrCodeRuleId;
    }

    public List<MaterialInventoryAttrResponseDTO> getInventoryAttrs() {
        return inventoryAttrs;
    }

    public Long getInventoryConvertUnitId() {
        return inventoryConvertUnitId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public List<MaterialBatchAttrResponseDTO> getBatchAttrs() {
        return batchAttrs;
    }

    public String getSpecification() {
        return specification;
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

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setAttrList(List<MaterialAttributeResponseDTO> attrList) {
        this.attrList = attrList;
    }

    public void setCustomFieldList(List<String> customFieldList) {
        this.customFieldList = customFieldList;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDocuments(List<MaterialDocumentRelResponseDTO> documents) {
        this.documents = documents;
    }

    public void setBaseUnit(UnitDetailResponseDTO baseUnit) {
        this.baseUnit = baseUnit;
    }

    public void setConversions(List<UnitConversionResponseDTO> conversions) {
        this.conversions = conversions;
    }

    public void setUnits(List<UnitDetailResponseDTO> units) {
        this.units = units;
    }

    public void setAuxUnitList(List<UnitDetailResponseDTO> auxUnitList) {
        this.auxUnitList = auxUnitList;
    }

    public void setBatchAttrCustomFields(List<String> batchAttrCustomFields) {
        this.batchAttrCustomFields = batchAttrCustomFields;
    }

    public void setUnitAttrCustomFields(List<String> unitAttrCustomFields) {
        this.unitAttrCustomFields = unitAttrCustomFields;
    }

    public void setBatchManagementEnable(int batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setFifoEnabled(Integer fifoEnabled) {
        this.fifoEnabled = fifoEnabled;
    }

    public void setFifoAttr(Integer fifoAttr) {
        this.fifoAttr = fifoAttr;
    }

    public void setInventoryQrCodeRuleId(Long inventoryQrCodeRuleId) {
        this.inventoryQrCodeRuleId = inventoryQrCodeRuleId;
    }

    public void setInventoryAttrs(List<MaterialInventoryAttrResponseDTO> inventoryAttrs) {
        this.inventoryAttrs = inventoryAttrs;
    }

    public void setInventoryConvertUnitId(Long inventoryConvertUnitId) {
        this.inventoryConvertUnitId = inventoryConvertUnitId;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setBatchAttrs(List<MaterialBatchAttrResponseDTO> batchAttrs) {
        this.batchAttrs = batchAttrs;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
