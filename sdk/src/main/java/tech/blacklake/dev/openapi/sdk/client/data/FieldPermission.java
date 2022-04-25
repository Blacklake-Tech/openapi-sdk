package tech.blacklake.dev.openapi.sdk.client.data;

import java.util.List;

/**
 * @author cuiyichen
 * @date 2022/04/24 20:37:39
 */
public class FieldPermission {
    private List<String> readonly;
    private List<String> noAccess;
    private String encoding;

    public List<String> getReadonly() {
        return readonly;
    }

    public void setReadonly(List<String> readonly) {
        this.readonly = readonly;
    }

    public List<String> getNoAccess() {
        return noAccess;
    }

    public void setNoAccess(List<String> noAccess) {
        this.noAccess = noAccess;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}