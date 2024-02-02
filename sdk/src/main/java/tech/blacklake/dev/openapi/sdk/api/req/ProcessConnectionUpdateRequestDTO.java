package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessConnectionUpdateRequestDTO  {
    /**
     * id
     */
    private Long id;

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
    private WorkInProgressUpdateRequestDTO processManufacturedGoods;

    public Long getId() {
        return id;
    }

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

    public WorkInProgressUpdateRequestDTO getProcessManufacturedGoods() {
        return processManufacturedGoods;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setProcessManufacturedGoods(WorkInProgressUpdateRequestDTO processManufacturedGoods) {
        this.processManufacturedGoods = processManufacturedGoods;
    }
}

