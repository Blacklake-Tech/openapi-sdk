package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageAreaTreeResponseDTO {
    /**
     * 仓库区域id
     */
    private Long id;

    /**
     * 仓库区域编码
     */
    private String code;

    /**
     * 仓库区域名称
     */
    private String name;

    /**
     * 仓库区域标识码
     */
    private String qrCode;

    /**
     * 状态 1启用 0禁用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 是否锁定1锁定0未锁定
     */
    private BizConstantDisplay isLock;

    /**
     * 备注
     */
    private String remark;

    /**
     * 子区域
     */
    private StorageAreaTreeResponseDTO sonArea;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getQrCode() {
        return qrCode;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public BizConstantDisplay getIsLock() {
        return isLock;
    }

    public String getRemark() {
        return remark;
    }

    public StorageAreaTreeResponseDTO getSonArea() {
        return sonArea;
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

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setIsLock(BizConstantDisplay isLock) {
        this.isLock = isLock;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSonArea(StorageAreaTreeResponseDTO sonArea) {
        this.sonArea = sonArea;
    }
}

