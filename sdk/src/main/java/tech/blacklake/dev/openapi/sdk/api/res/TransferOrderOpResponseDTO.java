package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderOpResponseDTO {
    /**
     * 操作类型
     */
    private String type;

    /**
     * 操作成功数
     */
    private long successCount;

    /**
     * 操作失败数
     */
    private long failCount;

    /**
     * 失败明细
     */
    private List<FailedDetailResponseDTO> failDetails;

    public String getType() {
        return type;
    }

    public long getSuccessCount() {
        return successCount;
    }

    public long getFailCount() {
        return failCount;
    }

    public List<FailedDetailResponseDTO> getFailDetails() {
        return failDetails;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSuccessCount(long successCount) {
        this.successCount = successCount;
    }

    public void setFailCount(long failCount) {
        this.failCount = failCount;
    }

    public void setFailDetails(List<FailedDetailResponseDTO> failDetails) {
        this.failDetails = failDetails;
    }
}
