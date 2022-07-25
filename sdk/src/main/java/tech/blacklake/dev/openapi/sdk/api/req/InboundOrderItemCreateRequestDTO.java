package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderItemCreateRequestDTO extends CustomFieldBaseCO {
    /**
     * id
     */
    private Long id;

    /**
     * 入库单编号，必须是工厂内或“入库单”基本信息中存在的入库单编号
     */
    private String code = "";

    /**
     * 行号，仅支持整数，必须大于等于 1 ，不可超过 10,000,000；同工单内，行号不可重复
     */
    private String lineNo = "";

    /**
     * 入库位置，必须是系统内存在且已启用的仓位编号
     */
    private String location = "";

    /**
     * 物料编号，必须是系统内存在且已启用的物料编号
     */
    private String materialCode = "";

    /**
     * 应收数量，若填写必须大于0，小于10,000,000，小数点后位数不可超过10位
     */
    private String planAmount;

    /**
     * 单位名称，必须是该物料上存在且已启用的主单位或转换单位名称，未填写时默认为该物料主单位
     */
    private String unit;

    /**
     * 批次号，必须是该物料上存在且已启用的批次号
     */
    private String batchNo;

    /**
     * 备注，不可超过1000字符
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

    public String getLocation() {
        return location;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getPlanAmount() {
        return planAmount;
    }

    public String getUnit() {
        return unit;
    }

    public String getBatchNo() {
        return batchNo;
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

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

