package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialUnitListRequestDTO {
    /**
     * 物料编号，必填，必须是系统中或该模板中存在的物料编号
     */
    private String materialCode;

    /**
     * 单位名称，必填，必须是系统中的单位名称，相同单位不可重复导入
     */
    private String unitName;

    /**
     * 单位类型，必填，可填写{转换单位、辅助单位}
     */
    private String unitType;

    /**
     * X，单位类型为转换单位时必填，该转换单位对应基本单位转换比例中的分母，即1转换单位=Y/X主单位
     */
    private String toUnitCount;

    /**
     * Y，单位类型为转换单位时必填，该转换单位对应基本单位转换比例中的分子，即1转换单位=Y/X主单位
     */
    private String fromUnitCount;

    /**
     * 是否启用，非必填，可填写{是，否} ，转换单位类型不填写时默认为是（仅能存在一个启用中的辅助单位）；辅助单位类型不填写时默认为否
     */
    private String enableFlag;

    public String getMaterialCode() {
        return materialCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getUnitType() {
        return unitType;
    }

    public String getToUnitCount() {
        return toUnitCount;
    }

    public String getFromUnitCount() {
        return fromUnitCount;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public void setToUnitCount(String toUnitCount) {
        this.toUnitCount = toUnitCount;
    }

    public void setFromUnitCount(String fromUnitCount) {
        this.fromUnitCount = fromUnitCount;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }
}
