package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomUpsertRequestRequestDTO  {
    /**
     * 父项物料编号,不可超过255个字符
     */
    private String materialCode;

    /**
     * 父项物料名称,不可超过255个字符
     */
    private String materialName;

    /**
     * 单位名称,不可超过255个字符
     */
    private String unit;

    /**
     * 工艺路线编号,不可超过255个字符
     */
    private String processRoute;

    /**
     * 版本号,同一工厂下,父项物料编号+版本号不能重复,支持数字、数字和字母,不可超过255个字符
     */
    private String version;

    /**
     * 版本说明,不可超过1000个字符,支持换行
     */
    private String versionDescription;

    /**
     * 默认版本,是1否0,默认为1
     */
    private Integer defaultVersionInt;

    /**
     * 默认版本,默认为是
     */
    private String defaultVersion;

    /**
     * 成品率(%)，默认值为100,必须大于0,小数点后不得超过4位,必须小于等于1000
     */
    private String productRate;

    /**
     * 报工控件编号,不可超过255个字符
     */
    private String workReportSopControlCode;

    /**
     * 单次报工数量,默认null,必须大于0
     */
    private String singleWorkReportAmount;

    /**
     * 所属部门编号,不可超过255个字符
     */
    private String ownedDepartmentCode;

    /**
     * 生产部门编号,不可超过255个字符
     */
    private String manufactureDepartmentCode;

    /**
     * 备注,不可超过1000个字符,支持换行
     */
    private String remark;

    /**
     * 多产出物料行
     */
    private List<BomOutputMaterialRequestDTO> bomOutputMaterials;

    /**
     * 子项物料行
     */
    private List<BomInputMaterialRequestDTO> bomInputMaterials;

    /**
     * 报工方式
     */
    private String reportingMethods;

    /**
     * 是否入库
     */
    private String warehousing;

    /**
     * 自动入库
     */
    private String autoWarehousingFlag;

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getUnit() {
        return unit;
    }

    public String getProcessRoute() {
        return processRoute;
    }

    public String getVersion() {
        return version;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public Integer getDefaultVersionInt() {
        return defaultVersionInt;
    }

    public String getDefaultVersion() {
        return defaultVersion;
    }

    public String getProductRate() {
        return productRate;
    }

    public String getWorkReportSopControlCode() {
        return workReportSopControlCode;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public String getOwnedDepartmentCode() {
        return ownedDepartmentCode;
    }

    public String getManufactureDepartmentCode() {
        return manufactureDepartmentCode;
    }

    public String getRemark() {
        return remark;
    }

    public List<BomOutputMaterialRequestDTO> getBomOutputMaterials() {
        return bomOutputMaterials;
    }

    public List<BomInputMaterialRequestDTO> getBomInputMaterials() {
        return bomInputMaterials;
    }

    public String getReportingMethods() {
        return reportingMethods;
    }

    public String getWarehousing() {
        return warehousing;
    }

    public String getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setProcessRoute(String processRoute) {
        this.processRoute = processRoute;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public void setDefaultVersionInt(Integer defaultVersionInt) {
        this.defaultVersionInt = defaultVersionInt;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public void setWorkReportSopControlCode(String workReportSopControlCode) {
        this.workReportSopControlCode = workReportSopControlCode;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }

    public void setOwnedDepartmentCode(String ownedDepartmentCode) {
        this.ownedDepartmentCode = ownedDepartmentCode;
    }

    public void setManufactureDepartmentCode(String manufactureDepartmentCode) {
        this.manufactureDepartmentCode = manufactureDepartmentCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBomOutputMaterials(List<BomOutputMaterialRequestDTO> bomOutputMaterials) {
        this.bomOutputMaterials = bomOutputMaterials;
    }

    public void setBomInputMaterials(List<BomInputMaterialRequestDTO> bomInputMaterials) {
        this.bomInputMaterials = bomInputMaterials;
    }

    public void setReportingMethods(String reportingMethods) {
        this.reportingMethods = reportingMethods;
    }

    public void setWarehousing(String warehousing) {
        this.warehousing = warehousing;
    }

    public void setAutoWarehousingFlag(String autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }
}

