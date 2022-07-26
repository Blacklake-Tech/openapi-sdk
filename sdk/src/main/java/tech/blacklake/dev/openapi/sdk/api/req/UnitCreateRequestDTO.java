package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitCreateRequestDTO {
    /**
     * 单位名称，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 单位编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String code;

    /**
     * 修约规则，从[四舍五入，奇进偶舍，进位，舍位]中取一个值
     */
    private String roundingRole;

    /**
     * 精度管理，从[是，否]中取一个值
     */
    private String enablePrecision;

    /**
     * 单位精度，取值为[0,10]区间内的整数
     */
    private String precisionFigure;

    /**
     * 单位备注，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String remark;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getRoundingRole() {
        return roundingRole;
    }

    public String getEnablePrecision() {
        return enablePrecision;
    }

    public String getPrecisionFigure() {
        return precisionFigure;
    }

    public String getRemark() {
        return remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRoundingRole(String roundingRole) {
        this.roundingRole = roundingRole;
    }

    public void setEnablePrecision(String enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setPrecisionFigure(String precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

