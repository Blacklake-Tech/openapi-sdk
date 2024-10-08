package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PickOrderListRequestRequestDTO {
    /**
     * 领料单编码
     */
    private String pickOrderCode;

    /**
     * 更新时间起
     */
    private Long updatedAtStart;

    /**
     * 更新时间止
     */
    private Long updatedAtEnd;

    public String getPickOrderCode() {
        return pickOrderCode;
    }

    public Long getUpdatedAtStart() {
        return updatedAtStart;
    }

    public Long getUpdatedAtEnd() {
        return updatedAtEnd;
    }

    public void setPickOrderCode(String pickOrderCode) {
        this.pickOrderCode = pickOrderCode;
    }

    public void setUpdatedAtStart(Long updatedAtStart) {
        this.updatedAtStart = updatedAtStart;
    }

    public void setUpdatedAtEnd(Long updatedAtEnd) {
        this.updatedAtEnd = updatedAtEnd;
    }
}
