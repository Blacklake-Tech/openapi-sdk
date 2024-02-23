package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class AmountAdjustRecListRequestDTO extends BasePage {
    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 仓位id
     */
    private Long locationId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 创建时间开始
     */
    private Long createdAtFrom;

    /**
     * 创建时间结束
     */
    private Long createdAtTill;

    public String getQrCode() {
        return qrCode;
    }

    public Long getLocationId() {
        return locationId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public Long getCreatedAtFrom() {
        return createdAtFrom;
    }

    public Long getCreatedAtTill() {
        return createdAtTill;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setCreatedAtTill(Long createdAtTill) {
        this.createdAtTill = createdAtTill;
    }
}
