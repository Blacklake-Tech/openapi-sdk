package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialDocumentResponseDTO {
    /**
     * 物料文件关联ID
     */
    private Long relationId;

    /**
     * 文件ID
     */
    private long id = 0;

    /**
     * 文件路径
     */
    private String url;

    public Long getRelationId() {
        return relationId;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

