package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class PlanOrderFullDetailResponseDTO {
    /**
     * 基本信息
     */
    private PlanOrderBaseResponseDTO planOrderBaseResponseDTO;

    /**
     * 来源信息
     */
    private PlanOrderSourceResponseDTO planOrderSourceResponseDTO;

    /**
     * 产出信息
     */
    private List<OutputMaterialResponseDTO> outputMaterialVOs;

    /**
     * 用料清单
     */
    private List<InputMaterialResponseDTO> inputMaterialVOs;

    /**
     * 工序计划
     */
    private ProcessPlanResponseDTO processPlanResponseDTO;

    public PlanOrderBaseResponseDTO getPlanOrderBaseResponseDTO() {
        return planOrderBaseResponseDTO;
    }

    public PlanOrderSourceResponseDTO getPlanOrderSourceResponseDTO() {
        return planOrderSourceResponseDTO;
    }

    public List<OutputMaterialResponseDTO> getOutputMaterialVOs() {
        return outputMaterialVOs;
    }

    public List<InputMaterialResponseDTO> getInputMaterialVOs() {
        return inputMaterialVOs;
    }

    public ProcessPlanResponseDTO getProcessPlanResponseDTO() {
        return processPlanResponseDTO;
    }

    public void setPlanOrderBaseResponseDTO(PlanOrderBaseResponseDTO planOrderBaseResponseDTO) {
        this.planOrderBaseResponseDTO = planOrderBaseResponseDTO;
    }

    public void setPlanOrderSourceResponseDTO(PlanOrderSourceResponseDTO planOrderSourceResponseDTO) {
        this.planOrderSourceResponseDTO = planOrderSourceResponseDTO;
    }

    public void setOutputMaterialVOs(List<OutputMaterialResponseDTO> outputMaterialVOs) {
        this.outputMaterialVOs = outputMaterialVOs;
    }

    public void setInputMaterialVOs(List<InputMaterialResponseDTO> inputMaterialVOs) {
        this.inputMaterialVOs = inputMaterialVOs;
    }

    public void setProcessPlanResponseDTO(ProcessPlanResponseDTO processPlanResponseDTO) {
        this.processPlanResponseDTO = processPlanResponseDTO;
    }
}
