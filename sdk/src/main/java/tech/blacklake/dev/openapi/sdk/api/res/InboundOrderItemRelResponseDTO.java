package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InboundOrderItemRelResponseDTO {
    /**
     * 主键ID
     */
    private long id;

    /**
     * 实体类型
     */
    private BizConstantDisplay entityType;

    /**
     * 实体ID
     */
    private long entityId;

    public long getId() {
        return id;
    }

    public BizConstantDisplay getEntityType() {
        return entityType;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEntityType(BizConstantDisplay entityType) {
        this.entityType = entityType;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }
}
