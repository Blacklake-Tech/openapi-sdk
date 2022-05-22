package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class StorageLocationInfoResponseDTO {
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
}

