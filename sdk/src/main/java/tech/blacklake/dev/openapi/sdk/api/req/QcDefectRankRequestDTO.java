package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcDefectRankRequestDTO {
    /**
     * 不良等级名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
