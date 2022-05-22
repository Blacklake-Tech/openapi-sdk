package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class MaterialInventoryManageAttrDTO {
    /**
     * 先进先出，1启用，0不启用
     */
    private Integer fifoEnabled;

    /**
     * 先进先出属性，0批次号1生产日期2有效期至
     */
    private Integer fifoAttr;

    /**
     * 库存明细标识码编号规则ID
     */
    private Long inventoryQrCodeRuleId;

    public Integer getFifoEnabled() {
        return fifoEnabled;
    }

    public Integer getFifoAttr() {
        return fifoAttr;
    }

    public Long getInventoryQrCodeRuleId() {
        return inventoryQrCodeRuleId;
    }

    public void setFifoEnabled(Integer fifoEnabled) {
        this.fifoEnabled = fifoEnabled;
    }

    public void setFifoAttr(Integer fifoAttr) {
        this.fifoAttr = fifoAttr;
    }

    public void setInventoryQrCodeRuleId(Long inventoryQrCodeRuleId) {
        this.inventoryQrCodeRuleId = inventoryQrCodeRuleId;
    }
}

