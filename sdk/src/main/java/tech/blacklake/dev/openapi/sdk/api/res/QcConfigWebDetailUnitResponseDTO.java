package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigWebDetailUnitResponseDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 单位编号
     */
    private String code;

    /**
     * 单位名称
     */
    private String name;

    /**
     * 启用状态(1启用0停用)
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
