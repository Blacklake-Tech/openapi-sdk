package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderOriginalAlternativeMaterialResponseDTO  {
    /**
     * id
     */
    private long id;

    /**
     * 工单替代方案ID
     */
    private long workOrderAlternativePlanId;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 被替代物料信息
     */
    private MaterialResponseDTO materialDO;

    /**
     * 主料 0 否 1是
     */
    private Integer mainFlag;

    /**
     * 数量分子
     */
    private String amountNumerator;

    /**
     * 数量分母
     */
    private String amountDenominator;

    /**
     * 单位信息
     */
    private UnitDetailResponseDTO unit;

    public long getId() {
        return id;
    }

    public long getWorkOrderAlternativePlanId() {
        return workOrderAlternativePlanId;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public MaterialResponseDTO getMaterialDO() {
        return materialDO;
    }

    public Integer getMainFlag() {
        return mainFlag;
    }

    public String getAmountNumerator() {
        return amountNumerator;
    }

    public String getAmountDenominator() {
        return amountDenominator;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWorkOrderAlternativePlanId(long workOrderAlternativePlanId) {
        this.workOrderAlternativePlanId = workOrderAlternativePlanId;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setMaterialDO(MaterialResponseDTO materialDO) {
        this.materialDO = materialDO;
    }

    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    public void setAmountNumerator(String amountNumerator) {
        this.amountNumerator = amountNumerator;
    }

    public void setAmountDenominator(String amountDenominator) {
        this.amountDenominator = amountDenominator;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }
}

