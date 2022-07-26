package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderInResponseDTO {
    /**
     * 行号
     */
    private String lineNo;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 仓位编号
     */
    private String locationCode;

    /**
     * 仓位名称
     */
    private String locationName;

    /**
     * 执行单位数量
     */
    private BaseAmountDisplayResponseDTO executeAmount;

    /**
     * 执行数量
     */
    private BaseAmountDisplayResponseDTO masterAmountDisplay;

    public String getLineNo() {
        return lineNo;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public BaseAmountDisplayResponseDTO getExecuteAmount() {
        return executeAmount;
    }

    public BaseAmountDisplayResponseDTO getMasterAmountDisplay() {
        return masterAmountDisplay;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setExecuteAmount(BaseAmountDisplayResponseDTO executeAmount) {
        this.executeAmount = executeAmount;
    }

    public void setMasterAmountDisplay(BaseAmountDisplayResponseDTO masterAmountDisplay) {
        this.masterAmountDisplay = masterAmountDisplay;
    }
}

