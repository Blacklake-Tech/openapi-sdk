package tech.blacklake.dev.openapi.sdk.api.common;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class Unit  {
    /**
     * DEFAULT_SCALE
     */
    private int DEFAULT_SCALE = 6;

    /**
     * DEFAULT_ROUNDING_MODE
     */
    private RoundingMode DEFAULT_ROUNDING_MODE = RoundingMode.HALF_UP;

    /**
     * serialVersionUID
     */
    private long serialVersionUID = 1;

    /**
     * orgId
     */
    private Long orgId;

    /**
     * id
     */
    private Long id;

    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * enablePrecision
     */
    private boolean enablePrecision;

    /**
     * precisionFigure
     */
    private int precisionFigure;

    /**
     * roundingRole
     */
    private int roundingRole;

    public int getDEFAULT_SCALE() {
        return DEFAULT_SCALE;
    }

    public RoundingMode getDEFAULT_ROUNDING_MODE() {
        return DEFAULT_ROUNDING_MODE;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrgId() {
        return orgId;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean getEnablePrecision() {
        return enablePrecision;
    }

    public int getPrecisionFigure() {
        return precisionFigure;
    }

    public int getRoundingRole() {
        return roundingRole;
    }

    public void setDEFAULT_SCALE(int DEFAULT_SCALE) {
        this.DEFAULT_SCALE = DEFAULT_SCALE;
    }

    public void setDEFAULT_ROUNDING_MODE(RoundingMode DEFAULT_ROUNDING_MODE) {
        this.DEFAULT_ROUNDING_MODE = DEFAULT_ROUNDING_MODE;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnablePrecision(boolean enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setPrecisionFigure(int precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setRoundingRole(int roundingRole) {
        this.roundingRole = roundingRole;
    }
}

