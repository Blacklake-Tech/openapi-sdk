package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FeedRecordDetailRequestDTO {
    /**
     * 投料记录详情id
     */
    private long feedRecordDetailId;

    public long getFeedRecordDetailId() {
        return feedRecordDetailId;
    }

    public void setFeedRecordDetailId(long feedRecordDetailId) {
        this.feedRecordDetailId = feedRecordDetailId;
    }
}
