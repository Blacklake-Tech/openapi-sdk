package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialCreateUnitRequestDTO {
    /**
     * 物料ID，必填
     */
    private long id = 0;

    /**
     * 基本单位ID，必填
     */
    private long unitId = 0;

    /**
     * 转换单位List，必填
     */
    private List<UnitConversionRequestDTO> conversionUnits;

    public long getId() {
        return id;
    }

    public long getUnitId() {
        return unitId;
    }

    public List<UnitConversionRequestDTO> getConversionUnits() {
        return conversionUnits;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setConversionUnits(List<UnitConversionRequestDTO> conversionUnits) {
        this.conversionUnits = conversionUnits;
    }
}

