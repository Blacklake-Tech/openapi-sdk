package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UpsertCustomerBaseInfoRequestDTO {
    /**
     * 编号：必填，支持字母、数字和符号，不可超过255个字符，前后不支持空格，若客户编号系统中已存在则覆盖导入
     */
    private String code;

    /**
     * 名称：必填，支持字母、数字、符号、中文，不可超过 255个字符，前后不支持空格
     */
    private String name;

    /**
     * 客户所有人：必填，请填写用户的编号
     */
    private String ownerCode;

    /**
     * 备注：非必填，不可超过1000字符
     */
    private String remark;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

