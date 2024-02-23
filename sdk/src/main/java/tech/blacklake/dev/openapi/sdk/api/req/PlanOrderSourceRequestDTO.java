package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderSourceRequestDTO {
    /**
     * 生成方式（1-手工录入；2-计划运算；3-拆分；）
     */
    private int generationMethod;

    /**
     *  来源单据类型（1-计划订单）
     */
    private Integer sourceType;

    /**
     * 来源-销售订单
     */
    private List<SourceSalesOrderRequestDTO> sourceSalesOrderList;

    /**
     * 来源-来源单据
     */
    private List<SourcePlanOrderRequestDTO> sourcePlanOrderList;

    public int getGenerationMethod() {
        return generationMethod;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public List<SourceSalesOrderRequestDTO> getSourceSalesOrderList() {
        return sourceSalesOrderList;
    }

    public List<SourcePlanOrderRequestDTO> getSourcePlanOrderList() {
        return sourcePlanOrderList;
    }

    public void setGenerationMethod(int generationMethod) {
        this.generationMethod = generationMethod;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public void setSourceSalesOrderList(List<SourceSalesOrderRequestDTO> sourceSalesOrderList) {
        this.sourceSalesOrderList = sourceSalesOrderList;
    }

    public void setSourcePlanOrderList(List<SourcePlanOrderRequestDTO> sourcePlanOrderList) {
        this.sourcePlanOrderList = sourcePlanOrderList;
    }
}
