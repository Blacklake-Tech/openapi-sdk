package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessRouteRequestDTO  {
    /**
     * 工艺路线ID
     */
    private Long id;

    /**
     * 工艺路线编号
     */
    private String code;

    /**
     * 工艺路线名称
     */
    private String name;

    /**
     * 状态
     */
    private int status = 0;

    /**
     * 所属部门
     */
    private Long departmentId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 物料id
     */
    private long materialId = 0L;

    /**
     * 物料单位id
     */
    private long unitId = 0L;

    /**
     * 是否启用sop 1启用 0未启用
     */
    private int enableSop = 0;

    /**
     * 工序列表
     */
    private List<ProcessRouteNodeRequestDTO> processes;

    /**
     * 工序接续方式
     */
    private List<ProcessRouteNodeRelationRequestDTO> processConnections;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public String getRemark() {
        return remark;
    }

    public long getMaterialId() {
        return materialId;
    }

    public long getUnitId() {
        return unitId;
    }

    public int getEnableSop() {
        return enableSop;
    }

    public List<ProcessRouteNodeRequestDTO> getProcesses() {
        return processes;
    }

    public List<ProcessRouteNodeRelationRequestDTO> getProcessConnections() {
        return processConnections;
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

    public void setStatus(int status) {
        this.status = status;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setEnableSop(int enableSop) {
        this.enableSop = enableSop;
    }

    public void setProcesses(List<ProcessRouteNodeRequestDTO> processes) {
        this.processes = processes;
    }

    public void setProcessConnections(List<ProcessRouteNodeRelationRequestDTO> processConnections) {
        this.processConnections = processConnections;
    }
}

