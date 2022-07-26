package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ChangeMaterialQcStatusInventoryAuxAmountRequestDTO {
    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 调整数量（无码库存使用）
     */
    private BigDecimal amount;

    public Long getUnitId() {
        return unitId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

