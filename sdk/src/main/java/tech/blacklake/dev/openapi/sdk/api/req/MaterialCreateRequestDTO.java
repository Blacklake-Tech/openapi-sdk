package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialCreateRequestDTO {
    /**
     * 物料名称，必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 物料编号，非必填，支持字母、数字和符号，不可超过255个字符
     */
    private String code;

    /**
     * 物料基本单位，必填
     */
    private MaterialCreateBaseUnitRequestDTO unit;

    /**
     * 物料辅助单位，已废弃，通过转换单位列表新建
     */
    private MaterialCreateAuxUnitRequestDTO auxUnit;

    /**
     * 物料类型，0虚拟件1默认2在制品，必填
     */
    private Integer bizType;

    /**
     * 物料业务范围，1仓储，2采购，3销售，4自制，5质量，6投料，当业务类型为虚拟件时必须未空，当业务类型为在制品时，取值范围为1仓储，4自制，5质量，6投料
     */
    private List<Integer> bizRange;

    /**
     * 是否启用批次管理，0不启用，1启用，非必填，不填默认为0不启用
     */
    private int batchManagementEnable = 0;

    /**
     * 批次号规则，非必填
     */
    private MaterialAttrRuleSaveRequestDTO batchNoRule;

    /**
     * 批次属性，非必填，默认会创建供应商，供应商批次，客户，生产日期，有效期至5个属性
     */
    private List<MaterialBatchAttrCreateRequestDTO> batchAttrs;

    /**
     * 物料分类，非必填
     */
    private MaterialCreateCategoryRequestDTO category;

    /**
     * 物料属性，非必填
     */
    private List<MaterialAttributeRelCreateRequestDTO> attributes;

    /**
     * 物料文件，非必填
     */
    private List<MaterialCreateDocumentRequestDTO> documents;

    /**
     * 备注，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String remark;

    /**
     * 编号规则ID，若物料编号不为空，则不需要填，若物料编号为空，则必填，否则会生成编号报错
     */
    private Long numberRuleId;

    /**
     * 物料规格，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String specification;

    /**
     * 自定义字段，若存在必填值，则必填，否则非必填
     */
    private CustomFieldBaseRequestDTO materialCustomField;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public MaterialCreateBaseUnitRequestDTO getUnit() {
        return unit;
    }

    public MaterialCreateAuxUnitRequestDTO getAuxUnit() {
        return auxUnit;
    }

    public Integer getBizType() {
        return bizType;
    }

    public List<Integer> getBizRange() {
        return bizRange;
    }

    public int getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public MaterialAttrRuleSaveRequestDTO getBatchNoRule() {
        return batchNoRule;
    }

    public List<MaterialBatchAttrCreateRequestDTO> getBatchAttrs() {
        return batchAttrs;
    }

    public MaterialCreateCategoryRequestDTO getCategory() {
        return category;
    }

    public List<MaterialAttributeRelCreateRequestDTO> getAttributes() {
        return attributes;
    }

    public List<MaterialCreateDocumentRequestDTO> getDocuments() {
        return documents;
    }

    public String getRemark() {
        return remark;
    }

    public Long getNumberRuleId() {
        return numberRuleId;
    }

    public String getSpecification() {
        return specification;
    }

    public CustomFieldBaseRequestDTO getMaterialCustomField() {
        return materialCustomField;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUnit(MaterialCreateBaseUnitRequestDTO unit) {
        this.unit = unit;
    }

    public void setAuxUnit(MaterialCreateAuxUnitRequestDTO auxUnit) {
        this.auxUnit = auxUnit;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setBizRange(List<Integer> bizRange) {
        this.bizRange = bizRange;
    }

    public void setBatchManagementEnable(int batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setBatchNoRule(MaterialAttrRuleSaveRequestDTO batchNoRule) {
        this.batchNoRule = batchNoRule;
    }

    public void setBatchAttrs(List<MaterialBatchAttrCreateRequestDTO> batchAttrs) {
        this.batchAttrs = batchAttrs;
    }

    public void setCategory(MaterialCreateCategoryRequestDTO category) {
        this.category = category;
    }

    public void setAttributes(List<MaterialAttributeRelCreateRequestDTO> attributes) {
        this.attributes = attributes;
    }

    public void setDocuments(List<MaterialCreateDocumentRequestDTO> documents) {
        this.documents = documents;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setNumberRuleId(Long numberRuleId) {
        this.numberRuleId = numberRuleId;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setMaterialCustomField(CustomFieldBaseRequestDTO materialCustomField) {
        this.materialCustomField = materialCustomField;
    }
}

