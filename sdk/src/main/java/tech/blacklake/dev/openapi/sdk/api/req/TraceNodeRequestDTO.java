package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TraceNodeRequestDTO {
    /**
     * 追溯节点id
     */
    private long traceId = 0L;

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
    private long materialId = 0L;

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

