package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomFiledRequestDTO {
    /**
     * 自定义字段ID
     */
    private Long customFieldId;

    /**
     * 自定义字段值
     */
    private Object customFieldValue;

    public Long getCustomFieldId() {
        return customFieldId;
    }

    public Object getCustomFieldValue() {
        return customFieldValue;
    }

    public void setCustomFieldId(Long customFieldId) {
        this.customFieldId = customFieldId;
    }

    public void setCustomFieldValue(Object customFieldValue) {
        this.customFieldValue = customFieldValue;
    }
}
