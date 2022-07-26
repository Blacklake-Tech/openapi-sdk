package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SourcePlanOrderRequestDTO  {
    /**
     * 业务ID
     */
    private Long id;

    /**
     * 来源单据ID
     */
    private long sourcePlanOrderId = 0;

    /**
     * 来源单据行号
     */
    private String sourcePlanOrderLine;

    public Long getId() {
        return id;
    }

    public long getSourcePlanOrderId() {
        return sourcePlanOrderId;
    }

    public String getSourcePlanOrderLine() {
        return sourcePlanOrderLine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSourcePlanOrderId(long sourcePlanOrderId) {
        this.sourcePlanOrderId = sourcePlanOrderId;
    }

    public void setSourcePlanOrderLine(String sourcePlanOrderLine) {
        this.sourcePlanOrderLine = sourcePlanOrderLine;
    }
}

