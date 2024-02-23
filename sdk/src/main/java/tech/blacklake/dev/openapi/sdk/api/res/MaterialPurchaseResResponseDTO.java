package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialPurchaseResResponseDTO {
    /**
     * 工厂ID
     */
    private Long orgId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 采购单位
     */
    private Long purchaseUnitId;

    /**
     * 采购批量
     */
    private BigDecimal purchaseAmount;

    /**
     * 最小采购量
     */
    private BigDecimal purchaseAmountMin;

    /**
     * 货源控制
     */
    private Long sourceControl;

    public Long getOrgId() {
        return orgId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Long getPurchaseUnitId() {
        return purchaseUnitId;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public BigDecimal getPurchaseAmountMin() {
        return purchaseAmountMin;
    }

    public Long getSourceControl() {
        return sourceControl;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setPurchaseUnitId(Long purchaseUnitId) {
        this.purchaseUnitId = purchaseUnitId;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void setPurchaseAmountMin(BigDecimal purchaseAmountMin) {
        this.purchaseAmountMin = purchaseAmountMin;
    }

    public void setSourceControl(Long sourceControl) {
        this.sourceControl = sourceControl;
    }
}
