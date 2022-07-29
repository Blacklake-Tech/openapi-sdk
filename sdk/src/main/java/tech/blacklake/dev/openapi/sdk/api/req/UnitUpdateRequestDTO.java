package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitUpdateRequestDTO {
    /**
     * 单位ID
     */
    private long id = 0L;

    /**
     * 单位编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String code;

    /**
     * 单位名称，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 舍入规则，0四舍五入，1奇进偶舍，2进位，3舍位
     */
    private int roundingRole = 0;

    /**
     * 是否启用精度管理，1启用，0停用
     */
    private int enablePrecision = 0;

    /**
     * 单位精度管理位数，取值为[0,10]区间内的整数
     */
    private Integer precisionFigure;

    /**
     * 单位备注，支持字母、数字和符号，不可超过255个字符
     */
    private String remark;

    /**
     * 编辑原因，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String reason;

    /**
     * 自定义字段
     */
    private List<CustomFiledRequestDTO> customFields;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getRoundingRole() {
        return roundingRole;
    }

    public int getEnablePrecision() {
        return enablePrecision;
    }

    public Integer getPrecisionFigure() {
        return precisionFigure;
    }

    public String getRemark() {
        return remark;
    }

    public String getReason() {
        return reason;
    }

    public List<CustomFiledRequestDTO> getCustomFields() {
        return customFields;
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

    public void setRoundingRole(int roundingRole) {
        this.roundingRole = roundingRole;
    }

    public void setEnablePrecision(int enablePrecision) {
        this.enablePrecision = enablePrecision;
    }

    public void setPrecisionFigure(Integer precisionFigure) {
        this.precisionFigure = precisionFigure;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setCustomFields(List<CustomFiledRequestDTO> customFields) {
        this.customFields = customFields;
    }
}

