package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderValueResponseDTO {
    /**
     * 业务id
     */
    private long id;

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
