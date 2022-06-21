package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialProductionInfoResponseDTO {
    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 自制单位
     */
    private Long productionUnitId;

    /**
     * 投料质量状态 1合格、2让步合格、3待检、4不合格
     */
    private List<BizConstantDisplay> manufactureQualityStatus;

    public Long getMaterialId() {
        return materialId;
    }

    public Long getProductionUnitId() {
        return productionUnitId;
    }

    public List<BizConstantDisplay> getManufactureQualityStatus() {
        return manufactureQualityStatus;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setProductionUnitId(Long productionUnitId) {
        this.productionUnitId = productionUnitId;
    }

    public void setManufactureQualityStatus(List<BizConstantDisplay> manufactureQualityStatus) {
        this.manufactureQualityStatus = manufactureQualityStatus;
    }
}

