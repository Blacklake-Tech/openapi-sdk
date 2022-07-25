package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageWarehouseWebPageListResponseDTO  {
    /**
     * 仓库id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;

    /**
     * 标识码
     */
    private String qrCode;

    /**
     * 仓库类型 1车间仓库 0普通仓库
     */
    private BizConstantDisplay bizType;

    /**
     * 仓库状态，1启用 0禁用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 是否开启仓位管理 1启用0禁用
     */
    private BizConstantDisplay enableStorageLocation;

    /**
     * 是否开启质量管控 1开启 0未开启
     */
    private BizConstantDisplay enableQcCtrl;

    /**
     * 是否锁定 1锁定 0未锁定
     */
    private BizConstantDisplay isLock;

    /**
     * 备注
     */
    private String remark;

    /**
     * 质量状态 1合格 2让步合格 3待检 4不合格 5暂控
     */
    private List<BizConstantDisplay> qcCtrlList;

    /**
     * 自定义字段数据
     */
    private List<CustomFieldItemWebResponseDTO> customFieldItems;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getQrCode() {
        return qrCode;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
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

    public String getRemark() {
        return remark;
    }

    public List<BizConstantDisplay> getQcCtrlList() {
        return qcCtrlList;
    }

    public List<CustomFieldItemWebResponseDTO> getCustomFieldItems() {
        return customFieldItems;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
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

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setQcCtrlList(List<BizConstantDisplay> qcCtrlList) {
        this.qcCtrlList = qcCtrlList;
    }

    public void setCustomFieldItems(List<CustomFieldItemWebResponseDTO> customFieldItems) {
        this.customFieldItems = customFieldItems;
    }
}

