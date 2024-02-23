package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkCenterListRequestDTO {
    /**
     * id
     */
    private Long id;

    /**
     * orgId
     */
    private Long orgId;

    /**
     * type
     */
    private Integer type;

    /**
     * idList
     */
    private List<Long> idList;

    /**
     * 模糊查询
     */
    private String quickSearch;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 部门集合
     */
    private List<Long> departmentIdList;

    /**
     * 投料仓位集合
     */
    private List<Long> inputStorageIdList;

    /**
     * 创建人Id
     */
    private Long creatorId;

    /**
     * 操作人Id
     */
    private Long operatorId;

    /**
     * createBeginDate
     */
    private LocalDateTime createBeginDate;

    /**
     * createEndDate
     */
    private LocalDateTime createEndDate;

    /**
     * updateBeginDate
     */
    private LocalDateTime updateBeginDate;

    /**
     * updateEndDate
     */
    private LocalDateTime updateEndDate;

    /**
     * 创建开始时间
     */
    private Long createBeginTime;

    /**
     * 创建开始时间
     */
    private Long createEndTime;

    /**
     * 更新开始时间
     */
    private Long updateBeginTime;

    /**
     * 更新结束时间
     */
    private Long updateEndTime;

    public Long getId() {
        return id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public Integer getType() {
        return type;
    }

    public List<Long> getIdList() {
        return idList;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Long> getDepartmentIdList() {
        return departmentIdList;
    }

    public List<Long> getInputStorageIdList() {
        return inputStorageIdList;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public LocalDateTime getCreateBeginDate() {
        return createBeginDate;
    }

    public LocalDateTime getCreateEndDate() {
        return createEndDate;
    }

    public LocalDateTime getUpdateBeginDate() {
        return updateBeginDate;
    }

    public LocalDateTime getUpdateEndDate() {
        return updateEndDate;
    }

    public Long getCreateBeginTime() {
        return createBeginTime;
    }

    public Long getCreateEndTime() {
        return createEndTime;
    }

    public Long getUpdateBeginTime() {
        return updateBeginTime;
    }

    public Long getUpdateEndTime() {
        return updateEndTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentIdList(List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    public void setInputStorageIdList(List<Long> inputStorageIdList) {
        this.inputStorageIdList = inputStorageIdList;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public void setCreateBeginDate(LocalDateTime createBeginDate) {
        this.createBeginDate = createBeginDate;
    }

    public void setCreateEndDate(LocalDateTime createEndDate) {
        this.createEndDate = createEndDate;
    }

    public void setUpdateBeginDate(LocalDateTime updateBeginDate) {
        this.updateBeginDate = updateBeginDate;
    }

    public void setUpdateEndDate(LocalDateTime updateEndDate) {
        this.updateEndDate = updateEndDate;
    }

    public void setCreateBeginTime(Long createBeginTime) {
        this.createBeginTime = createBeginTime;
    }

    public void setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
    }

    public void setUpdateBeginTime(Long updateBeginTime) {
        this.updateBeginTime = updateBeginTime;
    }

    public void setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
    }
}
