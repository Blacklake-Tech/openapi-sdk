package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class UnitConversionResponseDTO {
    /**
     * 工厂id
     */
    private Long orgId;

    /**
     * 物料id
     */
    private Long materialId;

    /**
     * 业务id
     */
    private Long id;

    /**
     * 主单位id
     */
    private Long fromUnitId;

    /**
     * 主单位名称
     */
    private String fromUnitName;

    /**
     * 主单位转换系数
     */
    private Integer fromUnitCount;

    /**
     * 转换单位id
     */
    private Long toUnitId;

    /**
     * 转换单位名称
     */
    private String toUnitName;

    /**
     * 转换单位转换系数
     */
    private Integer toUnitCount;

    /**
     * 转换单位
     */
    private UnitDetailResponseDTO toUnit;

    /**
     * 转换关系类型，0主单位、1转换单位、2辅助单位
     */
    private BizConstantDisplay convertType;

    /**
     * 物料转换单位启停用状态，1启用0停用，若单位本身已停用，此处也为已停用
     */
    private BizConstantDisplay enableFlag;

    public Long getOrgId() {
        return orgId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Long getId() {
        return id;
    }

    public Long getFromUnitId() {
        return fromUnitId;
    }

    public String getFromUnitName() {
        return fromUnitName;
    }

    public Integer getFromUnitCount() {
        return fromUnitCount;
    }

    public Long getToUnitId() {
        return toUnitId;
    }

    public String getToUnitName() {
        return toUnitName;
    }

    public Integer getToUnitCount() {
        return toUnitCount;
    }

    public UnitDetailResponseDTO getToUnit() {
        return toUnit;
    }

    public BizConstantDisplay getConvertType() {
        return convertType;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFromUnitId(Long fromUnitId) {
        this.fromUnitId = fromUnitId;
    }

    public void setFromUnitName(String fromUnitName) {
        this.fromUnitName = fromUnitName;
    }

    public void setFromUnitCount(Integer fromUnitCount) {
        this.fromUnitCount = fromUnitCount;
    }

    public void setToUnitId(Long toUnitId) {
        this.toUnitId = toUnitId;
    }

    public void setToUnitName(String toUnitName) {
        this.toUnitName = toUnitName;
    }

    public void setToUnitCount(Integer toUnitCount) {
        this.toUnitCount = toUnitCount;
    }

    public void setToUnit(UnitDetailResponseDTO toUnit) {
        this.toUnit = toUnit;
    }

    public void setConvertType(BizConstantDisplay convertType) {
        this.convertType = convertType;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }
}

