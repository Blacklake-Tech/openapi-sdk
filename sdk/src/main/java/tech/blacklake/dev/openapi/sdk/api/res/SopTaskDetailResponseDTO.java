package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SopTaskDetailResponseDTO {
    /**
     * SOP任务编号
     */
    private String code;

    /**
     * SOP任务名称
     */
    private String name;

    /**
     * SOP任务类型 key = SopBizTypeEnum
     */
    private BizConstantDisplay bizType;

    /**
     * SOP任务状态 key = SopTaskStatusEnum
     */
    private BizConstantDisplay status;

    /**
     * 关联的SOP方案
     */
    private SopResponseDTO sop;

    /**
     * 关联的SOP方案副本
     */
    private SopResponseDTO sopSnapshot;

    /**
     * 可执行用户
     */
    private List<UserResponseDTO> canExecUser;

    /**
     * 可执行角色
     */
    private List<UserResponseDTO> canExecRole;

    /**
     * 可执行部门
     */
    private List<UserResponseDTO> canExecDept;

    /**
     * SOP任务备注
     */
    private String remark;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public BizConstantDisplay getStatus() {
        return status;
    }

    public SopResponseDTO getSop() {
        return sop;
    }

    public SopResponseDTO getSopSnapshot() {
        return sopSnapshot;
    }

    public List<UserResponseDTO> getCanExecUser() {
        return canExecUser;
    }

    public List<UserResponseDTO> getCanExecRole() {
        return canExecRole;
    }

    public List<UserResponseDTO> getCanExecDept() {
        return canExecDept;
    }

    public String getRemark() {
        return remark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setStatus(BizConstantDisplay status) {
        this.status = status;
    }

    public void setSop(SopResponseDTO sop) {
        this.sop = sop;
    }

    public void setSopSnapshot(SopResponseDTO sopSnapshot) {
        this.sopSnapshot = sopSnapshot;
    }

    public void setCanExecUser(List<UserResponseDTO> canExecUser) {
        this.canExecUser = canExecUser;
    }

    public void setCanExecRole(List<UserResponseDTO> canExecRole) {
        this.canExecRole = canExecRole;
    }

    public void setCanExecDept(List<UserResponseDTO> canExecDept) {
        this.canExecDept = canExecDept;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

