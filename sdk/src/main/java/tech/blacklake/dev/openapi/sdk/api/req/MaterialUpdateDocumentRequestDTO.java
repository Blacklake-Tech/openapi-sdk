package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialUpdateDocumentRequestDTO {
    /**
     * 物料文件关联ID，非必填
     */
    private Long relationId;

    /**
     * 文件ID，必填
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

