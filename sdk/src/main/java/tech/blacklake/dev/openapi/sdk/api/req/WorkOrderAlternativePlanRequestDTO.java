package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkOrderAlternativePlanRequestDTO  {
    /**
     * id
     */
    private Long id;

    /**
     * 替代策略
     */
    private int substitutionStrategy;

    /**
     * 替代物料组
     */
    private List<WorkOrderAlternativeMaterialRequestDTO> alternativeMaterials;

    /**
     * 被替代物料
     */
    private List<WorkOrderOriginalAlternativeMaterialRequestDTO> originalAlternativeMaterials;

    public Long getId() {
        return id;
    }

    public int getSubstitutionStrategy() {
        return substitutionStrategy;
    }

    public List<WorkOrderAlternativeMaterialRequestDTO> getAlternativeMaterials() {
        return alternativeMaterials;
    }

    public List<WorkOrderOriginalAlternativeMaterialRequestDTO> getOriginalAlternativeMaterials() {
        return originalAlternativeMaterials;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubstitutionStrategy(int substitutionStrategy) {
        this.substitutionStrategy = substitutionStrategy;
    }

    public void setAlternativeMaterials(List<WorkOrderAlternativeMaterialRequestDTO> alternativeMaterials) {
        this.alternativeMaterials = alternativeMaterials;
    }

    public void setOriginalAlternativeMaterials(List<WorkOrderOriginalAlternativeMaterialRequestDTO> originalAlternativeMaterials) {
        this.originalAlternativeMaterials = originalAlternativeMaterials;
    }
}

