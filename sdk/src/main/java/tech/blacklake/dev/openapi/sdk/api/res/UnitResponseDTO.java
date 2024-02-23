package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UnitResponseDTO {
    /**
     * 区域ID
     */
    private Long orgId;

    /**
     * 单位ID
     */
    private Long id;

    /**
     * 单位编号
     */
    private String code;

    /**
     * 单位名称
     */
    private String name;

    /**
     * 单位编号
     */
    private Boolean enablePrecision;

    /**
     * 单位编号
     */
    private Integer precisionFigure;

    /**
     * 单位编号
     */
    private Integer roundingRole;

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

    public Boolean getEnablePrecision() {
        return enablePrecision;
    }

    public Integer getPrecisionFigure() {
        return precisionFigure;
    }

    public Integer getRoundingRole() {
        return roundingRole;
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

    public void setEnablePrecision(Boolean enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setPrecisionFigure(Integer precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setRoundingRole(Integer roundingRole) {
        this.roundingRole = roundingRole;
    }
}
