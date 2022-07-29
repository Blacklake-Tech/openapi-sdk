package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 工厂ID
     */
    private long orgId = 0L;

    /**
     * 物料ID
     */
    private long id = 0L;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料编号
     */
    private String code;

    /**
     * 物料标识码
     */
    private String qrCode;

    /**
     * 物料类型，0虚拟件1默认2在制品
     */
    private BizConstantDisplay bizType;

    /**
     * 物料业务范围，0虚拟件，1仓储，2采购，3销售，4生产，5质量，6投料
     */
    private List<BizConstantDisplay> bizRange;

    /**
     * 是否启用批次管理，0不启用，1启用
     */
    private BizConstantDisplay batchManagementEnable;

    /**
     * 批次号规则
     */
    private MaterialAttrRuleDetailResponseDTO batchNoRule;

    /**
     * 批次属性
     */
    private List<MaterialBatchAttrDetailResponseDTO> batchAttrs;

    /**
     * 库存属性
     */
    private List<MaterialStorageAttrDetailResponseDTO> inventoryAttrs;

    /**
     * 物料状态，1启用0停用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 物料备注
     */
    private String remark;

    /**
     * 物料分类
     */
    private MaterialDetailCategoryListResponseDTO category;

    /**
     * 物料基本单位
     */
    private MaterialDetailUnitResponseDTO unit;

    /**
     * 物料辅助单位
     */
    private MaterialDetailUnitResponseDTO auxUnit;

    /**
     * 物料单位转换关系
     */
    private List<UnitConversionResponseDTO> conversionUnits;

    /**
     * 物料所有辅助单位
     */
    private List<UnitConversionResponseDTO> auxUnitList;

    /**
     * 物料属性信息
     */
    private List<MaterialDetailAttributeResponseDTO> attributes;

    /**
     * 物料文件信息
     */
    private List<MaterialDocumentResponseDTO> documents;

    /**
     * 物料规格
     */
    private String specification;

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getQrCode() {
        return qrCode;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public List<BizConstantDisplay> getBizRange() {
        return bizRange;
    }

    public BizConstantDisplay getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public MaterialAttrRuleDetailResponseDTO getBatchNoRule() {
        return batchNoRule;
    }

    public List<MaterialBatchAttrDetailResponseDTO> getBatchAttrs() {
        return batchAttrs;
    }

    public List<MaterialStorageAttrDetailResponseDTO> getInventoryAttrs() {
        return inventoryAttrs;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public String getRemark() {
        return remark;
    }

    public MaterialDetailCategoryListResponseDTO getCategory() {
        return category;
    }

    public MaterialDetailUnitResponseDTO getUnit() {
        return unit;
    }

    public MaterialDetailUnitResponseDTO getAuxUnit() {
        return auxUnit;
    }

    public List<UnitConversionResponseDTO> getConversionUnits() {
        return conversionUnits;
    }

    public List<UnitConversionResponseDTO> getAuxUnitList() {
        return auxUnitList;
    }

    public List<MaterialDetailAttributeResponseDTO> getAttributes() {
        return attributes;
    }

    public List<MaterialDocumentResponseDTO> getDocuments() {
        return documents;
    }

    public String getSpecification() {
        return specification;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setBizRange(List<BizConstantDisplay> bizRange) {
        this.bizRange = bizRange;
    }

    public void setBatchManagementEnable(BizConstantDisplay batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setBatchNoRule(MaterialAttrRuleDetailResponseDTO batchNoRule) {
        this.batchNoRule = batchNoRule;
    }

    public void setBatchAttrs(List<MaterialBatchAttrDetailResponseDTO> batchAttrs) {
        this.batchAttrs = batchAttrs;
    }

    public void setInventoryAttrs(List<MaterialStorageAttrDetailResponseDTO> inventoryAttrs) {
        this.inventoryAttrs = inventoryAttrs;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCategory(MaterialDetailCategoryListResponseDTO category) {
        this.category = category;
    }

    public void setUnit(MaterialDetailUnitResponseDTO unit) {
        this.unit = unit;
    }

    public void setAuxUnit(MaterialDetailUnitResponseDTO auxUnit) {
        this.auxUnit = auxUnit;
    }

    public void setConversionUnits(List<UnitConversionResponseDTO> conversionUnits) {
        this.conversionUnits = conversionUnits;
    }

    public void setAuxUnitList(List<UnitConversionResponseDTO> auxUnitList) {
        this.auxUnitList = auxUnitList;
    }

    public void setAttributes(List<MaterialDetailAttributeResponseDTO> attributes) {
        this.attributes = attributes;
    }

    public void setDocuments(List<MaterialDocumentResponseDTO> documents) {
        this.documents = documents;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}

