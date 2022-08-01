package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BulkFeedApplyRequestDTO {
    /**
     * 生产任务Id
     */
    private long taskId;

    /**
     * SOP信息
     */
    private SopParamRequestDTO sopParam;

    /**
     * 多物料投料申请列表
     */
    private List<MaterialFeedApplyRequestDTO> feedMaterialApplies;

    /**
     * 可跳过的弱管控规则 list
     */
    private List<String> skipWeakControlRule;

    public long getTaskId() {
        return taskId;
    }

    public SopParamRequestDTO getSopParam() {
        return sopParam;
    }

    public List<MaterialFeedApplyRequestDTO> getFeedMaterialApplies() {
        return feedMaterialApplies;
    }

    public List<String> getSkipWeakControlRule() {
        return skipWeakControlRule;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setSopParam(SopParamRequestDTO sopParam) {
        this.sopParam = sopParam;
    }

    public void setFeedMaterialApplies(List<MaterialFeedApplyRequestDTO> feedMaterialApplies) {
        this.feedMaterialApplies = feedMaterialApplies;
    }

    public void setSkipWeakControlRule(List<String> skipWeakControlRule) {
        this.skipWeakControlRule = skipWeakControlRule;
    }
}

