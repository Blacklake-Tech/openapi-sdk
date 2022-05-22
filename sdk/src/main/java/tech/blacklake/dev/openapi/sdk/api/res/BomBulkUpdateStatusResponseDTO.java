package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomBulkUpdateStatusResponseDTO  {
    /**
     * 成功数量
     */
    private Integer successCount;

    /**
     * 失败数量
     */
    private Integer failCount;

    /**
     * 失败详情
     */
    private List<BomBulkUpdateStatusDetailResponseDTO> failDetails;

    public Integer getSuccessCount() {
        return successCount;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public List<BomBulkUpdateStatusDetailResponseDTO> getFailDetails() {
        return failDetails;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public void setFailDetails(List<BomBulkUpdateStatusDetailResponseDTO> failDetails) {
        this.failDetails = failDetails;
    }
}

