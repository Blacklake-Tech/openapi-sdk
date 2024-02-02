package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomListResponseDTO  {
    /**
     * 业务ID
     */
    private long id;

    /**
     * 启用状态 key = ActiveEnum
     */
    private BizConstantDisplay active;

    /**
     * 父项物料ID
     */
    private long materialId;

    /**
     * 父项物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 是否是虚拟件 key = BooleanEnum
     */
    private BizConstantDisplay virtual;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 单位name
     */
    private String unitName;

    /**
     * 成品率
     */
    private String productRate;

    /**
     * 版本号
     */
    private String version;

    /**
     * 是否是默认版本 key = BooleanEnum
     */
    private BizConstantDisplay defaultVersion;

    /**
     * 版本说明
     */
    private String versionDescription;

    /**
     * 工艺路线ID
     */
    private Long processRouteId;

    /**
     * 工艺路线
     */
    private ProcessRouteSimpleResponseDTO processRouteSimpleResponseDTO;

    /**
     * 报工工序ID
     */
    private Long workReportProcessId;

    /**
     * 报工工序
     */
    private ProcessRouteNodeSimpleResponseDTO workReportProcessRouteNodeSimpleResponseDTO;

    /**
     * 报工控件Code
     */
    private String workReportSopControlCode;

    /**
     * 报工控件信息
     */
    private SopControlResponseDTO workReportSopControlDTO;

    /**
     * 所属部门
     */
    private Long ownedDepartmentId;

    /**
     * 所属部门名称
     */
    private String ownedDepartmentName;

    /**
     * 生产部门
     */
    private Long manufactureDepartmentId;

    /**
     * 生产部门名称
     */
    private String manufactureDepartmentName;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 单次报工数量
     */
    private String singleWorkReportAmount;

    /**
     * 创建人
     */
    private UserResponseDTO creator;

    /**
     * 更新人
     */
    private UserResponseDTO operator;

    /**
     * 创建时间
     */
    private long createdAt;

    /**
     * 更新时间
     */
    private long updatedAt;

    public long getId() {
        return id;
    }

    public BizConstantDisplay getActive() {
        return active;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BizConstantDisplay getVirtual() {
        return virtual;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getProductRate() {
        return productRate;
    }

    public String getVersion() {
        return version;
    }

    public BizConstantDisplay getDefaultVersion() {
        return defaultVersion;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public Long getProcessRouteId() {
        return processRouteId;
    }

    public ProcessRouteSimpleResponseDTO getProcessRouteSimpleResponseDTO() {
        return processRouteSimpleResponseDTO;
    }

    public Long getWorkReportProcessId() {
        return workReportProcessId;
    }

    public ProcessRouteNodeSimpleResponseDTO getWorkReportProcessRouteNodeSimpleResponseDTO() {
        return workReportProcessRouteNodeSimpleResponseDTO;
    }

    public String getWorkReportSopControlCode() {
        return workReportSopControlCode;
    }

    public SopControlResponseDTO getWorkReportSopControlDTO() {
        return workReportSopControlDTO;
    }

    public Long getOwnedDepartmentId() {
        return ownedDepartmentId;
    }

    public String getOwnedDepartmentName() {
        return ownedDepartmentName;
    }

    public Long getManufactureDepartmentId() {
        return manufactureDepartmentId;
    }

    public String getManufactureDepartmentName() {
        return manufactureDepartmentName;
    }

    public String getRemark() {
        return remark;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public UserResponseDTO getCreator() {
        return creator;
    }

    public UserResponseDTO getOperator() {
        return operator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setActive(BizConstantDisplay active) {
        this.active = active;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setVirtual(BizConstantDisplay virtual) {
        this.virtual = virtual;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDefaultVersion(BizConstantDisplay defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public void setProcessRouteId(Long processRouteId) {
        this.processRouteId = processRouteId;
    }

    public void setProcessRouteSimpleResponseDTO(ProcessRouteSimpleResponseDTO processRouteSimpleResponseDTO) {
        this.processRouteSimpleResponseDTO = processRouteSimpleResponseDTO;
    }

    public void setWorkReportProcessId(Long workReportProcessId) {
        this.workReportProcessId = workReportProcessId;
    }

    public void setWorkReportProcessRouteNodeSimpleResponseDTO(ProcessRouteNodeSimpleResponseDTO workReportProcessRouteNodeSimpleResponseDTO) {
        this.workReportProcessRouteNodeSimpleResponseDTO = workReportProcessRouteNodeSimpleResponseDTO;
    }

    public void setWorkReportSopControlCode(String workReportSopControlCode) {
        this.workReportSopControlCode = workReportSopControlCode;
    }

    public void setWorkReportSopControlDTO(SopControlResponseDTO workReportSopControlDTO) {
        this.workReportSopControlDTO = workReportSopControlDTO;
    }

    public void setOwnedDepartmentId(Long ownedDepartmentId) {
        this.ownedDepartmentId = ownedDepartmentId;
    }

    public void setOwnedDepartmentName(String ownedDepartmentName) {
        this.ownedDepartmentName = ownedDepartmentName;
    }

    public void setManufactureDepartmentId(Long manufactureDepartmentId) {
        this.manufactureDepartmentId = manufactureDepartmentId;
    }

    public void setManufactureDepartmentName(String manufactureDepartmentName) {
        this.manufactureDepartmentName = manufactureDepartmentName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }

    public void setCreator(UserResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(UserResponseDTO operator) {
        this.operator = operator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}

