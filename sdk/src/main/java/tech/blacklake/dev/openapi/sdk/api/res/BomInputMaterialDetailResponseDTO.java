package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomInputMaterialDetailResponseDTO  {
    /**
     * 业务ID
     */
    private long id = 0;

    /**
     * 项次
     */
    private int seq = 0;

    /**
     * 物料ID
     */
    private long materialId = 0;

    /**
     * 物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 分子
     */
    private String inputAmountNumerator;

    /**
     * 分母
     */
    private String inputAmountDenominator;

    /**
     * 单位id
     */
    private long unitId = 0;

    /**
     * 单位name
     */
    private String unitName;

    /**
     * 损耗率
     */
    private String lossRate;

    /**
     * 关联物料清单ID
     */
    private Long relatedBomId;

    /**
     * 版本
     */
    private String version;

    /**
     * 领料方式 key = PickModeEnum
     */
    private BizConstantDisplay pickMode;

    /**
     * 是否指定工序投料 key = BooleanEnum
     */
    private BizConstantDisplay specificProcessInput;

    /**
     * 是否拆分工序投料 key = BooleanEnum
     */
    private BizConstantDisplay splitProcessInput;

    /**
     * 投料工序ID
     */
    private Long inputProcessId;

    /**
     * 投料工序
     */
    private ProcessRouteNodeSimpleResponseDTO inputProcessRouteNodeSimpleResponseDTO;

    /**
     * 是否拆分工序投料 key = BooleanEnum
     */
    private BizConstantDisplay splitSopControlInput;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 子项物料第二层
     */
    private List<BomInputMaterialLineDetailResponseDTO> bomInputMaterialLines;

    /**
     * 投料管控
     */
    private List<BomFeedingControlDetailResponseDTO> bomFeedingControls;

    public long getId() {
        return id;
    }

    public int getSeq() {
        return seq;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public String getInputAmountNumerator() {
        return inputAmountNumerator;
    }

    public String getInputAmountDenominator() {
        return inputAmountDenominator;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getLossRate() {
        return lossRate;
    }

    public Long getRelatedBomId() {
        return relatedBomId;
    }

    public String getVersion() {
        return version;
    }

    public BizConstantDisplay getPickMode() {
        return pickMode;
    }

    public BizConstantDisplay getSpecificProcessInput() {
        return specificProcessInput;
    }

    public BizConstantDisplay getSplitProcessInput() {
        return splitProcessInput;
    }

    public Long getInputProcessId() {
        return inputProcessId;
    }

    public ProcessRouteNodeSimpleResponseDTO getInputProcessRouteNodeSimpleResponseDTO() {
        return inputProcessRouteNodeSimpleResponseDTO;
    }

    public BizConstantDisplay getSplitSopControlInput() {
        return splitSopControlInput;
    }

    public String getRemark() {
        return remark;
    }

    public List<BomInputMaterialLineDetailResponseDTO> getBomInputMaterialLines() {
        return bomInputMaterialLines;
    }

    public List<BomFeedingControlDetailResponseDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setInputAmountNumerator(String inputAmountNumerator) {
        this.inputAmountNumerator = inputAmountNumerator;
    }

    public void setInputAmountDenominator(String inputAmountDenominator) {
        this.inputAmountDenominator = inputAmountDenominator;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }

    public void setRelatedBomId(Long relatedBomId) {
        this.relatedBomId = relatedBomId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPickMode(BizConstantDisplay pickMode) {
        this.pickMode = pickMode;
    }

    public void setSpecificProcessInput(BizConstantDisplay specificProcessInput) {
        this.specificProcessInput = specificProcessInput;
    }

    public void setSplitProcessInput(BizConstantDisplay splitProcessInput) {
        this.splitProcessInput = splitProcessInput;
    }

    public void setInputProcessId(Long inputProcessId) {
        this.inputProcessId = inputProcessId;
    }

    public void setInputProcessRouteNodeSimpleResponseDTO(ProcessRouteNodeSimpleResponseDTO inputProcessRouteNodeSimpleResponseDTO) {
        this.inputProcessRouteNodeSimpleResponseDTO = inputProcessRouteNodeSimpleResponseDTO;
    }

    public void setSplitSopControlInput(BizConstantDisplay splitSopControlInput) {
        this.splitSopControlInput = splitSopControlInput;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBomInputMaterialLines(List<BomInputMaterialLineDetailResponseDTO> bomInputMaterialLines) {
        this.bomInputMaterialLines = bomInputMaterialLines;
    }

    public void setBomFeedingControls(List<BomFeedingControlDetailResponseDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }
}

