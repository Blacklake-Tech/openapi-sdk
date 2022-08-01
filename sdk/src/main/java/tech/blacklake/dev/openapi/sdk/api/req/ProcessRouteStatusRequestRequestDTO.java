package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ProcessRouteStatusRequestRequestDTO  {
    /**
     * 工艺路线ID
     */
    private List<Long> idList;

    /**
     * 要变更为的状态
     */
    private int status;

    public List<Long> getIdList() {
        return idList;
    }

    public int getStatus() {
        return status;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

