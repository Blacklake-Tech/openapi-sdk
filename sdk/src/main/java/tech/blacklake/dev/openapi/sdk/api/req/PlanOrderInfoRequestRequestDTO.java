package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderInfoRequestRequestDTO {
    /**
     * 计划订单 ID
     */
    private long planOrderId;

    public long getPlanOrderId() {
        return planOrderId;
    }

    public void setPlanOrderId(long planOrderId) {
        this.planOrderId = planOrderId;
    }
}
