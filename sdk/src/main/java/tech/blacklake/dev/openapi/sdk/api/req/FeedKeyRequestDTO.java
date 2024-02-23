package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class FeedKeyRequestDTO {
    /**
     * 项次
     */
    private Integer seq;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 物料ID
     */
    private Long lineId;

    /**
     * 投料物料子行ID
     */
    private Long subLineId;

    /**
     * 被替代料物料id
     */
    private Long originalAlternativeMaterialId;

    /**
     * 被替代物料用料清单行id
     */
    private Long originalAlternativeLineId;

    /**
     * 被替代物料用料清单行子行id
     */
    private Long originalAlternativeSubLineId;

    /**
     * 替代优先级
     */
    private Integer priority;

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
}
