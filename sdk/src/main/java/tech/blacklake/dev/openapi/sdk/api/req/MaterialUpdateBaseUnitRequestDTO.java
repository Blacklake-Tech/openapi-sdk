package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialUpdateBaseUnitRequestDTO {
    /**
     * 物料单位关联ID
     */
    private Long relationId;

    /**
     * 单位ID，必填
     */
    private long id;

    public Long getRelationId() {
        return relationId;
    }

    public long getId() {
        return id;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setId(long id) {
        this.id = id;
    }
}
