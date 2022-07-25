package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialBaseInfoResponseDTO  {
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
     * 备注
     */
    private String remark;

    /**
     * 是否启用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 业务类型
     */
    private BizConstantDisplay bizType;

    /**
     * 业务范围
     */
    private List<BizConstantDisplay> bizRange;

    /**
     * 规格
     */
    private String specification;

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

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getEnableFlag() {
        return enableFlag;
    }

    public BizConstantDisplay getBizType() {
        return bizType;
    }

    public List<BizConstantDisplay> getBizRange() {
        return bizRange;
    }

    public String getSpecification() {
        return specification;
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

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEnableFlag(BizConstantDisplay enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setBizType(BizConstantDisplay bizType) {
        this.bizType = bizType;
    }

    public void setBizRange(List<BizConstantDisplay> bizRange) {
        this.bizRange = bizRange;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}

