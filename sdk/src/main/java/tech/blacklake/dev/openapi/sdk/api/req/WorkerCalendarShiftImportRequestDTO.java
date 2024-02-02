package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkerCalendarShiftImportRequestDTO {
    /**
     * 工作日历id
     */
    private Long workerCalendarId;

    /**
     * 文件地址
     */
    private String fileUrl;

    public Long getWorkerCalendarId() {
        return workerCalendarId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setWorkerCalendarId(Long workerCalendarId) {
        this.workerCalendarId = workerCalendarId;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}

