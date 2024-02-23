package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialCategoryResponseDTO {
    /**
     * 工厂ID
     */
    private Long orgId;

    /**
     * 物料ID
     */
    private Long materialId;

    /**
     * 物料分类ID
     */
    private Long id;

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

    public Long getOrgId() {
        return orgId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public Long getId() {
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

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setId(Long id) {
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
