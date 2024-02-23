package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CodeCountRequestDTO {
    /**
     * 标识码数量
     */
    private int codeCount;

    /**
     * 执行数量
     */
    private ExecuteAmountRequestDTO amount;

    public int getCodeCount() {
        return codeCount;
    }

    public ExecuteAmountRequestDTO getAmount() {
        return amount;
    }

    public void setCodeCount(int codeCount) {
        this.codeCount = codeCount;
    }

    public void setAmount(ExecuteAmountRequestDTO amount) {
        this.amount = amount;
    }
}
