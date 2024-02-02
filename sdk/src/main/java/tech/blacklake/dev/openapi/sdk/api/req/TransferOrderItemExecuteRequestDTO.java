package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderItemExecuteRequestDTO extends CustomFieldBaseCO {
    /**
     * 调拨单明细ID 按单调拨必传
     */
    private Long id;

    /**
     * 接收仓位
     */
    private long targetLocationId;

    /**
     * 库存明细
     */
    private List<TransferExecuteInventoryRequestDTO> inventoryDetails;

    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public long getTargetLocationId() {
        return targetLocationId;
    }

    public List<TransferExecuteInventoryRequestDTO> getInventoryDetails() {
        return inventoryDetails;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTargetLocationId(long targetLocationId) {
        this.targetLocationId = targetLocationId;
    }

    public void setInventoryDetails(List<TransferExecuteInventoryRequestDTO> inventoryDetails) {
        this.inventoryDetails = inventoryDetails;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

