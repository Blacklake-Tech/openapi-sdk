package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskSaveForMengniuRequestDTO {
    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * 检验项明细
     */
    private List<QcTaskCheckItemDetailForMengniuRequestDTO> checkItems;

    public String getTaskCode() {
        return taskCode;
    }

    public List<QcTaskCheckItemDetailForMengniuRequestDTO> getCheckItems() {
        return checkItems;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public void setCheckItems(List<QcTaskCheckItemDetailForMengniuRequestDTO> checkItems) {
        this.checkItems = checkItems;
    }
}

