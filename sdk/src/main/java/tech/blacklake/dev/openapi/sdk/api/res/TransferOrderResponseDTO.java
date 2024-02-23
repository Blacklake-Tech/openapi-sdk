package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderResponseDTO {
    /**
     * 调拨单id
     */
    private long id;

    /**
     * 调拨单明细id
     */
    private long itemId;

    /**
     * 调拨单code
     */
    private String code;

    public long getId() {
        return id;
    }

    public long getItemId() {
        return itemId;
    }

    public String getCode() {
        return code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
