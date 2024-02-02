package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ConfigurationItemsRequestDTO  {
    /**
     * 用料追溯关系
     */
    private int traceRelationship;

    public int getTraceRelationship() {
        return traceRelationship;
    }

    public void setTraceRelationship(int traceRelationship) {
        this.traceRelationship = traceRelationship;
    }
}

