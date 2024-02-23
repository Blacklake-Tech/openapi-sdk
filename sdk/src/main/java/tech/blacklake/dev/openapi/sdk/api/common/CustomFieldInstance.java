package tech.blacklake.dev.openapi.sdk.api.common;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class CustomFieldInstance {
    @ApiModelProperty("id（废弃）")
    private Long id;

    @ApiModelProperty("字段类型")
    private Integer fieldType;

    @ApiModelProperty("字段id")
    private Long fieldId;

    @ApiModelProperty("字段code")
    private String fieldCode;

    @ApiModelProperty("对象code")
    private String objectCode;

    @ApiModelProperty("字段名称")
    private String fieldName;

    @ApiModelProperty("字段提示")
    private String fieldRemind;

    @ApiModelProperty("是否必填")
    private Integer isRequired;

    @ApiModelProperty("默认值")
    private String defaultValue;

    @ApiModelProperty("字段值")
    private Object fieldValue;

    private Integer maxLength;
    private Integer maxValue;
    private Integer decimalNumber;
    private String datetimeFormat;
    private Integer isRefer;
    private String reference;
    private Integer targetType;
    private List<ChoiceValue> choiceValues;
    private Integer isUsed;

    public CustomFieldInstance() {}

    public Integer getIsUsed() {
        return this.isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public Long getFieldId() {
        return this.fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldCode() {
        return this.fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getObjectCode() {
        return this.objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldRemind() {
        return this.fieldRemind;
    }

    public void setFieldRemind(String fieldRemind) {
        this.fieldRemind = fieldRemind;
    }

    public Integer getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Object getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Integer getDecimalNumber() {
        return this.decimalNumber;
    }

    public void setDecimalNumber(Integer decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public String getDatetimeFormat() {
        return this.datetimeFormat;
    }

    public void setDatetimeFormat(String datetimeFormat) {
        this.datetimeFormat = datetimeFormat;
    }

    public Integer getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public Integer getIsRefer() {
        return this.isRefer;
    }

    public void setIsRefer(Integer isRefer) {
        this.isRefer = isRefer;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getTargetType() {
        return this.targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public List<ChoiceValue> getChoiceValues() {
        return this.choiceValues;
    }

    public void setChoiceValues(List<ChoiceValue> choiceValues) {
        this.choiceValues = choiceValues;
    }
}
