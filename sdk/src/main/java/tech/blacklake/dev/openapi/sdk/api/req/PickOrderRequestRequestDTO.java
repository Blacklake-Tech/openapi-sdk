package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PickOrderRequestRequestDTO {
    /**
     * 领料单ID
     */
    private long pickOrderId;

    public long getPickOrderId() {
        return pickOrderId;
    }

    public void setPickOrderId(long pickOrderId) {
        this.pickOrderId = pickOrderId;
    }
}
