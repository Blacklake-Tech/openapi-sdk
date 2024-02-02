package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomInputMaterialRequestDTO extends CustomFieldBaseCO  {
    /**
     * 物料清单子项Id
     */
    private Long id;

    /**
     * 项次
     */
    private int seq;

    /**
     * 物料ID
     */
    private long materialId;

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
    private long unitId;

    /**
     * 损耗率
     */
    private String lossRate;

    /**
     * 关联物料清单Id
     */
    private Long relatedBomId;

    /**
     * 领料方式
     */
    private int pickMode;

    /**
     * 是否指定工序投料
     */
    private int specificProcessInput;

    /**
     * 是否拆分工序投料
     */
    private int splitProcessInput;

    /**
     * 投料工序ID
     */
    private Long inputProcessId;

    /**
     * 是否拆分控件投料
     */
    private Integer splitSopControlInput;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 投料管控
     */
    private List<BomFeedingControlRequestDTO> bomFeedingControls;

    /**
     * 子项物料第二层
     */
    private List<BomInputMaterialLineRequestDTO> bomInputMaterialLines;

    public Long getId() {
        return id;
    }

    public int getSeq() {
        return seq;
    }

    public long getMaterialId() {
        return materialId;
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

    public String getLossRate() {
        return lossRate;
    }

    public Long getRelatedBomId() {
        return relatedBomId;
    }

    public int getPickMode() {
        return pickMode;
    }

    public int getSpecificProcessInput() {
        return specificProcessInput;
    }

    public int getSplitProcessInput() {
        return splitProcessInput;
    }

    public Long getInputProcessId() {
        return inputProcessId;
    }

    public Integer getSplitSopControlInput() {
        return splitSopControlInput;
    }

    public String getRemark() {
        return remark;
    }

    public List<BomFeedingControlRequestDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public List<BomInputMaterialLineRequestDTO> getBomInputMaterialLines() {
        return bomInputMaterialLines;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
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

    public void setLossRate(String lossRate) {
        this.lossRate = lossRate;
    }

    public void setRelatedBomId(Long relatedBomId) {
        this.relatedBomId = relatedBomId;
    }

    public void setPickMode(int pickMode) {
        this.pickMode = pickMode;
    }

    public void setSpecificProcessInput(int specificProcessInput) {
        this.specificProcessInput = specificProcessInput;
    }

    public void setSplitProcessInput(int splitProcessInput) {
        this.splitProcessInput = splitProcessInput;
    }

    public void setInputProcessId(Long inputProcessId) {
        this.inputProcessId = inputProcessId;
    }

    public void setSplitSopControlInput(Integer splitSopControlInput) {
        this.splitSopControlInput = splitSopControlInput;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBomFeedingControls(List<BomFeedingControlRequestDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }

    public void setBomInputMaterialLines(List<BomInputMaterialLineRequestDTO> bomInputMaterialLines) {
        this.bomInputMaterialLines = bomInputMaterialLines;
    }
}

