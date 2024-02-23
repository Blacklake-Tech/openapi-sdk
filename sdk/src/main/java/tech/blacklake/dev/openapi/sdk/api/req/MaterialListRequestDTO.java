package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialListRequestDTO extends BasePage {
    /**
     * 物料id List
     */
    private List<Long> idList;

    /**
     * 物料编号 List，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private List<String> codeList;

    /**
     * 物料名称，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String name;

    /**
     * 物料编号，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String code;

    /**
     * 物料标志码，支持字母、数字和符号，不可超过255个字符，前后不支持空格
     */
    private String qrCode;

    /**
     * 物料状态，1启用中、0已停用
     */
    private Integer enableFlag;

    /**
     * 物料是否启用批次管理，1启用、0停用
     */
    private Integer batchManagementEnable;

    /**
     * 物料分类ID List
     */
    private List<Long> categoryIds;

    /**
     * 物料属性ID List
     */
    private List<Long> attributeIds;

    /**
     * 快速查询，支持物料编号，物料名称和物料规格的模糊搜索
     */
    private String quickSearch;

    /**
     * 物料业务范围，0虚拟件，1仓储，2采购，3销售，4自制，5质量，6投料
     */
    private List<Integer> bizRange;

    /**
     * 物料类型，0虚拟件1默认2在制品
     */
    private List<Integer> bizType;

    /**
     * 物料规格，支持字母、数字、中文和符号，不可超过255个字符
     */
    private String specification;

    /**
     * 更新时间（开始时间）, 非必填，仅支持时间戳
     */
    private Long updateStartTime;

    /**
     * 更新时间（结束时间）, 非必填，仅支持时间戳
     */
    private Long updateEndTime;

    public List<Long> getIdList() {
        return idList;
    }

    public List<String> getCodeList() {
        return codeList;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public Integer getBatchManagementEnable() {
        return batchManagementEnable;
    }

    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public List<Long> getAttributeIds() {
        return attributeIds;
    }

    public String getQuickSearch() {
        return quickSearch;
    }

    public List<Integer> getBizRange() {
        return bizRange;
    }

    public List<Integer> getBizType() {
        return bizType;
    }

    public String getSpecification() {
        return specification;
    }

    public Long getUpdateStartTime() {
        return updateStartTime;
    }

    public Long getUpdateEndTime() {
        return updateEndTime;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public void setBatchManagementEnable(Integer batchManagementEnable) {
        this.batchManagementEnable = batchManagementEnable;
    }

    public void setCategoryIds(List<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public void setAttributeIds(List<Long> attributeIds) {
        this.attributeIds = attributeIds;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setBizRange(List<Integer> bizRange) {
        this.bizRange = bizRange;
    }

    public void setBizType(List<Integer> bizType) {
        this.bizType = bizType;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setUpdateStartTime(Long updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public void setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
    }
}
