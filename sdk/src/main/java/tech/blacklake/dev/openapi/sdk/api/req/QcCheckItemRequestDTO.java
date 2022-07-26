package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcCheckItemRequestDTO {
    /**
     * 检验项名称
     */
    private String name;

    /**
     * 检验项编号
     */
    private String code;

    /**
     * 备注
     */
    private String remark;

    /**
     * 检验项分类名称
     */
    private String categoryName;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

