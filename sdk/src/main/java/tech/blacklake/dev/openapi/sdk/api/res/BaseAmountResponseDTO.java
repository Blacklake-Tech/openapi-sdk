package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

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

