package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialUpdateRequestDTO {
    /**
     * 物料ID，必填
     */
    private long id;

    /**
     * 物料名称，必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 物料编号，必填，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String code;

    /**
     * 物料基本单位，必填
     */
    private MaterialUpdateBaseUnitRequestDTO unit;

    /**
     * 物料辅助单位，非必填
     */
    private MaterialUpdateAuxUnitRequestDTO auxUnit;

    /**
     * 物料业务范围，0虚拟件，1仓储，2采购，3销售，4生产，5质量，6投料
     */
    private List<Integer> bizRange;

    /**
     * 是否启用批次管理，0不启用，1启用
     */
    private int batchManagementEnable;

    /**
     * 批次号规则，非必填
     */
    private MaterialAttrRuleSaveRequestDTO batchNoRule;

    /**
     * 批次属性，非必填，如果开启了批次管理，则必填
     */
    private List<MaterialBatchAttrUpdateRequestDTO> batchAttrs;

    /**
     * 物料标识码，必填
     */
    private String qrCode;

    /**
     * 物料分类ID，非必填
     */
    private MaterialDetailCategoryUpdateRequestDTO category;

    /**
     * 物料属性ID List，非必填
     */
    private List<MaterialAttributeUpdateRequestDTO> attributes;

    /**
     * 物料文件ID List，非必填
     */
    private List<MaterialUpdateDocumentRequestDTO> documents;

    /**
     * 备注，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String remark;

    /**
     * 编辑原因，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String reason;

    /**
     * 自定义字段，非必填
     */
    private CustomFieldBaseCO materialCustomField;

    /**
     * 物料规格，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String specification;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public MaterialUpdateBaseUnitRequestDTO getUnit() {
        return unit;
    }

    public MaterialUpdateAuxUnitRequestDTO getAuxUnit() {
        return auxUnit;
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

    public List<MaterialBatchAttrUpdateRequestDTO> getBatchAttrs() {
        return batchAttrs;
    }

    public String getQrCode() {
        return qrCode;
    }

    public MaterialDetailCategoryUpdateRequestDTO getCategory() {
        return category;
    }

    public List<MaterialAttributeUpdateRequestDTO> getAttributes() {
        return attributes;
    }

    public List<MaterialUpdateDocumentRequestDTO> getDocuments() {
        return documents;
    }

    public String getRemark() {
        return remark;
    }

    public String getReason() {
        return reason;
    }

    public CustomFieldBaseCO getMaterialCustomField() {
        return materialCustomField;
    }

    public String getSpecification() {
        return specification;
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

    public void setUnit(MaterialUpdateBaseUnitRequestDTO unit) {
        this.unit = unit;
    }

    public void setAuxUnit(MaterialUpdateAuxUnitRequestDTO auxUnit) {
        this.auxUnit = auxUnit;
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

    public void setBatchAttrs(List<MaterialBatchAttrUpdateRequestDTO> batchAttrs) {
        this.batchAttrs = batchAttrs;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setCategory(MaterialDetailCategoryUpdateRequestDTO category) {
        this.category = category;
    }

    public void setAttributes(List<MaterialAttributeUpdateRequestDTO> attributes) {
        this.attributes = attributes;
    }

    public void setDocuments(List<MaterialUpdateDocumentRequestDTO> documents) {
        this.documents = documents;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setMaterialCustomField(CustomFieldBaseCO materialCustomField) {
        this.materialCustomField = materialCustomField;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
