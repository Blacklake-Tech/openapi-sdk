package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class ProgressReportMaterialAmountRequestDTO {
    /**
     * 报工操作数量
     */
    private BigDecimal reportAmount;

    /**
     * 报工操作单位
     */
    private long reportUnitId;

    /**
     * 辅助单位数量1
     */
    private BigDecimal auxAmount1;

    /**
     * 辅助单位1
     */
    private Long auxUnitId1;

    /**
     * 辅助单位数量2
     */
    private BigDecimal auxAmount2;

    /**
     * 辅助单位2
     */
    private Long auxUnitId2;

    /**
     * （实际执行人）生产人员
     */
    private List<Long> executorIds;

    /**
     * 备注
     */
    private String remark;

    public BigDecimal getReportAmount() {
        return reportAmount;
    }

    public long getReportUnitId() {
        return reportUnitId;
    }

    public BigDecimal getAuxAmount1() {
        return auxAmount1;
    }

    public Long getAuxUnitId1() {
        return auxUnitId1;
    }

    public BigDecimal getAuxAmount2() {
        return auxAmount2;
    }

    public Long getAuxUnitId2() {
        return auxUnitId2;
    }

    public List<Long> getExecutorIds() {
        return executorIds;
    }

    public String getRemark() {
        return remark;
    }

    public void setReportAmount(BigDecimal reportAmount) {
        this.reportAmount = reportAmount;
    }

    public void setReportUnitId(long reportUnitId) {
        this.reportUnitId = reportUnitId;
    }

    public void setAuxAmount1(BigDecimal auxAmount1) {
        this.auxAmount1 = auxAmount1;
    }

    public void setAuxUnitId1(Long auxUnitId1) {
        this.auxUnitId1 = auxUnitId1;
    }

    public void setAuxAmount2(BigDecimal auxAmount2) {
        this.auxAmount2 = auxAmount2;
    }

    public void setAuxUnitId2(Long auxUnitId2) {
        this.auxUnitId2 = auxUnitId2;
    }

    public void setExecutorIds(List<Long> executorIds) {
        this.executorIds = executorIds;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
