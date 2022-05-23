package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BulkOperationResponseDTO  {
    /**
     * 失败数量
     */
    private Integer failCount;

    /**
     * 成功数量
     */
    private Integer successCount;

    /**
     * 失败详细信息
     */
    private List<FailDetailResponseDTO> failDetails;

    public Integer getFailCount() {
        return failCount;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public List<FailDetailResponseDTO> getFailDetails() {
        return failDetails;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public void setFailDetails(List<FailDetailResponseDTO> failDetails) {
        this.failDetails = failDetails;
    }
}

