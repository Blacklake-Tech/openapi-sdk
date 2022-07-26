package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FailedDetailResponseDTO {
    /**
     * 单据ID
     */
    private Long id;

    /**
     * 单据编号
     */
    private String code;

    /**
     * 单据编号
     */
    private BizConstantDisplay bizType;

    /**
     * 失败原因
     */
    private String reason;

    /**
     * 关联对象ID List
     */
    private List<Long> entityIds;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public String getReason() {
        return reason;
    }

    public List<Long> getEntityIds() {
        return entityIds;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setEntityIds(List<Long> entityIds) {
        this.entityIds = entityIds;
    }
}

