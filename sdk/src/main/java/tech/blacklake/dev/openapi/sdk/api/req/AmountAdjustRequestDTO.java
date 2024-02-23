package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class AmountAdjustRequestDTO {
    /**
     * 原始库存明细ID
     */
    private long originInvEleId;

    /**
     * 原始库存明细Version
     */
    private long originInvEleVersion;

    /**
     * 执行数量
     */
    private ExecuteAmountRequestDTO executeAmount;

    /**
     * 备注(暂时用作调整原因)
     */
    private String remark;

    public long getOriginInvEleId() {
        return originInvEleId;
    }

    public long getOriginInvEleVersion() {
        return originInvEleVersion;
    }

    public ExecuteAmountRequestDTO getExecuteAmount() {
        return executeAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setOriginInvEleId(long originInvEleId) {
        this.originInvEleId = originInvEleId;
    }

    public void setOriginInvEleVersion(long originInvEleVersion) {
        this.originInvEleVersion = originInvEleVersion;
    }

    public void setExecuteAmount(ExecuteAmountRequestDTO executeAmount) {
        this.executeAmount = executeAmount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
