package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UpsertSupplierBaseInfoRequestDTO {
    /**
     * 供应商编号
     */
    private String code;

    /**
     * 供应商名称
     */
    private String name;

    /**
     * 供应商所有人
     */
    private String ownerCode;

    /**
     * 备注
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
