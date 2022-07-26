package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialFeedApplyItemRequestDTO {
    /**
     * 投料申请数量
     */
    private BigDecimal opeAmount;

    /**
     * 投料申请单位
     */
    private long opeUnitId = 0;

    /**
     * 物料质量状态
     */
    private int qcStatus = 0;

    /**
     * 仓储位置
     */
    private long locationId = 0;

    /**
     * 库存标识码
     */
    private String qrCode;

    /**
     * 批次码
     */
    private String batchNo;

    /**
     * 批次码Id
     */
    private Long batchNoId;

    public BigDecimal getOpeAmount() {
        return opeAmount;
    }

    public long getOpeUnitId() {
        return opeUnitId;
    }

    public int getQcStatus() {
        return qcStatus;
    }

    public long getLocationId() {
        return locationId;
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

    public void setOpeAmount(BigDecimal opeAmount) {
        this.opeAmount = opeAmount;
    }

    public void setOpeUnitId(long opeUnitId) {
        this.opeUnitId = opeUnitId;
    }

    public void setQcStatus(int qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
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
}

