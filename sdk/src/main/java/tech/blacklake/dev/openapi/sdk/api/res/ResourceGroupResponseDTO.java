package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ResourceGroupResponseDTO {
    /**
     * 记录id
     */
    private long id;

    /**
     * 资源组id
     */
    private long groupId;

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

    public long getGroupId() {
        return groupId;
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

    public void setGroupId(long groupId) {
        this.groupId = groupId;
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
