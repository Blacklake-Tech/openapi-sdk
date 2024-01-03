package tech.blacklake.dev.openapi.sdk.event.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventReq {

    private byte[] body;
    private String httpPath;
    private Map<String, List<String>> headers = new HashMap();

    public String getHttpPath() {
        return httpPath;
    }

    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }
}
