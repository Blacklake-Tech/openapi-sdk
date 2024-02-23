package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ChangeMaterialQcStatusInventoryRequestDTO {
    /**
     * 库存id
     */
    private Long id;

    /**
     * 库存version
     */
    private Long version;

    /**
     * 调整数量（无码库存使用）
     */
    private BigDecimal amount;

    /**
     * 辅助数量（无码库存使用）
     */
    private List<ChangeMaterialQcStatusInventoryAuxAmountRequestDTO> auxAmounts;

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public List<ChangeMaterialQcStatusInventoryAuxAmountRequestDTO> getAuxAmounts() {
        return auxAmounts;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setAuxAmounts(List<ChangeMaterialQcStatusInventoryAuxAmountRequestDTO> auxAmounts) {
        this.auxAmounts = auxAmounts;
    }
}
