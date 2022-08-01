package tech.blacklake.dev.openapi.sdk.api.common;

import java.math.BigDecimal;

public class BaseAmount {
    /**
     * serialVersionUID
     */
    private long serialVersionUID = 1L;

    /**
     * amount
     */
    private BigDecimal amount;

    /**
     * unit
     */
    private Unit unit;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}

