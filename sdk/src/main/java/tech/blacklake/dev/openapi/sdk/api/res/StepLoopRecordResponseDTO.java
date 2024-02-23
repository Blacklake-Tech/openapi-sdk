package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class StepLoopRecordResponseDTO {
    /**
     * 循环体名称：步骤/步骤组
     */
    private String name;

    /**
     * 循环结束时间
     */
    private Long loopFinishTime;

    /**
     * 当前循环次数
     */
    private int currentLoopTimes;

    /**
     * 最大循环次数
     */
    private int maxLoopTimes;

    /**
     * 循环内执行次数
     */
    private int loopExecTimes;

    /**
     * 循环计划开始时间
     */
    private Long planStartTime;

    /**
     * 循环计划结束时间
     */
    private Long planFinishTime;

    public String getName() {
        return name;
    }

    public Long getLoopFinishTime() {
        return loopFinishTime;
    }

    public int getCurrentLoopTimes() {
        return currentLoopTimes;
    }

    public int getMaxLoopTimes() {
        return maxLoopTimes;
    }

    public int getLoopExecTimes() {
        return loopExecTimes;
    }

    public Long getPlanStartTime() {
        return planStartTime;
    }

    public Long getPlanFinishTime() {
        return planFinishTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoopFinishTime(Long loopFinishTime) {
        this.loopFinishTime = loopFinishTime;
    }

    public void setCurrentLoopTimes(int currentLoopTimes) {
        this.currentLoopTimes = currentLoopTimes;
    }

    public void setMaxLoopTimes(int maxLoopTimes) {
        this.maxLoopTimes = maxLoopTimes;
    }

    public void setLoopExecTimes(int loopExecTimes) {
        this.loopExecTimes = loopExecTimes;
    }

    public void setPlanStartTime(Long planStartTime) {
        this.planStartTime = planStartTime;
    }

    public void setPlanFinishTime(Long planFinishTime) {
        this.planFinishTime = planFinishTime;
    }
}
