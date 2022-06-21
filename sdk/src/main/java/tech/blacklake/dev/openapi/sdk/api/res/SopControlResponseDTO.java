package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SopControlResponseDTO  {
    /**
     * 工厂id
     */
    private long id = 0;

    /**
     * SOP控件编号
     */
    private String code;

    /**
     * SOP控件名称
     */
    private String name;

    /**
     * 控件类型
     */
    private BizConstantDisplay controlType;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BizConstantDisplay getControlType() {
        return controlType;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setControlType(BizConstantDisplay controlType) {
        this.controlType = controlType;
    }
}

