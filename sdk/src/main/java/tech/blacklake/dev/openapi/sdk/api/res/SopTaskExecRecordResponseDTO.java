package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class SopTaskExecRecordResponseDTO {
    /**
     * SOP任务编号
     */
    private String taskCode;

    /**
     * 步骤编号
     */
    private String code;

    /**
     * 步骤名称
     */
    private String name;

    /**
     * 步骤是否循环
     */
    private boolean loopFlag;

    /**
     * 步骤循环信息
     */
    private StepLoopRecordResponseDTO loopInfo;

    /**
     * 步骤结束时间
     */
    private Long finishTime;

    /**
     * 步骤强制结束原因
     */
    private String reason;

    /**
     * 步骤电子签名用户
     */
    private UserResponseDTO authUser;

    /**
     * 步骤执行用户
     */
    private UserResponseDTO execUser;

    /**
     * 控件编号
     */
    private String controlCode;

    /**
     * 控件名称
     */
    private String controlName;

    /**
     * 控件执行记录
     */
    private String controlValue;

    public String getTaskCode() {
        return taskCode;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean getLoopFlag() {
        return loopFlag;
    }

    public StepLoopRecordResponseDTO getLoopInfo() {
        return loopInfo;
    }

    public Long getFinishTime() {
        return finishTime;
    }

    public String getReason() {
        return reason;
    }

    public UserResponseDTO getAuthUser() {
        return authUser;
    }

    public UserResponseDTO getExecUser() {
        return execUser;
    }

    public String getControlCode() {
        return controlCode;
    }

    public String getControlName() {
        return controlName;
    }

    public String getControlValue() {
        return controlValue;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoopFlag(boolean loopFlag) {
        this.loopFlag = loopFlag;
    }

    public void setLoopInfo(StepLoopRecordResponseDTO loopInfo) {
        this.loopInfo = loopInfo;
    }

    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setAuthUser(UserResponseDTO authUser) {
        this.authUser = authUser;
    }

    public void setExecUser(UserResponseDTO execUser) {
        this.execUser = execUser;
    }

    public void setControlCode(String controlCode) {
        this.controlCode = controlCode;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    public void setControlValue(String controlValue) {
        this.controlValue = controlValue;
    }
}
