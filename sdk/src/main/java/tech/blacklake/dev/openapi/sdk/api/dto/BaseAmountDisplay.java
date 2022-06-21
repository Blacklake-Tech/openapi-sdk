package tech.blacklake.dev.openapi.sdk.api.dto;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BaseAmountDisplay  {
    /**
     * serialVersionUID
     */
    private long serialVersionUID = 1;

    /**
     * amount
     */
    private BigDecimal amount;

    /**
     * amountDisplay
     */
    private String amountDisplay;

    /**
     * unitId
     */
    private Long unitId;

    /**
     * unitCode
     */
    private String unitCode;

    /**
     * unitName
     */
    private String unitName;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
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

