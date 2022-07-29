package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedApplyListResponseDTO {
    /**
     * 工单ID
     */
    private Long workOrderId;

    /**
     * 任务ID
     */
    private long taskId = 0L;

    /**
     * 投料申请ID
     */
    private long applyId = 0L;

    /**
     * 投料申请状态(0处理中 1失败 2成功)
     */
    private BizConstantDisplay applyStatus;

    /**
     * 失败申请信息
     */
    private FailedApplyResponseDTO failedApply;

    /**
     * 物料信息
     */
    private FeedApplyMaterialBaseResponseDTO feedMaterial;

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public long getTaskId() {
        return taskId;
    }

    public long getApplyId() {
        return applyId;
    }

    public BizConstantDisplay getApplyStatus() {
        return applyStatus;
    }

    public FailedApplyResponseDTO getFailedApply() {
        return failedApply;
    }

    public FeedApplyMaterialBaseResponseDTO getFeedMaterial() {
        return feedMaterial;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setApplyId(long applyId) {
        this.applyId = applyId;
    }

    public void setApplyStatus(BizConstantDisplay applyStatus) {
        this.applyStatus = applyStatus;
    }

    public void setFailedApply(FailedApplyResponseDTO failedApply) {
        this.failedApply = failedApply;
    }

    public void setFeedMaterial(FeedApplyMaterialBaseResponseDTO feedMaterial) {
        this.feedMaterial = feedMaterial;
    }
}

