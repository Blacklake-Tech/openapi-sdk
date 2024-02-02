package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageWarehouseResponseDTO {
    /**
     * 仓库ID
     */
    private Long id;

    /**
     * 编号
     */
    private String code;

    /**
     * 识别码
     */
    private String qrCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String remark;

    /**
     * 状态1启用0停用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 0车间仓库1普通仓库
     */
    private BizConstantDisplay bizType;

    /**
     * 是否可以拥有仓位0不可1可
     */
    private BizConstantDisplay enableStorageLocation;

    /**
     * 开启质量管控1开0关
     */
    private BizConstantDisplay enableQcCtrl;

    /**
     * 是否锁定0不锁1锁
     */
    private BizConstantDisplay isLock;

    /**
     * 质量状态 1合格 2让步合格 3待检 4不合格 5暂控
     */
    private List<BizConstantDisplay> qcCtrlList;

    public Long getId() {
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

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getEnableStorageLocation() {
        return enableStorageLocation;
    }

    public BizConstantDisplay getEnableQcCtrl() {
        return enableQcCtrl;
    }

    public BizConstantDisplay getIsLock() {
        return isLock;
    }

    public List<BizConstantDisplay> getQcCtrlList() {
        return qcCtrlList;
    }

    public void setId(Long id) {
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

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setEnableStorageLocation(BizConstantDisplay enableStorageLocation) {
        this.enableStorageLocation = enableStorageLocation;
    }

    public void setEnableQcCtrl(BizConstantDisplay enableQcCtrl) {
        this.enableQcCtrl = enableQcCtrl;
    }

    public void setIsLock(BizConstantDisplay isLock) {
        this.isLock = isLock;
    }

    public void setQcCtrlList(List<BizConstantDisplay> qcCtrlList) {
        this.qcCtrlList = qcCtrlList;
    }
}

