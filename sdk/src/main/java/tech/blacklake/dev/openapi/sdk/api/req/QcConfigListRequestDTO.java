package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcConfigListRequestDTO {
    /**
     * 快速搜索条件（名称或编号）
     */
    private String quickSearch;

    /**
     * 检验方案编号
     */
    private String code;

    /**
     * 检验方案名称
     */
    private String name;

    /**
     * 状态（1：启用，0：停用）
     */
    private List<Integer> status;

    /**
     * 业务类型
     */
    private List<Integer> checkType;

    /**
     * 关联物料id
     */
    private List<Long> materialIds;

    /**
     * 关联工序id
     */
    private List<Long> processIds;

    /**
     * 关联资源id
     */
    private List<Long> resourceIds;

    /**
     * 排序规则（asc正序，desc倒叙）
     */
    private String orderDirection;

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getStatus() {
        return status;
    }

    public List<Integer> getCheckType() {
        return checkType;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public List<Long> getProcessIds() {
        return processIds;
    }

    public List<Long> getResourceIds() {
        return resourceIds;
    }

    public String getOrderDirection() {
        return orderDirection;
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

    public void setStatus(List<Integer> status) {
        this.status = status;
    }

    public void setCheckType(List<Integer> checkType) {
        this.checkType = checkType;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setProcessIds(List<Long> processIds) {
        this.processIds = processIds;
    }

    public void setResourceIds(List<Long> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }
}

