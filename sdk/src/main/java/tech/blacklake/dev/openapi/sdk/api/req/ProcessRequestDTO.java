package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessRequestDTO  {
    /**
     * 工序ID
     */
    private Long id;

    /**
     * 工序编号
     */
    private String code;

    /**
     * 工序名称
     */
    private String name;

    /**
     * 所属部门
     */
    private Long departmentId;

    /**
     * 工作中心
     */
    private long workCenterId;

    /**
     * 工序说明
     */
    private String description;

    /**
     * 文件id
     */
    private List<Long> fileIds;

    /**
     * 用料追溯关系
     */
    private ConfigurationItemsRequestDTO configurationItems;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public long getWorkCenterId() {
        return workCenterId;
    }

    public String getDescription() {
        return description;
    }

    public List<Long> getFileIds() {
        return fileIds;
    }

    public ConfigurationItemsRequestDTO getConfigurationItems() {
        return configurationItems;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setWorkCenterId(long workCenterId) {
        this.workCenterId = workCenterId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFileIds(List<Long> fileIds) {
        this.fileIds = fileIds;
    }

    public void setConfigurationItems(ConfigurationItemsRequestDTO configurationItems) {
        this.configurationItems = configurationItems;
    }
}

