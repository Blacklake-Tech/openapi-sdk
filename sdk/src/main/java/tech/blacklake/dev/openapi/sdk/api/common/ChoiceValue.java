package tech.blacklake.dev.openapi.sdk.api.common;

import io.swagger.annotations.ApiModelProperty;

public class ChoiceValue {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("选项code")
    private String choiceCode;
    @ApiModelProperty("选项值")
    private String choiceValue;
    @ApiModelProperty("是否默认选项")
    private Integer isDefault;
    @ApiModelProperty("选项序号")
    private Integer sequence;

    public ChoiceValue() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChoiceCode() {
        return this.choiceCode;
    }

    public void setChoiceCode(String choiceCode) {
        this.choiceCode = choiceCode;
    }

    public String getChoiceValue() {
        return this.choiceValue;
    }

    public void setChoiceValue(String choiceValue) {
        this.choiceValue = choiceValue;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}
