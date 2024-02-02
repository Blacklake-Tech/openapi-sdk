package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class MaterialBaseInfoResponseDTO {
    /**
     * 工厂ID
     */
    private Long orgId;

    /**
     * 物料ID
     */
    private Long id;

    /**
     * 物料编号
     */
    private String code;

    /**
     * 物料标识码
     */
    private String qrCode;

    /**
     * 物料名称
     */
    private String name;

    /**
     * 物料备注
     */
    private String remark;

    /**
     * 状态，1启用0停用
     */
    private BizConstantDisplay enableFlag;

    /**
     * 物料类型，0虚拟件1默认2在制品
     */
    private BizConstantDisplay bizType;

    /**
     * 物料规格
     */
    private String specification;

    /**
     * 物料业务范围，0虚拟件，1仓储，2采购，3销售，4生产，5质量
     */
    private List<BizConstantDisplay> bizRange;

    public Long getOrgId() {
        return orgId;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getQrCode() {
        return qrCode;
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

    public String getSpecification() {
        return specification;
    }

    public List<BizConstantDisplay> getBizRange() {
        return bizRange;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setBizRange(List<BizConstantDisplay> bizRange) {
        this.bizRange = bizRange;
    }
}

