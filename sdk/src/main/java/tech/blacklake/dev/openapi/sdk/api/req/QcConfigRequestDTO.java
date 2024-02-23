package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigRequestDTO {
    /**
     * 检验方案编号
     */
    private String code;

    /**
     * 检验方案名称
     */
    private String name;

    /**
     * 业务类型
     */
    private String checkType;

    /**
     * 填写份数
     */
    private String checkEntityType;

    /**
     * 具体份数
     */
    private String checkEntityUnitCount;

    /**
     * 执行页填写方式
     */
    private String reportPageType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 结论判定选项
     */
    private String inspectionResultOptions;

    /**
     * 总体处理方式
     */
    private String materialBatchRecordType;

    /**
     * 样本是否需记录
     */
    private String recordSample;

    /**
     * 样本处理方式
     */
    private String sampleProcessMethod;

    /**
     * 样本记录填写格式
     */
    private String reportFormatType;

    /**
     * 检验项明细
     */
    private List<QcConfigCheckItemRequestDTO> qcConfigCheckItemList;

    /**
     * 关联关系
     */
    private List<QcConfigLinkedRequestDTO> qcConfigLinkedList;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCheckType() {
        return checkType;
    }

    public String getCheckEntityType() {
        return checkEntityType;
    }

    public String getCheckEntityUnitCount() {
        return checkEntityUnitCount;
    }

    public String getReportPageType() {
        return reportPageType;
    }

    public String getRemark() {
        return remark;
    }

    public String getInspectionResultOptions() {
        return inspectionResultOptions;
    }

    public String getMaterialBatchRecordType() {
        return materialBatchRecordType;
    }

    public String getRecordSample() {
        return recordSample;
    }

    public String getSampleProcessMethod() {
        return sampleProcessMethod;
    }

    public String getReportFormatType() {
        return reportFormatType;
    }

    public List<QcConfigCheckItemRequestDTO> getQcConfigCheckItemList() {
        return qcConfigCheckItemList;
    }

    public List<QcConfigLinkedRequestDTO> getQcConfigLinkedList() {
        return qcConfigLinkedList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public void setCheckEntityType(String checkEntityType) {
        this.checkEntityType = checkEntityType;
    }

    public void setCheckEntityUnitCount(String checkEntityUnitCount) {
        this.checkEntityUnitCount = checkEntityUnitCount;
    }

    public void setReportPageType(String reportPageType) {
        this.reportPageType = reportPageType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setInspectionResultOptions(String inspectionResultOptions) {
        this.inspectionResultOptions = inspectionResultOptions;
    }

    public void setMaterialBatchRecordType(String materialBatchRecordType) {
        this.materialBatchRecordType = materialBatchRecordType;
    }

    public void setRecordSample(String recordSample) {
        this.recordSample = recordSample;
    }

    public void setSampleProcessMethod(String sampleProcessMethod) {
        this.sampleProcessMethod = sampleProcessMethod;
    }

    public void setReportFormatType(String reportFormatType) {
        this.reportFormatType = reportFormatType;
    }

    public void setQcConfigCheckItemList(List<QcConfigCheckItemRequestDTO> qcConfigCheckItemList) {
        this.qcConfigCheckItemList = qcConfigCheckItemList;
    }

    public void setQcConfigLinkedList(List<QcConfigLinkedRequestDTO> qcConfigLinkedList) {
        this.qcConfigLinkedList = qcConfigLinkedList;
    }
}
