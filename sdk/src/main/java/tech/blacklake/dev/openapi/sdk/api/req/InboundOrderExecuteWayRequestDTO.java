package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class InboundOrderExecuteWayRequestDTO {
    /**
     * 
     */
    private int executeWay;

    /**
     * 
     */
    private ExecuteAmountRequestDTO executeAmount;

    /**
     * 
     */
    private List<CodeCountRequestDTO> codeCountList;

    /**
     * 
     */
    private List<QrCodeRequestDTO> codeList;

    /**
     * 记录自定义字段
     */
    private CustomFieldBaseRequestDTO recordCustomField;

    public int getExecuteWay() {
        return executeWay;
    }

    public ExecuteAmountRequestDTO getExecuteAmount() {
        return executeAmount;
    }

    public List<CodeCountRequestDTO> getCodeCountList() {
        return codeCountList;
    }

    public List<QrCodeRequestDTO> getCodeList() {
        return codeList;
    }

    public CustomFieldBaseRequestDTO getRecordCustomField() {
        return recordCustomField;
    }

    public void setExecuteWay(int executeWay) {
        this.executeWay = executeWay;
    }

    public void setExecuteAmount(ExecuteAmountRequestDTO executeAmount) {
        this.executeAmount = executeAmount;
    }

    public void setCodeCountList(List<CodeCountRequestDTO> codeCountList) {
        this.codeCountList = codeCountList;
    }

    public void setCodeList(List<QrCodeRequestDTO> codeList) {
        this.codeList = codeList;
    }

    public void setRecordCustomField(CustomFieldBaseRequestDTO recordCustomField) {
        this.recordCustomField = recordCustomField;
    }
}

