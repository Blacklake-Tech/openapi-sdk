package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskWebDetailConfigResponseDTO {
    /**
     * 方案快照id
     */
    private Long snapshotId;

    /**
     * 方案编号
     */
    private String code;

    /**
     * 方案名称
     */
    private String name;

    /**
     * 文件
     */
    private List<Long> attachmentIds;

    /**
     * 方案业务类型（1.入厂检 2.出厂检 3.首检 4.生产检 5.巡检）
     */
    private BizConstantDisplay checkType;

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
     * (检验结论)结论判定选项（1合格, 2让步合格, 3待检, 4不合格）
     */
    private List<BizConstantDisplay> inspectionResultOptions;

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

    /**
     * 关联检验项配置
     */
    private List<QcConfigCheckItemByGroupWebDetailResponseDTO> qcConfigCheckItemList;

    /**
     * 关联物料
     */
    private List<QcConfigMaterialWebDetailResponseDTO> linkMaterialList;

    /**
     * 关联工序
     */
    private List<QcConfigProcessWebDetailResponseDTO> linkProcessList;

    /**
     * 关联资源
     */
    private List<QcConfigResourceWebDetailResponseDTO> linkResourceList;

    /**
     * 关联客户
     */
    private List<QcConfigCustomerWebDetailResponseDTO> linkCustomerList;

    /**
     * 关联供应商
     */
    private List<QcConfigSupplierWebDetailResponseDTO> linkSupplierList;

    public Long getSnapshotId() {
        return snapshotId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Long> getAttachmentIds() {
        return attachmentIds;
    }

    public BizConstantDisplay getCheckType() {
        return checkType;
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

    public List<BizConstantDisplay> getInspectionResultOptions() {
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

    public List<QcConfigCheckItemByGroupWebDetailResponseDTO> getQcConfigCheckItemList() {
        return qcConfigCheckItemList;
    }

    public List<QcConfigMaterialWebDetailResponseDTO> getLinkMaterialList() {
        return linkMaterialList;
    }

    public List<QcConfigProcessWebDetailResponseDTO> getLinkProcessList() {
        return linkProcessList;
    }

    public List<QcConfigResourceWebDetailResponseDTO> getLinkResourceList() {
        return linkResourceList;
    }

    public List<QcConfigCustomerWebDetailResponseDTO> getLinkCustomerList() {
        return linkCustomerList;
    }

    public List<QcConfigSupplierWebDetailResponseDTO> getLinkSupplierList() {
        return linkSupplierList;
    }

    public void setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttachmentIds(List<Long> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setCheckType(BizConstantDisplay checkType) {
        this.checkType = checkType;
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

    public void setInspectionResultOptions(List<BizConstantDisplay> inspectionResultOptions) {
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

    public void setQcConfigCheckItemList(List<QcConfigCheckItemByGroupWebDetailResponseDTO> qcConfigCheckItemList) {
        this.qcConfigCheckItemList = qcConfigCheckItemList;
    }

    public void setLinkMaterialList(List<QcConfigMaterialWebDetailResponseDTO> linkMaterialList) {
        this.linkMaterialList = linkMaterialList;
    }

    public void setLinkProcessList(List<QcConfigProcessWebDetailResponseDTO> linkProcessList) {
        this.linkProcessList = linkProcessList;
    }

    public void setLinkResourceList(List<QcConfigResourceWebDetailResponseDTO> linkResourceList) {
        this.linkResourceList = linkResourceList;
    }

    public void setLinkCustomerList(List<QcConfigCustomerWebDetailResponseDTO> linkCustomerList) {
        this.linkCustomerList = linkCustomerList;
    }

    public void setLinkSupplierList(List<QcConfigSupplierWebDetailResponseDTO> linkSupplierList) {
        this.linkSupplierList = linkSupplierList;
    }
}
