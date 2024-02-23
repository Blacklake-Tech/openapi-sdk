package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QrCodeRequestDTO {
    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 执行数量
     */
    private ExecuteAmountRequestDTO amount;

    public String getQrCode() {
        return qrCode;
    }

    public ExecuteAmountRequestDTO getAmount() {
        return amount;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setAmount(ExecuteAmountRequestDTO amount) {
        this.amount = amount;
    }
}
