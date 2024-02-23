package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WebUserInfoResponseDTO {
    /**
     * web-User信息VO-id
     */
    private Long id;

    /**
     * web-User信息VO-username
     */
    private String username;

    /**
     * web-User信息VO-name
     */
    private String name;

    /**
     * web-User信息VO-描述
     */
    private String desc;

    /**
     * web-User信息VO-头像
     */
    private String avatarUrl;

    /**
     * web-User信息VO-编号
     */
    private String code;

    public Long getId() {
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

    public void setId(Long id) {
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
}
