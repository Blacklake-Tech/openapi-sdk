package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProcessRouteBasicInfoResponseDTO {
    /**
     * id
     */
    private long id;

    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * remark
     */
    private String remark;

    /**
     * status key = ActiveEnum
     */
    private BizConstantDisplay status;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getStatus() {
        return status;
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

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }
}
