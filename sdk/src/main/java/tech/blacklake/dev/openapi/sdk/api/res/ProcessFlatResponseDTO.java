package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessFlatResponseDTO {
    /**
     * id
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
     * 所属部门ID
     */
    private Long departmentId;

    /**
     * 所属部门名称
     */
    private String departmentName;

    /**
     * 工作中心ID
     */
    private Long workCenterId;

    /**
     * 工作中心名称
     */
    private String workCenterName;

    /**
     * 工序说明
     */
    private String description;

    /**
     * 文件id
     */
    private List<Long> fileIds;

    /**
     * creatorId
     */
    private Long creatorId;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * operatorId
     */
    private Long operatorId;

    /**
     * 更新人
     */
    private UserSimpleResponseDTO operator;

    /**
     * createdAt
     */
    private Long createdAt;

    /**
     * updatedAt
     */
    private Long updatedAt;

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

    public String getDepartmentName() {
        return departmentName;
    }

    public Long getWorkCenterId() {
        return workCenterId;
    }

    public String getWorkCenterName() {
        return workCenterName;
    }

    public String getDescription() {
        return description;
    }

    public List<Long> getFileIds() {
        return fileIds;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
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

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setWorkCenterId(Long workCenterId) {
        this.workCenterId = workCenterId;
    }

    public void setWorkCenterName(String workCenterName) {
        this.workCenterName = workCenterName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFileIds(List<Long> fileIds) {
        this.fileIds = fileIds;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
