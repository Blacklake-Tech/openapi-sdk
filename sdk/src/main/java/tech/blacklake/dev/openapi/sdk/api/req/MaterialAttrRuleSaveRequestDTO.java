package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialAttrRuleSaveRequestDTO {
    /**
     * ID，必填
     */
    private long id = 0L;

    /**
     * 名称，非必填，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

