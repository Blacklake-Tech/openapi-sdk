package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BatchResponseDTO  {
    /**
     * 业务id
     */
    private long id;

    /**
     * 批号
     */
    private String code;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

