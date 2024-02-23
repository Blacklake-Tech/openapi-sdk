package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BatchNoKeyRequestDTO {
    /**
     * 是否自动获取批号
     */
    private int autoNoFlag;

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
