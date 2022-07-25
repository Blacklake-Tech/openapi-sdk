package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderValueResponseDTO  {
    /**
     * 业务id
     */
    private long id = 0;

    /**
     * 编码
     */
    private String code;

    /**
     * 标识码
     */
    private String identifier;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

