package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UserResponseDTO  {
    /**
     * 业务id
     */
    private long id = 0L;

    /**
     * 用户名字
     */
    private String name;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 用户编码
     */
    private String code;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getCode() {
        return code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

