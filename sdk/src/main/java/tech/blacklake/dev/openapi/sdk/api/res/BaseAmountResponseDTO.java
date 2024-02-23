package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BaseAmountResponseDTO {
    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 单位
     */
    private UnitResponseDTO unit;

    public BigDecimal getAmount() {
        return amount;
    }

    public UnitResponseDTO getUnit() {
        return unit;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnit(UnitResponseDTO unit) {
        this.unit = unit;
    }
}
