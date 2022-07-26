package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderExecuteRevertResponseDTO {
    /**
     * 入库单编号
     */
    private String inboundOrderCode;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 执行数量
     */
    private ExecuteAmountResponseDTO executeAmount;

    public String getInboundOrderCode() {
        return inboundOrderCode;
    }

    public String getLineNo() {
        return lineNo;
    }

    public ExecuteAmountResponseDTO getExecuteAmount() {
        return executeAmount;
    }

    public void setInboundOrderCode(String inboundOrderCode) {
        this.inboundOrderCode = inboundOrderCode;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setExecuteAmount(ExecuteAmountResponseDTO executeAmount) {
        this.executeAmount = executeAmount;
    }
}

