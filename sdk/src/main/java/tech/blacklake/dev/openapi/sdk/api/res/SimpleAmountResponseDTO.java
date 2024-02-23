package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class SimpleAmountResponseDTO {
    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 单位
     */
    private long unitId;

    public BigDecimal getAmount() {
        return amount;
    }

    public long getUnitId() {
        return unitId;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }
}
