package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutputMaterialRequestDTO {
    /**
     * 工单编号
     */
    private String workOrderCode;

    /**
     * 是否是主产出,是1否0
     */
    private int mainFlagInt = 0;

    /**
     * 是否是主产出
     */
    private String mainFlag;

    /**
     * 计划生产数,若为主产出:计划生产数必填,计划生产数必须大于0,若不为主产出:计划生产数由系统自动计算
     */
    private String plannedAmount;

    /**
     * 基准数,若为主产出:基准数默认为1,且不支持用户修改,若不为主产出:默认值为物料清单中配置基准数
     */
    private String standardAmount;

    /**
     * 批次号(编号规则)，用于生成批次号
     */
    private String batchRule;

    /**
     * 批次号(指定批次号),不可超过255字符
     */
    private String batchCode;

    /**
     * 行号,整数,大于等于0行号不可重复
     */
    private String lineSeq;

    /**
     * 版本号
     */
    private String version;

    /**
     * 工艺路线编号,若为主产出:默认带出物料清单上所选的工艺路线或用户搭建工艺路线
     */
    private String processRouteCode;

    /**
     * 子项物料编号,支持字母、数字和符号,不可超过255个字符,必须为启用中且业务类型勾选了生产且不为虚拟件的物料
     */
    private String materialCode;

    /**
     * 子项物料名称
     */
    private String materialName;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 产出工序号,主产出所选工艺路线/所选工序计划中已有的工序号
     */
    private String outputProcessCode;

    /**
     * 产出控件编号,必须为主产出所选工艺路线工序号中已有的控件编号
     */
    private String workReportControlCode;

    /**
     * 成品率,默认值为100,必须大于0,小数点后位数不可超过4位,小于等于1000
     */
    private String productRate;

    /**
     * 单次报工数量,若填写必须大于0
     */
    private String singleWorkReportAmount;

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public int getMainFlagInt() {
        return mainFlagInt;
    }

    public String getMainFlag() {
        return mainFlag;
    }

    public String getPlannedAmount() {
        return plannedAmount;
    }

    public String getStandardAmount() {
        return standardAmount;
    }

    public String getBatchRule() {
        return batchRule;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public String getLineSeq() {
        return lineSeq;
    }

    public String getVersion() {
        return version;
    }

    public String getProcessRouteCode() {
        return processRouteCode;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getOutputProcessCode() {
        return outputProcessCode;
    }

    public String getWorkReportControlCode() {
        return workReportControlCode;
    }

    public String getProductRate() {
        return productRate;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public void setMainFlagInt(int mainFlagInt) {
        this.mainFlagInt = mainFlagInt;
    }

    public void setMainFlag(String mainFlag) {
        this.mainFlag = mainFlag;
    }

    public void setPlannedAmount(String plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setStandardAmount(String standardAmount) {
        this.standardAmount = standardAmount;
    }

    public void setBatchRule(String batchRule) {
        this.batchRule = batchRule;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public void setLineSeq(String lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setProcessRouteCode(String processRouteCode) {
        this.processRouteCode = processRouteCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setOutputProcessCode(String outputProcessCode) {
        this.outputProcessCode = outputProcessCode;
    }

    public void setWorkReportControlCode(String workReportControlCode) {
        this.workReportControlCode = workReportControlCode;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }
}

