package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ForwardTraceRelationshipResponseDTO {
    /**
     * 来源批次号
     */
    private String fromBatchNo;

    /**
     * 来源物料id
     */
    private long fromMaterialId = 0;

    /**
     * 来源标识码
     */
    private String fromQrcode;

    /**
     * 去向批次号
     */
    private String toBatchNo;

    /**
     * 去向物料id
     */
    private long toMaterialId = 0;

    /**
     * 去向标识码
     */
    private String toQrcode;

    public String getFromBatchNo() {
        return fromBatchNo;
    }

    public long getFromMaterialId() {
        return fromMaterialId;
    }

    public String getFromQrcode() {
        return fromQrcode;
    }

    public String getToBatchNo() {
        return toBatchNo;
    }

    public long getToMaterialId() {
        return toMaterialId;
    }

    public String getToQrcode() {
        return toQrcode;
    }

    public void setFromBatchNo(String fromBatchNo) {
        this.fromBatchNo = fromBatchNo;
    }

    public void setFromMaterialId(long fromMaterialId) {
        this.fromMaterialId = fromMaterialId;
    }

    public void setFromQrcode(String fromQrcode) {
        this.fromQrcode = fromQrcode;
    }

    public void setToBatchNo(String toBatchNo) {
        this.toBatchNo = toBatchNo;
    }

    public void setToMaterialId(long toMaterialId) {
        this.toMaterialId = toMaterialId;
    }

    public void setToQrcode(String toQrcode) {
        this.toQrcode = toQrcode;
    }
}

