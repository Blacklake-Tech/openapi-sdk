package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class RoleListRequestDTO extends BasePage {
    /**
     * 角色编号，非必填
     */
    private String code;

    /**
     * 角色名称，非必填
     */
    private String name;

    /**
     * 角色启用状态，非必填，0为停用，1为启用
     */
    private Integer enableFlag;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }
}

