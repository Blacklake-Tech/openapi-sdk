package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialCategoryResponseDTO  {
    /**
     * 工厂id
     */
    private long orgId = 0;

    /**
     * id
     */
    private long id = 0;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 物料分类物料数
     */
    private String count;

    /**
     * 物料分类备注
     */
    private String remark;

    /**
     * 是否是叶子节点，1是0否
     */
    private BizConstantDisplay leaf;

    /**
     * 是否启用，1启用0停用
     */
    private BizConstantDisplay enableFlag;

    public long getOrgId() {
        return orgId;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public String getCount() {
        return count;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getLeaf() {
        return leaf;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
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

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setLeaf(BizConstantDisplay leaf) {
        this.leaf = leaf;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }
}

