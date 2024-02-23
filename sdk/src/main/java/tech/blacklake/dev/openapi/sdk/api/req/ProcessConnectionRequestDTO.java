package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessConnectionRequestDTO {
    /**
     * 前工序号
     */
    private String prevProcessNum;

    /**
     * 后工序号
     */
    private String nextProcessNum;

    /**
     * 接续关系类型
     */
    private int connectionType;

    /**
     * 时间间隔值
     */
    private int intervalTime;

    /**
     * 时间间隔单位 ID
     */
    private Integer timeUnit;

    /**
     * 在制品
     */
    private WorkInProgressRequestDTO processManufacturedGoods;

    public String getPrevProcessNum() {
        return prevProcessNum;
    }

    public String getNextProcessNum() {
        return nextProcessNum;
    }

    public int getConnectionType() {
        return connectionType;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public WorkInProgressRequestDTO getProcessManufacturedGoods() {
        return processManufacturedGoods;
    }

    public void setPrevProcessNum(String prevProcessNum) {
        this.prevProcessNum = prevProcessNum;
    }

    public void setNextProcessNum(String nextProcessNum) {
        this.nextProcessNum = nextProcessNum;
    }

    public void setConnectionType(int connectionType) {
        this.connectionType = connectionType;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void setProcessManufacturedGoods(WorkInProgressRequestDTO processManufacturedGoods) {
        this.processManufacturedGoods = processManufacturedGoods;
    }
}
