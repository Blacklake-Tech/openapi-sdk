package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class UnitConversionResponseDTO {
    /**
     * 基本单位转换系数
     */
    private BigDecimal fromUnitCount;

    /**
     * 基本单位id
     */
    private long fromUnitId = 0;

    /**
     * 转换单位转换系数
     */
    private BigDecimal toUnitCount;

    /**
     * 转换单位id
     */
    private long toUnitId = 0;

    public BigDecimal getFromUnitCount() {
        return fromUnitCount;
    }

    public long getFromUnitId() {
        return fromUnitId;
    }

    public BigDecimal getToUnitCount() {
        return toUnitCount;
    }

    public long getToUnitId() {
        return toUnitId;
    }

    public void setFromUnitCount(BigDecimal fromUnitCount) {
        this.fromUnitCount = fromUnitCount;
    }

    public void setFromUnitId(long fromUnitId) {
        this.fromUnitId = fromUnitId;
    }

    public void setToUnitCount(BigDecimal toUnitCount) {
        this.toUnitCount = toUnitCount;
    }

    public void setToUnitId(long toUnitId) {
        this.toUnitId = toUnitId;
    }
}

