package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedRelationResponseDTO {
    /**
     * 标准件
     */
    private FeedMaterialBaseResponseDTO originalAlternativeMaterial;

    /**
     * 替代件
     */
    private FeedMaterialBaseResponseDTO alternativeMaterial;

    public FeedMaterialBaseResponseDTO getOriginalAlternativeMaterial() {
        return originalAlternativeMaterial;
    }

    public FeedMaterialBaseResponseDTO getAlternativeMaterial() {
        return alternativeMaterial;
    }

    public void setOriginalAlternativeMaterial(FeedMaterialBaseResponseDTO originalAlternativeMaterial) {
        this.originalAlternativeMaterial = originalAlternativeMaterial;
    }

    public void setAlternativeMaterial(FeedMaterialBaseResponseDTO alternativeMaterial) {
        this.alternativeMaterial = alternativeMaterial;
    }
}

