package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderDetailRequestDTO {
    /**
     * 调拨单ID
     */
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
