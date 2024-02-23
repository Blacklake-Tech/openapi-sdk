package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UserImportRequestDTO {
    /**
     * 用户编号，必填，不支持重复，仅支持字母、数字和下划线，不可超过100个字符；若用户编号系统中已存在则覆盖导入
     */
    private String code;

    /**
     * 账号，必填，不支持重复，仅支持字母、数字和下划线，不可超过100个字符
     */
    private String username;

    /**
     * 用户名称，必填，不可超过100个字符
     */
    private String name;

    /**
     * 手机号，非必填，请输入1开头的11位手机号
     */
    private String phone;

    /**
     * 邮箱，非必填，请输入正确的邮箱格式（xxx@xxx.xxx）
     */
    private String email;

    /**
     * 直属上级，非必填，请填写直属上级的用户编号
     */
    private String superiorCode;

    /**
     * 部门编号，必填，最多支持添加10个部门，多个部门间用中/英文逗号隔开
     */
    private String departmentList;

    /**
     * 角色编号，最多支持添加10个角色，多个角色间用中/英文逗号隔开
     */
    private String roleList;

    /**
     * 账号类型，必填，填写 网页端+移动端 或 移动端
     */
    private String terminal;

    /**
     * 用户密码，新建用户时必填，请填写数字、大写字母、小写字母、符号中的至少三种，最少8位；覆盖更新系统已有用户时，密码非必填
     */
    private String password;

    /**
     * 备注，非必填，不可超过1000字符
     */
    private String desc;

    public String getCode() {
        return code;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getSuperiorCode() {
        return superiorCode;
    }

    public String getDepartmentList() {
        return departmentList;
    }

    public String getRoleList() {
        return roleList;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getPassword() {
        return password;
    }

    public String getDesc() {
        return desc;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSuperiorCode(String superiorCode) {
        this.superiorCode = superiorCode;
    }

    public void setDepartmentList(String departmentList) {
        this.departmentList = departmentList;
    }

    public void setRoleList(String roleList) {
        this.roleList = roleList;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
