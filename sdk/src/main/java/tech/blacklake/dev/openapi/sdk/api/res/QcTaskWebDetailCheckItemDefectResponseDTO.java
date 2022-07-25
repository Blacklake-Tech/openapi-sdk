package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailCheckItemDefectResponseDTO {
    /**
     * 序号
     */
    private Long seq;

    /**
     * 不良原因
     */
    private QcTaskWebDetailCheckItemDefectReasonResponseDTO defectReason;

    /**
     * 不良等级
     */
    private QcTaskWebDetailCheckItemDefectRankResponseDTO defectRank;

    /**
     * 不良数量
     */
    private BigDecimal defectCount;

    public Long getSeq() {
        return seq;
    }

    public QcTaskWebDetailCheckItemDefectReasonResponseDTO getDefectReason() {
        return defectReason;
    }

    public QcTaskWebDetailCheckItemDefectRankResponseDTO getDefectRank() {
        return defectRank;
    }

    public BigDecimal getDefectCount() {
        return defectCount;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setDefectReason(QcTaskWebDetailCheckItemDefectReasonResponseDTO defectReason) {
        this.defectReason = defectReason;
    }

    public void setDefectRank(QcTaskWebDetailCheckItemDefectRankResponseDTO defectRank) {
        this.defectRank = defectRank;
    }

    public void setDefectCount(BigDecimal defectCount) {
        this.defectCount = defectCount;
    }
}

