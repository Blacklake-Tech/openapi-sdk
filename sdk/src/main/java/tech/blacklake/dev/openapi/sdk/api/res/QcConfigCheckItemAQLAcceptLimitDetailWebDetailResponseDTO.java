package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigCheckItemAQLAcceptLimitDetailWebDetailResponseDTO {
    /**
     * 最小批量
     */
    private BigDecimal minBatch;

    /**
     * 最大批量
     */
    private BigDecimal maxBatch;

    /**
     * 样本量
     */
    private BigDecimal sampleCount;

    /**
     * 接收量
     */
    private BigDecimal acceptCount;

    /**
     * 拒收量
     */
    private BigDecimal rejectCount;

    public BigDecimal getMinBatch() {
        return minBatch;
    }

    public BigDecimal getMaxBatch() {
        return maxBatch;
    }

    public BigDecimal getSampleCount() {
        return sampleCount;
    }

    public BigDecimal getAcceptCount() {
        return acceptCount;
    }

    public BigDecimal getRejectCount() {
        return rejectCount;
    }

    public void setMinBatch(BigDecimal minBatch) {
        this.minBatch = minBatch;
    }

    public void setMaxBatch(BigDecimal maxBatch) {
        this.maxBatch = maxBatch;
    }

    public void setSampleCount(BigDecimal sampleCount) {
        this.sampleCount = sampleCount;
    }

    public void setAcceptCount(BigDecimal acceptCount) {
        this.acceptCount = acceptCount;
    }

    public void setRejectCount(BigDecimal rejectCount) {
        this.rejectCount = rejectCount;
    }
}
