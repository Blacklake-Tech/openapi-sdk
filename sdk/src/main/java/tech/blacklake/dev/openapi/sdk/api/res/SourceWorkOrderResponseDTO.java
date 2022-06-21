package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SourceWorkOrderResponseDTO  {
    /**
     * 业务id
     */
    private long id = 0;

    /**
     * 单据信息
     */
    private WorkOrderValueResponseDTO workOrderValue;

    /**
     * 单据行号
     */
    private String workOrderLine;

    public long getId() {
        return id;
    }

    public WorkOrderValueResponseDTO getWorkOrderValue() {
        return workOrderValue;
    }

    public String getWorkOrderLine() {
        return workOrderLine;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWorkOrderValue(WorkOrderValueResponseDTO workOrderValue) {
        this.workOrderValue = workOrderValue;
    }

    public void setWorkOrderLine(String workOrderLine) {
        this.workOrderLine = workOrderLine;
    }
}

