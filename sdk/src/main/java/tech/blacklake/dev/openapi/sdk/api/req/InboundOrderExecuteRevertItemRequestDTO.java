package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

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

