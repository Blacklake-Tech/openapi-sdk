package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcTaskUpdateCheckItemDetailRequestDTO extends CustomFieldBaseCO {
    /**
     * 分组名
     */
    private String groupName;

    /**
     * 检验项id
     */
    private Long checkItemId;

    /**
     * 序号
     */
    private Long seq;

    /**
     * 实测值左区间
     */
    private BigDecimal min;

    /**
     * 实测值右区间
     */
    private BigDecimal max;

    /**
     * 实测值结果 （单一数据）
     */
    private String result;

    /**
     * 不良信息
     */
    private List<QcDefectInfoRequestDTO> qcDefectInfos;

    /**
     * 创建时间
     */
    private Long createdAt;

    public String getGroupName() {
        return groupName;
    }

    public Long getCheckItemId() {
        return checkItemId;
    }

    public Long getSeq() {
        return seq;
    }

    public BigDecimal getMin() {
        return min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public String getResult() {
        return result;
    }

    public List<QcDefectInfoRequestDTO> getQcDefectInfos() {
        return qcDefectInfos;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setCheckItemId(Long checkItemId) {
        this.checkItemId = checkItemId;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setQcDefectInfos(List<QcDefectInfoRequestDTO> qcDefectInfos) {
        this.qcDefectInfos = qcDefectInfos;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
