package tech.blacklake.dev.openapi.sdk.api.dto;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ExcelImportResult {
    /**
     * status
     */
    private boolean status;

    /**
     * index
     */
    private int index;

    /**
     * reason
     */
    private String reason;

    /**
     * errorCode
     */
    private List<BizExData> errorCode;

    public boolean getStatus() {
        return status;
    }

    public int getIndex() {
        return index;
    }

    public String getReason() {
        return reason;
    }

    public List<BizExData> getErrorCode() {
        return errorCode;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setErrorCode(List<BizExData> errorCode) {
        this.errorCode = errorCode;
    }
}

