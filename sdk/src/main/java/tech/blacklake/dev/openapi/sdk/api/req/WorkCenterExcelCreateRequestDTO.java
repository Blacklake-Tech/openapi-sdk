package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkCenterExcelCreateRequestDTO {
    /**
     * 工作中心编号，不可超过255字符
     */
    private String workCenterCode;

    /**
     * 工作中心名称，不可超过255字符
     */
    private String name;

    /**
     * 所属部门，部门编号
     */
    private String departmentCode;

    /**
     * 收料仓库，仓库编号
     */
    private String receiveWarehouseCode;

    /**
     * 投料仓位，仓位编号集合
     */
    private String feedStorageCodes;

    /**
     * 入库仓位，仓位编号集合
     */
    private String inputStorageCodes;

    /**
     * 备注， 不可超过255字符
     */
    private String remark;

    /**
     * 生产部门， 资源组 - 多部门/ 编号用逗号拼接
     */
    private String departmentCodes;

    /**
     * 生产执行人， 资源组 - 多用户 / 用户编号用逗号拼接
     */
    private String userCodes;

    /**
     * 设备， 资源组 - 多设备/ 设备编号用逗号拼接
     */
    private String equipmentCodes;

    public String getWorkCenterCode() {
        return workCenterCode;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getReceiveWarehouseCode() {
        return receiveWarehouseCode;
    }

    public String getFeedStorageCodes() {
        return feedStorageCodes;
    }

    public String getInputStorageCodes() {
        return inputStorageCodes;
    }

    public String getRemark() {
        return remark;
    }

    public String getDepartmentCodes() {
        return departmentCodes;
    }

    public String getUserCodes() {
        return userCodes;
    }

    public String getEquipmentCodes() {
        return equipmentCodes;
    }

    public void setWorkCenterCode(String workCenterCode) {
        this.workCenterCode = workCenterCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setReceiveWarehouseCode(String receiveWarehouseCode) {
        this.receiveWarehouseCode = receiveWarehouseCode;
    }

    public void setFeedStorageCodes(String feedStorageCodes) {
        this.feedStorageCodes = feedStorageCodes;
    }

    public void setInputStorageCodes(String inputStorageCodes) {
        this.inputStorageCodes = inputStorageCodes;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDepartmentCodes(String departmentCodes) {
        this.departmentCodes = departmentCodes;
    }

    public void setUserCodes(String userCodes) {
        this.userCodes = userCodes;
    }

    public void setEquipmentCodes(String equipmentCodes) {
        this.equipmentCodes = equipmentCodes;
    }
}
