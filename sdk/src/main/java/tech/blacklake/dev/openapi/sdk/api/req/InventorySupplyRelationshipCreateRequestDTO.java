package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InventorySupplyRelationshipCreateRequestDTO {
    /**
     * 来源物料id
     */
    private long fromMaterialId;

    /**
     * 来源批次号
     */
    private String fromBatchNo;

    /**
     * 来源qrcode
     */
    private String fromQrCode;

    /**
     * 去向物料id
     */
    private long toMaterialId;

    /**
     * 去向批次号
     */
    private String toBatchNo;

    /**
     * 去向qrcode
     */
    private String toQrCode;

    /**
     * 备注
     */
    private String remark;

    public long getFromMaterialId() {
        return fromMaterialId;
    }

    public String getFromBatchNo() {
        return fromBatchNo;
    }

    public String getFromQrCode() {
        return fromQrCode;
    }

    public long getToMaterialId() {
        return toMaterialId;
    }

    public String getToBatchNo() {
        return toBatchNo;
    }

    public String getToQrCode() {
        return toQrCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setFromMaterialId(long fromMaterialId) {
        this.fromMaterialId = fromMaterialId;
    }

    public void setFromBatchNo(String fromBatchNo) {
        this.fromBatchNo = fromBatchNo;
    }

    public void setFromQrCode(String fromQrCode) {
        this.fromQrCode = fromQrCode;
    }

    public void setToMaterialId(long toMaterialId) {
        this.toMaterialId = toMaterialId;
    }

    public void setToBatchNo(String toBatchNo) {
        this.toBatchNo = toBatchNo;
    }

    public void setToQrCode(String toQrCode) {
        this.toQrCode = toQrCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
