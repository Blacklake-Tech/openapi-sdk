package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkCenterGroupResponseDTO  {
    /**
     * 资源组id
     */
    private long id = 0L;

    /**
     * 行号
     */
    private Integer lineNo;

    /**
     * 资源组分类，key = BizTypeEnum
     */
    private BizConstantDisplay groupType;

    /**
     * 资源组名称
     */
    private String name;

    /**
     * 可选资源 key =BizTypeEnum
     */
    private BizConstantDisplay bizType;

    /**
     * 可选资源Id
     */
    private List<Long> bizIdList;

    /**
     * 可选资源, 0 -用户时
     */
    private List<UserResponseDTO> userList;

    /**
     * 可选资源, 1 -部门时
     */
    private List<DepartmentResponseDTO> departmentList;

    /**
     * 可选资源, 0 -设备时
     */
    private List<ResourceListResponseDTO> resourceList;

    /**
     * 工作中心id
     */
    private Long workCenterId;

    public long getId() {
        return id;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public BizConstantDisplay getGroupType() {
        return groupType;
    }

    public String getName() {
        return name;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public List<Long> getBizIdList() {
        return bizIdList;
    }

    public List<UserResponseDTO> getUserList() {
        return userList;
    }

    public List<DepartmentResponseDTO> getDepartmentList() {
        return departmentList;
    }

    public List<ResourceListResponseDTO> getResourceList() {
        return resourceList;
    }

    public Long getWorkCenterId() {
        return workCenterId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public void setGroupType(BizConstantDisplay groupType) {
        this.groupType = groupType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setBizIdList(List<Long> bizIdList) {
        this.bizIdList = bizIdList;
    }

    public void setUserList(List<UserResponseDTO> userList) {
        this.userList = userList;
    }

    public void setDepartmentList(List<DepartmentResponseDTO> departmentList) {
        this.departmentList = departmentList;
    }

    public void setResourceList(List<ResourceListResponseDTO> resourceList) {
        this.resourceList = resourceList;
    }

    public void setWorkCenterId(Long workCenterId) {
        this.workCenterId = workCenterId;
    }
}

