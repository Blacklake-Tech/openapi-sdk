package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialProductionSaveRequestDTO {
    /**
     * 物料ID，必填
     */
    private long materialId;

    /**
     * 自制单位，必填
     */
    private MaterialProductionUnitDetailRequestDTO productionUnit;

    /**
     * 投料质量状态 1合格、2让步合格、3待检、4不合格
     */
    private List<Integer> manufactureQualityStatus;

    public long getMaterialId() {
        return materialId;
    }

    public MaterialProductionUnitDetailRequestDTO getProductionUnit() {
        return productionUnit;
    }

    public List<Integer> getManufactureQualityStatus() {
        return manufactureQualityStatus;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setProductionUnit(MaterialProductionUnitDetailRequestDTO productionUnit) {
        this.productionUnit = productionUnit;
    }

    public void setManufactureQualityStatus(List<Integer> manufactureQualityStatus) {
        this.manufactureQualityStatus = manufactureQualityStatus;
    }
}
