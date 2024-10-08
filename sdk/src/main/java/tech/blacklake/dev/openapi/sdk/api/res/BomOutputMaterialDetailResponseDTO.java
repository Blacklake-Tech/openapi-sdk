package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BomOutputMaterialDetailResponseDTO {
    /**
     * 多产出
     */
    private long id;

    /**
     * 行号
     */
    private int lineSeq;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 单位id
     */
    private long unitId;

    /**
     * 单位name
     */
    private String unitName;

    /**
     * 数量
     */
    private String amount;

    /**
     * 报工工序ID
     */
    private Long outputProcessId;

    /**
     * 报工工序
     */
    private ProcessRouteNodeSimpleResponseDTO outputProcessProcessRouteNodeSimpleResponseDTO;

    /**
     * 报工控件Code
     */
    private String outputSopControlCode;

    /**
     * 报工控件信息
     */
    private SopControlResponseDTO outputSopControlDTO;

    /**
     * 单次报工数量
     */
    private String singleWorkReportAmount;

    /**
     * 报工方式
     */
    private List<BizConstantDisplay> reportingMethods;

    /**
     * 是否入库
     */
    private BizConstantDisplay warehousing;

    /**
     * 自动入库
     */
    private BizConstantDisplay autoWarehousingFlag;

    public long getId() {
        return id;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getAmount() {
        return amount;
    }

    public Long getOutputProcessId() {
        return outputProcessId;
    }

    public ProcessRouteNodeSimpleResponseDTO getOutputProcessProcessRouteNodeSimpleResponseDTO() {
        return outputProcessProcessRouteNodeSimpleResponseDTO;
    }

    public String getOutputSopControlCode() {
        return outputSopControlCode;
    }

    public SopControlResponseDTO getOutputSopControlDTO() {
        return outputSopControlDTO;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public List<BizConstantDisplay> getReportingMethods() {
        return reportingMethods;
    }

    public BizConstantDisplay getWarehousing() {
        return warehousing;
    }

    public BizConstantDisplay getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLineSeq(int lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setOutputProcessId(Long outputProcessId) {
        this.outputProcessId = outputProcessId;
    }

    public void setOutputProcessProcessRouteNodeSimpleResponseDTO(
            ProcessRouteNodeSimpleResponseDTO outputProcessProcessRouteNodeSimpleResponseDTO) {
        this.outputProcessProcessRouteNodeSimpleResponseDTO = outputProcessProcessRouteNodeSimpleResponseDTO;
    }

    public void setOutputSopControlCode(String outputSopControlCode) {
        this.outputSopControlCode = outputSopControlCode;
    }

    public void setOutputSopControlDTO(SopControlResponseDTO outputSopControlDTO) {
        this.outputSopControlDTO = outputSopControlDTO;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }

    public void setReportingMethods(List<BizConstantDisplay> reportingMethods) {
        this.reportingMethods = reportingMethods;
    }

    public void setWarehousing(BizConstantDisplay warehousing) {
        this.warehousing = warehousing;
    }

    public void setAutoWarehousingFlag(BizConstantDisplay autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }
}
