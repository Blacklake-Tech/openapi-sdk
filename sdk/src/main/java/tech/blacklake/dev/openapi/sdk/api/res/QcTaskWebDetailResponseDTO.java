package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 检验任务id
     */
    private Long id;

    /**
     * 检验任务编号
     */
    private String code;

    /**
     * 任务状态(0:未开始,1:执行中，2:已结束，3:已取消，4:审核中，5:已拒绝)
     */
    private BizConstantDisplay status;

    /**
     * 检验任务执行人
     */
    private WebUserInfoResponseDTO operator;

    /**
     * 领取状态 0未领取 1已领取
     */
    private BizConstantDisplay getStatus;

    /**
     * 可领取人(候选人)
     */
    private List<WebUserInfoResponseDTO> candidates;

    /**
     * 开始时间
     */
    private Long beginTime;

    /**
     * 结束时间
     */
    private Long endTime;

    /**
     * 物料
     */
    private QcTaskDetailWebMaterialResponseDTO material;

    /**
     * 供应商
     */
    private SimpleCodeNameIdResponseDTO supplier;

    /**
     * 客户
     */
    private SimpleCodeNameIdResponseDTO customer;

    /**
     * 工序
     */
    private SimpleCodeNameIdResponseDTO process;

    /**
     * 设备
     */
    private SimpleCodeNameIdResponseDTO equipment;

    /**
     * 质检方案
     */
    private QcTaskWebDetailConfigResponseDTO qcConfig;

    /**
     * 检验范围
     */
    private QcTaskWebDetailRangeResponseDTO qcTaskRange;

    /**
     * 质检项详情列表
     */
    private List<QcTaskWebDetailCheckItemResponseDTO> checkItems;

    /**
     * 样本库存
     */
    private List<QcTaskWebDetailSampleMaterialResponseDTO> sampleMaterials;

    /**
     * 总体库存
     */
    private List<QcTaskWebDetailCheckMaterialResponseDTO> checkMaterials;

    /**
     * 样本数量（所有库存明细中置为样本的总数量，检验单位）
     */
    private BigDecimal qcSample;

    /**
     * 总体数量（所有库存明细的总数量，检验单位）
     */
    private BigDecimal qcTotal;

    /**
     * 检验任务总抽样量
     */
    private BigDecimal checkCount;

    /**
     * 合格数
     */
    private BigDecimal qualifiedCount;

    /**
     * 合格率
     */
    private BigDecimal qualifiedRate;

    /**
     * 让步合格数
     */
    private BigDecimal qualifiedConcessionCount;

    /**
     * 让步合格率
     */
    private BigDecimal qualifiedConcessionRate;

    /**
     * 不合格数
     */
    private BigDecimal defectCount;

    /**
     * 不合格率
     */
    private BigDecimal defectRate;

    /**
     * 待检数
     */
    private BigDecimal pendingCount;

    /**
     * 待检率
     */
    private BigDecimal pendingRate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 结论判定（1.合格2.让不合格3.待检4.不合格）
     */
    private BizConstantDisplay inspectionResult;

    /**
     * 业务类型 1.入厂检 2.出厂检 3.首检 4.生产检 5.巡检）
     */
    private BizConstantDisplay checkType;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 物料主单位
     */
    private QcTaskWebUnitResponseDTO unit;

    /**
     * 质检单位
     */
    private QcTaskWebUnitResponseDTO qcUnit;

    /**
     * 取消时间
     */
    private Long cancelTime;

    /**
     * 批号
     */
    private String batchNumber;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public BizConstantDisplay getStatus() {
        return status;
    }

    public WebUserInfoResponseDTO getOperator() {
        return operator;
    }

    public BizConstantDisplay getGetStatus() {
        return getStatus;
    }

    public List<WebUserInfoResponseDTO> getCandidates() {
        return candidates;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public QcTaskDetailWebMaterialResponseDTO getMaterial() {
        return material;
    }

    public SimpleCodeNameIdResponseDTO getSupplier() {
        return supplier;
    }

    public SimpleCodeNameIdResponseDTO getCustomer() {
        return customer;
    }

    public SimpleCodeNameIdResponseDTO getProcess() {
        return process;
    }

    public SimpleCodeNameIdResponseDTO getEquipment() {
        return equipment;
    }

    public QcTaskWebDetailConfigResponseDTO getQcConfig() {
        return qcConfig;
    }

    public QcTaskWebDetailRangeResponseDTO getQcTaskRange() {
        return qcTaskRange;
    }

    public List<QcTaskWebDetailCheckItemResponseDTO> getCheckItems() {
        return checkItems;
    }

    public List<QcTaskWebDetailSampleMaterialResponseDTO> getSampleMaterials() {
        return sampleMaterials;
    }

    public List<QcTaskWebDetailCheckMaterialResponseDTO> getCheckMaterials() {
        return checkMaterials;
    }

    public BigDecimal getQcSample() {
        return qcSample;
    }

    public BigDecimal getQcTotal() {
        return qcTotal;
    }

    public BigDecimal getCheckCount() {
        return checkCount;
    }

    public BigDecimal getQualifiedCount() {
        return qualifiedCount;
    }

    public BigDecimal getQualifiedRate() {
        return qualifiedRate;
    }

    public BigDecimal getQualifiedConcessionCount() {
        return qualifiedConcessionCount;
    }

    public BigDecimal getQualifiedConcessionRate() {
        return qualifiedConcessionRate;
    }

    public BigDecimal getDefectCount() {
        return defectCount;
    }

    public BigDecimal getDefectRate() {
        return defectRate;
    }

    public BigDecimal getPendingCount() {
        return pendingCount;
    }

    public BigDecimal getPendingRate() {
        return pendingRate;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getInspectionResult() {
        return inspectionResult;
    }

    public BizConstantDisplay getCheckType() {
        return checkType;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public QcTaskWebUnitResponseDTO getUnit() {
        return unit;
    }

    public QcTaskWebUnitResponseDTO getQcUnit() {
        return qcUnit;
    }

    public Long getCancelTime() {
        return cancelTime;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }

    public void setOperator(WebUserInfoResponseDTO operator) {
        this.operator = operator;
    }

    public void setGetStatus(BizConstantDisplay getStatus) {
        this.getStatus = getStatus;
    }

    public void setCandidates(List<WebUserInfoResponseDTO> candidates) {
        this.candidates = candidates;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setMaterial(QcTaskDetailWebMaterialResponseDTO material) {
        this.material = material;
    }

    public void setSupplier(SimpleCodeNameIdResponseDTO supplier) {
        this.supplier = supplier;
    }

    public void setCustomer(SimpleCodeNameIdResponseDTO customer) {
        this.customer = customer;
    }

    public void setProcess(SimpleCodeNameIdResponseDTO process) {
        this.process = process;
    }

    public void setEquipment(SimpleCodeNameIdResponseDTO equipment) {
        this.equipment = equipment;
    }

    public void setQcConfig(QcTaskWebDetailConfigResponseDTO qcConfig) {
        this.qcConfig = qcConfig;
    }

    public void setQcTaskRange(QcTaskWebDetailRangeResponseDTO qcTaskRange) {
        this.qcTaskRange = qcTaskRange;
    }

    public void setCheckItems(List<QcTaskWebDetailCheckItemResponseDTO> checkItems) {
        this.checkItems = checkItems;
    }

    public void setSampleMaterials(List<QcTaskWebDetailSampleMaterialResponseDTO> sampleMaterials) {
        this.sampleMaterials = sampleMaterials;
    }

    public void setCheckMaterials(List<QcTaskWebDetailCheckMaterialResponseDTO> checkMaterials) {
        this.checkMaterials = checkMaterials;
    }

    public void setQcSample(BigDecimal qcSample) {
        this.qcSample = qcSample;
    }

    public void setQcTotal(BigDecimal qcTotal) {
        this.qcTotal = qcTotal;
    }

    public void setCheckCount(BigDecimal checkCount) {
        this.checkCount = checkCount;
    }

    public void setQualifiedCount(BigDecimal qualifiedCount) {
        this.qualifiedCount = qualifiedCount;
    }

    public void setQualifiedRate(BigDecimal qualifiedRate) {
        this.qualifiedRate = qualifiedRate;
    }

    public void setQualifiedConcessionCount(BigDecimal qualifiedConcessionCount) {
        this.qualifiedConcessionCount = qualifiedConcessionCount;
    }

    public void setQualifiedConcessionRate(BigDecimal qualifiedConcessionRate) {
        this.qualifiedConcessionRate = qualifiedConcessionRate;
    }

    public void setDefectCount(BigDecimal defectCount) {
        this.defectCount = defectCount;
    }

    public void setDefectRate(BigDecimal defectRate) {
        this.defectRate = defectRate;
    }

    public void setPendingCount(BigDecimal pendingCount) {
        this.pendingCount = pendingCount;
    }

    public void setPendingRate(BigDecimal pendingRate) {
        this.pendingRate = pendingRate;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setInspectionResult(BizConstantDisplay inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    public void setCheckType(BizConstantDisplay checkType) {
        this.checkType = checkType;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUnit(QcTaskWebUnitResponseDTO unit) {
        this.unit = unit;
    }

    public void setQcUnit(QcTaskWebUnitResponseDTO qcUnit) {
        this.qcUnit = qcUnit;
    }

    public void setCancelTime(Long cancelTime) {
        this.cancelTime = cancelTime;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
}

