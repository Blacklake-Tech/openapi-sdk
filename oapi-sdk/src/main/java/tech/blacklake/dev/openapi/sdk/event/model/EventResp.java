package tech.blacklake.dev.openapi.sdk.event.model;

import tech.blacklake.dev.openapi.sdk.constants.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventResp {

    public static final String RESPONSE_FORMAT = "{\"msg\":\"%s\"}";
    private byte[] body;
    private Map<String, List<String>> headers = new HashMap();
    private int statusCode;

    public EventResp() {

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

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setContentType(String contentType) {
        List<String> ct = new ArrayList<>();
        ct.add(contentType);
        this.headers.put(Constants.CONTENT_TYPE, ct);
    }
}
