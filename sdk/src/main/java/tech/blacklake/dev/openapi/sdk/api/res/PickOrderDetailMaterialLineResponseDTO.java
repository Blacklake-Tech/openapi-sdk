package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class PickOrderDetailMaterialLineResponseDTO  {
    /**
     * 领料单编号
     */
    private String pickOrderCode;

    /**
     * 领料单id
     */
    private long pickOrderId;

    /**
     * 状态
     */
    private BizConstantDisplay pickOrderStatus;

    /**
     * 领料类型 key = PickOrderTypeEnum
     */
    private BizConstantDisplay pickOrderType;

    /**
     * 创建人
     */
    private UserResponseDTO creator;

    /**
     * 创建时间
     */
    private long createdAt;

    /**
     * 更新人
     */
    private UserResponseDTO operator;

    /**
     * 更新时间
     */
    private long updatedAt;

    /**
     * 领料单详情id
     */
    private long pickOrderDetailId;

    /**
     * 序号
     */
    private long line;

    /**
     * 物料
     */
    private MaterialResponseDTO material;

    /**
     * 申请数
     */
    private BaseAmountDisplay requestPickAmount;

    /**
     * 发起调拨数
     */
    private BaseAmountDisplay transferIssuedAmount;

    /**
     * 发料数
     */
    private BaseAmountDisplay pickOrderIssuedAmount;

    /**
     * 收料数
     */
    private BaseAmountDisplay receivePickAmount;

    /**
     * 发料仓库id
     */
    private Long sourceWarehouseId;

    /**
     * 收料仓库id
     */
    private long targetWarehouseId;

    /**
     * 发料仓库名称
     */
    private String sourceWarehouseName;

    /**
     * 收料仓库名称
     */
    private String targetWarehouseName;

    /**
     * 发料仓库
     */
    private StorageWarehouseResponseDTO sourceWarehouse;

    /**
     * 收料仓库
     */
    private StorageWarehouseResponseDTO targetWarehouse;

    /**
     * 需求时间
     */
    private Long requirementTime;

    /**
     * 投料工序号
     */
    private String inputProcessCode;

    /**
     * 投料工序名称
     */
    private String inputProcessName;

    /**
     * 投料工序ID
     */
    private Long inputProcessId;

    /**
     * 工作中心
     */
    private WorkCenterResponseDTO workCenter;

    /**
     * 指定供应商
     */
    private List<SupplierResponseDTO> supplierList;

    /**
     * 指定批号
     */
    private BatchResponseDTO batchCode;

    /**
     * 生产工单id
     */
    private Long workOrderId;

    /**
     * 生产工单编号
     */
    private String workOrderCode;

    /**
     * 生产部门
     */
    private DepartmentResponseDTO productionDepartment;

    /**
     * 行备注
     */
    private String remark;

    /**
     * 调拨单
     */
    private List<TransferOrderResponseDTO> transferOrderResponseDTO;

    /**
     * 标准件或替代件Id
     */
    private Long inputOrAlternativeMaterialId;

    /**
     * 项次
     */
    private Integer seq;

    /**
     * 是否是替代物料
     */
    private Integer alternativeMaterialFlag;

    /**
     * 主产出批次号/批次号规则
     */
    private String mainOutputBatchNumber;

    public String getPickOrderCode() {
        return pickOrderCode;
    }

    public long getPickOrderId() {
        return pickOrderId;
    }

    public BizConstantDisplay getPickOrderStatus() {
        return pickOrderStatus;
    }

    public BizConstantDisplay getPickOrderType() {
        return pickOrderType;
    }

    public UserResponseDTO getCreator() {
        return creator;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public UserResponseDTO getOperator() {
        return operator;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public long getPickOrderDetailId() {
        return pickOrderDetailId;
    }

    public long getLine() {
        return line;
    }

    public MaterialResponseDTO getMaterial() {
        return material;
    }

    public BaseAmountDisplay getRequestPickAmount() {
        return requestPickAmount;
    }

    public BaseAmountDisplay getTransferIssuedAmount() {
        return transferIssuedAmount;
    }

    public BaseAmountDisplay getPickOrderIssuedAmount() {
        return pickOrderIssuedAmount;
    }

    public BaseAmountDisplay getReceivePickAmount() {
        return receivePickAmount;
    }

    public Long getSourceWarehouseId() {
        return sourceWarehouseId;
    }

    public long getTargetWarehouseId() {
        return targetWarehouseId;
    }

    public String getSourceWarehouseName() {
        return sourceWarehouseName;
    }

    public String getTargetWarehouseName() {
        return targetWarehouseName;
    }

    public StorageWarehouseResponseDTO getSourceWarehouse() {
        return sourceWarehouse;
    }

    public StorageWarehouseResponseDTO getTargetWarehouse() {
        return targetWarehouse;
    }

    public Long getRequirementTime() {
        return requirementTime;
    }

    public String getInputProcessCode() {
        return inputProcessCode;
    }

    public String getInputProcessName() {
        return inputProcessName;
    }

    public Long getInputProcessId() {
        return inputProcessId;
    }

    public WorkCenterResponseDTO getWorkCenter() {
        return workCenter;
    }

    public List<SupplierResponseDTO> getSupplierList() {
        return supplierList;
    }

    public BatchResponseDTO getBatchCode() {
        return batchCode;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public DepartmentResponseDTO getProductionDepartment() {
        return productionDepartment;
    }

    public String getRemark() {
        return remark;
    }

    public List<TransferOrderResponseDTO> getTransferOrderResponseDTO() {
        return transferOrderResponseDTO;
    }

    public Long getInputOrAlternativeMaterialId() {
        return inputOrAlternativeMaterialId;
    }

    public Integer getSeq() {
        return seq;
    }

    public Integer getAlternativeMaterialFlag() {
        return alternativeMaterialFlag;
    }

    public String getMainOutputBatchNumber() {
        return mainOutputBatchNumber;
    }

    public void setPickOrderCode(String pickOrderCode) {
        this.pickOrderCode = pickOrderCode;
    }

    public void setPickOrderId(long pickOrderId) {
        this.pickOrderId = pickOrderId;
    }

    public void setPickOrderStatus(BizConstantDisplay pickOrderStatus) {
        this.pickOrderStatus = pickOrderStatus;
    }

    public void setPickOrderType(BizConstantDisplay pickOrderType) {
        this.pickOrderType = pickOrderType;
    }

    public void setCreator(UserResponseDTO creator) {
        this.creator = creator;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setOperator(UserResponseDTO operator) {
        this.operator = operator;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPickOrderDetailId(long pickOrderDetailId) {
        this.pickOrderDetailId = pickOrderDetailId;
    }

    public void setLine(long line) {
        this.line = line;
    }

    public void setMaterial(MaterialResponseDTO material) {
        this.material = material;
    }

    public void setRequestPickAmount(BaseAmountDisplay requestPickAmount) {
        this.requestPickAmount = requestPickAmount;
    }

    public void setTransferIssuedAmount(BaseAmountDisplay transferIssuedAmount) {
        this.transferIssuedAmount = transferIssuedAmount;
    }

    public void setPickOrderIssuedAmount(BaseAmountDisplay pickOrderIssuedAmount) {
        this.pickOrderIssuedAmount = pickOrderIssuedAmount;
    }

    public void setReceivePickAmount(BaseAmountDisplay receivePickAmount) {
        this.receivePickAmount = receivePickAmount;
    }

    public void setSourceWarehouseId(Long sourceWarehouseId) {
        this.sourceWarehouseId = sourceWarehouseId;
    }

    public void setTargetWarehouseId(long targetWarehouseId) {
        this.targetWarehouseId = targetWarehouseId;
    }

    public void setSourceWarehouseName(String sourceWarehouseName) {
        this.sourceWarehouseName = sourceWarehouseName;
    }

    public void setTargetWarehouseName(String targetWarehouseName) {
        this.targetWarehouseName = targetWarehouseName;
    }

    public void setSourceWarehouse(StorageWarehouseResponseDTO sourceWarehouse) {
        this.sourceWarehouse = sourceWarehouse;
    }

    public void setTargetWarehouse(StorageWarehouseResponseDTO targetWarehouse) {
        this.targetWarehouse = targetWarehouse;
    }

    public void setRequirementTime(Long requirementTime) {
        this.requirementTime = requirementTime;
    }

    public void setInputProcessCode(String inputProcessCode) {
        this.inputProcessCode = inputProcessCode;
    }

    public void setInputProcessName(String inputProcessName) {
        this.inputProcessName = inputProcessName;
    }

    public void setInputProcessId(Long inputProcessId) {
        this.inputProcessId = inputProcessId;
    }

    public void setWorkCenter(WorkCenterResponseDTO workCenter) {
        this.workCenter = workCenter;
    }

    public void setSupplierList(List<SupplierResponseDTO> supplierList) {
        this.supplierList = supplierList;
    }

    public void setBatchCode(BatchResponseDTO batchCode) {
        this.batchCode = batchCode;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public void setProductionDepartment(DepartmentResponseDTO productionDepartment) {
        this.productionDepartment = productionDepartment;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTransferOrderResponseDTO(List<TransferOrderResponseDTO> transferOrderResponseDTO) {
        this.transferOrderResponseDTO = transferOrderResponseDTO;
    }

    public void setInputOrAlternativeMaterialId(Long inputOrAlternativeMaterialId) {
        this.inputOrAlternativeMaterialId = inputOrAlternativeMaterialId;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public void setAlternativeMaterialFlag(Integer alternativeMaterialFlag) {
        this.alternativeMaterialFlag = alternativeMaterialFlag;
    }

    public void setMainOutputBatchNumber(String mainOutputBatchNumber) {
        this.mainOutputBatchNumber = mainOutputBatchNumber;
    }
}

