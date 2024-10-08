package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FeedRelationsRequestDTO {
    /**
     * 任务ID
     */
    private long taskId;

    /**
     * 物料id
     */
    private long materialId;

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
