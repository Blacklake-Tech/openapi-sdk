package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class WorkOrderUpdateRequestDTO extends CustomFieldBaseCO {
    /**
     * 是否是草稿状态
     */
    private boolean draftFlag;

    /**
     * 基本信息
     */
    private WorkOrderBaseUpdateRequestDTO workOrderBaseRequestDTO;

    /**
     * 用料清单
     */
    private List<InputMaterialUpdateRequestDTO> bomInputMaterials;

    /**
     * 工序计划
     */
    private ProcessPlanUpdateRequestDTO processPlanRequestDTO;

    /**
     * 产出信息
     */
    private List<OutputMaterialUpdateRequestDTO> bomOutputMaterials;

    /**
     * 来源信息
     */
    private WorkOrderSourceUpdateRequestDTO workOrderSourceRequestDTO;

    public boolean getDraftFlag() {
        return draftFlag;
    }

    public WorkOrderBaseUpdateRequestDTO getWorkOrderBaseRequestDTO() {
        return workOrderBaseRequestDTO;
    }

    public List<InputMaterialUpdateRequestDTO> getBomInputMaterials() {
        return bomInputMaterials;
    }

    public ProcessPlanUpdateRequestDTO getProcessPlanRequestDTO() {
        return processPlanRequestDTO;
    }

    public List<OutputMaterialUpdateRequestDTO> getBomOutputMaterials() {
        return bomOutputMaterials;
    }

    public WorkOrderSourceUpdateRequestDTO getWorkOrderSourceRequestDTO() {
        return workOrderSourceRequestDTO;
    }

    public void setDraftFlag(boolean draftFlag) {
        this.draftFlag = draftFlag;
    }

    public void setWorkOrderBaseRequestDTO(WorkOrderBaseUpdateRequestDTO workOrderBaseRequestDTO) {
        this.workOrderBaseRequestDTO = workOrderBaseRequestDTO;
    }

    public void setBomInputMaterials(List<InputMaterialUpdateRequestDTO> bomInputMaterials) {
        this.bomInputMaterials = bomInputMaterials;
    }

    public void setProcessPlanRequestDTO(ProcessPlanUpdateRequestDTO processPlanRequestDTO) {
        this.processPlanRequestDTO = processPlanRequestDTO;
    }

    public void setBomOutputMaterials(List<OutputMaterialUpdateRequestDTO> bomOutputMaterials) {
        this.bomOutputMaterials = bomOutputMaterials;
    }

    public void setWorkOrderSourceRequestDTO(WorkOrderSourceUpdateRequestDTO workOrderSourceRequestDTO) {
        this.workOrderSourceRequestDTO = workOrderSourceRequestDTO;
    }
}
