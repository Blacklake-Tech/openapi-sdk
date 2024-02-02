package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderInfoRequestRequestDTO {
    /**
     * 出库单编号
     */
    private String outboundOrderCode;

    /**
     * 仓库id
     */
    private long warehouseId;

    /**
     * 物料id
     */
    private long materialId;

    /**
     * 业务类型 0其他出厂 1销售发运 2 采购退料  普通出库必填
     */
    private Integer bizType;

    public String getOutboundOrderCode() {
        return outboundOrderCode;
    }

    public long getWarehouseId() {
        return warehouseId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setOutboundOrderCode(String outboundOrderCode) {
        this.outboundOrderCode = outboundOrderCode;
    }

    public void setWarehouseId(long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }
}

