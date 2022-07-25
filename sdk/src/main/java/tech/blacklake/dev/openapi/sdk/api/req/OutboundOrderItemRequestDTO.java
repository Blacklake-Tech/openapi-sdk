package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderItemRequestDTO extends CustomFieldBaseCO {
    /**
     * id
     */
    private Long id;

    /**
     * 出库单编号 必须是工厂内或出库单基本信息中存在的出库单编号
     */
    private String code = "";

    /**
     * 行号 仅支持整数，必须大于等于 0 ，不可超过 10,000,000；同工单内，行号不可重复
     */
    private String lineNo = "";

    /**
     * 物料编号 必须是系统内存在且已启用的物料编号
     */
    private String materialCode = "";

    /**
     * 计划数量 若填写必须大于0，小于10,000,000，小数点后位数不可超过10位
     */
    private String planAmount;

    /**
     * 批次号 必须是系统存在的批次号
     */
    private String batchNo;

    /**
     * 单位名称 必须是该物料上存在且已启用的主单位或转换单位名称，未填写时默认为该物料主单位
     */
    private String unit;

    /**
     * 备注 不可超过1000字符
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLineNo() {
        return lineNo;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getPlanAmount() {
        return planAmount;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getUnit() {
        return unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

