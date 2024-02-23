package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class StorageLocationCreateRequestDTO {
    /**
     * 仓库编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格，仓库编号和仓库区域编号不能同时为空
     */
    private String warehouseCode;

    /**
     * 仓库区域编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格，仓库编号和仓库区域编号不能同时为空
     */
    private String areaCode;

    /**
     * 仓位编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String locationCode;

    /**
     * 仓位名称，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String locationName;

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
