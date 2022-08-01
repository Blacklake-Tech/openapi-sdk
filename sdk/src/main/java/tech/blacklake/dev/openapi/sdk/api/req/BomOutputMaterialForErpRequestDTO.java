package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BomOutputMaterialForErpRequestDTO {
    /**
     * 行号,整数,默认以10开始,以10递增,同一物料清单下,产出物料行号不支持重复
     */
    private String lineSeq;

    /**
     * 物料编号
     */
    private String materialCode;

    /**
     * 数量,默认值为1;必须大于0
     */
    private String amount;

    /**
     * 单位名称
     */
    private String unit;

    public String getLineSeq() {
        return lineSeq;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setLineSeq(String lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

