package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialCategoryListRequestDTO extends BasePage {
    /**
     * 分类编号 List（精确查询）
     */
    private List<String> codeList;

    /**
     * 分类编号（模糊查询）
     */
    private String code;

    /**
     * 分类名称（模糊查询）
     */
    private String name;

    /**
     * 分类名称 List（精确查询）
     */
    private List<String> nameList;

    public List<String> getCodeList() {
        return codeList;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }
}
