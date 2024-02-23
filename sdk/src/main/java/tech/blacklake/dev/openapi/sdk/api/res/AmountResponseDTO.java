package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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
