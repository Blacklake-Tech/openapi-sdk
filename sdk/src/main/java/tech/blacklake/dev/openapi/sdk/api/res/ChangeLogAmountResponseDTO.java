package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ChangeLogAmountResponseDTO {
    /**
     * 变动方向
     */
    private Boolean direction;

    /**
     * 变动数量
     */
    private InventoryAmountResponseDTO amount;

    /**
     * 结余数量
     */
    private InventoryAmountResponseDTO afterAmount;

    /**
     * 辅助单位数量
     */
    private List<InventoryAmountResponseDTO> auxAmounts;

    public Boolean getDirection() {
        return direction;
    }

    public InventoryAmountResponseDTO getAmount() {
        return amount;
    }

    public InventoryAmountResponseDTO getAfterAmount() {
        return afterAmount;
    }

    public List<InventoryAmountResponseDTO> getAuxAmounts() {
        return auxAmounts;
    }

    public void setDirection(Boolean direction) {
        this.direction = direction;
    }

    public void setAmount(InventoryAmountResponseDTO amount) {
        this.amount = amount;
    }

    public void setAfterAmount(InventoryAmountResponseDTO afterAmount) {
        this.afterAmount = afterAmount;
    }

    public void setAuxAmounts(List<InventoryAmountResponseDTO> auxAmounts) {
        this.auxAmounts = auxAmounts;
    }
}

