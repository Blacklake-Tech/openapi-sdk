package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class StorageLocationResponseDTO {
    /**
     * id
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
     * 父级id
     */
    private Long parentId;

    /**
     * 父级类型
     */
    private Integer parentType;

    /**
     * 仓库id
     */
    private Long warehouseId;

    /**
     * 质量管控是否跟随上层
     */
    private BizConstantDisplay qcFollowParent;

    /**
     * 是否锁定
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

    public Long getParentId() {
        return parentId;
    }

    public Integer getParentType() {
        return parentType;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public BizConstantDisplay getQcFollowParent() {
        return qcFollowParent;
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

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setQcFollowParent(BizConstantDisplay qcFollowParent) {
        this.qcFollowParent = qcFollowParent;
    }

    public void setIsLock(BizConstantDisplay isLock) {
        this.isLock = isLock;
    }

    public void setQcCtrlList(List<BizConstantDisplay> qcCtrlList) {
        this.qcCtrlList = qcCtrlList;
    }
}
