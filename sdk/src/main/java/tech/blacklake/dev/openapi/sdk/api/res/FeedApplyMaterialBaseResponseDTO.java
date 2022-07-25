package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedApplyMaterialBaseResponseDTO {
    /**
     * 当前物料feedKey
     */
    private FeedKey alternativeFeedKey;

    /**
     * 物料信息
     */
    private MaterialResponseDTO materialInfo;

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

    public UnitBaseResponseDTO getUnitInfo() {
        return unitInfo;
    }

    public void setAlternativeFeedKey(FeedKey alternativeFeedKey) {
        this.alternativeFeedKey = alternativeFeedKey;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setUnitInfo(UnitBaseResponseDTO unitInfo) {
        this.unitInfo = unitInfo;
    }
}

