package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessRouteUpsertRequestDTO  {
    /**
     * 工艺路线编号,不能重复,支持字母、数字和符号,不可超过255个字符,前后不支持空格
     */
    private String processRouteCode;

    /**
     * 工艺路线名称,不可超过255个字符,前后不支持空格
     */
    private String processRouteName;

    /**
     * 所属部门编号,不可超过255个字符
     */
    private String departmentCode;

    /**
     * 物料编号,不可超过255个字符
     */
    private String materialCode;

    /**
     * 物料名称,不可超过255个字符
     */
    private String materialName;

    /**
     * 备注,不可超过1000个字符,支持换行
     */
    private String remark;

    /**
     * 单位名称,不可超过1000个字符,支持换行
     */
    private String unitName;

    /**
     * 启用SOP,是1否0
     */
    private Integer enableSopInt;

    /**
     * 启用SOP
     */
    private String enableSop;

    /**
     * 工序信息
     */
    private List<ProcessRouteNodeRequestDTO> processes;

    public String getProcessRouteCode() {
        return processRouteCode;
    }

    public String getProcessRouteName() {
        return processRouteName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getRemark() {
        return remark;
    }

    public String getUnitName() {
        return unitName;
    }

    public Integer getEnableSopInt() {
        return enableSopInt;
    }

    public String getEnableSop() {
        return enableSop;
    }

    public List<ProcessRouteNodeRequestDTO> getProcesses() {
        return processes;
    }

    public void setProcessRouteCode(String processRouteCode) {
        this.processRouteCode = processRouteCode;
    }

    public void setProcessRouteName(String processRouteName) {
        this.processRouteName = processRouteName;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setEnableSopInt(Integer enableSopInt) {
        this.enableSopInt = enableSopInt;
    }

    public void setEnableSop(String enableSop) {
        this.enableSop = enableSop;
    }

    public void setProcesses(List<ProcessRouteNodeRequestDTO> processes) {
        this.processes = processes;
    }
}

