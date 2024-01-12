package tech.blacklake.dev.openapi.sdk.event.model.check;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

public class CheckDTO extends BaseCallbackDTO {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
