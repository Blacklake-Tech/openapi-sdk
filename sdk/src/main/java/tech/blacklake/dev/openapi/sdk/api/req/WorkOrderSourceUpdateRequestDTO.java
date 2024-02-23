package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderSourceUpdateRequestDTO {
    /**
     * 生成方式（1-手工录入；2-拆分；3-合并；4-改制）
     */
    private int generationMethod;

    /**
     *  来源单据类型（1-生产工单）
     */
    private int sourceType;

    /**
     * 来源-销售订单
     */
    private List<SourceSalesOrderUpdateRequestDTO> sourceSalesOrderList;

    /**
     * 来源-来源单据
     */
    private List<SourceWorkOrderUpdateRequestDTO> sourceWorkOrderList;

    public int getGenerationMethod() {
        return generationMethod;
    }

    public int getSourceType() {
        return sourceType;
    }

    public List<SourceSalesOrderUpdateRequestDTO> getSourceSalesOrderList() {
        return sourceSalesOrderList;
    }

    public List<SourceWorkOrderUpdateRequestDTO> getSourceWorkOrderList() {
        return sourceWorkOrderList;
    }

    public void setGenerationMethod(int generationMethod) {
        this.generationMethod = generationMethod;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public void setSourceSalesOrderList(List<SourceSalesOrderUpdateRequestDTO> sourceSalesOrderList) {
        this.sourceSalesOrderList = sourceSalesOrderList;
    }

    public void setSourceWorkOrderList(List<SourceWorkOrderUpdateRequestDTO> sourceWorkOrderList) {
        this.sourceWorkOrderList = sourceWorkOrderList;
    }
}
