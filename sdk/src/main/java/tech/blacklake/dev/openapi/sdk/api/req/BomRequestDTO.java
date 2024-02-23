package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BomRequestDTO {
    /**
     * 物料清单Id
     */
    private Long id;

    /**
     * 父项物料ID
     */
    private long materialId;

    /**
     * 是否是虚拟件
     */
    private int virtual;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 成品率
     */
    private String productRate;

    /**
     * 版本号
     */
    private String version;

    /**
     * 是否是默认版本
     */
    private int defaultVersion;

    /**
     * 版本说明
     */
    private String versionDescription;

    /**
     * 工艺路线ID
     */
    private Long processRouteId;

    /**
     * 报工工序ID
     */
    private Long workReportProcessId;

    /**
     * 报工控件Code
     */
    private String workReportSopControlCode;

    /**
     * 所属部门
     */
    private Long ownedDepartmentId;

    /**
     * 生产部门
     */
    private Long manufactureDepartmentId;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 单次报工数量
     */
    private String singleWorkReportAmount;

    /**
     * 报工方式
     */
    private List<Integer> reportingMethods;

    /**
     * 是否入库
     */
    private int warehousing;

    /**
     * 自动入库
     */
    private Integer autoWarehousingFlag;

    /**
     * 子项物料第一层
     */
    private List<BomInputMaterialRequestDTO> bomInputMaterials;

    /**
     * 多产出
     */
    private List<BomOutputMaterialRequestDTO> bomOutputMaterials;

    public Long getId() {
        return id;
    }

    public long getMaterialId() {
        return materialId;
    }

    public int getVirtual() {
        return virtual;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getProductRate() {
        return productRate;
    }

    public String getVersion() {
        return version;
    }

    public int getDefaultVersion() {
        return defaultVersion;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public Long getProcessRouteId() {
        return processRouteId;
    }

    public Long getWorkReportProcessId() {
        return workReportProcessId;
    }

    public String getWorkReportSopControlCode() {
        return workReportSopControlCode;
    }

    public Long getOwnedDepartmentId() {
        return ownedDepartmentId;
    }

    public Long getManufactureDepartmentId() {
        return manufactureDepartmentId;
    }

    public String getRemark() {
        return remark;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public List<Integer> getReportingMethods() {
        return reportingMethods;
    }

    public int getWarehousing() {
        return warehousing;
    }

    public Integer getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public List<BomInputMaterialRequestDTO> getBomInputMaterials() {
        return bomInputMaterials;
    }

    public List<BomOutputMaterialRequestDTO> getBomOutputMaterials() {
        return bomOutputMaterials;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setVirtual(int virtual) {
        this.virtual = virtual;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDefaultVersion(int defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public void setProcessRouteId(Long processRouteId) {
        this.processRouteId = processRouteId;
    }

    public void setWorkReportProcessId(Long workReportProcessId) {
        this.workReportProcessId = workReportProcessId;
    }

    public void setWorkReportSopControlCode(String workReportSopControlCode) {
        this.workReportSopControlCode = workReportSopControlCode;
    }

    public void setOwnedDepartmentId(Long ownedDepartmentId) {
        this.ownedDepartmentId = ownedDepartmentId;
    }

    public void setManufactureDepartmentId(Long manufactureDepartmentId) {
        this.manufactureDepartmentId = manufactureDepartmentId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }

    public void setReportingMethods(List<Integer> reportingMethods) {
        this.reportingMethods = reportingMethods;
    }

    public void setWarehousing(int warehousing) {
        this.warehousing = warehousing;
    }

    public void setAutoWarehousingFlag(Integer autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }

    public void setBomInputMaterials(List<BomInputMaterialRequestDTO> bomInputMaterials) {
        this.bomInputMaterials = bomInputMaterials;
    }

    public void setBomOutputMaterials(List<BomOutputMaterialRequestDTO> bomOutputMaterials) {
        this.bomOutputMaterials = bomOutputMaterials;
    }
}
