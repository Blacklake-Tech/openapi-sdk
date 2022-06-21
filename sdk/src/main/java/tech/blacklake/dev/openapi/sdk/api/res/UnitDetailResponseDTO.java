package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitDetailResponseDTO  {
    /**
     * 单位类型
     */
    private Integer unitType;

    /**
     * 工厂id
     */
    private long orgId = 0;

    /**
     * id
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
     * 备注
     */
    private String remark;

    /**
     * 是否开启精度
     */
    private BizConstantDisplay enablePrecision;

    /**
     * 舍入规则
     */
    private BizConstantDisplay roundingRole;

    /**
     * 精度
     */
    private int precisionFigure = 0;

    /**
     * 是否启用
     */
    private BizConstantDisplay enableFlag;

    public Integer getUnitType() {
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

    public BizConstantDisplay getEnablePrecision() {
        return enablePrecision;
    }

    public BizConstantDisplay getRoundingRole() {
        return roundingRole;
    }

    public int getPrecisionFigure() {
        return precisionFigure;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public void setUnitType(Integer unitType) {
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

    public void setEnablePrecision(BizConstantDisplay enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setRoundingRole(BizConstantDisplay roundingRole) {
        this.roundingRole = roundingRole;
    }

    public void setPrecisionFigure(int precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }
}

