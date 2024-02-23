package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialCategoryListResponseDTO {
    /**
     * 物料分类ID
     */
    private long id;

    /**
     * 物料分类编号
     */
    private String code;

    /**
     * 物料分类名称
     */
    private String name;

    /**
     * 物料分类层级
     */
    private int level;

    /**
     * 物料分类备注
     */
    private String remark;

    /**
     * 是否是叶子节点，1是 0否
     */
    private Integer leaf;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getRemark() {
        return remark;
    }

    public Integer getLeaf() {
        return leaf;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setLeaf(Integer leaf) {
        this.leaf = leaf;
    }
}
