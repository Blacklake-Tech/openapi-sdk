package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomFieldItemWebResponseDTO {
    /**
     * 字段id
     */
    private Long fieldId;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 字段code
     */
    private String fieldCode;

    /**
     * 字段值
     */
    private Object displayValue;

    public Long getFieldId() {
        return fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public Object getDisplayValue() {
        return displayValue;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public void setDisplayValue(Object displayValue) {
        this.displayValue = displayValue;
    }
}

