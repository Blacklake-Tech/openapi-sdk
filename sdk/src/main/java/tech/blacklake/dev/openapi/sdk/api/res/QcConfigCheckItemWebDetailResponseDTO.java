package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcConfigCheckItemWebDetailResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 检验方案id
     */
    private Long qcConfigVersionId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 检验项分类id
     */
    private Long checkItemCategoryId;

    /**
     * 检验项分类name
     */
    private String checkItemCategoryName;

    /**
     * 检验项id
     */
    private Long checkItemId;

    /**
     * 检验项name
     */
    private String checkItemName;

    /**
     * 检验项编号
     */
    private String checkItemCode;

    /**
     * 检验项备注
     */
    private String checkItemRemark;

    /**
     * 检验项格式（1.数值，2.文本, 3.百分比,4.单选项 ,5.多选项,6.记录次品数,7.多行文本）
     */
    private BizConstantDisplay executeItemType;

    /**
     * 标准值逻辑（1.区间 2.小于 3.大于 4.等于 5.小于等于 6.大于等于 7:允差 8:空）
     */
    private BizConstantDisplay logic;

    /**
     * 检验值精度
     */
    private Integer scale;

    /**
     * 标准值
     */
    private BigDecimal base;

    /**
     * 最大值
     */
    private BigDecimal max;

    /**
     * 最小值
     */
    private BigDecimal min;

    /**
     * 检验数量
     */
    private BigDecimal checkCount;

    /**
     * 可选项
     */
    private List<String> radios;

    /**
     * 合格选项
     */
    private List<String> qualityItems;

    /**
     * 测量值格式（1.单一数值,2.数值区间）
     */
    private BizConstantDisplay checkValueType;

    /**
     * 抽检类型（0.无1.比例抽检,2.固定抽检,3.国标aql,4.自定义aql,5.执行时设置）
     */
    private BizConstantDisplay checkCountType;

    /**
     * 单位
     */
    private QcTaskWebDetailUnitResponseDTO unit;

    /**
     * 备注
     */
    private String remark;

    /**
     * 执行时可填写备注（0.未勾选，1.勾选）
     */
    private BizConstantDisplay executeRemark;

    /**
     * 执行时可上传图片（0.未勾选，1.勾选）
     */
    private BizConstantDisplay executeUpload;

    /**
     * 关联客户
     */
    private List<QcConfigCheckItemCustomerWebDetailResponseDTO> customerList;

    /**
     * 关联不良等级
     */
    private List<QcConfigCheckItemDefectRankWebDetailResponseDTO> defectRankList;

    /**
     * 关联不良原因
     */
    private List<QcConfigCheckItemDefectReasonWebDetailResponseDTO> defectReasonList;

    /**
     * 关联附件
     */
    private List<Long> attachmentIds;

    /**
     * 关联设备
     */
    private List<QcConfigCheckItemEquipmentWebDetailResponseDTO> equipments;

    /**
     * 国标AQL检验水平/自定义AQL方案
     */
    private QcConfigCheckItemAQLWebDetailResponseDTO aqlDetail;

    /**
     * 实际抽样量
     */
    private BigDecimal taskCheckCount;

    /**
     * 检验项填写规则（1必填 2非必填 3不选时默认为良）
     */
    private BizConstantDisplay recordCheckItemType;

    /**
     * (检验结论)附加结论（1平均值,2标准偏差）
     */
    private List<Integer> extraResults;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 默认值-最小值
     */
    private BigDecimal defaultMin;

    /**
     * 默认值-最大值
     */
    private BigDecimal defaultMax;

    /**
     * 总份数
     */
    private Integer totalReportCount;

    /**
     * 必填份数
     */
    private Integer requireReportCount;

    public Long getId() {
        return id;
    }

    public Long getQcConfigVersionId() {
        return qcConfigVersionId;
    }

    public String getGroupName() {
        return groupName;
    }

    public Long getCheckItemCategoryId() {
        return checkItemCategoryId;
    }

    public String getCheckItemCategoryName() {
        return checkItemCategoryName;
    }

    public Long getCheckItemId() {
        return checkItemId;
    }

    public String getCheckItemName() {
        return checkItemName;
    }

    public String getCheckItemCode() {
        return checkItemCode;
    }

    public String getCheckItemRemark() {
        return checkItemRemark;
    }

    public BizConstantDisplay getExecuteItemType() {
        return executeItemType;
    }

    public BizConstantDisplay getLogic() {
        return logic;
    }

    public Integer getScale() {
        return scale;
    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getMax() {
        return max;
    }

    public BigDecimal getMin() {
        return min;
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

    public BizConstantDisplay getCheckValueType() {
        return checkValueType;
    }

    public BizConstantDisplay getCheckCountType() {
        return checkCountType;
    }

    public QcTaskWebDetailUnitResponseDTO getUnit() {
        return unit;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getExecuteRemark() {
        return executeRemark;
    }

    public BizConstantDisplay getExecuteUpload() {
        return executeUpload;
    }

    public List<QcConfigCheckItemCustomerWebDetailResponseDTO> getCustomerList() {
        return customerList;
    }

    public List<QcConfigCheckItemDefectRankWebDetailResponseDTO> getDefectRankList() {
        return defectRankList;
    }

    public List<QcConfigCheckItemDefectReasonWebDetailResponseDTO> getDefectReasonList() {
        return defectReasonList;
    }

    public List<Long> getAttachmentIds() {
        return attachmentIds;
    }

    public List<QcConfigCheckItemEquipmentWebDetailResponseDTO> getEquipments() {
        return equipments;
    }

    public QcConfigCheckItemAQLWebDetailResponseDTO getAqlDetail() {
        return aqlDetail;
    }

    public BigDecimal getTaskCheckCount() {
        return taskCheckCount;
    }

    public BizConstantDisplay getRecordCheckItemType() {
        return recordCheckItemType;
    }

    public List<Integer> getExtraResults() {
        return extraResults;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public BigDecimal getDefaultMin() {
        return defaultMin;
    }

    public BigDecimal getDefaultMax() {
        return defaultMax;
    }

    public Integer getTotalReportCount() {
        return totalReportCount;
    }

    public Integer getRequireReportCount() {
        return requireReportCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQcConfigVersionId(Long qcConfigVersionId) {
        this.qcConfigVersionId = qcConfigVersionId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCheckItemCategoryId(Long checkItemCategoryId) {
        this.checkItemCategoryId = checkItemCategoryId;
    }

    public void setCheckItemCategoryName(String checkItemCategoryName) {
        this.checkItemCategoryName = checkItemCategoryName;
    }

    public void setCheckItemId(Long checkItemId) {
        this.checkItemId = checkItemId;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
    }

    public void setCheckItemCode(String checkItemCode) {
        this.checkItemCode = checkItemCode;
    }

    public void setCheckItemRemark(String checkItemRemark) {
        this.checkItemRemark = checkItemRemark;
    }

    public void setExecuteItemType(BizConstantDisplay executeItemType) {
        this.executeItemType = executeItemType;
    }

    public void setLogic(BizConstantDisplay logic) {
        this.logic = logic;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
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

    public void setCheckValueType(BizConstantDisplay checkValueType) {
        this.checkValueType = checkValueType;
    }

    public void setCheckCountType(BizConstantDisplay checkCountType) {
        this.checkCountType = checkCountType;
    }

    public void setUnit(QcTaskWebDetailUnitResponseDTO unit) {
        this.unit = unit;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setExecuteRemark(BizConstantDisplay executeRemark) {
        this.executeRemark = executeRemark;
    }

    public void setExecuteUpload(BizConstantDisplay executeUpload) {
        this.executeUpload = executeUpload;
    }

    public void setCustomerList(List<QcConfigCheckItemCustomerWebDetailResponseDTO> customerList) {
        this.customerList = customerList;
    }

    public void setDefectRankList(List<QcConfigCheckItemDefectRankWebDetailResponseDTO> defectRankList) {
        this.defectRankList = defectRankList;
    }

    public void setDefectReasonList(List<QcConfigCheckItemDefectReasonWebDetailResponseDTO> defectReasonList) {
        this.defectReasonList = defectReasonList;
    }

    public void setAttachmentIds(List<Long> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setEquipments(List<QcConfigCheckItemEquipmentWebDetailResponseDTO> equipments) {
        this.equipments = equipments;
    }

    public void setAqlDetail(QcConfigCheckItemAQLWebDetailResponseDTO aqlDetail) {
        this.aqlDetail = aqlDetail;
    }

    public void setTaskCheckCount(BigDecimal taskCheckCount) {
        this.taskCheckCount = taskCheckCount;
    }

    public void setRecordCheckItemType(BizConstantDisplay recordCheckItemType) {
        this.recordCheckItemType = recordCheckItemType;
    }

    public void setExtraResults(List<Integer> extraResults) {
        this.extraResults = extraResults;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setDefaultMin(BigDecimal defaultMin) {
        this.defaultMin = defaultMin;
    }

    public void setDefaultMax(BigDecimal defaultMax) {
        this.defaultMax = defaultMax;
    }

    public void setTotalReportCount(Integer totalReportCount) {
        this.totalReportCount = totalReportCount;
    }

    public void setRequireReportCount(Integer requireReportCount) {
        this.requireReportCount = requireReportCount;
    }
}

