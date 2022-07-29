package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRecordDetailRequestDTO {
    /**
     * 投料记录详情id
     */
    private long feedRecordDetailId = 0L;

    public long getFeedRecordDetailId() {
        return feedRecordDetailId;
    }

    public void setFeedRecordDetailId(long feedRecordDetailId) {
        this.feedRecordDetailId = feedRecordDetailId;
    }
}

