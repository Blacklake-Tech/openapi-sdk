package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InventoryKeyRequestDTO {
    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 仓位ID
     */
    private long storageLocationId;

    /**
     * 库存关键属性
     */
    private InboundExecuteBizKeyRequestDTO inventoryLotAttr;

    public long getMaterialId() {
        return materialId;
    }

    public long getStorageLocationId() {
        return storageLocationId;
    }

    public InboundExecuteBizKeyRequestDTO getInventoryLotAttr() {
        return inventoryLotAttr;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setStorageLocationId(long storageLocationId) {
        this.storageLocationId = storageLocationId;
    }

    public void setInventoryLotAttr(InboundExecuteBizKeyRequestDTO inventoryLotAttr) {
        this.inventoryLotAttr = inventoryLotAttr;
    }
}

