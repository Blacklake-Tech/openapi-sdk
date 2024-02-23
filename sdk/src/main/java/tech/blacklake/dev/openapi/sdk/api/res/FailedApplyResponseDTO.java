package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FailedApplyResponseDTO {
    /**
     * 投料申请id
     */
    private long id;

    /**
     * 投料申请数量
     */
    private BaseAmountDisplay opeAmount;

    /**
     * 物料质量状态
     */
    private BizConstantDisplay qcStatus;

    /**
     * 仓储位置
     */
    private StorageLocationResponseDTO location;

    /**
     * 库存标识码
     */
    private String qrCode;

    /**
     * 批次码
     */
    private String batchNo;

    /**
     * 批次码ID
     */
    private Long batchNoId;

    /**
     * 子项类型
     */
    private Boolean alternativeFlag;

    /**
     * 被替代物料名称
     */
    private String originalAlternativeMaterialName;

    /**
     * 被替代物料编号
     */
    private String originalAlternativeMaterialCode;

    /**
     * 申请人员
     */
    private UserBaseResponseDTO applyUser;

    /**
     * 申请时间
     */
    private long applyTime;

    public long getId() {
        return id;
    }

    public BaseAmountDisplay getOpeAmount() {
        return opeAmount;
    }

    public BizConstantDisplay getQcStatus() {
        return qcStatus;
    }

    public StorageLocationResponseDTO getLocation() {
        return location;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Long getBatchNoId() {
        return batchNoId;
    }

    public Boolean getAlternativeFlag() {
        return alternativeFlag;
    }

    public String getOriginalAlternativeMaterialName() {
        return originalAlternativeMaterialName;
    }

    public String getOriginalAlternativeMaterialCode() {
        return originalAlternativeMaterialCode;
    }

    public UserBaseResponseDTO getApplyUser() {
        return applyUser;
    }

    public long getApplyTime() {
        return applyTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOpeAmount(BaseAmountDisplay opeAmount) {
        this.opeAmount = opeAmount;
    }

    public void setQcStatus(BizConstantDisplay qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setLocation(StorageLocationResponseDTO location) {
        this.location = location;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setBatchNoId(Long batchNoId) {
        this.batchNoId = batchNoId;
    }

    public void setAlternativeFlag(Boolean alternativeFlag) {
        this.alternativeFlag = alternativeFlag;
    }

    public void setOriginalAlternativeMaterialName(String originalAlternativeMaterialName) {
        this.originalAlternativeMaterialName = originalAlternativeMaterialName;
    }

    public void setOriginalAlternativeMaterialCode(String originalAlternativeMaterialCode) {
        this.originalAlternativeMaterialCode = originalAlternativeMaterialCode;
    }

    public void setApplyUser(UserBaseResponseDTO applyUser) {
        this.applyUser = applyUser;
    }

    public void setApplyTime(long applyTime) {
        this.applyTime = applyTime;
    }
}
