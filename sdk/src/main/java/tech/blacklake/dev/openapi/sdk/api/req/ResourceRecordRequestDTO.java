package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceRecordRequestDTO {
    /**
     * 资源编号
     */
    private String resourceCode;

    /**
     * 业务类型
     */
    private String businessType;

    /**
     * 参数编号
     */
    private String paramCode;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 读取时间
     */
    private LocalDateTime readTime;

    /**
     * 开始时间
     */
    private LocalDateTime beginTimeLocalDateTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    public String getResourceCode() {
        return resourceCode;
    }

    public String getBusinessType() {
        return businessType;
    }

    public String getParamCode() {
        return paramCode;
    }

    public String getParamValue() {
        return paramValue;
    }

    public LocalDateTime getReadTime() {
        return readTime;
    }

    public LocalDateTime getBeginTimeLocalDateTime() {
        return beginTimeLocalDateTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public void setReadTime(LocalDateTime readTime) {
        this.readTime = readTime;
    }

    public void setBeginTimeLocalDateTime(LocalDateTime beginTimeLocalDateTime) {
        this.beginTimeLocalDateTime = beginTimeLocalDateTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}

