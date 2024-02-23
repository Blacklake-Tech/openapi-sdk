package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialDetailUnitResponseDTO {
    /**
     * 物料单位关联ID
     */
    private Long relationId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 单位类型
     */
    private Integer unitType;

    /**
     * 单位ID
     */
    private Long id;

    /**
     * 单位名称
     */
    private String name;

    /**
     * 单位编号
     */
    private String code;

    /**
     * 单位描述
     */
    private String remark;

    /**
     * 精度管理，1启用0停用
     */
    private BizConstantDisplay enablePrecision;

    /**
     * 舍入规则，0四舍五入1奇进偶舍2进位3舍位
     */
    private BizConstantDisplay roundingRole;

    /**
     * 精度
     */
    private Integer precisionFigure;

    /**
     * 使用状态，1启用0停用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 顺序
     */
    private Integer serialNo;

    public Long getRelationId() {
        return relationId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getEnablePrecision() {
        return enablePrecision;
    }

    public BizConstantDisplay getRoundingRole() {
        return roundingRole;
    }

    public Integer getPrecisionFigure() {
        return precisionFigure;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnablePrecision(BizConstantDisplay enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setRoundingRole(BizConstantDisplay roundingRole) {
        this.roundingRole = roundingRole;
    }

    public void setPrecisionFigure(Integer precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }
}
