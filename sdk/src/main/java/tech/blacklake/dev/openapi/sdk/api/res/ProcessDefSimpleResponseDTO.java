package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessDefSimpleResponseDTO  {
    /**
     * 工序定义ID
     */
    private long processDefId;

    /**
     * 工序号
     */
    private String processNum;

    public long getProcessDefId() {
        return processDefId;
    }

    public String getProcessNum() {
        return processNum;
    }

    public void setProcessDefId(long processDefId) {
        this.processDefId = processDefId;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }
}

