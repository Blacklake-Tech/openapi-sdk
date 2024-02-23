package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderFailedResultResponseDTO {
    /**
     * 业务id
     */
    private long planOrderId;

    /**
     * 计划订单编号
     */
    private String planOrderCode;

    /**
     * 失败原因
     */
    private String failedReason;

    public long getPlanOrderId() {
        return planOrderId;
    }

    public String getPlanOrderCode() {
        return planOrderCode;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setPlanOrderId(long planOrderId) {
        this.planOrderId = planOrderId;
    }

    public void setPlanOrderCode(String planOrderCode) {
        this.planOrderCode = planOrderCode;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }
}
