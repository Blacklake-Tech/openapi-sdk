package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessPlanRequestDTO  {
    /**
     * 工序列表
     */
    private List<ProcessRequestDTO> processes;

    /**
     * 工序接续关系列表
     */
    private List<ProcessConnectionRequestDTO> processConnections;

    /**
     * 是否支持高级 SOP 方案 1:支持 0:不支持
     */
    private int enableSop = 0;

    public List<ProcessRequestDTO> getProcesses() {
        return processes;
    }

    public List<ProcessConnectionRequestDTO> getProcessConnections() {
        return processConnections;
    }

    public int getEnableSop() {
        return enableSop;
    }

    public void setProcesses(List<ProcessRequestDTO> processes) {
        this.processes = processes;
    }

    public void setProcessConnections(List<ProcessConnectionRequestDTO> processConnections) {
        this.processConnections = processConnections;
    }

    public void setEnableSop(int enableSop) {
        this.enableSop = enableSop;
    }
}

