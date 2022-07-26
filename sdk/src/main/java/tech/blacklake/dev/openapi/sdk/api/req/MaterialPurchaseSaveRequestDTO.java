package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialPurchaseSaveRequestDTO {
    /**
     * 物料ID，必填
     */
    private long materialId;

    /**
     * 采购单位，必填
     */
    private MaterialPurchaseUnitDetailRequestDTO purchaseUnit;

    /**
     * 采购批量，非必填，数值类型
     */
    private BigDecimal purchaseAmount;

    /**
     * 最小采购量，非必填，数值类型
     */
    private BigDecimal purchaseAmountMin;

    /**
     * 货源控制，必填，0否，1是
     */
    private int sourceControl;

    public long getMaterialId() {
        return materialId;
    }

    public MaterialPurchaseUnitDetailRequestDTO getPurchaseUnit() {
        return purchaseUnit;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public BigDecimal getPurchaseAmountMin() {
        return purchaseAmountMin;
    }

    public int getSourceControl() {
        return sourceControl;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setPurchaseUnit(MaterialPurchaseUnitDetailRequestDTO purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void setPurchaseAmountMin(BigDecimal purchaseAmountMin) {
        this.purchaseAmountMin = purchaseAmountMin;
    }

    public void setSourceControl(int sourceControl) {
        this.sourceControl = sourceControl;
    }
}

