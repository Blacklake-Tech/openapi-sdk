package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomerSimpleResponseDTO {
    /**
     * 
     */
    private long id = 0L;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer status;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getStatus() {
        return status;
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

    public void setStatus(Integer status) {
        this.status = status;
    }
}

