package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class StorageAreaCreateRequestDTO {
    /**
     * 仓库编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格，仓库编号和上级区域编号不能同时为空
     */
    private String warehouseCode;

    /**
     * 上级区域编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格，仓库编号和上级区域编号不能同时为空
     */
    private String parentAreaCode;

    /**
     * 仓库区域编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String areaCode;

    /**
     * 仓库区域名称，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String areaName;

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public String getParentAreaCode() {
        return parentAreaCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setParentAreaCode(String parentAreaCode) {
        this.parentAreaCode = parentAreaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
