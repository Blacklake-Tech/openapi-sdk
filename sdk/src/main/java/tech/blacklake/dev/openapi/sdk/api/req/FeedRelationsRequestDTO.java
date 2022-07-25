package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRelationsRequestDTO {
    /**
     * 任务ID
     */
    private long taskId = 0;

    /**
     * 物料id
     */
    private long materialId = 0;

    /**
     * 控件id
     */
    private Long controlId;

    public long getTaskId() {
        return taskId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public Long getControlId() {
        return controlId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setControlId(Long controlId) {
        this.controlId = controlId;
    }
}

