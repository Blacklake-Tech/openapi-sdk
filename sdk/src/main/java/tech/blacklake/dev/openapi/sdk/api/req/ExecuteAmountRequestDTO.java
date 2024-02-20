package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ExecuteAmountRequestDTO {
    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 单位
     */
    private long unitId;

    /**
     * 辅助单位
     */
    private List<AuxAmountRequestDTO> auxAmounts;

    public BigDecimal getAmount() {
        return amount;
    }

    public long getUnitId() {
        return unitId;
    }

    public List<AuxAmountRequestDTO> getAuxAmounts() {
        return auxAmounts;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setAuxAmounts(List<AuxAmountRequestDTO> auxAmounts) {
        this.auxAmounts = auxAmounts;
    }
}
