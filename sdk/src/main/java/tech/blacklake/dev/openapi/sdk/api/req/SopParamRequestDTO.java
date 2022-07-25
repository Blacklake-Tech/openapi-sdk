package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SopParamRequestDTO {
    /**
     * sop任务id
     */
    private Long sopTaskId;

    /**
     * sop步骤id
     */
    private Long stepId;

    /**
     * sop控件id
     */
    private Long controlId;

    /**
     * sop循环维度id
     */
    private Long sopExecRecordId;

    /**
     * sop执行次数
     */
    private Integer execTimes;

    public Long getSopTaskId() {
        return sopTaskId;
    }

    public Long getStepId() {
        return stepId;
    }

    public Long getControlId() {
        return controlId;
    }

    public Long getSopExecRecordId() {
        return sopExecRecordId;
    }

    public Integer getExecTimes() {
        return execTimes;
    }

    public void setSopTaskId(Long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public void setControlId(Long controlId) {
        this.controlId = controlId;
    }

    public void setSopExecRecordId(Long sopExecRecordId) {
        this.sopExecRecordId = sopExecRecordId;
    }

    public void setExecTimes(Integer execTimes) {
        this.execTimes = execTimes;
    }
}

