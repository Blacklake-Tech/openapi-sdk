package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitConversionResponseDTO  {
    /**
     * orgid
     */
    private long orgId = 0;

    /**
     * id
     */
    private long id = 0;

    /**
     * 基本单位id
     */
    private long fromUnitId = 0;

    /**
     * 基本单位名称
     */
    private String fromUnitName;

    /**
     * 基本单位转换系数
     */
    private int fromUnitCount = 0;

    /**
     * 转换单位id
     */
    private long toUnitId = 0;

    /**
     * 转换单位名称
     */
    private String toUnitName;

    /**
     * 转换单位转换系数
     */
    private int toUnitCount = 0;

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public long getFromUnitId() {
        return fromUnitId;
    }

    public String getFromUnitName() {
        return fromUnitName;
    }

    public int getFromUnitCount() {
        return fromUnitCount;
    }

    public long getToUnitId() {
        return toUnitId;
    }

    public String getToUnitName() {
        return toUnitName;
    }

    public int getToUnitCount() {
        return toUnitCount;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFromUnitId(long fromUnitId) {
        this.fromUnitId = fromUnitId;
    }

    public void setFromUnitName(String fromUnitName) {
        this.fromUnitName = fromUnitName;
    }

    public void setFromUnitCount(int fromUnitCount) {
        this.fromUnitCount = fromUnitCount;
    }

    public void setToUnitId(long toUnitId) {
        this.toUnitId = toUnitId;
    }

    public void setToUnitName(String toUnitName) {
        this.toUnitName = toUnitName;
    }

    public void setToUnitCount(int toUnitCount) {
        this.toUnitCount = toUnitCount;
    }
}

