package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitDetailResponseDTO {
    /**
     * 单位类型，0主单位，1转换单位，2辅助单位
     */
    private int unitType;

    /**
     * 工厂ID
     */
    private long orgId;

    /**
     * 业务ID
     */
    private long id;

    /**
     * 单位编号
     */
    private String code;

    /**
     * 单位名称
     */
    private String name;

    /**
     * 单位描述
     */
    private String remark;

    /**
     * 精度管理，1启用0停用
     */
    private int enablePrecision;

    /**
     * 舍入规则，0四舍五入1奇进偶舍2进位3舍位
     */
    private Integer roundingRole;

    /**
     * 精度
     */
    private Integer precisionFigure;

    /**
     * 使用状态，1启用0停用
     */
    private int enableFlag;

    public int getUnitType() {
        return unitType;
    }

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public int getEnablePrecision() {
        return enablePrecision;
    }

    public Integer getRoundingRole() {
        return roundingRole;
    }

    public Integer getPrecisionFigure() {
        return precisionFigure;
    }

    public int getEnableFlag() {
        return enableFlag;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnablePrecision(int enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setRoundingRole(Integer roundingRole) {
        this.roundingRole = roundingRole;
    }

    public void setPrecisionFigure(Integer precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setEnableFlag(int enableFlag) {
        this.enableFlag = enableFlag;
    }
}

