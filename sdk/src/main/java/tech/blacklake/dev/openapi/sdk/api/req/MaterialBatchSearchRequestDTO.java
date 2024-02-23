package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialBatchSearchRequestDTO extends BasePage {
    /**
     * 批次号（模糊查询）, 非必填
     */
    private String batchNo;

    /**
     * 快速搜索（模糊查询）, 支持批次号的模糊查询, 非必填
     */
    private String quickSearch;

    /**
     * 物料ID, 非必填
     */
    private List<Long> materialIds;

    /**
     * 物料分类ID List, 非必填
     */
    private List<Long> materialCategoryIds;

    /**
     * 物料属性ID List, 非必填
     */
    private List<Long> materialAttributeIds;

    /**
     * 供应商批次, 非必填
     */
    private String supplierBatch;

    /**
     * 供应商id List, 非必填
     */
    private List<Long> supplierIds;

    /**
     * 客户id List, 非必填
     */
    private List<Long> customerIds;

    /**
     * 更新时间（开始时间）, 非必填
     */
    private Long updateStartTime;

    /**
     * 更新时间（结束时间）, 非必填
     */
    private Long updateEndTime;

    public String getBatchNo() {
        return batchNo;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public List<Long> getMaterialCategoryIds() {
        return materialCategoryIds;
    }

    public List<Long> getMaterialAttributeIds() {
        return materialAttributeIds;
    }

    public String getSupplierBatch() {
        return supplierBatch;
    }

    public List<Long> getSupplierIds() {
        return supplierIds;
    }

    public List<Long> getCustomerIds() {
        return customerIds;
    }

    public Long getUpdateStartTime() {
        return updateStartTime;
    }

    public Long getUpdateEndTime() {
        return updateEndTime;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setMaterialCategoryIds(List<Long> materialCategoryIds) {
        this.materialCategoryIds = materialCategoryIds;
    }

    public void setMaterialAttributeIds(List<Long> materialAttributeIds) {
        this.materialAttributeIds = materialAttributeIds;
    }

    public void setSupplierBatch(String supplierBatch) {
        this.supplierBatch = supplierBatch;
    }

    public void setSupplierIds(List<Long> supplierIds) {
        this.supplierIds = supplierIds;
    }

    public void setCustomerIds(List<Long> customerIds) {
        this.customerIds = customerIds;
    }

    public void setUpdateStartTime(Long updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public void setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
    }
}
