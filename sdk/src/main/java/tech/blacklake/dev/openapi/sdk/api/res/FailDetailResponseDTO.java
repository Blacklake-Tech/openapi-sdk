package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FailDetailResponseDTO {
    /**
     * 编号
     */
    private String code;

    /**
     * 类型
     */
    private String bizType;

    /**
     * 原因
     */
    private String reason;

    public String getCode() {
        return code;
    }

    public String getBizType() {
        return bizType;
    }

    public String getReason() {
        return reason;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
