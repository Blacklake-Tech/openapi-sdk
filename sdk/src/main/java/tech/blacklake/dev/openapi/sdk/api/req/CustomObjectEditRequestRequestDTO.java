package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectEditRequestRequestDTO {
    /**
     * 实例ID
     */
    private Long instanceId;

    /**
     * 对象编码
     */
    private String objectCode;

    /**
     * 自定义对象字段列表
     */
    private List<CustomObjectFieldKeyValueRequestRequestDTO> fields;

    /**
     * 自定义对象从对象列表
     */
    private List<CustomObjectSonObjectInstanceRequestRequestDTO> sonObjects;

    public Long getInstanceId() {
        return instanceId;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public List<CustomObjectFieldKeyValueRequestRequestDTO> getFields() {
        return fields;
    }

    public List<CustomObjectSonObjectInstanceRequestRequestDTO> getSonObjects() {
        return sonObjects;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setFields(List<CustomObjectFieldKeyValueRequestRequestDTO> fields) {
        this.fields = fields;
    }

    public void setSonObjects(List<CustomObjectSonObjectInstanceRequestRequestDTO> sonObjects) {
        this.sonObjects = sonObjects;
    }
}
