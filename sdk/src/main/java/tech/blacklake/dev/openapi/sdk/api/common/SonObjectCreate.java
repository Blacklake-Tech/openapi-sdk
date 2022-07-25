package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.List;

public class SonObjectCreate {
    private String objectCode;

    private List<CustomFieldInstanceCreate> customFieldInstances;

    public SonObjectCreate() {
    }

    public String getObjectCode() {
        return this.objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public List<CustomFieldInstanceCreate> getCustomFields() {
        return this.customFieldInstances;
    }

    public void setCustomFields(List<CustomFieldInstanceCreate> customFieldInstances) {
        this.customFieldInstances = customFieldInstances;
    }
}
