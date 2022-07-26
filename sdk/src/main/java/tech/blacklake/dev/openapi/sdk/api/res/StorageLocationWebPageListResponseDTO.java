package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class StorageLocationWebPageListResponseDTO {
    /**
     * 仓位id
     */
    private Long id;

    /**
     * 编码
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
     * 备注
     */
    private String remark;

    /**
     * 启用状态1启用0禁用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 父级id
     */
    private Long parentId;

    /**
     * 父级类型 0仓库 1区域
     */
    private BizConstantDisplay parentType;

    /**
     * 父级名称
     */
    private String parentName;

    /**
     * 父级编码
     */
    private String parentCode;

    /**
     * 父级标识码
     */
    private String parentQrCode;

    /**
     * 所属仓库id
     */
    private Long warehouseId;

    /**
     * 所属仓库名称
     */
    private String warehouseName;

    /**
     * 所属仓库编码
     */
    private String warehouseCode;

    /**
     * 所属仓库标识码
     */
    private String warehouseQrCode;

    /**
     * 是否启用质量管理 1开启 0未开启
     */
    private BizConstantDisplay enableQcCtrl;

    /**
     * 管控的质量管理状态 1合格 2让步合格 3待检 4不合格 5暂控
     */
    private List<BizConstantDisplay> qcCtrlList;

    /**
     * 是否锁定 1锁定 0未锁定
     */
    private BizConstantDisplay isLock;

    /**
     * 自定义字段数据
     */
    private List<CustomFieldItemWebResponseDTO> customFieldItems;

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

    public Long getParentId() {
        return parentId;
    }

    public BizConstantDisplay getParentType() {
        return parentType;
    }

    public String getParentName() {
        return parentName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public String getParentQrCode() {
        return parentQrCode;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public String getWarehouseQrCode() {
        return warehouseQrCode;
    }

    public BizConstantDisplay getEnableQcCtrl() {
        return enableQcCtrl;
    }

    public List<BizConstantDisplay> getQcCtrlList() {
        return qcCtrlList;
    }

    public BizConstantDisplay getIsLock() {
        return isLock;
    }

    public List<CustomFieldItemWebResponseDTO> getCustomFieldItems() {
        return customFieldItems;
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

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setParentType(BizConstantDisplay parentType) {
        this.parentType = parentType;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setParentQrCode(String parentQrCode) {
        this.parentQrCode = parentQrCode;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setWarehouseQrCode(String warehouseQrCode) {
        this.warehouseQrCode = warehouseQrCode;
    }

    public void setEnableQcCtrl(BizConstantDisplay enableQcCtrl) {
        this.enableQcCtrl = enableQcCtrl;
    }

    public void setQcCtrlList(List<BizConstantDisplay> qcCtrlList) {
        this.qcCtrlList = qcCtrlList;
    }

    public void setIsLock(BizConstantDisplay isLock) {
        this.isLock = isLock;
    }

    public void setCustomFieldItems(List<CustomFieldItemWebResponseDTO> customFieldItems) {
        this.customFieldItems = customFieldItems;
    }
}

