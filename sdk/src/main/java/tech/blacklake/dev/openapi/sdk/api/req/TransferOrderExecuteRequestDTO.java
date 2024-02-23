package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class TransferOrderExecuteRequestDTO extends CustomFieldBaseCO {
    /**
     * 调拨单ID，领料调拨时必传，不传按普通调拨处理
     */
    private Long id;

    /**
     * 调拨单编号，不传即启用编号规则
     */
    private String code;

    /**
     * 备注
     */
    private String remark;

    /**
     * 调拨单明细List
     */
    private List<TransferOrderItemExecuteRequestDTO> transferOrderItems;

    /**
     * 调拨记录自定义字段
     */
    private CustomFieldBaseCO recordCustomFieldBaseRequestDTO;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }

    public List<TransferOrderItemExecuteRequestDTO> getTransferOrderItems() {
        return transferOrderItems;
    }

    public CustomFieldBaseCO getRecordCustomFieldBaseRequestDTO() {
        return recordCustomFieldBaseRequestDTO;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTransferOrderItems(List<TransferOrderItemExecuteRequestDTO> transferOrderItems) {
        this.transferOrderItems = transferOrderItems;
    }

    public void setRecordCustomFieldBaseRequestDTO(CustomFieldBaseCO recordCustomFieldBaseRequestDTO) {
        this.recordCustomFieldBaseRequestDTO = recordCustomFieldBaseRequestDTO;
    }
}
