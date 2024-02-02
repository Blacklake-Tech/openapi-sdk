package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcConfigLinkedRequestDTO {
    /**
     * 检验方案编号
     */
    private String configCode;

    /**
     * 关联关系类型
     */
    private String category;

    /**
     * 编号
     */
    private String code;

    /**
     * 检验单位
     */
    private String unit;

    /**
     * 工序次序
     */
    private String processSeq;

    public String getConfigCode() {
        return configCode;
    }

    public String getCategory() {
        return category;
    }

    public String getCode() {
        return code;
    }

    public String getUnit() {
        return unit;
    }

    public String getProcessSeq() {
        return processSeq;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setProcessSeq(String processSeq) {
        this.processSeq = processSeq;
    }
}

