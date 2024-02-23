package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class MaterialCategoryImportRequestDTO {
    /**
     * 一级分类名称
     */
    private String categoryName;

    /**
     * 一级分类编号
     */
    private String categoryCode;

    /**
     * 二级分类名称
     */
    private String secondCategoryName;

    /**
     * 二级分类编号
     */
    private String secondCategoryCode;

    /**
     * 三级分类名称
     */
    private String thirdCategoryName;

    /**
     * 三级分类编号
     */
    private String thirdCategoryCode;

    /**
     * 四级分类名称
     */
    private String forthCategoryName;

    /**
     * 四级分类编号
     */
    private String forthCategoryCode;

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public String getSecondCategoryName() {
        return secondCategoryName;
    }

    public String getSecondCategoryCode() {
        return secondCategoryCode;
    }

    public String getThirdCategoryName() {
        return thirdCategoryName;
    }

    public String getThirdCategoryCode() {
        return thirdCategoryCode;
    }

    public String getForthCategoryName() {
        return forthCategoryName;
    }

    public String getForthCategoryCode() {
        return forthCategoryCode;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setSecondCategoryName(String secondCategoryName) {
        this.secondCategoryName = secondCategoryName;
    }

    public void setSecondCategoryCode(String secondCategoryCode) {
        this.secondCategoryCode = secondCategoryCode;
    }

    public void setThirdCategoryName(String thirdCategoryName) {
        this.thirdCategoryName = thirdCategoryName;
    }

    public void setThirdCategoryCode(String thirdCategoryCode) {
        this.thirdCategoryCode = thirdCategoryCode;
    }

    public void setForthCategoryName(String forthCategoryName) {
        this.forthCategoryName = forthCategoryName;
    }

    public void setForthCategoryCode(String forthCategoryCode) {
        this.forthCategoryCode = forthCategoryCode;
    }
}
