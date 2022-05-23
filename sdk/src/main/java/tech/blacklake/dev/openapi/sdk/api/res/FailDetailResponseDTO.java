package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class FailDetailResponseDTO  {
    /**
     * 工艺路线ID
     */
    private long id = 0;

    /**
     * 工艺路线code
     */
    private String code;

    /**
     * 工艺路线名称
     */
    private String name;

    /**
     * 工艺路线信息
     */
    private String reason;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
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

    public void setReason(String reason) {
        this.reason = reason;
    }
}

