package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkerCalendarShiftExportRequestDTO {
    /**
     * 工作日历id
     */
    private Long workerCalendarId;

    /**
     * 导出起始时间
     */
    private LocalDate startTime;

    /**
     * 导出结束时间
     */
    private LocalDate endTime;

    /**
     * 导出起始时间 / 日期
     */
    private String startDate;

    /**
     * 导出结束时间 / 日期
     */
    private String endDate;

    public Long getWorkerCalendarId() {
        return workerCalendarId;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setWorkerCalendarId(Long workerCalendarId) {
        this.workerCalendarId = workerCalendarId;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}

