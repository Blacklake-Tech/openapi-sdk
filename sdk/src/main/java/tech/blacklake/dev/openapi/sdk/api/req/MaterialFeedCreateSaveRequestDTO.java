package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialFeedCreateSaveRequestDTO {
    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 投料单位
     */
    private Long feedUnitId;

    /**
     * 投料质量状态 1合格、2让步合格、3待检、4不合格
     */
    private List<Integer> qcStatus;

    public long getMaterialId() {
        return materialId;
    }

    public Long getFeedUnitId() {
        return feedUnitId;
    }

    public List<Integer> getQcStatus() {
        return qcStatus;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setFeedUnitId(Long feedUnitId) {
        this.feedUnitId = feedUnitId;
    }

    public void setQcStatus(List<Integer> qcStatus) {
        this.qcStatus = qcStatus;
    }
}
