package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SimpleAreaResponseDTO {
    /**
     * 区域信息
     */
    private SimpleCodeNameIdResponseDTO base;

    /**
     * 父级ID
     */
    private Long parentId;

    /**
     * 层级
     */
    private Integer level;

    public SimpleCodeNameIdResponseDTO getBase() {
        return base;
    }

    public Long getParentId() {
        return parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setBase(SimpleCodeNameIdResponseDTO base) {
        this.base = base;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

