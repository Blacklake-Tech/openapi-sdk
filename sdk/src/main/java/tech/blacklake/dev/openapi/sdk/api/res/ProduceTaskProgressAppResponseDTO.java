package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class ProduceTaskProgressAppResponseDTO {
    /**
     * 物料基本信息
     */
    private MaterialResponseDTO materialInfo;

    /**
     * 已报工数
     */
    private BaseAmount alreadyReportedAmount;

    /**
     * 计划数
     */
    private BaseAmount plannedAmount;

    public MaterialResponseDTO getMaterialInfo() {
        return materialInfo;
    }

    public BaseAmount getAlreadyReportedAmount() {
        return alreadyReportedAmount;
    }

    public BaseAmount getPlannedAmount() {
        return plannedAmount;
    }

    public void setMaterialInfo(MaterialResponseDTO materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setAlreadyReportedAmount(BaseAmount alreadyReportedAmount) {
        this.alreadyReportedAmount = alreadyReportedAmount;
    }

    public void setPlannedAmount(BaseAmount plannedAmount) {
        this.plannedAmount = plannedAmount;
    }
}

