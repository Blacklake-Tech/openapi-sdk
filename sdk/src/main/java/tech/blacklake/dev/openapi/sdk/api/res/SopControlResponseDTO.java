package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class SopControlResponseDTO {
    /**
     * id
     */
    private long id = 0;

    /**
     * controlType
     */
    private BizConstantDisplay controlType;

    /**
     * name
     */
    private String name;

    /**
     * code
     */
    private String code;

    public long getId() {
        return id;
    }

    public BizConstantDisplay getControlType() {
        return controlType;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setControlType(BizConstantDisplay controlType) {
        this.controlType = controlType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

