package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ResourceImportRequestDTO {
    /**
     * 设备编号，必填,单个工厂内编号唯一，不支持中文，不可超过255字符
     */
    private String code;

    /**
     * 设备名称，必填，不可超过255个字符
     */
    private String name;

    /**
     * 业务类型，生产设备/0，称量设备/1，其他设备/2
     */
    private String businessType;

    /**
     * 标识码, 非必填，不可超过255字符
     */
    private String codeEntityLinkCode;

    /**
     * 制造商，单行文本，不可超过255个字符
     */
    private String manufacturer;

    /**
     * 序列号，单行文本，不可超过255个字符
     */
    private String serialNo;

    /**
     * 负责人编号，用户多选，英文逗号分割，最多支持10个
     */
    private String userCodesStr;

    /**
     * 负责部门编号，部门多选，最多支5个
     */
    private String departmentCodesStr;

    /**
     * 入厂日期，格式为YYYY/mm/DD HH:MM:SS
     */
    private String enterFactoryDateStr;

    /**
     * 出厂日期，格式为YYYY/mm/DD HH:MM:SS
     */
    private String outFactoryDateStr;

    /**
     * 启用日期，格式为YYYY/mm/DD HH:MM:SS
     */
    private String enableDateStr;

    /**
     * 存储单位名称，单个，不可超过255字符
     */
    private String unitName;

    /**
     * 存储区域编号，单个，不可超过255字符
     */
    private String locationCode;

    /**
     * 外部ID,单个，不可超过255字符
     */
    private String externalNo;

    /**
     * 备注，单个，不可超过255字符
     */
    private String remark;

    /**
     * 品牌型号， 梅特勒/0，怡雪/1，金立方/2
     */
    private String brandModel;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBusinessType() {
        return businessType;
    }

    public String getCodeEntityLinkCode() {
        return codeEntityLinkCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public String getUserCodesStr() {
        return userCodesStr;
    }

    public String getDepartmentCodesStr() {
        return departmentCodesStr;
    }

    public String getEnterFactoryDateStr() {
        return enterFactoryDateStr;
    }

    public String getOutFactoryDateStr() {
        return outFactoryDateStr;
    }

    public String getEnableDateStr() {
        return enableDateStr;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public String getExternalNo() {
        return externalNo;
    }

    public String getRemark() {
        return remark;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setCodeEntityLinkCode(String codeEntityLinkCode) {
        this.codeEntityLinkCode = codeEntityLinkCode;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setUserCodesStr(String userCodesStr) {
        this.userCodesStr = userCodesStr;
    }

    public void setDepartmentCodesStr(String departmentCodesStr) {
        this.departmentCodesStr = departmentCodesStr;
    }

    public void setEnterFactoryDateStr(String enterFactoryDateStr) {
        this.enterFactoryDateStr = enterFactoryDateStr;
    }

    public void setOutFactoryDateStr(String outFactoryDateStr) {
        this.outFactoryDateStr = outFactoryDateStr;
    }

    public void setEnableDateStr(String enableDateStr) {
        this.enableDateStr = enableDateStr;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public void setExternalNo(String externalNo) {
        this.externalNo = externalNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }
}
