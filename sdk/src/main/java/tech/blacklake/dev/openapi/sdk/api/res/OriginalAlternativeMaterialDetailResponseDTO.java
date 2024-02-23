package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OriginalAlternativeMaterialDetailResponseDTO {
    /**
     * 被替代料Id
     */
    private long id;

    /**
     * 物料Id
     */
    private long materialId;

    /**
     * 被替代料物料数据
     */
    private MaterialResponseDTO material;

    /**
     * 替代主料 key = BooleanEnum
     */
    private BizConstantDisplay mainFlag;

    /**
     * 分子
     */
    private String amountNumerator;

    /**
     * 分母
     */
    private String amountDenominator;

    /**
     * 使用比例
     */
    private String useRatio;

    /**
     * 单位Id
     */
    private long unitId;

    /**
     * 单位name
     */
    private String unitName;

    public long getId() {
        return id;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BizConstantDisplay getMainFlag() {
        return mainFlag;
    }

    public String getAmountNumerator() {
        return amountNumerator;
    }

    public String getAmountDenominator() {
        return amountDenominator;
    }

    public String getUseRatio() {
        return useRatio;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setMainFlag(BizConstantDisplay mainFlag) {
        this.mainFlag = mainFlag;
    }

    public void setAmountNumerator(String amountNumerator) {
        this.amountNumerator = amountNumerator;
    }

    public void setAmountDenominator(String amountDenominator) {
        this.amountDenominator = amountDenominator;
    }

    public void setUseRatio(String useRatio) {
        this.useRatio = useRatio;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
