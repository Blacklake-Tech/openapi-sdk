package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceParamsResponseDTO  {
    /**
     * 资源ID
     */
    private long resourceId;

    /**
     * 参数ID
     */
    private long paramsId;

    /**
     * 参数名称
     */
    private String paramsName;

    /**
     * 参数编号
     */
    private String paramsCode;

    /**
     * 参数类型
     */
    private BizConstantDisplay paramsType;

    /**
     * 单位ID
     */
    private Long unitId;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 单位编号
     */
    private String unitCode;

    /**
     * 参数标准值
     */
    private BigDecimal paramsStandard;

    /**
     * 参数上限
     */
    private BigDecimal paramsUpperLimit;

    /**
     * 参数上上限
     */
    private BigDecimal paramsTopLimit;

    /**
     * 参数下限
     */
    private BigDecimal paramsLowerLimit;

    /**
     * 参数下下限
     */
    private BigDecimal paramsFloorLimit;

    public long getResourceId() {
        return resourceId;
    }

    public long getParamsId() {
        return paramsId;
    }

    public String getParamsName() {
        return paramsName;
    }

    public String getParamsCode() {
        return paramsCode;
    }

    public BizConstantDisplay getParamsType() {
        return paramsType;
    }

    public Long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public BigDecimal getParamsStandard() {
        return paramsStandard;
    }

    public BigDecimal getParamsUpperLimit() {
        return paramsUpperLimit;
    }

    public BigDecimal getParamsTopLimit() {
        return paramsTopLimit;
    }

    public BigDecimal getParamsLowerLimit() {
        return paramsLowerLimit;
    }

    public BigDecimal getParamsFloorLimit() {
        return paramsFloorLimit;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    public void setParamsId(long paramsId) {
        this.paramsId = paramsId;
    }

    public void setParamsName(String paramsName) {
        this.paramsName = paramsName;
    }

    public void setParamsCode(String paramsCode) {
        this.paramsCode = paramsCode;
    }

    public void setParamsType(BizConstantDisplay paramsType) {
        this.paramsType = paramsType;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setParamsStandard(BigDecimal paramsStandard) {
        this.paramsStandard = paramsStandard;
    }

    public void setParamsUpperLimit(BigDecimal paramsUpperLimit) {
        this.paramsUpperLimit = paramsUpperLimit;
    }

    public void setParamsTopLimit(BigDecimal paramsTopLimit) {
        this.paramsTopLimit = paramsTopLimit;
    }

    public void setParamsLowerLimit(BigDecimal paramsLowerLimit) {
        this.paramsLowerLimit = paramsLowerLimit;
    }

    public void setParamsFloorLimit(BigDecimal paramsFloorLimit) {
        this.paramsFloorLimit = paramsFloorLimit;
    }
}

