package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskDefectForMengniuRequestDTO {
    /**
     * 序号
     */
    private Long seq = 0L;

    /**
     * 不良等级名称
     */
    private String qcDefectRankName;

    /**
     * 不良等级id
     */
    private Long qcDefectRankId;

    /**
     * 不良原因名称
     */
    private String qcDefectReasonName;

    /**
     * 不良原因id
     */
    private Long qcDefectReasonId;

    /**
     * 次品数量
     */
    private BigDecimal defectCount;

    public Long getSeq() {
        return seq;
    }

    public String getQcDefectRankName() {
        return qcDefectRankName;
    }

    public Long getQcDefectRankId() {
        return qcDefectRankId;
    }

    public String getQcDefectReasonName() {
        return qcDefectReasonName;
    }

    public Long getQcDefectReasonId() {
        return qcDefectReasonId;
    }

    public BigDecimal getDefectCount() {
        return defectCount;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setQcDefectRankName(String qcDefectRankName) {
        this.qcDefectRankName = qcDefectRankName;
    }

    public void setQcDefectRankId(Long qcDefectRankId) {
        this.qcDefectRankId = qcDefectRankId;
    }

    public void setQcDefectReasonName(String qcDefectReasonName) {
        this.qcDefectReasonName = qcDefectReasonName;
    }

    public void setQcDefectReasonId(Long qcDefectReasonId) {
        this.qcDefectReasonId = qcDefectReasonId;
    }

    public void setDefectCount(BigDecimal defectCount) {
        this.defectCount = defectCount;
    }
}

