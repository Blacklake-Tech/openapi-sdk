package tech.blacklake.dev.openapi.sdk.api.dto;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class FeedKey {
    /**
     * seq
     */
    private Integer seq;

    /**
     * materialId
     */
    private long materialId = 0L;

    /**
     * lineId
     */
    private Long lineId;

    /**
     * subLineId
     */
    private Long subLineId;

    /**
     * originalAlternativeMaterialId
     */
    private Long originalAlternativeMaterialId;

    /**
     * originalAlternativeLineId
     */
    private Long originalAlternativeLineId;

    /**
     * originalAlternativeSubLineId
     */
    private Long originalAlternativeSubLineId;

    /**
     * priority
     */
    private Integer priority;

    /**
     * alternativeFlag$delegate
     */
    private Lazy alternativeFlag$delegate;

    /**
     * isNotDefineOnWorkOrder$delegate
     */
    private Lazy isNotDefineOnWorkOrder$delegate;

    public Integer getSeq() {
        return seq;
    }

    public long getMaterialId() {
        return materialId;
    }

    public Long getLineId() {
        return lineId;
    }

    public Long getSubLineId() {
        return subLineId;
    }

    public Long getOriginalAlternativeMaterialId() {
        return originalAlternativeMaterialId;
    }

    public Long getOriginalAlternativeLineId() {
        return originalAlternativeLineId;
    }

    public Long getOriginalAlternativeSubLineId() {
        return originalAlternativeSubLineId;
    }

    public Integer getPriority() {
        return priority;
    }

    public Lazy getAlternativeFlag$delegate() {
        return alternativeFlag$delegate;
    }

    public Lazy getIsNotDefineOnWorkOrder$delegate() {
        return isNotDefineOnWorkOrder$delegate;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public void setSubLineId(Long subLineId) {
        this.subLineId = subLineId;
    }

    public void setOriginalAlternativeMaterialId(Long originalAlternativeMaterialId) {
        this.originalAlternativeMaterialId = originalAlternativeMaterialId;
    }

    public void setOriginalAlternativeLineId(Long originalAlternativeLineId) {
        this.originalAlternativeLineId = originalAlternativeLineId;
    }

    public void setOriginalAlternativeSubLineId(Long originalAlternativeSubLineId) {
        this.originalAlternativeSubLineId = originalAlternativeSubLineId;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setAlternativeFlag$delegate(Lazy alternativeFlag$delegate) {
        this.alternativeFlag$delegate = alternativeFlag$delegate;
    }

    public void setIsNotDefineOnWorkOrder$delegate(Lazy isNotDefineOnWorkOrder$delegate) {
        this.isNotDefineOnWorkOrder$delegate = isNotDefineOnWorkOrder$delegate;
    }
}

