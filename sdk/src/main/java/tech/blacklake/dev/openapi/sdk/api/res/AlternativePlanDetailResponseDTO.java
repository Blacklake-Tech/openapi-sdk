package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AlternativePlanDetailResponseDTO  {
    /**
     * 替代方案Id
     */
    private long id = 0;

    /**
     * 替代方案code
     */
    private String code;

    /**
     * 替代方案name
     */
    private String name;

    /**
     * 所属部门
     */
    private Long ownedDepartmentId;

    /**
     * 所属部门名称
     */
    private String ownedDepartmentName;

    /**
     * 替代策略 key = SubstitutionStrategyEnum
     */
    private BizConstantDisplay substitutionStrategy;

    /**
     * 指定物料清单 key = BooleanEnum
     */
    private BizConstantDisplay specificBom;

    /**
     * 适用物料清单
     */
    private Long bomId;

    /**
     * 物料清单信息
     */
    private BomBasicResponseDTO bomBasicResponseDTO;

    /**
     * 备注
     */
    private String remark;

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
    private long createdAt = 0;

    /**
     * 更新时间
     */
    private long updatedAt = 0;

    /**
     * 被替代料列表
     */
    private List<OriginalAlternativeMaterialDetailResponseDTO> originalAlternativeMaterials;

    /**
     * 替代料列表
     */
    private List<AlternativeMaterialDetailResponseDTO> alternativeMaterials;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Long getOwnedDepartmentId() {
        return ownedDepartmentId;
    }

    public String getOwnedDepartmentName() {
        return ownedDepartmentName;
    }

    public BizConstantDisplay getSubstitutionStrategy() {
        return substitutionStrategy;
    }

    public BizConstantDisplay getSpecificBom() {
        return specificBom;
    }

    public Long getBomId() {
        return bomId;
    }

    public BomBasicResponseDTO getBomBasicResponseDTO() {
        return bomBasicResponseDTO;
    }

    public String getRemark() {
        return remark;
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

    public List<OriginalAlternativeMaterialDetailResponseDTO> getOriginalAlternativeMaterials() {
        return originalAlternativeMaterials;
    }

    public List<AlternativeMaterialDetailResponseDTO> getAlternativeMaterials() {
        return alternativeMaterials;
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

    public void setOwnedDepartmentId(Long ownedDepartmentId) {
        this.ownedDepartmentId = ownedDepartmentId;
    }

    public void setOwnedDepartmentName(String ownedDepartmentName) {
        this.ownedDepartmentName = ownedDepartmentName;
    }

    public void setSubstitutionStrategy(BizConstantDisplay substitutionStrategy) {
        this.substitutionStrategy = substitutionStrategy;
    }

    public void setSpecificBom(BizConstantDisplay specificBom) {
        this.specificBom = specificBom;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setBomBasicResponseDTO(BomBasicResponseDTO bomBasicResponseDTO) {
        this.bomBasicResponseDTO = bomBasicResponseDTO;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public void setOriginalAlternativeMaterials(List<OriginalAlternativeMaterialDetailResponseDTO> originalAlternativeMaterials) {
        this.originalAlternativeMaterials = originalAlternativeMaterials;
    }

    public void setAlternativeMaterials(List<AlternativeMaterialDetailResponseDTO> alternativeMaterials) {
        this.alternativeMaterials = alternativeMaterials;
    }
}

