package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.List;

public class CustomFieldBaseVO {

    List<CustomFieldInstance> customFields;
    List<SonObject> sonObjects;

    public List<CustomFieldInstance> getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(List<CustomFieldInstance> customFields) {
        this.customFields = customFields;
    }

    public List<SonObject> getSonObjects() {
        return this.sonObjects;
    }

    public void setSonObjects(List<SonObject> sonObjects) {
        this.sonObjects = sonObjects;
    }
}
