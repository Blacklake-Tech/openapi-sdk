package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InventoryAmountResponseDTO {
    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 单位
     */
    private UnitDetailResponseDTO unit;

    public BigDecimal getAmount() {
        return amount;
    }

    public Long getUnitId() {
        return unitId;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }
}
