package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UnitListRequestDTO extends BasePage {
    /**
     * 单位名称，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 单位编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String code;

    /**
     * 单位状态，1启用，0停用
     */
    private Integer enableFlag;

    /**
     * 快速查询，支持单位编号和单位名称的模糊搜索
     */
    private String quickSearch;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }
}
