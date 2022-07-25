package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AuxAmountRequestDTO {
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

