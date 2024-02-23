package tech.blacklake.dev.openapi.sdk.api.common;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SonObject {
    @ApiModelProperty("对象code")
    private String objectCode;

    @ApiModelProperty("自定义字段列表")
    private List<CustomFieldInstance> customFieldInstances;

    public SonObject() {}

    public String getObjectCode() {
        return this.objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public List<CustomFieldInstance> getCustomFields() {
        return this.customFieldInstances;
    }

    public void setCustomFields(List<CustomFieldInstance> customFieldInstances) {
        this.customFieldInstances = customFieldInstances;
    }
}
