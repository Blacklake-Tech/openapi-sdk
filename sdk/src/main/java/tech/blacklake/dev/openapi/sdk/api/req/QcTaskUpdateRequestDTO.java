package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 检验任务id
     */
    private Long id;

    /**
     * 任务状态(0:未开始,1:执行中，2:已结束，3:已取消)
     */
    private Integer qcTaskStatus;

    /**
     * 领取状态 0未领取 1已领取
     */
    private Integer qcTaskGetStatus;

    /**
     * 结论判定选项（1合格, 2让步合格, 3待检, 4不合格）
     */
    private Integer qcResult;

    /**
     * 备注
     */
    private String remark;

    /**
     * 库存总量
     */
    private BigDecimal totalCount;

    /**
     * 总抽样量
     */
    private BigDecimal checkCount;

    public Long getId() {
        return id;
    }

    public Integer getQcTaskStatus() {
        return qcTaskStatus;
    }

    public Integer getQcTaskGetStatus() {
        return qcTaskGetStatus;
    }

    public Integer getQcResult() {
        return qcResult;
    }

    public String getRemark() {
        return remark;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public BigDecimal getCheckCount() {
        return checkCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQcTaskStatus(Integer qcTaskStatus) {
        this.qcTaskStatus = qcTaskStatus;
    }

    public void setQcTaskGetStatus(Integer qcTaskGetStatus) {
        this.qcTaskGetStatus = qcTaskGetStatus;
    }

    public void setQcResult(Integer qcResult) {
        this.qcResult = qcResult;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public void setCheckCount(BigDecimal checkCount) {
        this.checkCount = checkCount;
    }
}
