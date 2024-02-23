package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BomInputMaterialLineRequestDTO extends CustomFieldBaseCO {
    /**
     * 子行Id
     */
    private Long id;

    /**
     * 物料清单子项Id
     */
    private Long bomInputMaterialId;

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
    private Integer splitProcessInput;

    /**
     * 投料工序ID
     */
    private Long inputProcessId;

    /**
     * 是否拆分控件投料
     */
    private int splitSopControlInput;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 投料管控
     */
    private List<BomFeedingControlRequestDTO> bomFeedingControls;

    public Long getId() {
        return id;
    }

    public Long getBomInputMaterialId() {
        return bomInputMaterialId;
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

    public Integer getSplitProcessInput() {
        return splitProcessInput;
    }

    public Long getInputProcessId() {
        return inputProcessId;
    }

    public int getSplitSopControlInput() {
        return splitSopControlInput;
    }

    public String getRemark() {
        return remark;
    }

    public List<BomFeedingControlRequestDTO> getBomFeedingControls() {
        return bomFeedingControls;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBomInputMaterialId(Long bomInputMaterialId) {
        this.bomInputMaterialId = bomInputMaterialId;
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

    public void setSplitProcessInput(Integer splitProcessInput) {
        this.splitProcessInput = splitProcessInput;
    }

    public void setInputProcessId(Long inputProcessId) {
        this.inputProcessId = inputProcessId;
    }

    public void setSplitSopControlInput(int splitSopControlInput) {
        this.splitSopControlInput = splitSopControlInput;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBomFeedingControls(List<BomFeedingControlRequestDTO> bomFeedingControls) {
        this.bomFeedingControls = bomFeedingControls;
    }
}
