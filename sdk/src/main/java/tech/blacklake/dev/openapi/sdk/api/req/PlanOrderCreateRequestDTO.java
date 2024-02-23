package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderCreateRequestDTO {
    /**
     * 基本信息
     */
    private PlanOrderBaseRequestDTO planOrderBaseRequestDTO;

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
    private PlanOrderSourceRequestDTO planOrderSourceRequestDTO;

    public PlanOrderBaseRequestDTO getPlanOrderBaseRequestDTO() {
        return planOrderBaseRequestDTO;
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

    public PlanOrderSourceRequestDTO getPlanOrderSourceRequestDTO() {
        return planOrderSourceRequestDTO;
    }

    public void setPlanOrderBaseRequestDTO(PlanOrderBaseRequestDTO planOrderBaseRequestDTO) {
        this.planOrderBaseRequestDTO = planOrderBaseRequestDTO;
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

    public void setPlanOrderSourceRequestDTO(PlanOrderSourceRequestDTO planOrderSourceRequestDTO) {
        this.planOrderSourceRequestDTO = planOrderSourceRequestDTO;
    }
}
