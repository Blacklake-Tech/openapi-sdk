package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomObjectDetailRequestRequestDTO {
    /**
     * 实例ID
     */
    private Long instanceId;

    /**
     * 对象编码
     */
    private String objectCode;

    /**
     * 是否返回从对象，默认为true
     */
    private boolean includeChildren = true;

    /**
     * 是否返回直接关联对象，默认为false
     */
    private boolean includeDirectlyRelated = false;

    public Long getInstanceId() {
        return instanceId;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public boolean getIncludeChildren() {
        return includeChildren;
    }

    public boolean getIncludeDirectlyRelated() {
        return includeDirectlyRelated;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setIncludeChildren(boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public void setIncludeDirectlyRelated(boolean includeDirectlyRelated) {
        this.includeDirectlyRelated = includeDirectlyRelated;
    }
}

