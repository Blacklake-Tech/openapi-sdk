package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialStorageUnitCreateRequestDTO {
    /**
     * 关联ID
     */
    private Long relationId;

    /**
     * ID
     */
    private Long id;

    public Long getRelationId() {
        return relationId;
    }

    public Long getId() {
        return id;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
