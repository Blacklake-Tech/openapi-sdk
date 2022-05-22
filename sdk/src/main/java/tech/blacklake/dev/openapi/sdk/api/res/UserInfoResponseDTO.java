package tech.blacklake.dev.openapi.sdk.api.res;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class UserInfoResponseDTO {
    /**
     * 用户业务ID
     */
    private long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户code
     */
    private String code;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
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

    public void setCode(String code) {
        this.code = code;
    }
}

