package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class SopTaskDetailRequestDTO {
    /**
     * SOP任务ID
     */
    private long sopTaskId;

    public long getSopTaskId() {
        return sopTaskId;
    }

    public void setSopTaskId(long sopTaskId) {
        this.sopTaskId = sopTaskId;
    }
}
