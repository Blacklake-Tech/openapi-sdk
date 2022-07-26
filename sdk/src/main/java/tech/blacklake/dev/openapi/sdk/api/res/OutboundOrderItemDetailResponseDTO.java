package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutboundOrderItemDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * ID
     */
    private long id;

    /**
     * 行号
     */
    private String lineNo;

    /**
     * 物料
     */
    private MaterialResponseDTO material;

    /**
     * 执行状态
     */
    private BizConstantDisplay bizStatus;

    /**
     * 计划数量
     */
    private String planAmount;

    /**
     * 执行数量
     */
    private String doneAmount;

    /**
     * 单位
     */
    private UnitDetailResponseDTO unit;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 批号
     */
    private String batchNo;

    /**
     * 创建人
     */
    private UserSimpleResponseDTO creator;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 操作人
     */
    private UserSimpleResponseDTO operator;

    /**
     * 关联单据编号（0 其他出厂，1销售发运，2采购退料）
     */
    private List<OutboundOrderBizCodeResponseDTO> outboundOrderBizCodes;

    public long getId() {
        return id;
    }

    public String getLineNo() {
        return lineNo;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BizConstantDisplay getBizStatus() {
        return bizStatus;
    }

    public String getPlanAmount() {
        return planAmount;
    }

    public String getDoneAmount() {
        return doneAmount;
    }

    public UnitDetailResponseDTO getUnit() {
        return unit;
    }

    public String getRemark() {
        return remark;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public UserSimpleResponseDTO getCreator() {
        return creator;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public UserSimpleResponseDTO getOperator() {
        return operator;
    }

    public List<OutboundOrderBizCodeResponseDTO> getOutboundOrderBizCodes() {
        return outboundOrderBizCodes;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setBizStatus(BizConstantDisplay bizStatus) {
        this.bizStatus = bizStatus;
    }

    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public void setDoneAmount(String doneAmount) {
        this.doneAmount = doneAmount;
    }

    public void setUnit(UnitDetailResponseDTO unit) {
        this.unit = unit;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setCreator(UserSimpleResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public void setOperator(UserSimpleResponseDTO operator) {
        this.operator = operator;
    }

    public void setOutboundOrderBizCodes(List<OutboundOrderBizCodeResponseDTO> outboundOrderBizCodes) {
        this.outboundOrderBizCodes = outboundOrderBizCodes;
    }
}

