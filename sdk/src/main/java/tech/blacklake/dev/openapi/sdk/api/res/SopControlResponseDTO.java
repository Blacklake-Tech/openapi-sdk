package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SopControlResponseDTO {
    /**
     * sop控件id
     */
    private long id = 0;

    /**
     * sop控件类型
     */
    private BizConstantDisplay controlType;

    /**
     * sop控件名称
     */
    private String name;

    /**
     * sop控件编号
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

