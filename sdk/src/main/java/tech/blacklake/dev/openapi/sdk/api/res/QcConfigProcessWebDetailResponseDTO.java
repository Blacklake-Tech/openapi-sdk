package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigProcessWebDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * 工序id
     */
    private Long id;

    /**
     * 工序编号
     */
    private String code;

    /**
     * 工序名称
     */
    private String name;

    /**
     * 工序在产线上出现的顺序
     */
    private Integer seq;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getSeq() {
        return seq;
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

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
