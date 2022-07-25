package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomForErpUpsertRequestDTO {
    /**
     * 父项物料编号
     */
    private String materialCode = "";

    /**
     * 版本号,同一工厂下,父项物料编号+版本号不能重复,支持数字、数字和字母,不可超过255个字符
     */
    private String version = "";

    /**
     * 单位名称
     */
    private String unit;

    /**
     * 成品率(%)，默认值为100,必须大于0,小数点后不得超过4位,必须小于等于1000
     */
    private String productRate;

    /**
     * 默认版本,是1否0,默认为1
     */
    private Integer defaultVersion;

    /**
     * 版本说明,不可超过1000个字符,支持换行
     */
    private String versionDescription;

    /**
     * 所属部门编号
     */
    private String ownedDepartmentCode;

    /**
     * 生产部门编号
     */
    private String manufactureDepartmentCode;

    /**
     * 备注,不可超过1000个字符,支持换行
     */
    private String remark;

    /**
     * 多产出物料行
     */
    private List<BomOutputMaterialForErpRequestDTO> bomOutputMaterials;

    /**
     * 子项物料行
     */
    private List<BomInputMaterialForErpRequestDTO> bomInputMaterials;

    public String getMaterialCode() {
        return materialCode;
    }

    public String getVersion() {
        return version;
    }

    public String getUnit() {
        return unit;
    }

    public String getProductRate() {
        return productRate;
    }

    public Integer getDefaultVersion() {
        return defaultVersion;
    }

    public String getVersionDescription() {
        return versionDescription;
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

    public List<BomOutputMaterialForErpRequestDTO> getBomOutputMaterials() {
        return bomOutputMaterials;
    }

    public List<BomInputMaterialForErpRequestDTO> getBomInputMaterials() {
        return bomInputMaterials;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public void setDefaultVersion(Integer defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
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

    public void setBomOutputMaterials(List<BomOutputMaterialForErpRequestDTO> bomOutputMaterials) {
        this.bomOutputMaterials = bomOutputMaterials;
    }

    public void setBomInputMaterials(List<BomInputMaterialForErpRequestDTO> bomInputMaterials) {
        this.bomInputMaterials = bomInputMaterials;
    }
}

