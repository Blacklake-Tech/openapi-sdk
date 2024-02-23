package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskSaveForMengniuSimpleCodeRequestDTO {
    /**
     * 编号
     */
    private String code;

    /**
     * id
     */
    private Long id;

    /**
     * extra long
     */
    private Long extraLong;

    /**
     * extra string
     */
    private String extraString;

    public String getCode() {
        return code;
    }

    public Long getId() {
        return id;
    }

    public Long getExtraLong() {
        return extraLong;
    }

    public String getExtraString() {
        return extraString;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExtraLong(Long extraLong) {
        this.extraLong = extraLong;
    }

    public void setExtraString(String extraString) {
        this.extraString = extraString;
    }
}
