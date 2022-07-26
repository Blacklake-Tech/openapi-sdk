package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class GetLocationListRequestDTO {
    /**
     * 区域层级
     */
    private Integer level;

    /**
     * 上级区域
     */
    private Long parentId;

    /**
     * 区域编号
     */
    private String code;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 标识码
     */
    private String identifier;

    /**
     * 备注
     */
    private String remark;

    /**
     * 负责人集合
     */
    private List<Long> managers;

    /**
     * 快速搜索
     */
    private String quickSearch;

    /**
     * 上级区域名称
     */
    private String parentName;

    /**
     * 启用状态
     */
    private Integer enableStatus;

    /**
     * 只有当 excel 导出时设为 true，用于跳过全量查询限制
     */
    private Boolean excelSearchFlag;

    public Integer getLevel() {
        return level;
    }

    public Long getParentId() {
        return parentId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getRemark() {
        return remark;
    }

    public List<Long> getManagers() {
        return managers;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getParentName() {
        return parentName;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public Boolean getExcelSearchFlag() {
        return excelSearchFlag;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setManagers(List<Long> managers) {
        this.managers = managers;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public void setExcelSearchFlag(Boolean excelSearchFlag) {
        this.excelSearchFlag = excelSearchFlag;
    }
}

