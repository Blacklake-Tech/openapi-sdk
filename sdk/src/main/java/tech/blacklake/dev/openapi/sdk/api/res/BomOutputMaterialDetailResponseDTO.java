package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomOutputMaterialDetailResponseDTO  {
    /**
     * 多产出
     */
    private long id = 0;

    /**
     * 行号
     */
    private int lineSeq = 0;

    /**
     * 物料ID
     */
    private long materialId = 0;

    /**
     * 物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 单位id
     */
    private long unitId = 0;

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

    public void setOutputProcessProcessRouteNodeSimpleResponseDTO(ProcessRouteNodeSimpleResponseDTO outputProcessProcessRouteNodeSimpleResponseDTO) {
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
}

