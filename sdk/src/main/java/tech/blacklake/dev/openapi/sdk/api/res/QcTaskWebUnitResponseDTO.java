package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskWebUnitResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 单位编号
     */
    private String code;

    /**
     * 单位名称
     */
    private String name;

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

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
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
}
