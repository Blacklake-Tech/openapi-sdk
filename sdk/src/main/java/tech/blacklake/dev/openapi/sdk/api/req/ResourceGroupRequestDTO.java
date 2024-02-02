package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceGroupRequestDTO {
    /**
     * 资源组记录id
     */
    private Long id;

    /**
     * 资源组id
     */
    private long resourceGroupId;

    /**
     * 资源组类型
     */
    private int groupType;

    /**
     * 资源ids
     */
    private List<Long> resourceIds;

    public Long getId() {
        return id;
    }

    public long getResourceGroupId() {
        return resourceGroupId;
    }

    public int getGroupType() {
        return groupType;
    }

    public List<Long> getResourceIds() {
        return resourceIds;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setResourceGroupId(long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }

    public void setResourceIds(List<Long> resourceIds) {
        this.resourceIds = resourceIds;
    }
}

