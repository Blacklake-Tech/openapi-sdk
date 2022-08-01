package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomObjectSonObjectInstanceResponseResponseDTO {
    /**
     * 对象编码
     */
    private String objectCode;

    /**
     * 对象名称
     */
    private String objectName;

    /**
     * 对象实例ID
     */
    private String instanceId;

    /**
     * 从对象referName
     */
    private String referName;

    /**
     * 从对象referCode
     */
    private String referCode;

    public String getObjectCode() {
        return objectCode;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public String getReferName() {
        return referName;
    }

    public String getReferCode() {
        return referCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setReferName(String referName) {
        this.referName = referName;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }
}

