package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class StorageWarehouseWebPageListRequestDTO extends BasePage {
    /**
     * 快速查询
     */
    private String quickSearch;

    /**
     * 名称
     */
    private String name;

    /**
     * 编号
     */
    private String code;

    /**
     * 仓库类型 0车间仓库 1普通仓库
     */
    private Integer bizType;

    /**
     * 状态 1启用0禁用
     */
    private Integer enableFlag;

    /**
     * 是否锁定1锁定0未锁定
     */
    private Integer isLock;

    /**
     * 是否开启仓位管理 1启用 0禁用
     */
    private Integer enableStorageLocation;

    /**
     * 是否开启质量管理 1开启 0未开启
     */
    private Integer enableQcCtrl;

    /**
     * 质量状态 1合格 2让步合格 3待检 4不合格 5暂控
     */
    private Integer qcStatus;

    /**
     * 仓库id集合
     */
    private List<Long> idList;

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Integer getBizType() {
        return bizType;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public Integer getEnableStorageLocation() {
        return enableStorageLocation;
    }

    public Integer getEnableQcCtrl() {
        return enableQcCtrl;
    }

    public Integer getQcStatus() {
        return qcStatus;
    }

    public List<Long> getIdList() {
        return idList;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public void setEnableStorageLocation(Integer enableStorageLocation) {
        this.enableStorageLocation = enableStorageLocation;
    }

    public void setEnableQcCtrl(Integer enableQcCtrl) {
        this.enableQcCtrl = enableQcCtrl;
    }

    public void setQcStatus(Integer qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }
}
