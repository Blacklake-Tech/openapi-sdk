package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ConfigurationItemsRequestDTO {
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
