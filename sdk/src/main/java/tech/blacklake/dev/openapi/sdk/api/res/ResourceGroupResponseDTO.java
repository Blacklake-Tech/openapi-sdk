package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class ResourceGroupResponseDTO {
    /**
     * 资源组id
     */
    private long id;

    /**
     * 资源组名称
     */
    private String groupName;

    /**
     * 资源分类 0-用户，1-部门，2-设备  key = groupType
     */
    private BizConstantDisplay groupType;

    /**
     * 资源列表
     */
    private List<ResourceResponseDTO> resourceList;

    public long getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public BizConstantDisplay getGroupType() {
        return groupType;
    }

    public List<ResourceResponseDTO> getResourceList() {
        return resourceList;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupType(BizConstantDisplay groupType) {
        this.groupType = groupType;
    }

    public void setResourceList(List<ResourceResponseDTO> resourceList) {
        this.resourceList = resourceList;
    }
}

