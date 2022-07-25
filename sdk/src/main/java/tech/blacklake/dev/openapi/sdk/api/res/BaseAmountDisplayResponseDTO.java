package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BaseAmountDisplayResponseDTO {
    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 数量展示
     */
    private String amountDisplay;

    /**
     * 单位ID
     */
    private Long unitId;

    /**
     * 单位编号
     */
    private String unitCode;

    /**
     * 单位名称
     */
    private String unitName;

    public BigDecimal getAmount() {
        return amount;
    }

    public String getAmountDisplay() {
        return amountDisplay;
    }

    public Long getUnitId() {
        return unitId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setAmountDisplay(String amountDisplay) {
        this.amountDisplay = amountDisplay;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}

