package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AmountResponseDTO {
    /**
     * 数量
     */
    private String amount;

    /**
     * 单位
     */
    private UnitDetailResponseDTO unit;

    public String getAmount() {
        return amount;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }
}

