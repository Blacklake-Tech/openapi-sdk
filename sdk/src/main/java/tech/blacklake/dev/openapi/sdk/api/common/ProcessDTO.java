package tech.blacklake.dev.openapi.sdk.api.common;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class ProcessDTO {
    /**
     * 工序编号,工厂内不能重复,支持字母、数字和符号,不可超过255个字符
     */
    private String code = "";

    /**
     * 工序名称,不可超过255个字符,前后不支持空格
     */
    private String name = "";

    /**
     * 所属部门,不可超过255个字符
     */
    private String departmentCode;

    /**
     * 工作中心编号,不可超过255个字符
     */
    private String workCenterCode = "";

    /**
     * 工序说明,不可超过1000个字符,支持换行
     */
    private String description;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getWorkCenterCode() {
        return workCenterCode;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setWorkCenterCode(String workCenterCode) {
        this.workCenterCode = workCenterCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

