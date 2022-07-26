package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailRangeStorageResponseDTO {
    /**
     * 存储位置1级仓库id
     */
    private Long levelOneWarehouseId;

    /**
     * 存储位置2级仓库id
     */
    private Long levelTwoWarehouseId;

    /**
     * 存储位置3级仓库id
     */
    private Long levelThreeWarehouseId;

    /**
     * 存储位置仓位id
     */
    private Long storageId;

    /**
     * 存储位置1级仓库code
     */
    private String levelOneWarehouseCode;

    /**
     * 存储位置2级仓库code
     */
    private String levelTwoWarehouseCode;

    /**
     * 存储位置3级仓库code
     */
    private String levelThreeWarehouseCode;

    /**
     * 存储位置仓位code
     */
    private String storageCode;

    /**
     * 存储位置1级仓库name
     */
    private String levelOneWarehouseName;

    /**
     * 存储位置2级仓库name
     */
    private String levelTwoWarehouseName;

    /**
     * 存储位置3级仓库name
     */
    private String levelThreeWarehouseName;

    /**
     * 存储位置仓位name
     */
    private String storageName;

    public Long getLevelOneWarehouseId() {
        return levelOneWarehouseId;
    }

    public Long getLevelTwoWarehouseId() {
        return levelTwoWarehouseId;
    }

    public Long getLevelThreeWarehouseId() {
        return levelThreeWarehouseId;
    }

    public Long getStorageId() {
        return storageId;
    }

    public String getLevelOneWarehouseCode() {
        return levelOneWarehouseCode;
    }

    public String getLevelTwoWarehouseCode() {
        return levelTwoWarehouseCode;
    }

    public String getLevelThreeWarehouseCode() {
        return levelThreeWarehouseCode;
    }

    public String getStorageCode() {
        return storageCode;
    }

    public String getLevelOneWarehouseName() {
        return levelOneWarehouseName;
    }

    public String getLevelTwoWarehouseName() {
        return levelTwoWarehouseName;
    }

    public String getLevelThreeWarehouseName() {
        return levelThreeWarehouseName;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setLevelOneWarehouseId(Long levelOneWarehouseId) {
        this.levelOneWarehouseId = levelOneWarehouseId;
    }

    public void setLevelTwoWarehouseId(Long levelTwoWarehouseId) {
        this.levelTwoWarehouseId = levelTwoWarehouseId;
    }

    public void setLevelThreeWarehouseId(Long levelThreeWarehouseId) {
        this.levelThreeWarehouseId = levelThreeWarehouseId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public void setLevelOneWarehouseCode(String levelOneWarehouseCode) {
        this.levelOneWarehouseCode = levelOneWarehouseCode;
    }

    public void setLevelTwoWarehouseCode(String levelTwoWarehouseCode) {
        this.levelTwoWarehouseCode = levelTwoWarehouseCode;
    }

    public void setLevelThreeWarehouseCode(String levelThreeWarehouseCode) {
        this.levelThreeWarehouseCode = levelThreeWarehouseCode;
    }

    public void setStorageCode(String storageCode) {
        this.storageCode = storageCode;
    }

    public void setLevelOneWarehouseName(String levelOneWarehouseName) {
        this.levelOneWarehouseName = levelOneWarehouseName;
    }

    public void setLevelTwoWarehouseName(String levelTwoWarehouseName) {
        this.levelTwoWarehouseName = levelTwoWarehouseName;
    }

    public void setLevelThreeWarehouseName(String levelThreeWarehouseName) {
        this.levelThreeWarehouseName = levelThreeWarehouseName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }
}

