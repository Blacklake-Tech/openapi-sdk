package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ForwardTraceRelationshipSearchRequestDTO {
    /**
     * 去向批次号
     */
    private String toBatchNo;

    /**
     * 去向物料id
     */
    private long toMaterialId = 0;

    /**
     * 查询层级
     */
    private int level = 0;

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

