package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class DoProgressReportResponseDTO {
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
