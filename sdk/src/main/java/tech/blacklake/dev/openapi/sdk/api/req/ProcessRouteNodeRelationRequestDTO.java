package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessRouteNodeRelationRequestDTO {
    /**
     * 业务id 详情返回有值就重新传回 没值不用传
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
     * 接续方式
     */
    private Integer connectionType;

    /**
     * 工序间隔时间
     */
    private Integer intervalTime;

    /**
     * 工序间隔时间单位
     */
    private Integer timeUnit;

    /**
     * 工序在制品
     */
    private ProcessManufacturedGoodsRequestDTO processManufacturedGoods;

    public Long getId() {
        return id;
    }

    public String getPrevProcessNum() {
        return prevProcessNum;
    }

    public String getNextProcessNum() {
        return nextProcessNum;
    }

    public Integer getConnectionType() {
        return connectionType;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public ProcessManufacturedGoodsRequestDTO getProcessManufacturedGoods() {
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

    public void setConnectionType(Integer connectionType) {
        this.connectionType = connectionType;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void setProcessManufacturedGoods(ProcessManufacturedGoodsRequestDTO processManufacturedGoods) {
        this.processManufacturedGoods = processManufacturedGoods;
    }
}
