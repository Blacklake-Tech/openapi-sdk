package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PlanOrderInfoRequestRequestDTO  {
    /**
     * 计划订单 ID
     */
    private long planOrderId = 0;

    public long getPlanOrderId() {
        return planOrderId;
    }

    public void setPlanOrderId(long planOrderId) {
        this.planOrderId = planOrderId;
    }
}

