package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderAlternativePlanResponseDTO {
    /**
     * id
     */
    private long id;

    /**
     * 替代策略 key = SubstitutionStrategyEnum
     */
    private int substitutionStrategy;

    /**
     * 替代物料组
     */
    private List<WorkOrderAlternativeMaterialResponseDTO> alternativeMaterials;

    /**
     * 被替代物料
     */
    private List<WorkOrderOriginalAlternativeMaterialResponseDTO> originalAlternativeMaterials;

    public long getId() {
        return id;
    }

    public int getSubstitutionStrategy() {
        return substitutionStrategy;
    }

    public List<WorkOrderAlternativeMaterialResponseDTO> getAlternativeMaterials() {
        return alternativeMaterials;
    }

    public List<WorkOrderOriginalAlternativeMaterialResponseDTO> getOriginalAlternativeMaterials() {
        return originalAlternativeMaterials;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSubstitutionStrategy(int substitutionStrategy) {
        this.substitutionStrategy = substitutionStrategy;
    }

    public void setAlternativeMaterials(List<WorkOrderAlternativeMaterialResponseDTO> alternativeMaterials) {
        this.alternativeMaterials = alternativeMaterials;
    }

    public void setOriginalAlternativeMaterials(
            List<WorkOrderOriginalAlternativeMaterialResponseDTO> originalAlternativeMaterials) {
        this.originalAlternativeMaterials = originalAlternativeMaterials;
    }
}
