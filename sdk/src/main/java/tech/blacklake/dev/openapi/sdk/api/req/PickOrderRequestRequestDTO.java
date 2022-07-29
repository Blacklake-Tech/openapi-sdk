package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PickOrderRequestRequestDTO {
    /**
     * 领料单ID
     */
    private long pickOrderId = 0L;

    public long getPickOrderId() {
        return pickOrderId;
    }

    public void setPickOrderId(long pickOrderId) {
        this.pickOrderId = pickOrderId;
    }
}

