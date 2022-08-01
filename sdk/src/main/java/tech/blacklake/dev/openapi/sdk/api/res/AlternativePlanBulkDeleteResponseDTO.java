package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AlternativePlanBulkDeleteResponseDTO  {
    /**
     * 替代方案Id
     */
    private long id;

    /**
     * 替代方案code
     */
    private String code;

    /**
     * 替代方案name
     */
    private String name;

    /**
     * 失败详情
     */
    private String failReason;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}

