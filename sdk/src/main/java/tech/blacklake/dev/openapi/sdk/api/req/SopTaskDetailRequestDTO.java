package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SopTaskDetailRequestDTO {
    /**
     * SOP任务ID
     */
    private long sopTaskId = 0;

    public long getSopTaskId() {
        return sopTaskId;
    }

    public void setSopTaskId(long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }
}

