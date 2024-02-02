package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UserLicenseDetailResponseDTO {
    /**
     * 许可名称
     */
    private String name;

    /**
     * 许可编号
     */
    private String code;

    /**
     * 许可使用量上限
     */
    private Integer licenseNumLimit;

    /**
     * 许可已使用量
     */
    private Integer licenseNumUsed;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Integer getLicenseNumLimit() {
        return licenseNumLimit;
    }

    public Integer getLicenseNumUsed() {
        return licenseNumUsed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLicenseNumLimit(Integer licenseNumLimit) {
        this.licenseNumLimit = licenseNumLimit;
    }

    public void setLicenseNumUsed(Integer licenseNumUsed) {
        this.licenseNumUsed = licenseNumUsed;
    }
}

