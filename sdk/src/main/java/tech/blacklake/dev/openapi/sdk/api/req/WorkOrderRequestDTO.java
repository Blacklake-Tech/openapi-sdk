package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderRequestDTO extends CustomFieldBaseCO {
    /**
     * 是否是草稿状态
     */
    private boolean draftFlag;

    /**
     * 基本信息
     */
    private WorkOrderBaseRequestDTO workOrderBaseRequestDTO;

    /**
     * 用料清单
     */
    private List<InputMaterialRequestDTO> bomInputMaterials;

    /**
     * 工序计划
     */
    private ProcessPlanRequestDTO processPlanRequestDTO;

    /**
     * 产出信息
     */
    private List<OutputMaterialRequestDTO> bomOutputMaterials;

    /**
     * 来源信息
     */
    private WorkOrderSourceRequestDTO workOrderSourceRequestDTO;

    public boolean getDraftFlag() {
        return draftFlag;
    }

    public WorkOrderBaseRequestDTO getWorkOrderBaseRequestDTO() {
        return workOrderBaseRequestDTO;
    }

    public List<InputMaterialRequestDTO> getBomInputMaterials() {
        return bomInputMaterials;
    }

    public ProcessPlanRequestDTO getProcessPlanRequestDTO() {
        return processPlanRequestDTO;
    }

    public List<OutputMaterialRequestDTO> getBomOutputMaterials() {
        return bomOutputMaterials;
    }

    public WorkOrderSourceRequestDTO getWorkOrderSourceRequestDTO() {
        return workOrderSourceRequestDTO;
    }

    public void setDraftFlag(boolean draftFlag) {
        this.draftFlag = draftFlag;
    }

    public void setWorkOrderBaseRequestDTO(WorkOrderBaseRequestDTO workOrderBaseRequestDTO) {
        this.workOrderBaseRequestDTO = workOrderBaseRequestDTO;
    }

    public void setBomInputMaterials(List<InputMaterialRequestDTO> bomInputMaterials) {
        this.bomInputMaterials = bomInputMaterials;
    }

    public void setProcessPlanRequestDTO(ProcessPlanRequestDTO processPlanRequestDTO) {
        this.processPlanRequestDTO = processPlanRequestDTO;
    }

    public void setBomOutputMaterials(List<OutputMaterialRequestDTO> bomOutputMaterials) {
        this.bomOutputMaterials = bomOutputMaterials;
    }

    public void setWorkOrderSourceRequestDTO(WorkOrderSourceRequestDTO workOrderSourceRequestDTO) {
        this.workOrderSourceRequestDTO = workOrderSourceRequestDTO;
    }
}
