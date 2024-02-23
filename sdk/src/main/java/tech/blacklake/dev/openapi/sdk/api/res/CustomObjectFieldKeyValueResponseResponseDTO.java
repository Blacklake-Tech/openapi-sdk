package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectFieldKeyValueResponseResponseDTO {
    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 是否为主属性
     */
    private Integer isName;

    /**
     * 关联类型，1/N
     */
    private Integer targetType;

    /**
     * 日期格式
     */
    private String datetimeFormat;

    /**
     * 是否是引用字段
     */
    private Integer isRefer;

    /**
     * 字段类型，字段类型 1 单行文本 2 数值 3 多行文本 4 单选 5 多选 6 布尔值 7 整数 8 日期时间 9 链接 11 关联关系 12 从关系 13 主从关系
     */
    private Integer fieldType;

    /**
     * 被选中的选项值项（单选/多选）
     */
    private List<CustomObjectFieldChoiceValueResponseDTO> choiceValues;

    /**
     * 字段类型，1 自定义字段 2 预置字段
     */
    private Integer fieldCategory;

    public String getFieldName() {
        return fieldName;
    }

    public Integer getIsName() {
        return isName;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public String getDatetimeFormat() {
        return datetimeFormat;
    }

    public Integer getIsRefer() {
        return isRefer;
    }

    public Integer getFieldType() {
        return fieldType;
    }

    public List<CustomObjectFieldChoiceValueResponseDTO> getChoiceValues() {
        return choiceValues;
    }

    public Integer getFieldCategory() {
        return fieldCategory;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setIsName(Integer isName) {
        this.isName = isName;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public void setDatetimeFormat(String datetimeFormat) {
        this.datetimeFormat = datetimeFormat;
    }

    public void setIsRefer(Integer isRefer) {
        this.isRefer = isRefer;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public void setChoiceValues(List<CustomObjectFieldChoiceValueResponseDTO> choiceValues) {
        this.choiceValues = choiceValues;
    }

    public void setFieldCategory(Integer fieldCategory) {
        this.fieldCategory = fieldCategory;
    }
}
