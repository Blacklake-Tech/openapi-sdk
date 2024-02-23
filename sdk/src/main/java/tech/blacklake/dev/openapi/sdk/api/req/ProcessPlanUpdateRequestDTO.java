package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessPlanUpdateRequestDTO {
    /**
     * 工艺路线快照ID
     */
    private long processRouteSnapshotId;

    /**
     * 工序列表
     */
    private List<ProcessUpdateRequestDTO> processes;

    /**
     * 工序接续关系列表
     */
    private List<ProcessConnectionUpdateRequestDTO> processConnections;

    /**
     * 是否支持高级 SOP 方案 1:支持 0:不支持
     */
    private int enableSop;

    public long getProcessRouteSnapshotId() {
        return processRouteSnapshotId;
    }

    public List<ProcessUpdateRequestDTO> getProcesses() {
        return processes;
    }

    public List<ProcessConnectionUpdateRequestDTO> getProcessConnections() {
        return processConnections;
    }

    public int getEnableSop() {
        return enableSop;
    }

    public void setProcessRouteSnapshotId(long processRouteSnapshotId) {
        this.processRouteSnapshotId = processRouteSnapshotId;
    }

    public void setProcesses(List<ProcessUpdateRequestDTO> processes) {
        this.processes = processes;
    }

    public void setProcessConnections(List<ProcessConnectionUpdateRequestDTO> processConnections) {
        this.processConnections = processConnections;
    }

    public void setEnableSop(int enableSop) {
        this.enableSop = enableSop;
    }
}
