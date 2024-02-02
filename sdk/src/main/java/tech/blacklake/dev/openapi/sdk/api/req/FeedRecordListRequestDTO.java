package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRecordListRequestDTO extends BasePage {
    /**
     * 工单id
     */
    private Long workOrderId;

    /**
     * 投料时间范围-开始-查询范围仅限一小时
     */
    private long feedTimeStart;

    /**
     * 投料时间范围-结束-查询范围仅限一小时
     */
    private long feedTimeEnd;

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public long getFeedTimeStart() {
        return feedTimeStart;
    }

    public long getFeedTimeEnd() {
        return feedTimeEnd;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setFeedTimeStart(long feedTimeStart) {
        this.feedTimeStart = feedTimeStart;
    }

    public void setFeedTimeEnd(long feedTimeEnd) {
        this.feedTimeEnd = feedTimeEnd;
    }
}

