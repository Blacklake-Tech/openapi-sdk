package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderBizCodeResponseDTO {
    /**
     * 编号
     */
    private String bizCode;

    /**
     * ID
     */
    private int bizType;

    public String getBizCode() {
        return bizCode;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }
}
