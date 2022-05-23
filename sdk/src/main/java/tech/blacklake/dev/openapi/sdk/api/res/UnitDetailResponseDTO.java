package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class UnitDetailResponseDTO {
    /**
     * 单位id
     */
    private long id = 0;

    /**
     * 单位编号
     */
    private String code;

    /**
     * 单位名称
     */
    private String name;

    /**
     * 单位类型，0主单位，1转换单位，2辅助单位
     */
    private Integer unitType;

    /**
     * 单位描述
     */
    private String remark;

    /**
     * 精度管理，1启用0停用
     */
    private BizConstantDisplay enablePrecision;

    /**
     * 舍入规则，0四舍五入1奇进偶舍2进位3舍位
     */
    private BizConstantDisplay roundingRole;

    /**
     * 精度
     */
    private Integer precisionFigure;

    /**
     * 使用状态，1启用0停用
     */
    private BizConstantDisplay enableFlag;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getEnablePrecision() {
        return enablePrecision;
    }

    public BizConstantDisplay getRoundingRole() {
        return roundingRole;
    }

    public Integer getPrecisionFigure() {
        return precisionFigure;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
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

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnablePrecision(BizConstantDisplay enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setRoundingRole(BizConstantDisplay roundingRole) {
        this.roundingRole = roundingRole;
    }

    public void setPrecisionFigure(Integer precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }
}

