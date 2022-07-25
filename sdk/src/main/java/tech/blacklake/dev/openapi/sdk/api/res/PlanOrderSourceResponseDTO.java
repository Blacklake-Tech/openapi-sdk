package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PlanOrderSourceResponseDTO  {
    /**
     * 生成方式 key=generationMethod
     */
    private BizConstantDisplay generationMethod;

    /**
     * 来源单据类型 key = sourceType
     */
    private BizConstantDisplay sourceType;

    /**
     * 来源单据列表
     */
    private List<SourceOrderResponseDTO> sourceOrderList;

    /**
     * 销售订单列表
     */
    private List<SourceSalesOrderResponseDTO> sourceSalesOrderList;

    public BizConstantDisplay getGenerationMethod() {
        return generationMethod;
    }

    public BizConstantDisplay getSourceType() {
        return sourceType;
    }

    public List<SourceOrderResponseDTO> getSourceOrderList() {
        return sourceOrderList;
    }

    public List<SourceSalesOrderResponseDTO> getSourceSalesOrderList() {
        return sourceSalesOrderList;
    }

    public void setGenerationMethod(BizConstantDisplay generationMethod) {
        this.generationMethod = generationMethod;
    }

    public void setSourceType(BizConstantDisplay sourceType) {
        this.sourceType = sourceType;
    }

    public void setSourceOrderList(List<SourceOrderResponseDTO> sourceOrderList) {
        this.sourceOrderList = sourceOrderList;
    }

    public void setSourceSalesOrderList(List<SourceSalesOrderResponseDTO> sourceSalesOrderList) {
        this.sourceSalesOrderList = sourceSalesOrderList;
    }
}

