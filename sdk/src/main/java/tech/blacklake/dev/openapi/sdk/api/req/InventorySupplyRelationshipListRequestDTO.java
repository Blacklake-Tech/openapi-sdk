package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InventorySupplyRelationshipListRequestDTO extends BasePage {
    /**
     * 物料id
     */
    private long materialId;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 查询方向
     */
    private int direction;

    /**
     * 查询层级
     */
    private int level;

    public long getMaterialId() {
        return materialId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public int getDirection() {
        return direction;
    }

    public int getLevel() {
        return level;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
