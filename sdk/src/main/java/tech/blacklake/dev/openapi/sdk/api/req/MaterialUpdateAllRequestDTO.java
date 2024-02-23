package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialUpdateAllRequestDTO {
    /**
     * 物料基本信息
     */
    private MaterialUpdateRequestDTO baseInfo;

    /**
     * 物料单位信息
     */
    private MaterialCreateUnitRequestDTO unitList;

    /**
     * 物料仓储信息
     */
    private MaterialStorageCreateRequestDTO inventoryInfo;

    /**
     * 物料生产信息
     */
    private MaterialProductionSaveRequestDTO productionInfo;

    /**
     * 物料采购信息
     */
    private MaterialPurchaseSaveRequestDTO purchaseInfo;

    /**
     * 投料信息
     */
    private MaterialFeedCreateSaveRequestDTO feedInfo;

    public MaterialUpdateRequestDTO getBaseInfo() {
        return baseInfo;
    }

    public MaterialCreateUnitRequestDTO getUnitList() {
        return unitList;
    }

    public MaterialStorageCreateRequestDTO getInventoryInfo() {
        return inventoryInfo;
    }

    public MaterialProductionSaveRequestDTO getProductionInfo() {
        return productionInfo;
    }

    public MaterialPurchaseSaveRequestDTO getPurchaseInfo() {
        return purchaseInfo;
    }

    public MaterialFeedCreateSaveRequestDTO getFeedInfo() {
        return feedInfo;
    }

    public void setBaseInfo(MaterialUpdateRequestDTO baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setUnitList(MaterialCreateUnitRequestDTO unitList) {
        this.unitList = unitList;
    }

    public void setInventoryInfo(MaterialStorageCreateRequestDTO inventoryInfo) {
        this.inventoryInfo = inventoryInfo;
    }

    public void setProductionInfo(MaterialProductionSaveRequestDTO productionInfo) {
        this.productionInfo = productionInfo;
    }

    public void setPurchaseInfo(MaterialPurchaseSaveRequestDTO purchaseInfo) {
        this.purchaseInfo = purchaseInfo;
    }

    public void setFeedInfo(MaterialFeedCreateSaveRequestDTO feedInfo) {
        this.feedInfo = feedInfo;
    }
}
