package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceRecordsResponseDTO {
    /**
     * 时间戳
     */
    private long ts = 0;

    /**
     * 资源编号
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 参数值
     */
    private String val;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 记录时间
     */
    private String recordTime;

    /**
     * 创建方式
     */
    private String createType;

    /**
     * 参数类型
     */
    private String paramType;

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 参数分类
     */
    private String paramClassification;

    /**
     * 参数单位
     */
    private String paramUnit;

    /**
     * 资源id
     */
    private Long deviceId;

    /**
     * 参数id
     */
    private Long paramId;

    public long getTs() {
        return ts;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getVal() {
        return val;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public String getCreateType() {
        return createType;
    }

    public String getParamType() {
        return paramType;
    }

    public String getParamName() {
        return paramName;
    }

    public String getParamClassification() {
        return paramClassification;
    }

    public String getParamUnit() {
        return paramUnit;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public Long getParamId() {
        return paramId;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public void setParamClassification(String paramClassification) {
        this.paramClassification = paramClassification;
    }

    public void setParamUnit(String paramUnit) {
        this.paramUnit = paramUnit;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }
}

