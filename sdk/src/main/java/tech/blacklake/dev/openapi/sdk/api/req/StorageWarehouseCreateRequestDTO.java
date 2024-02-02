package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageWarehouseCreateRequestDTO {
    /**
     * 仓库编号,支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String warehouseCode;

    /**
     * 仓库名称，支持字母、数字，中文和符号，不可超过255个字符
     */
    private String warehouseName;

    /**
     * 仓库类型，从[普通仓库，车间仓库]中选取一个值
     */
    private String bizType;

    /**
     * 质量管理，用',|，'分隔开，从[合格，合格，待检，不合格，暂控]取值
     */
    private String qcCtrlList;

    /**
     * 仓位管理，从[是，否]中选取一个值
     */
    private String enableStorageLocation;

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getBizType() {
        return bizType;
    }

    public String getQcCtrlList() {
        return qcCtrlList;
    }

    public String getEnableStorageLocation() {
        return enableStorageLocation;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setQcCtrlList(String qcCtrlList) {
        this.qcCtrlList = qcCtrlList;
    }

    public void setEnableStorageLocation(String enableStorageLocation) {
        this.enableStorageLocation = enableStorageLocation;
    }
}

