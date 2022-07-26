package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class CustomObjectSearchItemRequestRequestDTO {
    /**
     * 字段编码
     */
    private String fieldCode;

    /**
     * 字段值，只有一个值的传一个就行，多个值传多个，注意某些字段的顺序，比如日期字段，开始和结束时间顺序
     */
    private List<Object> fieldValues;

    public String getFieldCode() {
        return fieldCode;
    }

    public List<Object> getFieldValues() {
        return fieldValues;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public void setFieldValues(List<Object> fieldValues) {
        this.fieldValues = fieldValues;
    }
}

