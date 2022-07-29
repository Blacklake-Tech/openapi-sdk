package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PlanOrderCloseResponseDTO  {
    /**
     * 完工数
     */
    private int successAmount = 0;

    /**
     * 失败数
     */
    private int failAmount = 0;

    /**
     * 结果集
     */
    private List<PlanOrderFailedResultResponseDTO> failResults;

    public int getSuccessAmount() {
        return successAmount;
    }

    public int getFailAmount() {
        return failAmount;
    }

    public List<PlanOrderFailedResultResponseDTO> getFailResults() {
        return failResults;
    }

    public void setSuccessAmount(int successAmount) {
        this.successAmount = successAmount;
    }

    public void setFailAmount(int failAmount) {
        this.failAmount = failAmount;
    }

    public void setFailResults(List<PlanOrderFailedResultResponseDTO> failResults) {
        this.failResults = failResults;
    }
}

