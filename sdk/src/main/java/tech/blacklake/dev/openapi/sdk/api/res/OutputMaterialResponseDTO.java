package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class OutputMaterialResponseDTO  {
    /**
     * 业务ID
     */
    private long id;

    /**
     * 是否是主产出
     */
    private int main;

    /**
     * 计划生产数
     */
    private BaseAmountDisplay plannedAmount;

    /**
     * 基准数
     */
    private String standardAmount;

    /**
     * 预计生产数
     */
    private BaseAmountDisplay expectedAmount;

    /**
     * 批号生成类型 key =batchGenerationType 
     */
    private BizConstantDisplay batchGenerationType;

    /**
     * 批号规则
     */
    private BatchRuleResponseDTO batchRule;

    /**
     * 批号
     */
    private String batchNumber;

    /**
     * 批号ID
     */
    private Long batchNumberId;

    /**
     * 行号
     */
    private int lineSeq;

    /**
     * 版本号
     */
    private String version;

    /**
     * bomId
     */
    private Long bomId;

    /**
     * 工艺路线编号
     */
    private String processRouteCode;

    /**
     * 工艺路线ID
     */
    private Long processRouteId;

    /**
     * 物料ID
     */
    private long materialId;

    /**
     * 物料信息
     */
    private MaterialResponseDTO material;

    /**
     * 单位ID
     */
    private long unitId;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 产出工单工序ID
     */
    private Long outputProcessId;

    /**
     * sop方案ID
     */
    private Long sopId;

    /**
     * 产出工单工序信息
     */
    private ProcessDefSimpleResponseDTO outputProcessSimpleResponseDTO;

    /**
     * 产出控件ID
     */
    private Long outputSopControlId;

    /**
     * 产出控件code
     */
    private String outputSopControlCode;

    /**
     * 成品率
     */
    private String productRate;

    /**
     * 单次报工数量
     */
    private String singleWorkReportAmount;

    /**
     * 总报工数
     */
    private BaseAmountDisplay totalHoldAmount;

    /**
     * 合格报工数
     */
    private BaseAmountDisplay qualifiedHoldAmount;

    /**
     * 不合格报工数
     */
    private BaseAmountDisplay disqualifiedHoldAmount;

    /**
     * 入库数
     */
    private BaseAmountDisplay warehousedAmount;

    /**
     * 领料收料齐套数
     */
    private BaseAmountDisplay pickOrderPreparedAmount;

    /**
     * 报工方式
     */
    private List<Integer> reportingMethods;

    /**
     * 是否入库
     */
    private int warehousing;

    /**
     * 自动入库
     */
    private Integer autoWarehousingFlag;

    public long getId() {
        return id;
    }

    public int getMain() {
        return main;
    }

    public BaseAmountDisplay getPlannedAmount() {
        return plannedAmount;
    }

    public String getStandardAmount() {
        return standardAmount;
    }

    public BaseAmountDisplay getExpectedAmount() {
        return expectedAmount;
    }

    public BizConstantDisplay getBatchGenerationType() {
        return batchGenerationType;
    }

    public BatchRuleResponseDTO getBatchRule() {
        return batchRule;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public Long getBatchNumberId() {
        return batchNumberId;
    }

    public int getLineSeq() {
        return lineSeq;
    }

    public String getVersion() {
        return version;
    }

    public Long getBomId() {
        return bomId;
    }

    public String getProcessRouteCode() {
        return processRouteCode;
    }

    public Long getProcessRouteId() {
        return processRouteId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public long getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public Long getOutputProcessId() {
        return outputProcessId;
    }

    public Long getSopId() {
        return sopId;
    }

    public ProcessDefSimpleResponseDTO getOutputProcessSimpleResponseDTO() {
        return outputProcessSimpleResponseDTO;
    }

    public Long getOutputSopControlId() {
        return outputSopControlId;
    }

    public String getOutputSopControlCode() {
        return outputSopControlCode;
    }

    public String getProductRate() {
        return productRate;
    }

    public String getSingleWorkReportAmount() {
        return singleWorkReportAmount;
    }

    public BaseAmountDisplay getTotalHoldAmount() {
        return totalHoldAmount;
    }

    public BaseAmountDisplay getQualifiedHoldAmount() {
        return qualifiedHoldAmount;
    }

    public BaseAmountDisplay getDisqualifiedHoldAmount() {
        return disqualifiedHoldAmount;
    }

    public BaseAmountDisplay getWarehousedAmount() {
        return warehousedAmount;
    }

    public BaseAmountDisplay getPickOrderPreparedAmount() {
        return pickOrderPreparedAmount;
    }

    public List<Integer> getReportingMethods() {
        return reportingMethods;
    }

    public int getWarehousing() {
        return warehousing;
    }

    public Integer getAutoWarehousingFlag() {
        return autoWarehousingFlag;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMain(int main) {
        this.main = main;
    }

    public void setPlannedAmount(BaseAmountDisplay plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public void setStandardAmount(String standardAmount) {
        this.standardAmount = standardAmount;
    }

    public void setExpectedAmount(BaseAmountDisplay expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public void setBatchGenerationType(BizConstantDisplay batchGenerationType) {
        this.batchGenerationType = batchGenerationType;
    }

    public void setBatchRule(BatchRuleResponseDTO batchRule) {
        this.batchRule = batchRule;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setBatchNumberId(Long batchNumberId) {
        this.batchNumberId = batchNumberId;
    }

    public void setLineSeq(int lineSeq) {
        this.lineSeq = lineSeq;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public void setProcessRouteCode(String processRouteCode) {
        this.processRouteCode = processRouteCode;
    }

    public void setProcessRouteId(Long processRouteId) {
        this.processRouteId = processRouteId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setUnitId(long unitId) {
        this.unitId = unitId;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setOutputProcessId(Long outputProcessId) {
        this.outputProcessId = outputProcessId;
    }

    public void setSopId(Long sopId) {
        this.sopId = sopId;
    }

    public void setOutputProcessSimpleResponseDTO(ProcessDefSimpleResponseDTO outputProcessSimpleResponseDTO) {
        this.outputProcessSimpleResponseDTO = outputProcessSimpleResponseDTO;
    }

    public void setOutputSopControlId(Long outputSopControlId) {
        this.outputSopControlId = outputSopControlId;
    }

    public void setOutputSopControlCode(String outputSopControlCode) {
        this.outputSopControlCode = outputSopControlCode;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public void setSingleWorkReportAmount(String singleWorkReportAmount) {
        this.singleWorkReportAmount = singleWorkReportAmount;
    }

    public void setTotalHoldAmount(BaseAmountDisplay totalHoldAmount) {
        this.totalHoldAmount = totalHoldAmount;
    }

    public void setQualifiedHoldAmount(BaseAmountDisplay qualifiedHoldAmount) {
        this.qualifiedHoldAmount = qualifiedHoldAmount;
    }

    public void setDisqualifiedHoldAmount(BaseAmountDisplay disqualifiedHoldAmount) {
        this.disqualifiedHoldAmount = disqualifiedHoldAmount;
    }

    public void setWarehousedAmount(BaseAmountDisplay warehousedAmount) {
        this.warehousedAmount = warehousedAmount;
    }

    public void setPickOrderPreparedAmount(BaseAmountDisplay pickOrderPreparedAmount) {
        this.pickOrderPreparedAmount = pickOrderPreparedAmount;
    }

    public void setReportingMethods(List<Integer> reportingMethods) {
        this.reportingMethods = reportingMethods;
    }

    public void setWarehousing(int warehousing) {
        this.warehousing = warehousing;
    }

    public void setAutoWarehousingFlag(Integer autoWarehousingFlag) {
        this.autoWarehousingFlag = autoWarehousingFlag;
    }
}

