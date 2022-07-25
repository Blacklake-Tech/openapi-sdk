package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class TransferOrderResponseDTO  {
    /**
     * 调拨单id
     */
    private long id = 0;

    /**
     * 调拨单明细id
     */
    private long itemId = 0;

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

