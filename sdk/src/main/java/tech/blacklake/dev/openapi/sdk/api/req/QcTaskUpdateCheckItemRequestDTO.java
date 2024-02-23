package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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
