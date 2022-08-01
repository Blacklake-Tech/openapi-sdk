package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class RoleListResponseDTO {
    /**
     * 角色业务ID
     */
    private Long id;

    /**
     * 工厂ID
     */
    private Long orgId;

    /**
     * 角色编号
     */
    private String code;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String desc;

    /**
     * 角色备注
     */
    private String remark;

    /**
     * 角色启停用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 当前角色是否被用户使用,仅用于角色列表页
     */
    private Boolean inUse;

    /**
     * 当前角色使用人
     */
    private List<UserDisplayResponseDTO> userList;

    /**
     * 许可项列表
     */
    private List<UserLicenseDetailResponseDTO> roleOwnedLicenses;

    public Long getId() {
        return id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public Boolean getInUse() {
        return inUse;
    }

    public List<UserDisplayResponseDTO> getUserList() {
        return userList;
    }

    public List<UserLicenseDetailResponseDTO> getRoleOwnedLicenses() {
        return roleOwnedLicenses;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    public void setUserList(List<UserDisplayResponseDTO> userList) {
        this.userList = userList;
    }

    public void setRoleOwnedLicenses(List<UserLicenseDetailResponseDTO> roleOwnedLicenses) {
        this.roleOwnedLicenses = roleOwnedLicenses;
    }
}

