package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialListDetailResponseDTO {
    /**
     * 工厂ID
     */
    private long orgId = 0;

    /**
     * 物料ID
     */
    private long id = 0;

    /**
     * 物料编号
     */
    private String code;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料标识码
     */
    private String qrCode;

    /**
     * 物料备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private long createdAt = 0;

    /**
     * 物料状态，1启用0停用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 物料类型，0虚拟件1默认2在制品
     */
    private BizConstantDisplay bizType;

    /**
     * 物料业务范围，0虚拟件，1仓储，2采购，3销售，4生产，5质量
     */
    private List<BizConstantDisplay> bizRange;

    /**
     * 物料分类信息
     */
    private MaterialDetailCategoryListResponseDTO category;

    /**
     * 物料单位名称
     */
    private String unitName;

    /**
     * 物料基本单位
     */
    private MaterialDetailUnitResponseDTO unit;

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
    private List<MaterialListAttributeDetailResponseDTO> attributes;

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

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getRemark() {
        return remark;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public List<BizConstantDisplay> getBizRange() {
        return bizRange;
    }

    public MaterialDetailCategoryListResponseDTO getCategory() {
        return category;
    }

    public String getUnitName() {
        return unitName;
    }

    public MaterialDetailUnitResponseDTO getUnit() {
        return unit;
    }

    public List<UnitConversionResponseDTO> getConversionUnits() {
        return conversionUnits;
    }

    public List<UnitConversionResponseDTO> getAuxUnitList() {
        return auxUnitList;
    }

    public List<MaterialListAttributeDetailResponseDTO> getAttributes() {
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setBizRange(List<BizConstantDisplay> bizRange) {
        this.bizRange = bizRange;
    }

    public void setCategory(MaterialDetailCategoryListResponseDTO category) {
        this.category = category;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnit(MaterialDetailUnitResponseDTO unit) {
        this.unit = unit;
    }

    public void setConversionUnits(List<UnitConversionResponseDTO> conversionUnits) {
        this.conversionUnits = conversionUnits;
    }

    public void setAuxUnitList(List<UnitConversionResponseDTO> auxUnitList) {
        this.auxUnitList = auxUnitList;
    }

    public void setAttributes(List<MaterialListAttributeDetailResponseDTO> attributes) {
        this.attributes = attributes;
    }

    public void setDocuments(List<MaterialDocumentResponseDTO> documents) {
        this.documents = documents;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}

