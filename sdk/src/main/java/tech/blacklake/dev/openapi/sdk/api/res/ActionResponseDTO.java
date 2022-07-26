package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class ActionResponseDTO {
    /**
     * 库存变动类型
     */
    private String action;

    /**
     * 描述
     */
    private String desc;

    public String getAction() {
        return action;
    }

    public String getDesc() {
        return desc;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

