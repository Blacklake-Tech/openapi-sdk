package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class OutboundOrderAppExecuteRequestRequestDTO {
    /**
     * 出库单头信息
     */
    private OutboundOrderInfoRequestRequestDTO outboundOrderInfo;

    /**
     * 出库库存明细
     */
    private List<OutboundOrderExecuteRequestDTO> executeItems;

    /**
     * 客户
     */
    private Long customerId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 文件id
     */
    private List<Long> docId;

    /**
     * 出库单自定义字段
     */
    private CustomFieldBaseCO outboundOrderCustomField;

    /**
     * 出库记录自定义字段
     */
    private CustomFieldBaseCO outboundOrderRecordCustomField;

    public OutboundOrderInfoRequestRequestDTO getOutboundOrderInfo() {
        return outboundOrderInfo;
    }

    public List<OutboundOrderExecuteRequestDTO> getExecuteItems() {
        return executeItems;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getRemark() {
        return remark;
    }

    public List<Long> getDocId() {
        return docId;
    }

    public CustomFieldBaseCO getOutboundOrderCustomField() {
        return outboundOrderCustomField;
    }

    public CustomFieldBaseCO getOutboundOrderRecordCustomField() {
        return outboundOrderRecordCustomField;
    }

    public void setOutboundOrderInfo(OutboundOrderInfoRequestRequestDTO outboundOrderInfo) {
        this.outboundOrderInfo = outboundOrderInfo;
    }

    public void setExecuteItems(List<OutboundOrderExecuteRequestDTO> executeItems) {
        this.executeItems = executeItems;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDocId(List<Long> docId) {
        this.docId = docId;
    }

    public void setOutboundOrderCustomField(CustomFieldBaseCO outboundOrderCustomField) {
        this.outboundOrderCustomField = outboundOrderCustomField;
    }

    public void setOutboundOrderRecordCustomField(CustomFieldBaseCO outboundOrderRecordCustomField) {
        this.outboundOrderRecordCustomField = outboundOrderRecordCustomField;
    }
}
