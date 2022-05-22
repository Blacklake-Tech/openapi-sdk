package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomOutputMaterialDTO  {
    /**
     * 父项物料编号,不可超过255个字符
     */
    private String bomMaterialCode = "";

    /**
     * 版本号,父项物料版本号
     */
    private String bomVersion = "";

    /**
     * 行号,整数,默认以10开始,以10递增,同一物料清单下,产出物料行号不支持重复
     */
    private String lineSeq = "";

    /**
     * 物料编号,不可超过255个字符
     */
    private String materialCode = "";

    /**
     * 物料名称,不可超过255个字符
     */
    private String materialName;

    /**
     * 数量,默认值为1;必须大于0
     */
    private String amount;

    /**
     * 单位名称,不可超过255个字符
     */
    private String unit;

    /**
     * 报工工序号,当父项物料不为虚拟件时,可选择所选工艺路线上的任何一道工序;默认值为null
     */
    private String workReportProcessNum;

    /**
     * 报工控件编号,主产出所选工艺路线投料工序中已有的控件编号
     */
    private String workReportSopControlCode;

    /**
     * 单次报工数量,默认null,必须大于0
     */
    private String singleWorkReportAmount;

    public String getBomMaterialCode() {
        return bomMaterialCode;
    }

    public String getBomVersion() {
        return bomVersion;
    }

    public String getLineSeq() {
        return lineSeq;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getWorkReportProcessNum() {
        return workReportProcessNum;
    }

    public String getWorkReportSopControlCode() {
        return workReportSopControlCode;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public void setBomMaterialCode(String bomMaterialCode) {
        this.bomMaterialCode = bomMaterialCode;
    }

    public void setBomVersion(String bomVersion) {
        this.bomVersion = bomVersion;
    }

    public void setLineSeq(String lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setWorkReportProcessNum(String workReportProcessNum) {
        this.workReportProcessNum = workReportProcessNum;
    }

    public void setWorkReportSopControlCode(String workReportSopControlCode) {
        this.workReportSopControlCode = workReportSopControlCode;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }
}

