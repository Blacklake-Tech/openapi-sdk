package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BulkFeedApplyResponseDTO {
    /**
     * 消息追踪ID
     */
    private long messageTraceId;

    public long getMessageTraceId() {
        return messageTraceId;
    }

    public void setMessageTraceId(long messageTraceId) {
        this.messageTraceId = messageTraceId;
    }
}

