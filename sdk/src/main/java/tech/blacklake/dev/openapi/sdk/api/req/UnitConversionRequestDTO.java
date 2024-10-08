package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UnitConversionRequestDTO {
    /**
     * 单位类型ID
     */
    private Long id;

    /**
     * 转换关系ID
     */
    private Long relationId;

    /**
     * 基本单位数量(Y)，如 1KG 的 1
     */
    private int fromUnitCount;

    /**
     * 转换单位ID
     */
    private long toUnitId;

    /**
     * 转换单位数量(X)，如 1000g 的 1000
     */
    private int toUnitCount;

    /**
     * 转换关系类型，取值范围【0主单位、1转换单位、2辅助单位】
     */
    private int convertType;

    /**
     * 顺序
     */
    private long serialNo;

    /**
     * 是否启用
     */
    private int enableFlag;

    public Long getId() {
        return id;
    }

    public Long getRelationId() {
        return relationId;
    }

    public int getFromUnitCount() {
        return fromUnitCount;
    }

    public long getToUnitId() {
        return toUnitId;
    }

    public int getToUnitCount() {
        return toUnitCount;
    }

    public int getConvertType() {
        return convertType;
    }

    public long getSerialNo() {
        return serialNo;
    }

    public int getEnableFlag() {
        return enableFlag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setFromUnitCount(int fromUnitCount) {
        this.fromUnitCount = fromUnitCount;
    }

    public void setToUnitId(long toUnitId) {
        this.toUnitId = toUnitId;
    }

    public void setToUnitCount(int toUnitCount) {
        this.toUnitCount = toUnitCount;
    }

    public void setConvertType(int convertType) {
        this.convertType = convertType;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    public void setEnableFlag(int enableFlag) {
        this.enableFlag = enableFlag;
    }
}
