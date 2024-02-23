package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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

    /**
     * 主产出批次号编码
     */
    private String mainOutputBatchNumber;

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public Long getUpdatedAtFrom() {
        return updatedAtFrom;
    }

    public Long getUpdatedAtTo() {
        return updatedAtTo;
    }

    public String getMainOutputBatchNumber() {
        return mainOutputBatchNumber;
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

    public void setMainOutputBatchNumber(String mainOutputBatchNumber) {
        this.mainOutputBatchNumber = mainOutputBatchNumber;
    }
}
