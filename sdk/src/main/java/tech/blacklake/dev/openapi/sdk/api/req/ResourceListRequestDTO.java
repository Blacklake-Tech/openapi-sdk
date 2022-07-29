package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ResourceListRequestDTO {
    /**
     * 资源名称
     */
    private String name;

    /**
     * 快捷查询
     */
    private String quickSearch;

    /**
     * 资源编号
     */
    private String code;

    /**
     * 制造商
     */
    private String manufacturer;

    /**
     * 序列号
     */
    private String serialNo;

    /**
     * 负责用户Id集合
     */
    private List<Long> userIdList;

    /**
     * 负责部门Id集合
     */
    private List<Long> departmentIdList;

    /**
     * 出厂日期-开始
     */
    private Long beginOutFactoryDate;

    /**
     * 出厂日期-结束
     */
    private Long endOutFactoryDate;

    /**
     * 入厂日期-开始
     */
    private Long beginEnterFactoryDate;

    /**
     * 入厂日期-结束
     */
    private Long endEnterFactoryDate;

    /**
     * 启用日期-开始
     */
    private Long beginEnableDate;

    /**
     * 启用日期-结束
     */
    private Long endEnableDate;

    /**
     * 出厂日期-开始
     */
    private LocalDateTime beginOutFactoryDateTime;

    /**
     * 出厂日期-结束
     */
    private LocalDateTime endOutFactoryDateTime;

    /**
     * 入厂日期-开始
     */
    private LocalDateTime beginEnterFactoryDateTime;

    /**
     * 入厂日期-结束
     */
    private LocalDateTime endEnterFactoryDateTime;

    /**
     * 启用日期-开始
     */
    private LocalDateTime beginEnableDateTime;

    /**
     * 启用日期-结束
     */
    private LocalDateTime endEnableDateTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态集合
     */
    private List<Integer> statusList;

    /**
     * 单位Id
     */
    private Long unitId;

    /**
     * 区域ID
     */
    private Long locationId;

    /**
     * 外部ID类似于mac地址
     */
    private String externalNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 业务范围
     */
    private List<Long> businessIdList;

    /**
     * id集合
     */
    private List<Long> idList;

    /**
     * 工厂ID
     */
    private Long orgId;

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 品牌模式
     */
    private Integer brandModel;

    /**
     * 标识码
     */
    private String entityLinkCode;

    /**
     * 是否展示子区域
     */
    private Boolean subLocationFlag;

    /**
     * 区域集合
     */
    private List<Long> locationIdList;

    /**
     * 父级ID
     */
    private Long parentId;

    /**
     * 是否只展示第一级，true 为 是，false 为否
     */
    private Boolean parentFlag;

    /**
     * 查看无区域设备, true - 是，false - 否
     */
    private Boolean selectNoLocationFlag;

    /**
     * 资源分类Id
     */
    private Long classificationId;

    /**
     * 标签ID集合
     */
    private List<Long> tagsIdList;

    /**
     * 供应商ID
     */
    private List<Long> supplierIdList;

    /**
     * 使用年限
     */
    private Integer useAge;

    /**
     * 使用年限单位- 数值
     */
    private Integer useAgeType;

    /**
     * 报废日期-开始
     */
    private LocalDateTime beginPlanScrapDateTime;

    /**
     * 报废日期-结束
     */
    private LocalDateTime endPlanScrapDateTime;

    /**
     * 报废日期-开始- 时间戳
     */
    private Long beginPlanScrapDate;

    /**
     * 报废日期-结束 - 时间戳
     */
    private Long endPlanScrapDate;

    /**
     * 资源类型 枚举 0- 设备 ，1 -能源仪表
     */
    private Integer type;

    public String getName() {
        return name;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public String getCode() {
        return code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public List<Long> getUserIdList() {
        return userIdList;
    }

    public List<Long> getDepartmentIdList() {
        return departmentIdList;
    }

    public Long getBeginOutFactoryDate() {
        return beginOutFactoryDate;
    }

    public Long getEndOutFactoryDate() {
        return endOutFactoryDate;
    }

    public Long getBeginEnterFactoryDate() {
        return beginEnterFactoryDate;
    }

    public Long getEndEnterFactoryDate() {
        return endEnterFactoryDate;
    }

    public Long getBeginEnableDate() {
        return beginEnableDate;
    }

    public Long getEndEnableDate() {
        return endEnableDate;
    }

    public LocalDateTime getBeginOutFactoryDateTime() {
        return beginOutFactoryDateTime;
    }

    public LocalDateTime getEndOutFactoryDateTime() {
        return endOutFactoryDateTime;
    }

    public LocalDateTime getBeginEnterFactoryDateTime() {
        return beginEnterFactoryDateTime;
    }

    public LocalDateTime getEndEnterFactoryDateTime() {
        return endEnterFactoryDateTime;
    }

    public LocalDateTime getBeginEnableDateTime() {
        return beginEnableDateTime;
    }

    public LocalDateTime getEndEnableDateTime() {
        return endEnableDateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public List<Integer> getStatusList() {
        return statusList;
    }

    public Long getUnitId() {
        return unitId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public String getExternalNo() {
        return externalNo;
    }

    public String getRemark() {
        return remark;
    }

    public List<Long> getBusinessIdList() {
        return businessIdList;
    }

    public List<Long> getIdList() {
        return idList;
    }

    public Long getOrgId() {
        return orgId;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public Integer getBrandModel() {
        return brandModel;
    }

    public String getEntityLinkCode() {
        return entityLinkCode;
    }

    public Boolean getSubLocationFlag() {
        return subLocationFlag;
    }

    public List<Long> getLocationIdList() {
        return locationIdList;
    }

    public Long getParentId() {
        return parentId;
    }

    public Boolean getParentFlag() {
        return parentFlag;
    }

    public Boolean getSelectNoLocationFlag() {
        return selectNoLocationFlag;
    }

    public Long getClassificationId() {
        return classificationId;
    }

    public List<Long> getTagsIdList() {
        return tagsIdList;
    }

    public List<Long> getSupplierIdList() {
        return supplierIdList;
    }

    public Integer getUseAge() {
        return useAge;
    }

    public Integer getUseAgeType() {
        return useAgeType;
    }

    public LocalDateTime getBeginPlanScrapDateTime() {
        return beginPlanScrapDateTime;
    }

    public LocalDateTime getEndPlanScrapDateTime() {
        return endPlanScrapDateTime;
    }

    public Long getBeginPlanScrapDate() {
        return beginPlanScrapDate;
    }

    public Long getEndPlanScrapDate() {
        return endPlanScrapDate;
    }

    public Integer getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setUserIdList(List<Long> userIdList) {
        this.userIdList = userIdList;
    }

    public void setDepartmentIdList(List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    public void setBeginOutFactoryDate(Long beginOutFactoryDate) {
        this.beginOutFactoryDate = beginOutFactoryDate;
    }

    public void setEndOutFactoryDate(Long endOutFactoryDate) {
        this.endOutFactoryDate = endOutFactoryDate;
    }

    public void setBeginEnterFactoryDate(Long beginEnterFactoryDate) {
        this.beginEnterFactoryDate = beginEnterFactoryDate;
    }

    public void setEndEnterFactoryDate(Long endEnterFactoryDate) {
        this.endEnterFactoryDate = endEnterFactoryDate;
    }

    public void setBeginEnableDate(Long beginEnableDate) {
        this.beginEnableDate = beginEnableDate;
    }

    public void setEndEnableDate(Long endEnableDate) {
        this.endEnableDate = endEnableDate;
    }

    public void setBeginOutFactoryDateTime(LocalDateTime beginOutFactoryDateTime) {
        this.beginOutFactoryDateTime = beginOutFactoryDateTime;
    }

    public void setEndOutFactoryDateTime(LocalDateTime endOutFactoryDateTime) {
        this.endOutFactoryDateTime = endOutFactoryDateTime;
    }

    public void setBeginEnterFactoryDateTime(LocalDateTime beginEnterFactoryDateTime) {
        this.beginEnterFactoryDateTime = beginEnterFactoryDateTime;
    }

    public void setEndEnterFactoryDateTime(LocalDateTime endEnterFactoryDateTime) {
        this.endEnterFactoryDateTime = endEnterFactoryDateTime;
    }

    public void setBeginEnableDateTime(LocalDateTime beginEnableDateTime) {
        this.beginEnableDateTime = beginEnableDateTime;
    }

    public void setEndEnableDateTime(LocalDateTime endEnableDateTime) {
        this.endEnableDateTime = endEnableDateTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public void setExternalNo(String externalNo) {
        this.externalNo = externalNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBusinessIdList(List<Long> businessIdList) {
        this.businessIdList = businessIdList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public void setBrandModel(Integer brandModel) {
        this.brandModel = brandModel;
    }

    public void setEntityLinkCode(String entityLinkCode) {
        this.entityLinkCode = entityLinkCode;
    }

    public void setSubLocationFlag(Boolean subLocationFlag) {
        this.subLocationFlag = subLocationFlag;
    }

    public void setLocationIdList(List<Long> locationIdList) {
        this.locationIdList = locationIdList;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setParentFlag(Boolean parentFlag) {
        this.parentFlag = parentFlag;
    }

    public void setSelectNoLocationFlag(Boolean selectNoLocationFlag) {
        this.selectNoLocationFlag = selectNoLocationFlag;
    }

    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    public void setTagsIdList(List<Long> tagsIdList) {
        this.tagsIdList = tagsIdList;
    }

    public void setSupplierIdList(List<Long> supplierIdList) {
        this.supplierIdList = supplierIdList;
    }

    public void setUseAge(Integer useAge) {
        this.useAge = useAge;
    }

    public void setUseAgeType(Integer useAgeType) {
        this.useAgeType = useAgeType;
    }

    public void setBeginPlanScrapDateTime(LocalDateTime beginPlanScrapDateTime) {
        this.beginPlanScrapDateTime = beginPlanScrapDateTime;
    }

    public void setEndPlanScrapDateTime(LocalDateTime endPlanScrapDateTime) {
        this.endPlanScrapDateTime = endPlanScrapDateTime;
    }

    public void setBeginPlanScrapDate(Long beginPlanScrapDate) {
        this.beginPlanScrapDate = beginPlanScrapDate;
    }

    public void setEndPlanScrapDate(Long endPlanScrapDate) {
        this.endPlanScrapDate = endPlanScrapDate;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}

