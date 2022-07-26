package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRetractRecordListRequestDTO extends BasePage {
    /**
     * 工单id
     */
    private Long workOrderId;

    /**
     * 回撤时间范围-开始-查询范围仅限一小时
     */
    private long feedRetractTimeStart;

    /**
     * 回撤时间范围-结束-查询范围仅限一小时
     */
    private long feedRetractTimeEnd;

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public long getFeedRetractTimeStart() {
        return feedRetractTimeStart;
    }

    public long getFeedRetractTimeEnd() {
        return feedRetractTimeEnd;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setFeedRetractTimeStart(long feedRetractTimeStart) {
        this.feedRetractTimeStart = feedRetractTimeStart;
    }

    public void setFeedRetractTimeEnd(long feedRetractTimeEnd) {
        this.feedRetractTimeEnd = feedRetractTimeEnd;
    }
}

