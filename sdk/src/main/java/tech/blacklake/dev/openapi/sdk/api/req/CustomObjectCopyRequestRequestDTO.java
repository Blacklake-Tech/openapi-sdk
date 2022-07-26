package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomObjectCopyRequestRequestDTO {
    /**
     * 实例ID
     */
    private Long instanceId;

    /**
     * 对象编码
     */
    private String objectCode;

    public Long getInstanceId() {
        return instanceId;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }
}

