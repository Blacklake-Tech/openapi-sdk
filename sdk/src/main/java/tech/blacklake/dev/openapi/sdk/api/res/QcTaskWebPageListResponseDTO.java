package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskWebPageListResponseDTO {
    /**
     * 检验任务id
     */
    private Long id;

    /**
     * 检验任务编号
     */
    private String code;

    /**
     * 业务类型1.入厂检, 2.出厂检, 3.首检, 4.生产检, 5巡检
     */
    private BizConstantDisplay checkType;

    /**
     * 物料id
     */
    private Long materialId;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 检验方案id
     */
    private Long qcConfigSnapshotId;

    /**
     * 检验方案编号
     */
    private String configCode;

    /**
     * 检验方案名称
     */
    private String configName;

    /**
     * 质检状态(0:未开始,1:执行中，2:已结束，3:已取消，4:审核中，5:已拒绝)
     */
    private BizConstantDisplay status;

    /**
     * 结论判定（1.合格2.让不合格3.待检4.不合格）
     */
    private BizConstantDisplay inspectionResult;

    /**
     * 创建人
     */
    private WebUserInfoResponseDTO creator;

    /**
     * 领取状态 0未领取 1已领取
     */
    private BizConstantDisplay getStatus;

    /**
     * 执行人
     */
    private WebUserInfoResponseDTO operator;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 开始时间
     */
    private Long startTime;

    /**
     * 结束时间
     */
    private Long endTime;

    /**
     * 取消时间
     */
    private Long cancelTime;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public BizConstantDisplay getCheckType() {
        return checkType;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public Long getQcConfigSnapshotId() {
        return qcConfigSnapshotId;
    }

    public String getConfigCode() {
        return configCode;
    }

    public String getConfigName() {
        return configName;
    }

    public BizConstantDisplay getStatus() {
        return status;
    }

    public BizConstantDisplay getInspectionResult() {
        return inspectionResult;
    }

    public WebUserInfoResponseDTO getCreator() {
        return creator;
    }

    public BizConstantDisplay getGetStatus() {
        return getStatus;
    }

    public WebUserInfoResponseDTO getOperator() {
        return operator;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public Long getCancelTime() {
        return cancelTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCheckType(BizConstantDisplay checkType) {
        this.checkType = checkType;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setQcConfigSnapshotId(Long qcConfigSnapshotId) {
        this.qcConfigSnapshotId = qcConfigSnapshotId;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }

    public void setInspectionResult(BizConstantDisplay inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    public void setCreator(WebUserInfoResponseDTO creator) {
        this.creator = creator;
    }

    public void setGetStatus(BizConstantDisplay getStatus) {
        this.getStatus = getStatus;
    }

    public void setOperator(WebUserInfoResponseDTO operator) {
        this.operator = operator;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setCancelTime(Long cancelTime) {
        this.cancelTime = cancelTime;
    }
}
