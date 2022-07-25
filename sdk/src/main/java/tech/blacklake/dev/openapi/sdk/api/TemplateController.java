package tech.blacklake.dev.openapi.sdk.api;

import java.util.*;
import tech.blacklake.dev.openapi.sdk.api.req.*;
import tech.blacklake.dev.openapi.sdk.api.res.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.annotation.ApiPath;

public class TemplateController {
    /**
     * 物料清单详情
     */
    @ApiPath("/med/open/v1/bom/get")
    public Result<BomDetailResponseDTO> bomGet(BomDetailRequestRequestDTO bomDetailRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单更新
     */
    @ApiPath("/med/open/v1/bom/_update")
    public Result<BomResponseDTO> bomUpdate(BomRequestDTO bomRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单列表
     */
    @ApiPath("/med/open/v1/bom/_list")
    public ResultList<BomListResponseDTO> bomList(BomListRequestRequestDTO bomListRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单新增
     */
    @ApiPath("/med/open/v1/bom/_create")
    public Result<BomResponseDTO> bomCreate(BomRequestDTO bomRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单新增或更新
     */
    @ApiPath("/med/open/v1/bom/_doimport")
    public Result<Object> bomDoimport(BomUpsertRequestRequestDTO bomUpsertRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单批量启停用
     */
    @ApiPath("/med/open/v1/bom/_bulk_update_status")
    public Result<BulkOperationVO<BomBulkUpdateStatusDetailResponseDTO>> bomBulkUpdateStatus(BomBulkUpdateStatusRequestDTO bomBulkUpdateStatusRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 替代方案新增或更新
     */
    @ApiPath("/med/open/v1/alt/create_or_update")
    public Result<Object> altCreateOrUpdate(AlternativePlanRequestRequestDTO alternativePlanRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工序定义新增或更新
     */
    @ApiPath("/med/open/v1/process/_doimport")
    public Result<Object> processDoimport(ProcessUpsertRequestDTO processUpsertRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工序定义新增
     */
    @ApiPath("/med/open/v1/process/_create")
    public Result<Object> processCreate(ProcessRequestDTO processRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工序定义更新
     */
    @ApiPath("/med/open/v1/process/_update")
    public Result<Object> processUpdate(ProcessRequestDTO processRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工艺路线新增或更新
     */
    @ApiPath("/med/open/v1/process_route/_doimport")
    public Result<Object> processRouteDoimport(ProcessRouteUpsertRequestDTO processRouteUpsertRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工艺路线新增
     */
    @ApiPath("/med/open/v1/process_route/_create")
    public Result<Object> processRouteCreate(ProcessRouteRequestDTO processRouteRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工艺路线更新
     */
    @ApiPath("/med/open/v1/process_route/_update")
    public Result<Object> processRouteUpdate(ProcessRouteRequestDTO processRouteRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工艺路线启用或停用
     */
    @ApiPath("/med/open/v1/process_route/_update_status")
    public Result<BulkOperationVO<FailDetailResponseDTO>> processRouteUpdateStatus(ProcessRouteStatusRequestRequestDTO processRouteStatusRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 领料单详情
     */
    @ApiPath("/med/open/v1/pick_order/_get")
    public Result<PickOrderDetailResponseDTO> pickOrderGet(PickOrderRequestDTO pickOrderRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 领料单列表
     */
    @ApiPath("/med/open/v1/pick_order/_list")
    public Result<PageResDTO<PickOrderDetailMaterialLineResponseDTO>> pickOrderList(PickOrderListRequestDTO pickOrderListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单产出信息详情
     */
    @ApiPath("/med/open/v1/work_order/output/_get")
    public Result<List<OutputMaterialResponseDTO>> workOrderOutputGet(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单创建
     */
    @ApiPath("/med/open/v1/work_order/_create")
    public Result<WorkOrderCreationResponseDTO> workOrderCreate(WorkOrderRequestDTO workOrderRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单编辑
     */
    @ApiPath("/med/open/v1/work_order/_update")
    public Result<WorkOrderUpdateResponseDTO> workOrderUpdate(WorkOrderUpdateRequestDTO workOrderUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单列表
     */
    @ApiPath("/med/open/v1/work_order/base/_list")
    public Result<PageResDTO<WorkOrderListResponseDTO>> workOrderBaseList(WorkOrderListRequestRequestDTO workOrderListRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单来源信息详情
     */
    @ApiPath("/med/open/v1/work_order/source/_get")
    public Result<WorkOrderSourceResponseDTO> workOrderSourceGet(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单基本信息详情
     */
    @ApiPath("/med/open/v1/work_order/base/_get")
    public Result<WorkOrderBaseResponseDTO> workOrderBaseGet(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单工序计划详情
     */
    @ApiPath("/med/open/v1/work_order/process_plan/_get")
    public Result<ProcessPlanResponseDTO> workOrderProcessPlanGet(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单用料清单详情
     */
    @ApiPath("/med/open/v1/work_order/input_material/_get")
    public Result<List<InputMaterialResponseDTO>> workOrderInputMaterialGet(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单创建或更新
     */
    @ApiPath("/med/open/v1/work_order/_doImport")
    public Result<Object> workOrderDoImport(WorkOrderUpsertRequestDTO workOrderUpsertRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 投料记录列表
     */
    @ApiPath("/mfg/open/v1/feed_record/_list")
    public Result<List<FeedRecordListResponseDTO>> feedRecordList(FeedRecordListRequestDTO feedRecordListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 生产任务详情
     */
    @ApiPath("/mfg/open/v1/produce_task/_detail")
    public Result<ProduceTaskDetailResponseDTO> produceTaskDetail(ProduceTaskIdRequestDTO produceTaskIdRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 生产任务列表
     */
    @ApiPath("/mfg/open/v1/produce_task/_list")
    public ResultList<ProduceTaskListResponseDTO> produceTaskList(ProduceTaskListRequestDTO produceTaskListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 报工
     */
    @ApiPath("/mfg/open/v1/progress_report/_do_progress_report")
    public Result<DoProgressReportResponseDTO> progressReportDoProgressReport(ProgressReportRequestRequestDTO progressReportRequestRequestDTO){
        throw new UnsupportedOperationException();
    }
}

