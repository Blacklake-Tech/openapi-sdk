package tech.blacklake.dev.openapi.sdk.api.common.custom;

import java.util.List;

public class CustomFieldBaseCO {

    List<CustomFieldInstanceCreate> customFields;
    List<SonObjectCreate> sonObjects;

    public CustomFieldBaseCO() {
    }

    public List<CustomFieldInstanceCreate> getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(List<CustomFieldInstanceCreate> customFields) {
        this.customFields = customFields;
    }

    public List<SonObjectCreate> getSonObjects() {
        return this.sonObjects;
    }

    public void setSonObjects(List<SonObjectCreate> sonObjects) {
        this.sonObjects = sonObjects;
    }
}
