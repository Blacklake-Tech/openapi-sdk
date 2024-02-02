package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageLocationWebPageListRequestDTO extends BasePage {
    /**
     * 快捷搜索
     */
    private String quickSearch;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 状态，1启用 0禁用
     */
    private Integer enableFlag;

    /**
     * 是否锁定 1锁定 0未锁定
     */
    private Integer isLock;

    /**
     * 管控的质量状态
     */
    private Integer qcStatus;

    /**
     * 仓储id 根据storageType确定是仓库id还是区域id
     */
    private Long storageId;

    /**
     * 仓储类型 0仓库 1区域
     */
    private Integer storageType;

    /**
     * 仓位id集合
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

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public Integer getQcStatus() {
        return qcStatus;
    }

    public Long getStorageId() {
        return storageId;
    }

    public Integer getStorageType() {
        return storageType;
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

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public void setQcStatus(Integer qcStatus) {
        this.qcStatus = qcStatus;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public void setStorageType(Integer storageType) {
        this.storageType = storageType;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }
}

