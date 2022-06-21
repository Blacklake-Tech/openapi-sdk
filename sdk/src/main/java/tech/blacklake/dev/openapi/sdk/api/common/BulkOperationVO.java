package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.List;

public class BulkOperationVO<T> {

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
    private List<T> failDetails;

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public List<T> getFailDetails() {
        return failDetails;
    }

    public void setFailDetails(List<T> failDetails) {
        this.failDetails = failDetails;
    }
}
