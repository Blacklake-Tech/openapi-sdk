package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomFieldInstanceCreateRequestDTO {
    /**
     * 自定义字段id，全租户唯一
     */
    private Long fieldId;

    /**
     * 自定义字段的编号，租户单对象下唯一，与fieldId任传一个即可
     */
    private String fieldCode;

    /**
     * 该自定义字段的值，值类型与该自定义字段的字段类型有关，详细映射关系见以下文档：https://blacklake.feishu.cn/docs/doccnRdPPj7bWl2xV0LWSBxtswc
     */
    private Object fieldValue;

    public Long getFieldId() {
        return fieldId;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
