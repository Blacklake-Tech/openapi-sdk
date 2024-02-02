package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutputMaterialUpdateRequestDTO  {
    /**
     * 产出 ID
     */
    private Long id;

    /**
     * 是否是主产出（0-副产出；1-主产出）
     */
    private int main;

    /**
     * 计划生产数
     */
    private String plannedAmount;

    /**
     * 基准数
     */
    private String standardAmount;

    /**
     * 批号生成类型（1-编号规则；2-批号；3-不生成）
     */
    private int batchGenerationType;

    /**
     * 批号规则ID
     */
    private Long batchRuleId;

    /**
     * 批号
     */
    private String batchNumber;

    /**
     * 批号对象ID
     */
    private Long batchNumberId;

    /**
     * 行号
     */
    private int lineSeq;

    /**
     * 物料清单ID
     */
    private Long bomId;

    /**
     * 工艺路线编号
     */
    private Long processRouteId;

    /**
     * 物料id
     */
    private long materialId;

    /**
     * 单位id
     */
    private long unitId;

    /**
     * 产出工序号
     */
    private String outputProcessNum;

    /**
     * 产出控件ID
     */
    private Long outputSopControlId;

    /**
     * 成品率
     */
    private String productRate;

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
    private int warehousing;

    /**
     * 自动入库
     */
    private Integer autoWarehousingFlag;

    public Long getId() {
        return id;
    }

    public int getMain() {
        return main;
    }

    public String getPlannedAmount() {
        return plannedAmount;
    }

    public String getStandardAmount() {
        return standardAmount;
    }

    public int getBatchGenerationType() {
        return batchGenerationType;
    }

    public Long getBatchRuleId() {
        return batchRuleId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public Long getBatchNumberId() {
        return batchNumberId;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public Long getBomId() {
        return bomId;
    }

    public Long getProcessRouteId() {
        return processRouteId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getOutputProcessNum() {
        return outputProcessNum;
    }

    public Long getOutputSopControlId() {
        return outputSopControlId;
    }

    public String getProductRate() {
        return productRate;
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

    public void setMain(int main) {
        this.main = main;
    }

    public void setPlannedAmount(String plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setStandardAmount(String standardAmount) {
        this.standardAmount = standardAmount;
    }

    public void setBatchGenerationType(int batchGenerationType) {
        this.batchGenerationType = batchGenerationType;
    }

    public void setBatchRuleId(Long batchRuleId) {
        this.batchRuleId = batchRuleId;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setBatchNumberId(Long batchNumberId) {
        this.batchNumberId = batchNumberId;
    }

    public void setLineSeq(int lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setProcessRouteId(Long processRouteId) {
        this.processRouteId = processRouteId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setOutputProcessNum(String outputProcessNum) {
        this.outputProcessNum = outputProcessNum;
    }

    public void setOutputSopControlId(Long outputSopControlId) {
        this.outputSopControlId = outputSopControlId;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
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

