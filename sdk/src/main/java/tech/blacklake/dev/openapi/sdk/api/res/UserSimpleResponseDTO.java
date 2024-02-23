package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UserSimpleResponseDTO {
    /**
     * 工厂ID
     */
    private Long orgId;

    /**
     * 用户ID
     */
    private long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 备注信息
     */
    private String desc;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 用户编号
     */
    private String code;

    /**
     * 账号状态，1为启用，0为未启用，2为已激活，3为未激活
     */
    private Byte active;

    public Long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getCode() {
        return code;
    }

    public Byte getActive() {
        return active;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setActive(Byte active) {
        this.active = active;
    }
}
