package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class UpsertPurchaseOrderItemRequestDTO {
    /**
     * 物料编号。长度为1-255位utf-8字符
     */
    private String materialCode;

    /**
     * 需求时间。格式如：2022-01-01 00:00:00
     */
    private String demandTime;

    /**
     * 需求数。长度不可超过10位正数，小数位进度10位
     */
    private String demandAmount;

    /**
     * 自定义字段
     */
    private List<CustomFieldInstanceCreateRequestDTO> customFields;

    public String getMaterialCode() {
        return materialCode;
    }

    public String getDemandTime() {
        return demandTime;
    }

    public String getDemandAmount() {
        return demandAmount;
    }

    public List<CustomFieldInstanceCreateRequestDTO> getCustomFields() {
        return customFields;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setDemandTime(String demandTime) {
        this.demandTime = demandTime;
    }

    public void setDemandAmount(String demandAmount) {
        this.demandAmount = demandAmount;
    }

    public void setCustomFields(List<CustomFieldInstanceCreateRequestDTO> customFields) {
        this.customFields = customFields;
    }
}
