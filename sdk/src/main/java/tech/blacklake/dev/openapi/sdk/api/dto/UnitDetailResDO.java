package tech.blacklake.dev.openapi.sdk.api.dto;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitDetailResDO  {
    /**
     * unitType
     */
    private Integer unitType;

    /**
     * orgId
     */
    private long orgId = 0L;

    /**
     * id
     */
    private long id = 0L;

    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * remark
     */
    private String remark;

    /**
     * enablePrecision
     */
    private BizConstantDisplay enablePrecision;

    /**
     * roundingRole
     */
    private BizConstantDisplay roundingRole;

    /**
     * precisionFigure
     */
    private int precisionFigure = 0;

    /**
     * enableFlag
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

