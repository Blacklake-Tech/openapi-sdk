package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderListRequestRequestDTO {
    /**
     * 生产工单编号
     */
    private String workOrderCode;

    /**
     * 更新时间起
     */
    private Long updatedAtFrom;

    /**
     * 更新时间止
     */
    private Long updatedAtTo;

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public Long getUpdatedAtFrom() {
        return updatedAtFrom;
    }

    public Long getUpdatedAtTo() {
        return updatedAtTo;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public void setUpdatedAtFrom(Long updatedAtFrom) {
        this.updatedAtFrom = updatedAtFrom;
    }

    public void setUpdatedAtTo(Long updatedAtTo) {
        this.updatedAtTo = updatedAtTo;
    }
}

