package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomOutputMaterialRequestDTO  {
    /**
     * 业务ID
     */
    private Long id;

    /**
     * 行号
     */
    private int lineSeq = 0;

    /**
     * 物料ID
     */
    private long materialId = 0;

    /**
     * 数量
     */
    private String amount;

    /**
     * 单位id
     */
    private long unitId = 0;

    /**
     * 报工工序ID
     */
    private Long outputProcessId;

    /**
     * 报工控件Code
     */
    private String outputSopControlCode;

    /**
     * 单次报工数量
     */
    private String singleWorkReportAmount;

    /**
     * 报工方式
     */
    private List<Integer> reportingMethods;

    /**
     * 是否入库
     */
    private int warehousing = 0;

    /**
     * 自动入库
     */
    private Integer autoWarehousingFlag;

    public Long getId() {
        return id;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public long getMaterialId() {
        return materialId;
    }

    public String getAmount() {
        return amount;
    }

    public long getUnitId() {
        return unitId;
    }

    public Long getOutputProcessId() {
        return outputProcessId;
    }

    public String getOutputSopControlCode() {
        return outputSopControlCode;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public List<Integer> getReportingMethods() {
        return reportingMethods;
    }

    public int getWarehousing() {
        return warehousing;
    }

    public Integer getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLineSeq(int lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setOutputProcessId(Long outputProcessId) {
        this.outputProcessId = outputProcessId;
    }

    public void setOutputSopControlCode(String outputSopControlCode) {
        this.outputSopControlCode = outputSopControlCode;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }

    public void setReportingMethods(List<Integer> reportingMethods) {
        this.reportingMethods = reportingMethods;
    }

    public void setWarehousing(int warehousing) {
        this.warehousing = warehousing;
    }

    public void setAutoWarehousingFlag(Integer autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }
}

