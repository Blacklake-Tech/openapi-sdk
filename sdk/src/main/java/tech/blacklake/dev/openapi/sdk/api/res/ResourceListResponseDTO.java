package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceListResponseDTO  {
    /**
     * 主键
     */
    private long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 制造商
     */
    private String manufacturer;

    /**
     * 序列号
     */
    private String serialNo;

    /**
     * 入场日期
     */
    private Long enterFactoryDate;

    /**
     * 出厂编号
     */
    private Long outFactoryDate;

    /**
     * 启用日期
     */
    private Long enableDate;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 外部地址，类似于mac地址之类
     */
    private String externalNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 资源分类id
     */
    private Long resourceClassificationId;

    /**
     * 区域id
     */
    private Long locationId;

    /**
     * 设备参数
     */
    private List<ResourceParamsResponseDTO> paramsVOList;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public Long getEnterFactoryDate() {
        return enterFactoryDate;
    }

    public Long getOutFactoryDate() {
        return outFactoryDate;
    }

    public Long getEnableDate() {
        return enableDate;
    }

    public Integer getStatus() {
        return status;
    }

    public Long getUnitId() {
        return unitId;
    }

    public String getExternalNo() {
        return externalNo;
    }

    public String getRemark() {
        return remark;
    }

    public Long getResourceClassificationId() {
        return resourceClassificationId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public List<ResourceParamsResponseDTO> getParamsVOList() {
        return paramsVOList;
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

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setEnterFactoryDate(Long enterFactoryDate) {
        this.enterFactoryDate = enterFactoryDate;
    }

    public void setOutFactoryDate(Long outFactoryDate) {
        this.outFactoryDate = outFactoryDate;
    }

    public void setEnableDate(Long enableDate) {
        this.enableDate = enableDate;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setExternalNo(String externalNo) {
        this.externalNo = externalNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setResourceClassificationId(Long resourceClassificationId) {
        this.resourceClassificationId = resourceClassificationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public void setParamsVOList(List<ResourceParamsResponseDTO> paramsVOList) {
        this.paramsVOList = paramsVOList;
    }
}

