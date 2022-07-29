package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class WorkCenterResourceGroupRequestDTO  {
    /**
     * 可用资源组行ID
     */
    private long lineId = 0L;

    /**
     * 行号
     */
    private int lineNo = 0;

    /**
     * 资源组分类，0-用户，1-部门，2-资源分类
     */
    private int groupType = 0;

    /**
     * 资源组名称
     */
    private String name;

    /**
     * 可选资源Id
     */
    private List<Long> bizIdList;

    /**
     * 可选资源，0-用户，1-部门, 2-资源分类
     */
    private Integer bizType;

    /**
     * 可选资源
     */
    private List<EquipmentResourceGroupInfoRequestDTO> bizList;

    public long getLineId() {
        return lineId;
    }

    public int getLineNo() {
        return lineNo;
    }

    public int getGroupType() {
        return groupType;
    }

    public String getName() {
        return name;
    }

    public List<Long> getBizIdList() {
        return bizIdList;
    }

    public Integer getBizType() {
        return bizType;
    }

    public List<EquipmentResourceGroupInfoRequestDTO> getBizList() {
        return bizList;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBizIdList(List<Long> bizIdList) {
        this.bizIdList = bizIdList;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setBizList(List<EquipmentResourceGroupInfoRequestDTO> bizList) {
        this.bizList = bizList;
    }
}

