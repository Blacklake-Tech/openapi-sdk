package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskUpdateCheckItemRequestDTO {
    /**
     * 检验任务id
     */
    private Long taskId;

    /**
     * 检验项记录明细
     */
    private List<QcTaskUpdateCheckItemDetailRequestDTO> checkItems;

    public Long getTaskId() {
        return taskId;
    }

    public List<QcTaskUpdateCheckItemDetailRequestDTO> getCheckItems() {
        return checkItems;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public void setCheckItems(List<QcTaskUpdateCheckItemDetailRequestDTO> checkItems) {
        this.checkItems = checkItems;
    }
}

