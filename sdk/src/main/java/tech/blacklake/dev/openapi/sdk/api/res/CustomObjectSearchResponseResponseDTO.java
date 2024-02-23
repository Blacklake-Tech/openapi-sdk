package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectSearchResponseResponseDTO {
    /**
     * 自定义对象实例id
     */
    private Long instanceId;

    /**
     * 对象编码
     */
    private String objectCode;

    /**
     * 创建者
     */
    private WebUserInfoResponseDTO creator;

    /**
     * 操作者
     */
    private WebUserInfoResponseDTO operator;

    /**
     * 更新时间
     */
    private Long updatedAt;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 字段信息
     */
    private List<CustomObjectFieldKeyValueResponseResponseDTO> fields;

    public Long getInstanceId() {
        return instanceId;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public WebUserInfoResponseDTO getCreator() {
        return creator;
    }

    public WebUserInfoResponseDTO getOperator() {
        return operator;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public List<CustomObjectFieldKeyValueResponseResponseDTO> getFields() {
        return fields;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setCreator(WebUserInfoResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(WebUserInfoResponseDTO operator) {
        this.operator = operator;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setFields(List<CustomObjectFieldKeyValueResponseResponseDTO> fields) {
        this.fields = fields;
    }
}
