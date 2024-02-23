package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

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
