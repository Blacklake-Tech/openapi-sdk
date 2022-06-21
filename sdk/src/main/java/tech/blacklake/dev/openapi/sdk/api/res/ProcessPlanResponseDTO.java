package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessPlanResponseDTO  {
    /**
     * 引用工艺路线信息
     */
    private ProcessRouteResponseDTO originalProcessRoute;

    /**
     * 工艺路线快照ID（用于工程变更）
     */
    private Long processRouteSnapshotId;

    /**
     * 是否启用sop
     */
    private int enableSop = 0;

    /**
     * 工序
     */
    private List<ProcessInfoResponseDTO> processes;

    /**
     * 工序接续关系
     */
    private List<ProcessConnectionResponseDTO> processConnections;

    public ProcessRouteResponseDTO getOriginalProcessRoute() {
        return originalProcessRoute;
    }

    public Long getProcessRouteSnapshotId() {
        return processRouteSnapshotId;
    }

    public int getEnableSop() {
        return enableSop;
    }

    public List<ProcessInfoResponseDTO> getProcesses() {
        return processes;
    }

    public List<ProcessConnectionResponseDTO> getProcessConnections() {
        return processConnections;
    }

    public void setOriginalProcessRoute(ProcessRouteResponseDTO originalProcessRoute) {
        this.originalProcessRoute = originalProcessRoute;
    }

    public void setProcessRouteSnapshotId(Long processRouteSnapshotId) {
        this.processRouteSnapshotId = processRouteSnapshotId;
    }

    public void setEnableSop(int enableSop) {
        this.enableSop = enableSop;
    }

    public void setProcesses(List<ProcessInfoResponseDTO> processes) {
        this.processes = processes;
    }

    public void setProcessConnections(List<ProcessConnectionResponseDTO> processConnections) {
        this.processConnections = processConnections;
    }
}

