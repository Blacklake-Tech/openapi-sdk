package tech.blacklake.dev.openapi.sdk.event.model;

import tech.blacklake.dev.openapi.domain.service.mq.dto.CallbackDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventReq {

    private byte[] body;

    private String httpPath;

    private Map<String, List<String>> headers = new HashMap();

    private CallbackDTO callbackDTO;

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

    public CallbackDTO getCallbackDTO() {
        return callbackDTO;
    }

    public void setCallbackDTO(CallbackDTO callbackDTO) {
        this.callbackDTO = callbackDTO;
    }
}
