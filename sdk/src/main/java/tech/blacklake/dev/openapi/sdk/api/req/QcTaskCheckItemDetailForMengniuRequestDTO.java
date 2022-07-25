package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskCheckItemDetailForMengniuRequestDTO extends CustomFieldBaseCO {
    /**
     * 是否复检
     */
    private Boolean reCheck;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 检验项编号
     */
    private String checkItemCode;

    /**
     * 检验项id
     */
    private Long checkItemId;

    /**
     * 检验项名称
     */
    private String checkItemName;

    /**
     * 检验项分类id
     */
    private Long checkItemCategoryId;

    /**
     * 检验项分类名称
     */
    private String checkItemCategoryName;

    /**
     * 检验项格式（1.数值，2.文本, 3.百分比,4.单选项 ,5.多选项,6.记录次品数,7.多行文本）
     */
    private Integer executeItemType;

    /**
     * 标准值
     */
    private BigDecimal base;

    /**
     * 标准值逻辑（1.区间 2.小于 3.大于 4.等于 5.小于等于 6.大于等于 7:允差 8:空）
     */
    private Integer logic;

    /**
     * 标准值单位名称
     */
    private String unitName;

    /**
     * 标准值单位id
     */
    private Long unitId;

    /**
     * 最小值&下偏差 (同一个字段)
     */
    private BigDecimal min;

    /**
     * 最大值&上偏差 (同一个字段)
     */
    private BigDecimal max;

    /**
     * 实测值精度(1执行项格式=数值时，最大6； 2执行项格式=百分比时，最大4)
     */
    private Integer scale;

    /**
     * 实测值格式（1.单一数值,2.数值区间）
     */
    private Integer checkValueType;

    /**
     * 抽检类型（0.无1.比例抽检2.固定抽检3.国标aql4.自定义aql5.执行时设置）
     */
    private Integer checkCountType;

    /**
     * 国标AQL检验水平：(特殊检验水平S-1：1，特殊检验水平S-2：2，特殊检验水平S-3：3，特殊检验水平S-4：4，一般检验水平I：5，一般检验水平II：6，一般检验水平III：7)
     */
    private Integer qcAqlInspectionLevel;

    /**
     * 国标AQL检验水平id
     */
    private Long qcAqlInspectionLevelId;

    /**
     * 国标AQL检验严格度类型（ 1正常检验, 2加严检验, 3放宽检验）
     */
    private Integer qcAqlCategory;

    /**
     * 国标接收质量限(0.01、0.015、0.025、0.04、0.065、0.1、0.15、0.25、0.4、0.65、1、1.5、2.5、4、6.5、10、15、25、40、65)
     */
    private String qcAql;

    /**
     * 国标接收质量限id
     */
    private Long qcAqlId;

    /**
     * 自定义AQL方案
     */
    private String customAqlName;

    /**
     * 自定义AQL方案id
     */
    private Long customAqlId;

    /**
     * 接收质量限
     */
    private String customAqlAcceptLimit;

    /**
     * 自定义AQL接收质量限id
     */
    private Long customAqlAcceptLimitId;

    /**
     * 不良原因(名称)
     */
    private List<QcTaskSaveForMengniuSimpleNameRequestDTO> defectReasons;

    /**
     * 不良等级(名称)
     */
    private List<QcTaskSaveForMengniuSimpleNameRequestDTO> defectRanks;

    /**
     * 检验设备(编号)
     */
    private List<QcTaskSaveForMengniuSimpleCodeRequestDTO> equipments;

    /**
     * 单一默认值
     */
    private String defaultValue;

    /**
     * 默认最大值
     */
    private BigDecimal defaultMax;

    /**
     * 默认最小值
     */
    private BigDecimal defaultMin;

    /**
     * 附加结论(1平均值,2标准偏差)
     */
    private List<Integer> extraResults;

    /**
     * 检验项填写规则（1必填 2非必填）
     */
    private Integer recordCheckItemType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 执行时可填写备注
     */
    private Boolean executeRemark;

    /**
     * 执行时可上传图片
     */
    private Boolean executeUpload;

    /**
     * 创建人编号
     */
    private String creatorCode;

    /**
     * 创建人Id
     */
    private Long creatorId;

    /**
     * 创建时间
     */
    private Long createAt;

    /**
     * 抽检数量
     */
    private BigDecimal checkCount;

    /**
     * 选项
     */
    private List<String> radios;

    /**
     * 合格选项
     */
    private List<String> qualityItems;

    /**
     * 单一实测值(检验项记录)
     */
    private String singleValue;

    /**
     * 实测值左区间/最小值(检验项记录)
     */
    private BigDecimal valueMin;

    /**
     * 实测值右区间/最大值(检验项记录)
     */
    private BigDecimal valueMax;

    /**
     * 不良信息(检验项记录)
     */
    private List<QcTaskDefectForMengniuRequestDTO> defects;

    /**
     * 单项判定(检验项记录)
     */
    private Boolean checkResult;

    public Boolean getReCheck() {
        return reCheck;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getCheckItemCode() {
        return checkItemCode;
    }

    public Long getCheckItemId() {
        return checkItemId;
    }

    public String getCheckItemName() {
        return checkItemName;
    }

    public Long getCheckItemCategoryId() {
        return checkItemCategoryId;
    }

    public String getCheckItemCategoryName() {
        return checkItemCategoryName;
    }

    public Integer getExecuteItemType() {
        return executeItemType;
    }

    public BigDecimal getBase() {
        return base;
    }

    public Integer getLogic() {
        return logic;
    }

    public String getUnitName() {
        return unitName;
    }

    public Long getUnitId() {
        return unitId;
    }

    public BigDecimal getMin() {
        return min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public Integer getScale() {
        return scale;
    }

    public Integer getCheckValueType() {
        return checkValueType;
    }

    public Integer getCheckCountType() {
        return checkCountType;
    }

    public Integer getQcAqlInspectionLevel() {
        return qcAqlInspectionLevel;
    }

    public Long getQcAqlInspectionLevelId() {
        return qcAqlInspectionLevelId;
    }

    public Integer getQcAqlCategory() {
        return qcAqlCategory;
    }

    public String getQcAql() {
        return qcAql;
    }

    public Long getQcAqlId() {
        return qcAqlId;
    }

    public String getCustomAqlName() {
        return customAqlName;
    }

    public Long getCustomAqlId() {
        return customAqlId;
    }

    public String getCustomAqlAcceptLimit() {
        return customAqlAcceptLimit;
    }

    public Long getCustomAqlAcceptLimitId() {
        return customAqlAcceptLimitId;
    }

    public List<QcTaskSaveForMengniuSimpleNameRequestDTO> getDefectReasons() {
        return defectReasons;
    }

    public List<QcTaskSaveForMengniuSimpleNameRequestDTO> getDefectRanks() {
        return defectRanks;
    }

    public List<QcTaskSaveForMengniuSimpleCodeRequestDTO> getEquipments() {
        return equipments;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public BigDecimal getDefaultMax() {
        return defaultMax;
    }

    public BigDecimal getDefaultMin() {
        return defaultMin;
    }

    public List<Integer> getExtraResults() {
        return extraResults;
    }

    public Integer getRecordCheckItemType() {
        return recordCheckItemType;
    }

    public String getRemark() {
        return remark;
    }

    public Boolean getExecuteRemark() {
        return executeRemark;
    }

    public Boolean getExecuteUpload() {
        return executeUpload;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public BigDecimal getCheckCount() {
        return checkCount;
    }

    public List<String> getRadios() {
        return radios;
    }

    public List<String> getQualityItems() {
        return qualityItems;
    }

    public String getSingleValue() {
        return singleValue;
    }

    public BigDecimal getValueMin() {
        return valueMin;
    }

    public BigDecimal getValueMax() {
        return valueMax;
    }

    public List<QcTaskDefectForMengniuRequestDTO> getDefects() {
        return defects;
    }

    public Boolean getCheckResult() {
        return checkResult;
    }

    public void setReCheck(Boolean reCheck) {
        this.reCheck = reCheck;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCheckItemCode(String checkItemCode) {
        this.checkItemCode = checkItemCode;
    }

    public void setCheckItemId(Long checkItemId) {
        this.checkItemId = checkItemId;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
    }

    public void setCheckItemCategoryId(Long checkItemCategoryId) {
        this.checkItemCategoryId = checkItemCategoryId;
    }

    public void setCheckItemCategoryName(String checkItemCategoryName) {
        this.checkItemCategoryName = checkItemCategoryName;
    }

    public void setExecuteItemType(Integer executeItemType) {
        this.executeItemType = executeItemType;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public void setCheckValueType(Integer checkValueType) {
        this.checkValueType = checkValueType;
    }

    public void setCheckCountType(Integer checkCountType) {
        this.checkCountType = checkCountType;
    }

    public void setQcAqlInspectionLevel(Integer qcAqlInspectionLevel) {
        this.qcAqlInspectionLevel = qcAqlInspectionLevel;
    }

    public void setQcAqlInspectionLevelId(Long qcAqlInspectionLevelId) {
        this.qcAqlInspectionLevelId = qcAqlInspectionLevelId;
    }

    public void setQcAqlCategory(Integer qcAqlCategory) {
        this.qcAqlCategory = qcAqlCategory;
    }

    public void setQcAql(String qcAql) {
        this.qcAql = qcAql;
    }

    public void setQcAqlId(Long qcAqlId) {
        this.qcAqlId = qcAqlId;
    }

    public void setCustomAqlName(String customAqlName) {
        this.customAqlName = customAqlName;
    }

    public void setCustomAqlId(Long customAqlId) {
        this.customAqlId = customAqlId;
    }

    public void setCustomAqlAcceptLimit(String customAqlAcceptLimit) {
        this.customAqlAcceptLimit = customAqlAcceptLimit;
    }

    public void setCustomAqlAcceptLimitId(Long customAqlAcceptLimitId) {
        this.customAqlAcceptLimitId = customAqlAcceptLimitId;
    }

    public void setDefectReasons(List<QcTaskSaveForMengniuSimpleNameRequestDTO> defectReasons) {
        this.defectReasons = defectReasons;
    }

    public void setDefectRanks(List<QcTaskSaveForMengniuSimpleNameRequestDTO> defectRanks) {
        this.defectRanks = defectRanks;
    }

    public void setEquipments(List<QcTaskSaveForMengniuSimpleCodeRequestDTO> equipments) {
        this.equipments = equipments;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setDefaultMax(BigDecimal defaultMax) {
        this.defaultMax = defaultMax;
    }

    public void setDefaultMin(BigDecimal defaultMin) {
        this.defaultMin = defaultMin;
    }

    public void setExtraResults(List<Integer> extraResults) {
        this.extraResults = extraResults;
    }

    public void setRecordCheckItemType(Integer recordCheckItemType) {
        this.recordCheckItemType = recordCheckItemType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setExecuteRemark(Boolean executeRemark) {
        this.executeRemark = executeRemark;
    }

    public void setExecuteUpload(Boolean executeUpload) {
        this.executeUpload = executeUpload;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public void setCheckCount(BigDecimal checkCount) {
        this.checkCount = checkCount;
    }

    public void setRadios(List<String> radios) {
        this.radios = radios;
    }

    public void setQualityItems(List<String> qualityItems) {
        this.qualityItems = qualityItems;
    }

    public void setSingleValue(String singleValue) {
        this.singleValue = singleValue;
    }

    public void setValueMin(BigDecimal valueMin) {
        this.valueMin = valueMin;
    }

    public void setValueMax(BigDecimal valueMax) {
        this.valueMax = valueMax;
    }

    public void setDefects(List<QcTaskDefectForMengniuRequestDTO> defects) {
        this.defects = defects;
    }

    public void setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
    }
}

