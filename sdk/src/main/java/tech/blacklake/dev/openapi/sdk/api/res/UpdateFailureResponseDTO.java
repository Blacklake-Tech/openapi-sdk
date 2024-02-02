package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UpdateFailureResponseDTO {
    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * failureReason
     */
    private String failureReason;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }
}

