package tech.blacklake.dev.openapi.sdk.api.common;

public class CustomFieldInstanceCreate {
    private Long fieldId;

    private String fieldCode;

    private Object fieldValue;

    public Long getFieldId() {
        return this.fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldCode() {
        return this.fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public Object getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
