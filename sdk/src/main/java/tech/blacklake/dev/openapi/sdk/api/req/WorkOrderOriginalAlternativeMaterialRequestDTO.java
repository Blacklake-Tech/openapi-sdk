package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderOriginalAlternativeMaterialRequestDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 物料ID
     */
    private long materialId;

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
     * 单位ID
     */
    private long unitId;

    public Long getId() {
        return id;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public long getMaterialId() {
        return materialId;
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

    public long getUnitId() {
        return unitId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
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

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }
}
