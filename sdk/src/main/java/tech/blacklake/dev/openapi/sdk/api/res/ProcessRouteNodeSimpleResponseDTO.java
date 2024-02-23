package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessRouteNodeSimpleResponseDTO {
    /**
     * 工序节点Id
     */
    private Long id;

    /**
     * 工序号
     */
    private String processNum;

    /**
     * Sop方案Id
     */
    private Long sopPlanId;

    public Long getId() {
        return id;
    }

    public String getProcessNum() {
        return processNum;
    }

    public Long getSopPlanId() {
        return sopPlanId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

    public void setSopPlanId(Long sopPlanId) {
        this.sopPlanId = sopPlanId;
    }
}
