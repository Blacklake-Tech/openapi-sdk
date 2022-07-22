package tech.blacklake.dev.openapi.sdk.newApi.api.dto;

import java.math.BigDecimal;

public class BaseAmountDisplay {
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

