package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialImportRequestDTO {
    /**
     * 物料编号，必填，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String materialCode;

    /**
     * 物料名称，必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String materialName;

    /**
     * 物料类型，非必填，若填写，支持填写 '默认，虚拟件，在制品'，若不填写，导入后默认为'默认'
     */
    private String bizType;

    /**
     * 主单位名称，必填，必须是系统中的单位名称
     */
    private String unitName;

    /**
     * 业务范围，非必填，若物料类型为默认，可填写{仓储，采购，销售，自制，质量，投料}，若不填写则默认为全部；若物料类型为在制品，可填写{仓储，自制，质量，投料}，若不填写则默认为全部；若物料类型为虚拟件，无需填写
     */
    private String bizRange;

    /**
     * 物料分类，非必填，必须是系统中物料分类的最低层级 
     */
    private String materialCategory;

    /**
     * 物料属性，非必填，支持填多个，格式为[属性项：属性值]，例如[颜色：黑色，产地：上海]
     */
    private String materialAttribute;

    /**
     * 物料规格，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String specification;

    /**
     * 批次管理，非必填，若填写，可填写 {是，否}，若不填写，导入后默认为否
     */
    private String batchManagementEnable;

    /**
     * 显示批次属性，非必填，仅批次管理开启后需要填写，若填写，可填写 {供应商、供应商批次、客户、生产日期、有效期至}中的一项或多项，若不填写，则默认均不显示
     */
    private String batchNoAttrDisplay;

    /**
     * 必填批次属性，非必填，仅填写了[显示批次属性]后需要填写，可填写其中的一项或多项，若不填写，则默认均为非必填
     */
    private String batchNoAttrNotNull;

    /**
     * 批次号规则编号，非必填，必须是系统中存在的批次号规则编号
     */
    private String batchNoRuleCode;

    /**
     * 备注，非必填，不可超过1000字符
     */
    private String remark;

    /**
     * 转换单位名称，非必填，指仓储的转换单位，必须是该物料上存在且已启用的主单位或转换单位名称
     */
    private String convertUnitName;

    /**
     * 调拨批量，非必填
     */
    private String transferBatch;

    /**
     * 调拨批量单位名称，非必填，必须物料主单位或转换单位，若不填，默认取物料主单位
     */
    private String transferUnitName;

    /**
     * 默认仓库编号，非必填，必须是系统中存在的仓库编号
     */
    private String defaultWarehouseCode;

    /**
     * 默认仓位编号，非必填，如果填写则必须是默认仓库下系统中存在的仓位编号
     */
    private String defaultLocationCode;

    /**
     * 存储有效期（时间），非必填，请填写正整数
     */
    private String validityTime;

    /**
     * 存储有效期（单位），非必填，可填写{年、月、日、时、分}，为空时默认为日
     */
    private String validityUnit;

    /**
     * 先进先出，非必填，可填写{是，否}，为空时默认为否
     */
    private String fifoEnabled;

    /**
     * 先进先出属性，非必填，仅先进先出为是时需要填写，可填写{批次号、生产日期、有效期至}，为空时默认为批次号
     */
    private String fifoAttr;

    /**
     * 显示库存属性，非必填，若填写，可填写 {供应商、供应商批次、客户、生产日期、有效期至、入厂日期}中的一项或多项，若不填写，则默认均不显示
     */
    private String inventoryAttrDisplay;

    /**
     * 必填库存属性，非必填，仅填写了[显示批次属性]后需要填写，可填写其中的一项或多项，若不填写，则默认均为非必填
     */
    private String inventoryAttrNotNull;

    /**
     * 标识码规则编号，非必填，必须是系统中存在的标识码规则编号
     */
    private String inventoryRuleCode;

    /**
     * 自制单位名称，非必填，必须是该物料上存在且已启用的主单位或转换单位名称，未填写时默认为该物料主单位
     */
    private String productionUnitName;

    /**
     * 投料质量状态，非必填，默认为[合格、让步合格]，支持多选[合格、不合格、让步合格、待检]
     */
    private String manufactureQualityStatus;

    /**
     * 投料单位，非必填，必须是该物料上存在且已启用的主单位或转换单位名称，未填写时默认为该物料主单位
     */
    private String feedUnitName;

    /**
     * 采购单位名称，非必填，必须是该物料上存在且已启用的主单位或转换单位名称，未填写时默认为该物料主单位
     */
    private String purchaseUnitName;

    /**
     * 采购批量，非必填，若填写必须大于0，小于1,000,000的整数
     */
    private String purchaseAmount;

    /**
     * 最小采购量，非必填，若填写必须大于0，小于1,000,000的整数
     */
    private String purchaseAmountMin;

    /**
     * 货源控制，非必填，可填写{是，否}，为空时默认为否
     */
    private String sourceControl;

    /**
     * 物料单位列表
     */
    private List<MaterialUnitListRequestDTO> items;

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getBizType() {
        return bizType;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getBizRange() {
        return bizRange;
    }

    public String getMaterialCategory() {
        return materialCategory;
    }

    public String getMaterialAttribute() {
        return materialAttribute;
    }

    public String getSpecification() {
        return specification;
    }

    public String getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public String getBatchNoAttrDisplay() {
        return batchNoAttrDisplay;
    }

    public String getBatchNoAttrNotNull() {
        return batchNoAttrNotNull;
    }

    public String getBatchNoRuleCode() {
        return batchNoRuleCode;
    }

    public String getRemark() {
        return remark;
    }

    public String getConvertUnitName() {
        return convertUnitName;
    }

    public String getTransferBatch() {
        return transferBatch;
    }

    public String getTransferUnitName() {
        return transferUnitName;
    }

    public String getDefaultWarehouseCode() {
        return defaultWarehouseCode;
    }

    public String getDefaultLocationCode() {
        return defaultLocationCode;
    }

    public String getValidityTime() {
        return validityTime;
    }

    public String getValidityUnit() {
        return validityUnit;
    }

    public String getFifoEnabled() {
        return fifoEnabled;
    }

    public String getFifoAttr() {
        return fifoAttr;
    }

    public String getInventoryAttrDisplay() {
        return inventoryAttrDisplay;
    }

    public String getInventoryAttrNotNull() {
        return inventoryAttrNotNull;
    }

    public String getInventoryRuleCode() {
        return inventoryRuleCode;
    }

    public String getProductionUnitName() {
        return productionUnitName;
    }

    public String getManufactureQualityStatus() {
        return manufactureQualityStatus;
    }

    public String getFeedUnitName() {
        return feedUnitName;
    }

    public String getPurchaseUnitName() {
        return purchaseUnitName;
    }

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public String getPurchaseAmountMin() {
        return purchaseAmountMin;
    }

    public String getSourceControl() {
        return sourceControl;
    }

    public List<MaterialUnitListRequestDTO> getItems() {
        return items;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setBizRange(String bizRange) {
        this.bizRange = bizRange;
    }

    public void setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory;
    }

    public void setMaterialAttribute(String materialAttribute) {
        this.materialAttribute = materialAttribute;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setBatchManagementEnable(String batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setBatchNoAttrDisplay(String batchNoAttrDisplay) {
        this.batchNoAttrDisplay = batchNoAttrDisplay;
    }

    public void setBatchNoAttrNotNull(String batchNoAttrNotNull) {
        this.batchNoAttrNotNull = batchNoAttrNotNull;
    }

    public void setBatchNoRuleCode(String batchNoRuleCode) {
        this.batchNoRuleCode = batchNoRuleCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setConvertUnitName(String convertUnitName) {
        this.convertUnitName = convertUnitName;
    }

    public void setTransferBatch(String transferBatch) {
        this.transferBatch = transferBatch;
    }

    public void setTransferUnitName(String transferUnitName) {
        this.transferUnitName = transferUnitName;
    }

    public void setDefaultWarehouseCode(String defaultWarehouseCode) {
        this.defaultWarehouseCode = defaultWarehouseCode;
    }

    public void setDefaultLocationCode(String defaultLocationCode) {
        this.defaultLocationCode = defaultLocationCode;
    }

    public void setValidityTime(String validityTime) {
        this.validityTime = validityTime;
    }

    public void setValidityUnit(String validityUnit) {
        this.validityUnit = validityUnit;
    }

    public void setFifoEnabled(String fifoEnabled) {
        this.fifoEnabled = fifoEnabled;
    }

    public void setFifoAttr(String fifoAttr) {
        this.fifoAttr = fifoAttr;
    }

    public void setInventoryAttrDisplay(String inventoryAttrDisplay) {
        this.inventoryAttrDisplay = inventoryAttrDisplay;
    }

    public void setInventoryAttrNotNull(String inventoryAttrNotNull) {
        this.inventoryAttrNotNull = inventoryAttrNotNull;
    }

    public void setInventoryRuleCode(String inventoryRuleCode) {
        this.inventoryRuleCode = inventoryRuleCode;
    }

    public void setProductionUnitName(String productionUnitName) {
        this.productionUnitName = productionUnitName;
    }

    public void setManufactureQualityStatus(String manufactureQualityStatus) {
        this.manufactureQualityStatus = manufactureQualityStatus;
    }

    public void setFeedUnitName(String feedUnitName) {
        this.feedUnitName = feedUnitName;
    }

    public void setPurchaseUnitName(String purchaseUnitName) {
        this.purchaseUnitName = purchaseUnitName;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void setPurchaseAmountMin(String purchaseAmountMin) {
        this.purchaseAmountMin = purchaseAmountMin;
    }

    public void setSourceControl(String sourceControl) {
        this.sourceControl = sourceControl;
    }

    public void setItems(List<MaterialUnitListRequestDTO> items) {
        this.items = items;
    }
}

