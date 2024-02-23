package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigCheckItemAQLWebDetailResponseDTO {
    /**
     * 检验水平(国标aql) / 抽检方案(自定义aql) id
     */
    private Long qcAqlInspectionLevelId;

    /**
     * 检验水平名称
     */
    private String qcAqlInspectionLevelName;

    /**
     * aql接受质量限id
     */
    private Long acceptLimitId;

    /**
     * 接受质量限名称
     */
    private String acceptLimitName;

    /**
     * 国标AQL检验严格度类型（ 1正常检验, 2加严检验, 3放宽检验）
     */
    private Integer qcAqlCategory;

    /**
     * 接收标准
     */
    private List<QcConfigCheckItemAQLAcceptLimitDetailWebDetailResponseDTO> acceptList;

    public Long getQcAqlInspectionLevelId() {
        return qcAqlInspectionLevelId;
    }

    public String getQcAqlInspectionLevelName() {
        return qcAqlInspectionLevelName;
    }

    public Long getAcceptLimitId() {
        return acceptLimitId;
    }

    public String getAcceptLimitName() {
        return acceptLimitName;
    }

    public Integer getQcAqlCategory() {
        return qcAqlCategory;
    }

    public List<QcConfigCheckItemAQLAcceptLimitDetailWebDetailResponseDTO> getAcceptList() {
        return acceptList;
    }

    public void setQcAqlInspectionLevelId(Long qcAqlInspectionLevelId) {
        this.qcAqlInspectionLevelId = qcAqlInspectionLevelId;
    }

    public void setQcAqlInspectionLevelName(String qcAqlInspectionLevelName) {
        this.qcAqlInspectionLevelName = qcAqlInspectionLevelName;
    }

    public void setAcceptLimitId(Long acceptLimitId) {
        this.acceptLimitId = acceptLimitId;
    }

    public void setAcceptLimitName(String acceptLimitName) {
        this.acceptLimitName = acceptLimitName;
    }

    public void setQcAqlCategory(Integer qcAqlCategory) {
        this.qcAqlCategory = qcAqlCategory;
    }

    public void setAcceptList(List<QcConfigCheckItemAQLAcceptLimitDetailWebDetailResponseDTO> acceptList) {
        this.acceptList = acceptList;
    }
}
