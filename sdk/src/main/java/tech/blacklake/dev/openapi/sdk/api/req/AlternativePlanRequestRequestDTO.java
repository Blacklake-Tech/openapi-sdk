package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class AlternativePlanRequestRequestDTO  {
    /**
     * 替代方案编号，支持字母、数字、符号，不可超过255字符
     */
    private String code = "";

    /**
     * 替代方案名称，不可超过255字符
     */
    private String name = "";

    /**
     * 替代策略，支持填写整批替代、混用替代
     */
    private String substitutionStrategy = "";

    /**
     * 所属部门，支持填写启用中的部门编号
     */
    private String ownedDepartmentCode;

    /**
     * 指定物料清单，支持填写是、否
     */
    private String specificBom = "";

    /**
     * 适用物料清单:父项物料编号，支持填写系统中存在且启用的物料编号
     */
    private String bomMaterialCode;

    /**
     * 适用物料清单:版本号，父项物料编号加版本号必须存在且启用
     */
    private String bomVersion;

    /**
     * 备注
     */
    private String remark;

    /**
     * 被替代物料
     */
    private List<OriginalAlternativeMaterialRequestRequestDTO> originalAlternativeMaterials;

    /**
     * 替代物料
     */
    private List<AlternativeMaterialRequestRequestDTO> alternativeMaterials;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSubstitutionStrategy() {
        return substitutionStrategy;
    }

    public String getOwnedDepartmentCode() {
        return ownedDepartmentCode;
    }

    public String getSpecificBom() {
        return specificBom;
    }

    public String getBomMaterialCode() {
        return bomMaterialCode;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public String getRemark() {
        return remark;
    }

    public List<OriginalAlternativeMaterialRequestRequestDTO> getOriginalAlternativeMaterials() {
        return originalAlternativeMaterials;
    }

    public List<AlternativeMaterialRequestRequestDTO> getAlternativeMaterials() {
        return alternativeMaterials;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubstitutionStrategy(String substitutionStrategy) {
        this.substitutionStrategy = substitutionStrategy;
    }

    public void setOwnedDepartmentCode(String ownedDepartmentCode) {
        this.ownedDepartmentCode = ownedDepartmentCode;
    }

    public void setSpecificBom(String specificBom) {
        this.specificBom = specificBom;
    }

    public void setBomMaterialCode(String bomMaterialCode) {
        this.bomMaterialCode = bomMaterialCode;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setOriginalAlternativeMaterials(List<OriginalAlternativeMaterialRequestRequestDTO> originalAlternativeMaterials) {
        this.originalAlternativeMaterials = originalAlternativeMaterials;
    }

    public void setAlternativeMaterials(List<AlternativeMaterialRequestRequestDTO> alternativeMaterials) {
        this.alternativeMaterials = alternativeMaterials;
    }
}

