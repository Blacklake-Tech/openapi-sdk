package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class BatchNoKeyRequestDTO {
    /**
     * 是否自动获取批号
     */
    private int autoNoFlag = 0;

    /**
     * 批次
     */
    private String batchNo;

    /**
     * 批次属性
     */
    private BatchNoAttrRequestDTO batchNoAttr;

    public int getAutoNoFlag() {
        return autoNoFlag;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public BatchNoAttrRequestDTO getBatchNoAttr() {
        return batchNoAttr;
    }

    public void setAutoNoFlag(int autoNoFlag) {
        this.autoNoFlag = autoNoFlag;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setBatchNoAttr(BatchNoAttrRequestDTO batchNoAttr) {
        this.batchNoAttr = batchNoAttr;
    }
}

