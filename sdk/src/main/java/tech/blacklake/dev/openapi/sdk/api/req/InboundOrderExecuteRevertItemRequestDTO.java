package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class InboundOrderExecuteRevertItemRequestDTO {
    /**
     * 库存明细ID
     */
    private long inventoryElementId;

    /**
     * 执行数量
     */
    private ExecuteAmountRequestDTO executeAmount;

    public long getInventoryElementId() {
        return inventoryElementId;
    }

    public ExecuteAmountRequestDTO getExecuteAmount() {
        return executeAmount;
    }

    public void setInventoryElementId(long inventoryElementId) {
        this.inventoryElementId = inventoryElementId;
    }

    public void setExecuteAmount(ExecuteAmountRequestDTO executeAmount) {
        this.executeAmount = executeAmount;
    }
}
