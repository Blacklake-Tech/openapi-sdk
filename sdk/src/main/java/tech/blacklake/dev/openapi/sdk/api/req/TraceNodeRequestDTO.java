package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TraceNodeRequestDTO {
    /**
     * 追溯节点id
     */
    private long traceId;

    /**
     * 追溯节点-批次号
     */
    private String batchNo;

    /**
     *  追溯节点-库存明细标识码
     */
    private String qrCode;

    /**
     * 追溯节点-物料id
     */
    private long materialId;

    public long getTraceId() {
        return traceId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public long getMaterialId() {
        return materialId;
    }

    public void setTraceId(long traceId) {
        this.traceId = traceId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }
}
