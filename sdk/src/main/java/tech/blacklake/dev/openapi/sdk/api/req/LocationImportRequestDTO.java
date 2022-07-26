package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class LocationImportRequestDTO extends BaseImportDO {
    /**
     * 上级区域编号，单行文本，不可超过255个字符
     */
    private String parentCode;

    /**
     * 区域编号，单行文本，不可超过255个字符
     */
    private String code;

    /**
     * 区域名称，单行文本，不可超过255个字符
     */
    private String name;

    /**
     * 区域层级，单行文本，不可超过255个字符
     */
    private String levelStr;

    /**
     * 负责人编号，单行文本，不可超过255个字符
     */
    private String managerCode;

    /**
     * 标识码,单行文本，不可超过255个字符
     */
    private String identifier;

    public String getParentCode() {
        return parentCode;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLevelStr() {
        return levelStr;
    }

    public String getManagerCode() {
        return managerCode;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevelStr(String levelStr) {
        this.levelStr = levelStr;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

