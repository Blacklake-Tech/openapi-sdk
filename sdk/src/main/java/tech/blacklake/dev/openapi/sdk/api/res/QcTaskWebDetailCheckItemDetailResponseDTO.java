package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class QcTaskWebDetailCheckItemDetailResponseDTO extends CustomFieldBaseVO {
    /**
     * id
     */
    private Long id;

    /**
     * 样本库存id
     */
    private Long qcTaskMaterialId;

    /**
     * 用于与检验方案上配置的检验项进行对应
     */
    private Long qcConfigCheckItemId;

    /**
     * 序号
     */
    private Long seq;

    /**
     * 选项（检验项为单选、多选时）
     */
    private List<String> option;

    /**
     * 检验过程中对具体检验项填写的值，可以是文本，可以是数字
     */
    private String result;

    /**
     * 最小值
     */
    private BigDecimal min;

    /**
     * 最大值
     */
    private BigDecimal max;

    /**
     * 实际抽样量
     */
    private BigDecimal taskCheckCount;

    /**
     * 平均值
     */
    private BigDecimal average;

    /**
     * 标准差
     */
    private BigDecimal standardDeviation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 不良原因不良等级不良数量测量结果
     */
    private List<QcTaskWebDetailCheckItemDefectResponseDTO> qcDefectVOS;

    /**
     * 关联附件
     */
    private List<Long> attachmentIds;

    /**
     * 单项判定 0不合格 1合格
     */
    private Integer singleJudgment;

    /**
     * 创建人
     */
    private WebUserInfoResponseDTO creator;

    /**
     * 更新人
     */
    private WebUserInfoResponseDTO operator;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 修改时间
     */
    private Long updatedAt;

    public Long getId() {
        return id;
    }

    public Long getQcTaskMaterialId() {
        return qcTaskMaterialId;
    }

    public Long getQcConfigCheckItemId() {
        return qcConfigCheckItemId;
    }

    public Long getSeq() {
        return seq;
    }

    public List<String> getOption() {
        return option;
    }

    public String getResult() {
        return result;
    }

    public BigDecimal getMin() {
        return min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public BigDecimal getTaskCheckCount() {
        return taskCheckCount;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public BigDecimal getStandardDeviation() {
        return standardDeviation;
    }

    public String getRemark() {
        return remark;
    }

    public List<QcTaskWebDetailCheckItemDefectResponseDTO> getQcDefectVOS() {
        return qcDefectVOS;
    }

    public List<Long> getAttachmentIds() {
        return attachmentIds;
    }

    public Integer getSingleJudgment() {
        return singleJudgment;
    }

    public WebUserInfoResponseDTO getCreator() {
        return creator;
    }

    public WebUserInfoResponseDTO getOperator() {
        return operator;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQcTaskMaterialId(Long qcTaskMaterialId) {
        this.qcTaskMaterialId = qcTaskMaterialId;
    }

    public void setQcConfigCheckItemId(Long qcConfigCheckItemId) {
        this.qcConfigCheckItemId = qcConfigCheckItemId;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setOption(List<String> option) {
        this.option = option;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public void setTaskCheckCount(BigDecimal taskCheckCount) {
        this.taskCheckCount = taskCheckCount;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public void setStandardDeviation(BigDecimal standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setQcDefectVOS(List<QcTaskWebDetailCheckItemDefectResponseDTO> qcDefectVOS) {
        this.qcDefectVOS = qcDefectVOS;
    }

    public void setAttachmentIds(List<Long> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setSingleJudgment(Integer singleJudgment) {
        this.singleJudgment = singleJudgment;
    }

    public void setCreator(WebUserInfoResponseDTO creator) {
        this.creator = creator;
    }

    public void setOperator(WebUserInfoResponseDTO operator) {
        this.operator = operator;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}

