package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceParamsRequestDTO  {
    /**
     * 资源ID
     */
    private Long resourceId;

    /**
     * 参数ID
     */
    private Long paramsId;

    /**
     * 参数标准值
     */
    private String paramsStandard;

    /**
     * 参数上限
     */
    private String paramsUpperLimit;

    /**
     * 参数上上限
     */
    private String paramsTopLimit;

    /**
     * 参数下限
     */
    private String paramsLowerLimit;

    /**
     * 参数下下限
     */
    private String paramsFloorLimit;

    public Long getResourceId() {
        return resourceId;
    }

    public Long getParamsId() {
        return paramsId;
    }

    public String getParamsStandard() {
        return paramsStandard;
    }

    public String getParamsUpperLimit() {
        return paramsUpperLimit;
    }

    public String getParamsTopLimit() {
        return paramsTopLimit;
    }

    public String getParamsLowerLimit() {
        return paramsLowerLimit;
    }

    public String getParamsFloorLimit() {
        return paramsFloorLimit;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public void setParamsId(Long paramsId) {
        this.paramsId = paramsId;
    }

    public void setParamsStandard(String paramsStandard) {
        this.paramsStandard = paramsStandard;
    }

    public void setParamsUpperLimit(String paramsUpperLimit) {
        this.paramsUpperLimit = paramsUpperLimit;
    }

    public void setParamsTopLimit(String paramsTopLimit) {
        this.paramsTopLimit = paramsTopLimit;
    }

    public void setParamsLowerLimit(String paramsLowerLimit) {
        this.paramsLowerLimit = paramsLowerLimit;
    }

    public void setParamsFloorLimit(String paramsFloorLimit) {
        this.paramsFloorLimit = paramsFloorLimit;
    }
}

