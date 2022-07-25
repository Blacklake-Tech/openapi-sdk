package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderItemEntityDetailResponseDTO {
    /**
     * 业务id
     */
    private long id;

    /**
     * 关联实体ID
     */
    private long entityId;

    /**
     * 关联实体类型 piking领料单
     */
    private String entityType;

    /**
     * 编号
     */
    private String code;

    /**
     * 行号
     */
    private long lineNo;

    public long getId() {
        return id;
    }

    public long getEntityId() {
        return entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public String getCode() {
        return code;
    }

    public long getLineNo() {
        return lineNo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLineNo(long lineNo) {
        this.lineNo = lineNo;
    }
}

