package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkCenterGroupRequestDTO {
    /**
     * 资源组id
     */
    private long id;

    /**
     * 行号
     */
    private Integer lineNo;

    /**
     * 资源组分类，0-用户，1-部门，2-资源分类
     */
    private Integer groupType;

    /**
     * 资源组名称
     */
    private String name;

    /**
     * 可选资源，0-用户，1-部门, 2-设备, key = tech.blacklake.dev.workcenter.api.constants.BizTypeEnum
     */
    private Integer bizType;

    /**
     * 可选资源Id
     */
    private List<Long> bizIdList;

    /**
     * 可选资源
     */
    private List<EquipmentResourceGroupInfoRequestDTO> bizList;

    public long getId() {
        return id;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public String getName() {
        return name;
    }

    public Integer getBizType() {
        return bizType;
    }

    public List<Long> getBizIdList() {
        return bizIdList;
    }

    public List<EquipmentResourceGroupInfoRequestDTO> getBizList() {
        return bizList;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public void setBizIdList(List<Long> bizIdList) {
        this.bizIdList = bizIdList;
    }

    public void setBizList(List<EquipmentResourceGroupInfoRequestDTO> bizList) {
        this.bizList = bizList;
    }
}
