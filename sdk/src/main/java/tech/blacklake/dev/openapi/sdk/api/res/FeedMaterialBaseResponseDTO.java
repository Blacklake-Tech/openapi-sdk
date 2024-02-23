package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FeedMaterialBaseResponseDTO {
    /**
     * 当前物料feedKey
     */
    private FeedKey alternativeFeedKey;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 是否必投
     */
    private Boolean mustInputFlag;

    /**
     * 是否可投
     */
    private Boolean canInputFlag;

    /**
     * 投料单位
     */
    private UnitBaseResponseDTO unitInfo;

    public FeedKey getAlternativeFeedKey() {
        return alternativeFeedKey;
    }

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public Boolean getMustInputFlag() {
        return mustInputFlag;
    }

    public Boolean getCanInputFlag() {
        return canInputFlag;
    }

    public UnitBaseResponseDTO getUnitInfo() {
        return unitInfo;
    }

    public void setAlternativeFeedKey(FeedKey alternativeFeedKey) {
        this.alternativeFeedKey = alternativeFeedKey;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setMustInputFlag(Boolean mustInputFlag) {
        this.mustInputFlag = mustInputFlag;
    }

    public void setCanInputFlag(Boolean canInputFlag) {
        this.canInputFlag = canInputFlag;
    }

    public void setUnitInfo(UnitBaseResponseDTO unitInfo) {
        this.unitInfo = unitInfo;
    }
}
