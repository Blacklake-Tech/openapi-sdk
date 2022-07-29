package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ClosePlanOrderRequestDTO  {
    /**
     * 计划订单ID
     */
    private List<Long> planOrderIdList;

    /**
     * 关闭原因
     */
    private String operateReason;

    public List<Long> getPlanOrderIdList() {
        return planOrderIdList;
    }

    public String getOperateReason() {
        return operateReason;
    }

    public void setPlanOrderIdList(List<Long> planOrderIdList) {
        this.planOrderIdList = planOrderIdList;
    }

    public void setOperateReason(String operateReason) {
        this.operateReason = operateReason;
    }
}

