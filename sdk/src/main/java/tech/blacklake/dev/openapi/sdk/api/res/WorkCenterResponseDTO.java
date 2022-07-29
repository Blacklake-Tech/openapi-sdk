package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkCenterResponseDTO  {
    /**
     * 工作中心名称
     */
    private String name;

    /**
     * 工作中心ID
     */
    private long id = 0L;

    /**
     * 工作中心模板ID
     */
    private Long sampleId;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Long getSampleId() {
        return sampleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }
}

