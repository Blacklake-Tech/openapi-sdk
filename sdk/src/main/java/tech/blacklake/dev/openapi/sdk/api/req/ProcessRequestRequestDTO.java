package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessRequestRequestDTO {
    /**
     * 工序名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Long createdStartAt;

    /**
     * 创建时间结束
     */
    private Long createdEndAt;

    /**
     * 更新时间开始
     */
    private Long updatedStartAt;

    /**
     * 更新时间结束
     */
    private Long updatedEndAt;

    public String getName() {
        return name;
    }

    public Long getCreatedStartAt() {
        return createdStartAt;
    }

    public Long getCreatedEndAt() {
        return createdEndAt;
    }

    public Long getUpdatedStartAt() {
        return updatedStartAt;
    }

    public Long getUpdatedEndAt() {
        return updatedEndAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedStartAt(Long createdStartAt) {
        this.createdStartAt = createdStartAt;
    }

    public void setCreatedEndAt(Long createdEndAt) {
        this.createdEndAt = createdEndAt;
    }

    public void setUpdatedStartAt(Long updatedStartAt) {
        this.updatedStartAt = updatedStartAt;
    }

    public void setUpdatedEndAt(Long updatedEndAt) {
        this.updatedEndAt = updatedEndAt;
    }
}
