package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class CustomObjectFieldChoiceValueResponseDTO {
    /**
     * 选项编号
     */
    private String choiceCode;

    /**
     * 选项值
     */
    private String choiceValue;

    /**
     * 是否默认
     */
    private Integer isDefault;

    /**
     * 顺序值
     */
    private Integer sequence;

    public String getChoiceCode() {
        return choiceCode;
    }

    public String getChoiceValue() {
        return choiceValue;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setChoiceCode(String choiceCode) {
        this.choiceCode = choiceCode;
    }

    public void setChoiceValue(String choiceValue) {
        this.choiceValue = choiceValue;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}
