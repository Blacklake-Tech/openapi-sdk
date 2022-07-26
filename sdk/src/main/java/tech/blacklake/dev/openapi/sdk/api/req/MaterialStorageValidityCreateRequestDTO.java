package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialStorageValidityCreateRequestDTO {
    /**
     * 时间
     */
    private Integer time;

    /**
     * 单位，0年、1月、2日、3时、4分
     */
    private Integer unit;

    public Integer getTime() {
        return time;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }
}

