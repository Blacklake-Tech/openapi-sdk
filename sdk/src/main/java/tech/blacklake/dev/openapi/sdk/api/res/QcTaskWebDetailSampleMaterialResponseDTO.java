package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailSampleMaterialResponseDTO {
    /**
     * 检验任务-关联库存id
     */
    private Long qcTaskMaterialId;

    /**
     * 数量(主单位)
     */
    private BigDecimal count;

    /**
     * 抽样量(主单位)
     */
    private BigDecimal checkCount;

    /**
     * 数量(质检单位)
     */
    private BigDecimal qcCount;

    /**
     * 抽样量(质检单位)
     */
    private BigDecimal qcCheckCount;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 库存单元编号
     */
    private String qrCode;

    /**
     * 存储位置
     */
    private MaterialLocationResponseDTO location;

    /**
     * 批次号
     */
    private String batchNumber;

    /**
     * 质量状态
     */
    private Integer qcStatus;

    /**
     * 合格数
     */
    private BigDecimal qualifiedCount;

    /**
     * 让步合格数
     */
    private BigDecimal qualifiedConcessionCount;

    /**
     * 不合格数
     */
    private BigDecimal defectCount;

    /**
     * 合格率
     */
    private BigDecimal qualifiedRate;

    /**
     * 让步合格率
     */
    private BigDecimal qualifiedConcessionRate;

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
     * 库存信息
     */
    private Object bizKey;

    public Long getQcTaskMaterialId() {
        return qcTaskMaterialId;
    }

    public BigDecimal getCount() {
        return count;
    }

    public BigDecimal getCheckCount() {
        return checkCount;
    }

    public BigDecimal getQcCount() {
        return qcCount;
    }

    public BigDecimal getQcCheckCount() {
        return qcCheckCount;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getQrCode() {
        return qrCode;
    }

    public MaterialLocationResponseDTO getLocation() {
        return location;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public Integer getQcStatus() {
        return qcStatus;
    }

    public BigDecimal getQualifiedCount() {
        return qualifiedCount;
    }

    public BigDecimal getQualifiedConcessionCount() {
        return qualifiedConcessionCount;
    }

    public BigDecimal getDefectCount() {
        return defectCount;
    }

    public BigDecimal getQualifiedRate() {
        return qualifiedRate;
    }

    public BigDecimal getQualifiedConcessionRate() {
        return qualifiedConcessionRate;
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

    public Object getBizKey() {
        return bizKey;
    }

    public void setQcTaskMaterialId(Long qcTaskMaterialId) {
        this.qcTaskMaterialId = qcTaskMaterialId;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public void setCheckCount(BigDecimal checkCount) {
        this.checkCount = checkCount;
    }

    public void setQcCount(BigDecimal qcCount) {
        this.qcCount = qcCount;
    }

    public void setQcCheckCount(BigDecimal qcCheckCount) {
        this.qcCheckCount = qcCheckCount;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setLocation(MaterialLocationResponseDTO location) {
        this.location = location;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setQcStatus(Integer qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setQualifiedCount(BigDecimal qualifiedCount) {
        this.qualifiedCount = qualifiedCount;
    }

    public void setQualifiedConcessionCount(BigDecimal qualifiedConcessionCount) {
        this.qualifiedConcessionCount = qualifiedConcessionCount;
    }

    public void setDefectCount(BigDecimal defectCount) {
        this.defectCount = defectCount;
    }

    public void setQualifiedRate(BigDecimal qualifiedRate) {
        this.qualifiedRate = qualifiedRate;
    }

    public void setQualifiedConcessionRate(BigDecimal qualifiedConcessionRate) {
        this.qualifiedConcessionRate = qualifiedConcessionRate;
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

    public void setBizKey(Object bizKey) {
        this.bizKey = bizKey;
    }
}

