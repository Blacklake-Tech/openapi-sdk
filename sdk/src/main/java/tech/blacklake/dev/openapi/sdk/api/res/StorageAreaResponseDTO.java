package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class StorageAreaResponseDTO {
    /**
     * id
     */
    private long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 下一级区域信息
     */
    private StorageAreaResponseDTO sonArea;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getName() {
        return name;
    }

    public StorageAreaResponseDTO getSonArea() {
        return sonArea;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSonArea(StorageAreaResponseDTO sonArea) {
        this.sonArea = sonArea;
    }
}

