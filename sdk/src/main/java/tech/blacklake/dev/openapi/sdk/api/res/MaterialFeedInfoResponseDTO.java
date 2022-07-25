package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialFeedInfoResponseDTO {
    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 投料单位
     */
    private Long feedUnitId;

    /**
     * 投料质量状态 1合格、2让步合格、3待检、4不合格
     */
    private List<BizConstantDisplay> qcStatus;

    public Long getMaterialId() {
        return materialId;
    }

    public Long getFeedUnitId() {
        return feedUnitId;
    }

    public List<BizConstantDisplay> getQcStatus() {
        return qcStatus;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setFeedUnitId(Long feedUnitId) {
        this.feedUnitId = feedUnitId;
    }

    public void setQcStatus(List<BizConstantDisplay> qcStatus) {
        this.qcStatus = qcStatus;
    }
}

