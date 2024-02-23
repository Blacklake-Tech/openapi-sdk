package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ForwardTraceRelationshipSearchRequestDTO {
    /**
     * 去向批次号
     */
    private String toBatchNo;

    /**
     * 去向物料id
     */
    private long toMaterialId;

    /**
     * 查询层级
     */
    private int level;

    public String getToBatchNo() {
        return toBatchNo;
    }

    public long getToMaterialId() {
        return toMaterialId;
    }

    public int getLevel() {
        return level;
    }

    public void setToBatchNo(String toBatchNo) {
        this.toBatchNo = toBatchNo;
    }

    public void setToMaterialId(long toMaterialId) {
        this.toMaterialId = toMaterialId;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
