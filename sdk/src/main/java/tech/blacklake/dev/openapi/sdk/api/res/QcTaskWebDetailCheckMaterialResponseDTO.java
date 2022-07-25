package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailCheckMaterialResponseDTO {
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
     * 库存类型(1:总体 2:样本)
     */
    private Integer category;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 库存单元号
     */
    private String qrCode;

    /**
     * 批次号
     */
    private String batchNumber;

    /**
     * 质量状态
     */
    private Integer qcStatus;

    /**
     * 存储位置
     */
    private MaterialLocationResponseDTO location;

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

    public Integer getCategory() {
        return category;
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

    public String getBatchNumber() {
        return batchNumber;
    }

    public Integer getQcStatus() {
        return qcStatus;
    }

    public MaterialLocationResponseDTO getLocation() {
        return location;
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

    public void setCategory(Integer category) {
        this.category = category;
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

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setQcStatus(Integer qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setLocation(MaterialLocationResponseDTO location) {
        this.location = location;
    }

    public void setBizKey(Object bizKey) {
        this.bizKey = bizKey;
    }
}

