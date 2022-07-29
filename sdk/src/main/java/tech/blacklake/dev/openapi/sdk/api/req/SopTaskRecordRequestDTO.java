package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SopTaskRecordRequestDTO {
    /**
     * SOP任务ID
     */
    private Long sopTaskId;

    /**
     * 步骤结束时间范围-开始，范围仅限一小时
     */
    private long finishTimeBegin = 0L;

    /**
     * 步骤结束时间范围-结束，范围仅限一小时
     */
    private long finishTimeEnd = 0L;

    /**
     * 控件记录更新时间范围-开始
     */
    private Long updateTimeBegin;

    /**
     * 控件记录更新时间范围-结束
     */
    private Long updateTimeEnd;

    /**
     * 页数
     */
    private int page = 0;

    /**
     * 条数
     */
    private int size = 0;

    public Long getSopTaskId() {
        return sopTaskId;
    }

    public long getFinishTimeBegin() {
        return finishTimeBegin;
    }

    public long getFinishTimeEnd() {
        return finishTimeEnd;
    }

    public Long getUpdateTimeBegin() {
        return updateTimeBegin;
    }

    public Long getUpdateTimeEnd() {
        return updateTimeEnd;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public void setSopTaskId(Long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }

    public void setFinishTimeBegin(long finishTimeBegin) {
        this.finishTimeBegin = finishTimeBegin;
    }

    public void setFinishTimeEnd(long finishTimeEnd) {
        this.finishTimeEnd = finishTimeEnd;
    }

    public void setUpdateTimeBegin(Long updateTimeBegin) {
        this.updateTimeBegin = updateTimeBegin;
    }

    public void setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

