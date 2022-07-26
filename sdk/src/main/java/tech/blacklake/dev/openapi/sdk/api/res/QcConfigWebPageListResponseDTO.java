package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcConfigWebPageListResponseDTO {
    /**
     * 工厂id
     */
    private Long orgId;

    /**
     * id
     */
    private Long id;

    /**
     * 方案编号
     */
    private String code;

    /**
     * 方案名称
     */
    private String name;

    /**
     * 方案业务类型 逗号分隔（1.入厂检 2.出厂检 3.首检 4.生产检 5.巡检）
     */
    private BizConstantDisplay checkType;

    /**
     * 自动触发（0：false  1:true）
     */
    private Integer triggerEnable;

    /**
     * 自动触发规则集合
     */
    private List<QcConfigTriggerRuleWebPageListResponseDTO> qcConfigTriggerRuleList;

    /**
     * 检验单填写页数  1:和抽样的库存明细个数一致;2:和抽样量一致;3:固定页数;4:执行时自行添加;5:按检验项分别配置
     */
    private BizConstantDisplay checkEntityType;

    /**
     * 执行页填写方式（1 按检验单填写, 2 按检验项填写）
     */
    private BizConstantDisplay reportPageType;

    /**
     * 当检验单填写页数checkEntityType为 2(固定页数)时记录自定义页数
     */
    private Integer checkEntityUnitCount;

    /**
     * (检验结论)结论判定选项 ,分隔（1合格, 2让步合格, 3待检, 4不合格）
     */
    private String inspectionResultOptions;

    /**
     * (检验结论)物料总体处理方式（1不记录, 2仅记录, 3记录且更新质量状态）
     */
    private BizConstantDisplay materialBatchRecordType;

    /**
     * (检验结论)样本是否需记录（1需要, 2不需要）
     */
    private BizConstantDisplay recordSample;

    /**
     * (检验结论)样本处理方式（1放回, 2留样, 3报废）
     */
    private BizConstantDisplay sampleProcessMethod;

    /**
     * (检验结论)样本记录填写格式（1基于物料单元填写数量, 2基于样本整体填写数量）
     */
    private BizConstantDisplay reportFormatType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态（1：启用，0：停用）
     */
    private BizConstantDisplay state;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 修改时间
     */
    private Long updatedAt;

    /**
     * 创建人
     */
    private WebUserInfoResponseDTO creator;

    /**
     * 修改人
     */
    private WebUserInfoResponseDTO operator;

    public Long getOrgId() {
        return orgId;
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

    public BizConstantDisplay getCheckType() {
        return checkType;
    }

    public Integer getTriggerEnable() {
        return triggerEnable;
    }

    public List<QcConfigTriggerRuleWebPageListResponseDTO> getQcConfigTriggerRuleList() {
        return qcConfigTriggerRuleList;
    }

    public BizConstantDisplay getCheckEntityType() {
        return checkEntityType;
    }

    public BizConstantDisplay getReportPageType() {
        return reportPageType;
    }

    public Integer getCheckEntityUnitCount() {
        return checkEntityUnitCount;
    }

    public String getInspectionResultOptions() {
        return inspectionResultOptions;
    }

    public BizConstantDisplay getMaterialBatchRecordType() {
        return materialBatchRecordType;
    }

    public BizConstantDisplay getRecordSample() {
        return recordSample;
    }

    public BizConstantDisplay getSampleProcessMethod() {
        return sampleProcessMethod;
    }

    public BizConstantDisplay getReportFormatType() {
        return reportFormatType;
    }

    public String getRemark() {
        return remark;
    }

    public BizConstantDisplay getState() {
        return state;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public WebUserInfoResponseDTO getCreator() {
        return creator;
    }

    public WebUserInfoResponseDTO getOperator() {
        return operator;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCheckType(BizConstantDisplay checkType) {
        this.checkType = checkType;
    }

    public void setTriggerEnable(Integer triggerEnable) {
        this.triggerEnable = triggerEnable;
    }

    public void setQcConfigTriggerRuleList(List<QcConfigTriggerRuleWebPageListResponseDTO> qcConfigTriggerRuleList) {
        this.qcConfigTriggerRuleList = qcConfigTriggerRuleList;
    }

    public void setCheckEntityType(BizConstantDisplay checkEntityType) {
        this.checkEntityType = checkEntityType;
    }

    public void setReportPageType(BizConstantDisplay reportPageType) {
        this.reportPageType = reportPageType;
    }

    public void setCheckEntityUnitCount(Integer checkEntityUnitCount) {
        this.checkEntityUnitCount = checkEntityUnitCount;
    }

    public void setInspectionResultOptions(String inspectionResultOptions) {
        this.inspectionResultOptions = inspectionResultOptions;
    }

    public void setMaterialBatchRecordType(BizConstantDisplay materialBatchRecordType) {
        this.materialBatchRecordType = materialBatchRecordType;
    }

    public void setRecordSample(BizConstantDisplay recordSample) {
        this.recordSample = recordSample;
    }

    public void setSampleProcessMethod(BizConstantDisplay sampleProcessMethod) {
        this.sampleProcessMethod = sampleProcessMethod;
    }

    public void setReportFormatType(BizConstantDisplay reportFormatType) {
        this.reportFormatType = reportFormatType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setState(BizConstantDisplay state) {
        this.state = state;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreator(WebUserInfoResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(WebUserInfoResponseDTO operator) {
        this.operator = operator;
    }
}

