package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SourceOrderResponseDTO  {
    /**
     * 业务id
     */
    private long id;

    /**
     * 单据信息
     */
    private PlanOrderValueResponseDTO planOrderValue;

    /**
     * 单据行号
     */
    private String planOrderLine;

    public long getId() {
        return id;
    }

    public PlanOrderValueResponseDTO getPlanOrderValue() {
        return planOrderValue;
    }

    public String getPlanOrderLine() {
        return planOrderLine;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPlanOrderValue(PlanOrderValueResponseDTO planOrderValue) {
        this.planOrderValue = planOrderValue;
    }

    public void setPlanOrderLine(String planOrderLine) {
        this.planOrderLine = planOrderLine;
    }
}

