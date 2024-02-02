package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SourceWorkOrderRequestDTO  {
    /**
     * 来源单据ID
     */
    private long sourceWorkOrderId;

    /**
     * 来源单据行号
     */
    private String sourceWorkOrderLine;

    public long getSourceWorkOrderId() {
        return sourceWorkOrderId;
    }

    public String getSourceWorkOrderLine() {
        return sourceWorkOrderLine;
    }

    public void setSourceWorkOrderId(long sourceWorkOrderId) {
        this.sourceWorkOrderId = sourceWorkOrderId;
    }

    public void setSourceWorkOrderLine(String sourceWorkOrderLine) {
        this.sourceWorkOrderLine = sourceWorkOrderLine;
    }
}

