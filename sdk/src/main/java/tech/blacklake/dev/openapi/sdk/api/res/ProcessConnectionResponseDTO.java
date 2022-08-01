package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessConnectionResponseDTO  {
    /**
     * 业务id
     */
    private long id;

    /**
     * 前序ID
     */
    private long prevProcessId;

    /**
     * 前序名称
     */
    private String prevProcessName;

    /**
     * 前序工序号
     */
    private String prevProcessNum;

    /**
     * 后序ID
     */
    private long nextProcessId;

    /**
     * 后序名称
     */
    private String nextProcessName;

    /**
     * 后序编号
     */
    private String nextProcessNum;

    /**
     * 接续类型枚举值 key = connectionType
     */
    private BizConstantDisplay connectionType;

    /**
     * 工序间隔时间
     */
    private Integer intervalTime;

    /**
     * 工序间隔时间单位枚举值 key = timeUnit 
     */
    private BizConstantDisplay timeUnit;

    /**
     * 工序在制品
     */
    private WorkInProcessResponseDTO processManufacturedGoods;

    public long getId() {
        return id;
    }

    public long getPrevProcessId() {
        return prevProcessId;
    }

    public String getPrevProcessName() {
        return prevProcessName;
    }

    public String getPrevProcessNum() {
        return prevProcessNum;
    }

    public long getNextProcessId() {
        return nextProcessId;
    }

    public String getNextProcessName() {
        return nextProcessName;
    }

    public String getNextProcessNum() {
        return nextProcessNum;
    }

    public BizConstantDisplay getConnectionType() {
        return connectionType;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public BizConstantDisplay getTimeUnit() {
        return timeUnit;
    }

    public WorkInProcessResponseDTO getProcessManufacturedGoods() {
        return processManufacturedGoods;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrevProcessId(long prevProcessId) {
        this.prevProcessId = prevProcessId;
    }

    public void setPrevProcessName(String prevProcessName) {
        this.prevProcessName = prevProcessName;
    }

    public void setPrevProcessNum(String prevProcessNum) {
        this.prevProcessNum = prevProcessNum;
    }

    public void setNextProcessId(long nextProcessId) {
        this.nextProcessId = nextProcessId;
    }

    public void setNextProcessName(String nextProcessName) {
        this.nextProcessName = nextProcessName;
    }

    public void setNextProcessNum(String nextProcessNum) {
        this.nextProcessNum = nextProcessNum;
    }

    public void setConnectionType(BizConstantDisplay connectionType) {
        this.connectionType = connectionType;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public void setTimeUnit(BizConstantDisplay timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void setProcessManufacturedGoods(WorkInProcessResponseDTO processManufacturedGoods) {
        this.processManufacturedGoods = processManufacturedGoods;
    }
}

