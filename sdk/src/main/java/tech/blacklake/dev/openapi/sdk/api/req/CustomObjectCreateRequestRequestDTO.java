package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectCreateRequestRequestDTO {
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
    private List<CustomObjectSonObjectRequestRequestDTO> sonObjects;

    public String getObjectCode() {
        return objectCode;
    }

    public List<CustomObjectFieldKeyValueRequestRequestDTO> getFields() {
        return fields;
    }

    public List<CustomObjectSonObjectRequestRequestDTO> getSonObjects() {
        return sonObjects;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setFields(List<CustomObjectFieldKeyValueRequestRequestDTO> fields) {
        this.fields = fields;
    }

    public void setSonObjects(List<CustomObjectSonObjectRequestRequestDTO> sonObjects) {
        this.sonObjects = sonObjects;
    }
}
