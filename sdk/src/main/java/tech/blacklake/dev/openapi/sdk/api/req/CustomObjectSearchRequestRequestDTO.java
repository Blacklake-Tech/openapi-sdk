package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectSearchRequestRequestDTO extends BasePage {
    /**
     * 自定义对象编码
     */
    private String objectCode;

    /**
     * 主属性搜索条件（仅在快捷搜索时需要输入）
     */
    private String mainPropertyCondition;

    /**
     * 单行文本搜索条件（所有单行文本搜索条件的集合，每个单行文本类型对应一个Map的键值对，对于单行文本，只有字段编码到字段搜索值的映射，支持模糊搜索）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> singleTextCondition;

    /**
     * 单选搜索条件（包含字段编码到单选id(String)的映射）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> singleChoiceCondition;

    /**
     * 多选搜索条件（包含字段编码到多选id(String)集合的映射
     */
    private List<CustomObjectSearchItemRequestRequestDTO> multipleChoiceCondition;

    /**
     * 布尔搜素条件（包含字段编码到true，false两种值的映射，没有值或者空代表全选）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> boolCondition;

    /**
     * 日期搜索条件（包含字段编码到开始日期和结束日期映射，格式为fieldValue字段包含min和max两个值）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> datetimeCondition;

    /**
     * 整数搜索条件（包含从字段编码到整数的映射）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> integerCondition;

    /**
     * 数字搜索条件（包含从字段编码到数字的映射）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> numericCondition;

    /**
     * 关联搜索条件（包含从字段编码到关联的instance-id（Long）的集合的映射）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> relateCondition;

    /**
     * 引用搜索条件（包含从字段编码到引用的字段值的映射）
     */
    private List<CustomObjectSearchItemRequestRequestDTO> referenceCondition;

    public String getObjectCode() {
        return objectCode;
    }

    public String getMainPropertyCondition() {
        return mainPropertyCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getSingleTextCondition() {
        return singleTextCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getSingleChoiceCondition() {
        return singleChoiceCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getMultipleChoiceCondition() {
        return multipleChoiceCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getBoolCondition() {
        return boolCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getDatetimeCondition() {
        return datetimeCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getIntegerCondition() {
        return integerCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getNumericCondition() {
        return numericCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getRelateCondition() {
        return relateCondition;
    }

    public List<CustomObjectSearchItemRequestRequestDTO> getReferenceCondition() {
        return referenceCondition;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public void setMainPropertyCondition(String mainPropertyCondition) {
        this.mainPropertyCondition = mainPropertyCondition;
    }

    public void setSingleTextCondition(List<CustomObjectSearchItemRequestRequestDTO> singleTextCondition) {
        this.singleTextCondition = singleTextCondition;
    }

    public void setSingleChoiceCondition(List<CustomObjectSearchItemRequestRequestDTO> singleChoiceCondition) {
        this.singleChoiceCondition = singleChoiceCondition;
    }

    public void setMultipleChoiceCondition(List<CustomObjectSearchItemRequestRequestDTO> multipleChoiceCondition) {
        this.multipleChoiceCondition = multipleChoiceCondition;
    }

    public void setBoolCondition(List<CustomObjectSearchItemRequestRequestDTO> boolCondition) {
        this.boolCondition = boolCondition;
    }

    public void setDatetimeCondition(List<CustomObjectSearchItemRequestRequestDTO> datetimeCondition) {
        this.datetimeCondition = datetimeCondition;
    }

    public void setIntegerCondition(List<CustomObjectSearchItemRequestRequestDTO> integerCondition) {
        this.integerCondition = integerCondition;
    }

    public void setNumericCondition(List<CustomObjectSearchItemRequestRequestDTO> numericCondition) {
        this.numericCondition = numericCondition;
    }

    public void setRelateCondition(List<CustomObjectSearchItemRequestRequestDTO> relateCondition) {
        this.relateCondition = relateCondition;
    }

    public void setReferenceCondition(List<CustomObjectSearchItemRequestRequestDTO> referenceCondition) {
        this.referenceCondition = referenceCondition;
    }
}
