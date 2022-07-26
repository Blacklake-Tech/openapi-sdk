package tech.blacklake.dev.openapi.sdk.api;

import java.util.*;
import tech.blacklake.dev.openapi.sdk.api.req.*;
import tech.blacklake.dev.openapi.sdk.api.res.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.annotation.ApiPath;

public class TemplateController {
    /**
     * 替代方案删除
     */
    @ApiPath("/med/open/v1/alt/_delete")
    public Result<BulkOperationVO<AlternativePlanBulkDeleteResponseDTO>> altDelete(AlternativePlanBulkDeleteRequestDTO alternativePlanBulkDeleteRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 替代方案导入
     */
    @ApiPath("/med/open/v1/alt/_doimport")
    public Result<Object> altDoimport(AlternativePlanRequestRequestDTO alternativePlanRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单详情
     */
    @ApiPath("/med/open/v1/bom/_detail")
    public Result<BomDetailResponseDTO> bomDetail(BomDetailRequestRequestDTO bomDetailRequestRequestDTO){
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
     * 物料清单更新(Erp对接)
     */
    @ApiPath("/med/open/v1/bom/_update_for_erp")
    public Result<Object> bomUpdateForErp(BomForErpUpsertRequestDTO bomForErpUpsertRequestDTO){
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
     * 查询工序列表接口
     */
    @ApiPath("/med/open/v1/process/_list")
    public Result<List<ProcessFlatResponseDTO>> processList(ProcessRequestRequestDTO processRequestRequestDTO){
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
     * 工艺路线启用或停用
     */
    @ApiPath("/med/open/v1/process_route/_update_status")
    public Result<BulkOperationVO<FailDetailResponseDTO>> processRouteUpdateStatus(ProcessRouteStatusRequestRequestDTO processRouteStatusRequestRequestDTO){
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
     * 工单工序计划详情
     */
    @ApiPath("/med/open/v1/work_order/process_plan/_detail")
    public Result<ProcessPlanResponseDTO> workOrderProcessPlanDetail(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
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
     * 工单列表
     */
    @ApiPath("/med/open/v1/work_order/base/_list")
    public Result<PageResDTO<WorkOrderListResponseDTO>> workOrderBaseList(WorkOrderListRequestRequestDTO workOrderListRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单基本信息详情
     */
    @ApiPath("/med/open/v1/work_order/base/_detail")
    public Result<WorkOrderBaseResponseDTO> workOrderBaseDetail(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单来源信息详情
     */
    @ApiPath("/med/open/v1/work_order/source/_detail")
    public Result<WorkOrderSourceResponseDTO> workOrderSourceDetail(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工单产出信息详情
     */
    @ApiPath("/med/open/v1/work_order/output/_detail")
    public Result<List<OutputMaterialResponseDTO>> workOrderOutputDetail(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
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
     * 工单用料清单详情
     */
    @ApiPath("/med/open/v1/work_order/input_material/_detail")
    public Result<List<InputMaterialResponseDTO>> workOrderInputMaterialDetail(WorkOrderInfoRequestRequestDTO workOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 领料申请详情
     */
    @ApiPath("/med/open/v1/pick_order/_detail")
    public Result<PickOrderDetailResponseDTO> pickOrderDetail(PickOrderRequestRequestDTO pickOrderRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 领料申请列表
     */
    @ApiPath("/med/open/v1/pick_order/_list")
    public Result<PageResDTO<PickOrderDetailMaterialLineResponseDTO>> pickOrderList(PickOrderListRequestRequestDTO pickOrderListRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 查看投料申请状态
     */
    @ApiPath("/mfg/open/v1/feed_apply/_list_feed_applies")
    public ResultList<FeedApplyListResponseDTO> feedApplyListFeedApplies(FeedApplyListRequestDTO feedApplyListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 批量创建投料申请
     */
    @ApiPath("/mfg/open/v1/feed_apply/_bulk_apply")
    public Result<BulkFeedApplyResponseDTO> feedApplyBulkApply(BulkFeedApplyRequestDTO bulkFeedApplyRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取投料关系
     */
    @ApiPath("/mfg/open/v1/feed/_get_feed_relation")
    public Result<List<FeedRelationResponseDTO>> feedGetFeedRelation(FeedRelationsRequestDTO feedRelationsRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 投料记录详情
     */
    @ApiPath("/mfg/open/v1/feed_record/feed_record/_detail")
    public Result<FeedRecordDetailResponseDTO> feedRecordFeedRecordDetail(FeedRecordDetailRequestDTO feedRecordDetailRequestDTO){
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
     * 回撤记录列表
     */
    @ApiPath("/mfg/open/v1/feed_retract_record/_list")
    public Result<List<FeedRetractRecordListResponseDTO>> feedRetractRecordList(FeedRetractRecordListRequestDTO feedRetractRecordListRequestDTO){
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

    /**
     * 设备导入接口
     */
    @ApiPath("/resource/open/v1/resources/_doimport")
    public Result<ResourceResponseDTO> resourcesDoimport(ResourceImportRequestDTO resourceImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 设备列表接口
     */
    @ApiPath("/resource/open/v1/resources/list")
    public Result resourcesList(ResourceListRequestDTO resourceListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 资源参数新增
     */
    @ApiPath("/resource/open/v1/resource_record/_create")
    public Result<ResourceRecordsResponseDTO> resourceRecordCreate(ResourceRecordRequestDTO resourceRecordRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 区域：列表接口
     */
    @ApiPath("/resource/open/v1/location/list")
    public Result locationList(GetLocationListRequestDTO getLocationListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 区域导入接口
     */
    @ApiPath("/resource/open/v1/location/_doimport")
    public Result<ResourceResponseDTO> locationDoimport(LocationImportRequestDTO locationImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 客户导入
     */
    @ApiPath("/order/open/v1/customer/_doimport")
    public Result<Object> customerDoimport(UpsertCustomerBaseInfoRequestDTO upsertCustomerBaseInfoRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 采购订单详情
     */
    @ApiPath("/order/open/v1/purchase_order/_detail")
    public Result<PurchaseOrderDetailResponseDTO> purchaseOrderDetail(GetPurchaseOrderDetailRequestDTO getPurchaseOrderDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 采购订单导入
     */
    @ApiPath("/order/open/v1/purchase_order/_doimport")
    public Result<Object> purchaseOrderDoimport(UpsertPurchaseOrderRequestDTO upsertPurchaseOrderRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 采购退货单导入
     */
    @ApiPath("/order/open/v1/purchase_return_order/_doimport")
    public Result<Object> purchaseReturnOrderDoimport(ImportPurchaseReturnOrderRequestDTO importPurchaseReturnOrderRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 收货单详情
     */
    @ApiPath("/order/open/v1/receive_note/_detail")
    public Result<ReceiveNoteDetailResponseDTO> receiveNoteDetail(GetReceiveNoteDetailRequestDTO getReceiveNoteDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 收货单列表查询-单据视图
     */
    @ApiPath("/order/open/v1/receive_note/_list")
    public ResultList<ReceiveNoteResponseDTO> receiveNoteList(GetReceiveNoteListRequestDTO getReceiveNoteListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 收货单列表查询-物料行视图
     */
    @ApiPath("/order/open/v1/receive_note/_list/_material")
    public ResultList<ReceiveNoteMaterialItemResponseDTO> receiveNoteListMaterial(GetReceiveNoteListRequestDTO getReceiveNoteListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 销售订单详情
     */
    @ApiPath("/order/open/v1/sales_order/_detail")
    public Result<SalesOrderResponseDTO> salesOrderDetail(GetSalesOrderDetailRequestDTO getSalesOrderDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 获得销售订单列表
     */
    @ApiPath("/order/open/v1/sales_order/_list_by_codes")
    public Result<List<SalesOrderResponseDTO>> salesOrderListByCodes(ListSalesOrderBaseInfoByCodesRequestDTO listSalesOrderBaseInfoByCodesRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 销售订单导入（不支持更新）
     */
    @ApiPath("/order/open/v1/sales_order/_doimport")
    public Result<Object> salesOrderDoimport(CreateSalesOrderBaseInfoRequestDTO createSalesOrderBaseInfoRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 销售订单更新
     */
    @ApiPath("/order/open/v1/sales_order/_update")
    public Result<Object> salesOrderUpdate(CreateSalesOrderBaseInfoRequestDTO createSalesOrderBaseInfoRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 销售退货单导入（暂不支持覆盖更新）
     */
    @ApiPath("/order/open/v1/sales_order_return/_doimport")
    public Result<Object> salesOrderReturnDoimport(ImportSalesOrderReturnRequestDTO importSalesOrderReturnRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 发货单导入
     */
    @ApiPath("/order/open/v1/shipment_note/_doimport")
    public Result<Object> shipmentNoteDoimport(ShipmentNoteImportRequestDTO shipmentNoteImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 根据编号查询供应商
     */
    @ApiPath("/order/open/v1/supplier/_list_by_codes")
    public Result<List<SupplierSimpleResponseDTO>> supplierListByCodes(ListSupplierBaseInfoByCodesRequestDTO listSupplierBaseInfoByCodesRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 启用供应商
     */
    @ApiPath("/order/open/v1/supplier/_enable")
    public Result<Object> supplierEnable(EnDisableSupplierBaseInfoRequestDTO enDisableSupplierBaseInfoRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 停用供应商
     */
    @ApiPath("/order/open/v1/supplier/_disable")
    public Result<Object> supplierDisable(EnDisableSupplierBaseInfoRequestDTO enDisableSupplierBaseInfoRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 供应商导入
     */
    @ApiPath("/order/open/v1/supplier/_doimport")
    public Result<Object> supplierDoimport(UpsertSupplierBaseInfoRequestDTO upsertSupplierBaseInfoRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或更新检验项信息
     */
    @ApiPath("/quality/open/v1/qc_check_item/_doimport")
    public Result<String> qcCheckItemDoimport(QcCheckItemRequestDTO qcCheckItemRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验任务详情
     */
    @ApiPath("/quality/open/v1/task/_detail")
    public Result<QcTaskWebDetailResponseDTO> taskDetail(QcTaskDetailRequestDTO qcTaskDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验任务编辑
     */
    @ApiPath("/quality/open/v1/task/_update")
    public Result<Boolean> taskUpdate(QcTaskUpdateRequestDTO qcTaskUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 更新任务检验项记录&检验项明细
     */
    @ApiPath("/quality/open/v1/task/_save_task_check_item_and_config")
    public Result<String> taskSaveTaskCheckItemAndConfig(QcTaskSaveForMengniuRequestDTO qcTaskSaveForMengniuRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验任务新建
     */
    @ApiPath("/quality/open/v1/task/_create")
    public Result<Long> taskCreate(QcTaskCreateRequestDTO qcTaskCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或更新检验项纪录
     */
    @ApiPath("/quality/open/v1/task/_update_task_check_item")
    public Result<Boolean> taskUpdateTaskCheckItem(QcTaskUpdateCheckItemRequestDTO qcTaskUpdateCheckItemRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验任务列表
     */
    @ApiPath("/quality/open/v1/task/_list")
    public ResultList<QcTaskWebPageListResponseDTO> taskList(QcTaskListRequestDTO qcTaskListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或更新检验项分类信息
     */
    @ApiPath("/quality/open/v1/qc_check_item_category/_doimport")
    public Result<String> qcCheckItemCategoryDoimport(QcCheckItemCategoryRequestDTO qcCheckItemCategoryRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或更新不良等级信息
     */
    @ApiPath("/quality/open/v1/qc_defect_rank/_doimport")
    public Result<String> qcDefectRankDoimport(QcDefectRankRequestDTO qcDefectRankRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或更新不良原因信息
     */
    @ApiPath("/quality/open/v1/qc_defect_reason/_doimport")
    public Result<String> qcDefectReasonDoimport(QcDefectReasonRequestDTO qcDefectReasonRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验方案启用
     */
    @ApiPath("/quality/open/v1/qc_config/_enable")
    public Result qcConfigEnable(QcConfigEnableRequestDTO qcConfigEnableRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验方案列表
     */
    @ApiPath("/quality/open/v1/qc_config/_list")
    public ResultList<QcConfigWebPageListResponseDTO> qcConfigList(QcConfigListRequestDTO qcConfigListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或更新检验方案信息
     */
    @ApiPath("/quality/open/v1/qc_config/_doimport")
    public Result<String> qcConfigDoimport(QcConfigRequestDTO qcConfigRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 检验方案停用
     */
    @ApiPath("/quality/open/v1/qc_config/_disable")
    public Result qcConfigDisable(QcConfigDisableRequestDTO qcConfigDisableRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 库存质量状态调整
     */
    @ApiPath("/quality/open/v1/qc_material/_change_qc_status")
    public Result<Long> qcMaterialChangeQcStatus(ChangeMaterialQcStatusRequestDTO changeMaterialQcStatusRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工作中心列表接口
     */
    @ApiPath("/workcenter/open/v1/work_center//list")
    public Result workCenterList(WorkCenterListRequestDTO workCenterListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工作中心导入接口
     */
    @ApiPath("/workcenter/open/v1/work_center//_doimport")
    public Result workCenterDoimport(WorkCenterExcelCreateRequestDTO workCenterExcelCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 库存调整
     */
    @ApiPath("/inventory/open/v1/amount_adjust/_execute")
    public Result<AmountAdjustResponseDTO> amountAdjustExecute(AmountAdjustRequestDTO amountAdjustRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 库存调整记录查询
     */
    @ApiPath("/inventory/open/v1/amount_adjust/_list_record")
    public ResultList<AmountAdjustRecListResponseDTO> amountAdjustListRecord(AmountAdjustRecListRequestDTO amountAdjustRecListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 入库单创建
     */
    @ApiPath("/inventory/open/v1/inbound_order/_doimport")
    public Result<Object> inboundOrderDoimport(InboundOrderCreateRequestDTO inboundOrderCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 入库单列表
     */
    @ApiPath("/inventory/open/v1/inbound_order/_list")
    public ResultList<InboundOrderListResponseDTO> inboundOrderList(InboundOrderListRequestDTO inboundOrderListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 入库单详情
     */
    @ApiPath("/inventory/open/v1/inbound_order/_detail")
    public Result<InboundOrderDetailResponseDTO> inboundOrderDetail(InboundOrderDetailRequestDTO inboundOrderDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 普通入库
     */
    @ApiPath("/inventory/open/v1/inbound_order/execute/_inbound")
    public Result<InboundOrderInResponseDTO> inboundOrderExecuteInbound(InboundOrderInRequestDTO inboundOrderInRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 入库单编辑
     */
    @ApiPath("/inventory/open/v1/inbound_order/_update")
    public Result<InboundOrderListResponseDTO> inboundOrderUpdate(InboundOrderUpdateRequestDTO inboundOrderUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 批量下发入库单
     */
    @ApiPath("/inventory/open/v1/inbound_order/_issue")
    public Result<CommonBulkOperationResponseDTO> inboundOrderIssue(InboundOrderIssueRequestDTO inboundOrderIssueRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 入库单记录
     */
    @ApiPath("/inventory/open/v1/inbound_order/_list_operate_record")
    public ResultList<InboundOrderOperateRecordResponseDTO> inboundOrderListOperateRecord(InboundOrderListOperateRecordRequestDTO inboundOrderListOperateRecordRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 入库单冲销
     */
    @ApiPath("/inventory/open/v1/inbound_order/_execute_revert")
    public Result<InboundOrderExecuteRevertResponseDTO> inboundOrderExecuteRevert(InboundOrderExecuteRevertRequestDTO inboundOrderExecuteRevertRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 库存明细查询
     */
    @ApiPath("/inventory/open/v1/material_inventory/_list")
    public ResultList<InventoryElementBaseInfoResponseDTO> materialInventoryList(MaterialInventorySearchRequestDTO materialInventorySearchRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 库存创建
     */
    @ApiPath("/inventory/open/v1/material_inventory/_doimport")
    public Result<Object> materialInventoryDoimport(MaterialInventoryCreateRequestDTO materialInventoryCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 库存变动记录查询
     */
    @ApiPath("/inventory/open/v1/material_inventory/_list_change_log")
    public ResultList<InventoryChangeLogResponseDTO> materialInventoryListChangeLog(InventoryChangeLogRequestDTO inventoryChangeLogRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 出库单详情
     */
    @ApiPath("/inventory/open/v1/outbound_order/_detail")
    public Result<OutboundOrderDetailResponseDTO> outboundOrderDetail(OutboundOrderDetailRequestDTO outboundOrderDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 出库单记录
     */
    @ApiPath("/inventory/open/v1/outbound_order/_list_outbound_record")
    public ResultList<OutboundOrderOperateRecordResponseDTO> outboundOrderListOutboundRecord(OutboundRecordRequestDTO outboundRecordRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 出库单列表
     */
    @ApiPath("/inventory/open/v1/outbound_order/_list")
    public ResultList<OutboundOrderListResponseDTO> outboundOrderList(OutboundOrderListRequestDTO outboundOrderListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 普通出库
     */
    @ApiPath("/inventory/open/v1/outbound_order/execute/_outbound")
    public Result<Object> outboundOrderExecuteOutbound(OutboundOrderAppExecuteRequestRequestDTO outboundOrderAppExecuteRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 出库单创建
     */
    @ApiPath("/inventory/open/v1/outbound_order/_doimport")
    public Result<Object> outboundOrderDoimport(OutboundOrderRequestDTO outboundOrderRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 出库单编辑
     */
    @ApiPath("/inventory/open/v1/outbound_order/_update")
    public Result<OutboundOrderUpdateResponseDTO> outboundOrderUpdate(OutboundOrderUpdateRequestDTO outboundOrderUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 调拨单创建
     */
    @ApiPath("/inventory/open/v1/transfer_order/_doimport")
    public Result<Object> transferOrderDoimport(TransferOrderCreateRequestDTO transferOrderCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 调拨单详情
     */
    @ApiPath("/inventory/open/v1/transfer_order/_detail")
    public Result<TransferOrderDetailResponseDTO> transferOrderDetail(TransferOrderDetailRequestDTO transferOrderDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 调拨单列表
     */
    @ApiPath("/inventory/open/v1/transfer_order/_list")
    public ResultList<TransferOrderDetailResponseDTO> transferOrderList(TransferOrderListRequestDTO transferOrderListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 按单调拨
     */
    @ApiPath("/inventory/open/v1/transfer_order/order/_execute")
    public Result<Void> transferOrderOrderExecute(TransferOrderExecuteRequestDTO transferOrderExecuteRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 普通调拨
     */
    @ApiPath("/inventory/open/v1/transfer_order/ordinary/_execute")
    public Result<Void> transferOrderOrdinaryExecute(TransferOrderExecuteRequestDTO transferOrderExecuteRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 调拨单编辑
     */
    @ApiPath("/inventory/open/v1/transfer_order/_update")
    public Result<TransferOrderSaveResponseDTO> transferOrderUpdate(TransferOrderUpdateRequestDTO transferOrderUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 调拨单记录
     */
    @ApiPath("/inventory/open/v1/transfer_order/_list_record")
    public ResultList<TransferOrderRecordResponseDTO> transferOrderListRecord(TransferOrderRecordRequestDTO transferOrderRecordRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 下发调拨单
     */
    @ApiPath("/inventory/open/v1/transfer_order/_issue")
    public Result<TransferOrderOpResponseDTO> transferOrderIssue(TransferOrderOpListRequestDTO transferOrderOpListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 创建调拨单
     */
    @ApiPath("/inventory/open/v1/transfer_order/_create")
    public Result<TransferOrderSaveResponseDTO> transferOrderCreate(TransferOrderCreateRequestDTO transferOrderCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新建或编辑物料属性
     */
    @ApiPath("/material/open/v1/material/attribute/_doimport")
    public Result<Object> materialAttributeDoimport(MaterialAttributeImportRequestDTO materialAttributeImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 批次列表
     */
    @ApiPath("/material/open/v1/batch_no/_list")
    public ResultList<MaterialBatchDetailResponseDTO> batchNoList(MaterialBatchSearchRequestDTO materialBatchSearchRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 创建批次
     */
    @ApiPath("/material/open/v1/batch_no/_save")
    public Result<MaterialBatchNoCommandResponseDTO> batchNoSave(MaterialBatchNoCreateRequestDTO materialBatchNoCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 更新批次
     */
    @ApiPath("/material/open/v1/batch_no/_update")
    public Result<MaterialBatchNoCommandResponseDTO> batchNoUpdate(MaterialBatchNoUpdateRequestDTO materialBatchNoUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料分类列表
     */
    @ApiPath("/material/open/v1/material/category/_list")
    public ResultList<MaterialCategoryListResponseDTO> materialCategoryList(MaterialCategoryListRequestDTO materialCategoryListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新建或编辑物料分类
     */
    @ApiPath("/material/open/v1/material/category/_doimport")
    public Result<Object> materialCategoryDoimport(MaterialCategoryImportRequestDTO materialCategoryImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料详情
     */
    @ApiPath("/material/open/v1/material/_detail")
    public Result<MaterialDetailResponseDTO> materialDetail(MaterialDetailRequestDTO materialDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料列表
     */
    @ApiPath("/material/open/v1/material/_list")
    public ResultList<MaterialListDetailResponseDTO> materialList(MaterialListRequestDTO materialListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 启用物料
     */
    @ApiPath("/material/open/v1/material/_start")
    public Result<Void> materialStart(MaterialStartRequestDTO materialStartRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 停用物料
     */
    @ApiPath("/material/open/v1/material/_stop")
    public Result<Void> materialStop(MaterialStopRequestDTO materialStopRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新建或编辑物料
     */
    @ApiPath("/material/open/v1/material/_doimport")
    public Result<Object> materialDoimport(MaterialImportRequestDTO materialImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 编辑物料
     */
    @ApiPath("/material/open/v1/material/_update")
    public Result<MaterialUpdateResponseDTO> materialUpdate(MaterialUpdateAllRequestDTO materialUpdateAllRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 创建物料
     */
    @ApiPath("/material/open/v1/material/_create")
    public Result<MaterialCreateResponseDTO> materialCreate(MaterialCreateAllRequestDTO materialCreateAllRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 单位详情
     */
    @ApiPath("/material/open/v1/unit/_detail")
    public Result<UnitDetailResponseDTO> unitDetail(UnitDetailRequestDTO unitDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 单位编辑
     */
    @ApiPath("/material/open/v1/unit/_update")
    public Result<UnitUpdateResponseDTO> unitUpdate(UnitUpdateRequestDTO unitUpdateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 单位列表
     */
    @ApiPath("/material/open/v1/unit/_list")
    public Result<UnitListResponseDTO> unitList(UnitListRequestDTO unitListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 单位停用
     */
    @ApiPath("/material/open/v1/unit/_stop")
    public Result<Void> unitStop(UnitStopRequestDTO unitStopRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 单位启用
     */
    @ApiPath("/material/open/v1/unit/_start")
    public Result<Void> unitStart(UnitStartRequestDTO unitStartRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 单位创建
     */
    @ApiPath("/material/open/v1/unit/_doimport")
    public Result<Object> unitDoimport(UnitCreateRequestDTO unitCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 仓库创建
     */
    @ApiPath("/storage/open/v1/storage_warehouse//_doimport")
    public Result<Void> storageWarehouseDoimport(StorageWarehouseCreateRequestDTO storageWarehouseCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 仓库分页查询
     */
    @ApiPath("/storage/open/v1/storage_warehouse//_list_page")
    public ResultList<StorageWarehouseWebPageListResponseDTO> storageWarehouseListPage(StorageWarehouseWebPageListRequestDTO storageWarehouseWebPageListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 仓位创建
     */
    @ApiPath("/storage/open/v1/storage_location//_doimport")
    public Result<Void> storageLocationDoimport(StorageLocationCreateRequestDTO storageLocationCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 仓位分页查询
     */
    @ApiPath("/storage/open/v1/storage_location//_list_page")
    public ResultList<StorageLocationWebPageListResponseDTO> storageLocationListPage(StorageLocationWebPageListRequestDTO storageLocationWebPageListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 仓库区域创建
     */
    @ApiPath("/storage/open/v1/storage_area//_doimport")
    public Result<Void> storageAreaDoimport(StorageAreaCreateRequestDTO storageAreaCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 自定义对象实例详情
     */
    @ApiPath("/dev/open/v1/custom_object/detail")
    public Result<CustomObjectDetailResponseResponseDTO> customObjectDetail(CustomObjectDetailRequestRequestDTO customObjectDetailRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 编辑自定义对象实例
     */
    @ApiPath("/dev/open/v1/custom_object/update")
    public Result<Boolean> customObjectUpdate(CustomObjectEditRequestRequestDTO customObjectEditRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 自定义对象实例搜索
     */
    @ApiPath("/dev/open/v1/custom_object/list")
    public ResultList<CustomObjectSearchResponseResponseDTO> customObjectList(CustomObjectSearchRequestRequestDTO customObjectSearchRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新建自定义对象实例
     */
    @ApiPath("/dev/open/v1/custom_object/create")
    public Result<CustomObjectCreateResponseResponseDTO> customObjectCreate(CustomObjectCreateRequestRequestDTO customObjectCreateRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 自定义对象实例复制
     */
    @ApiPath("/dev/open/v1/custom_object/copy")
    public Result<CustomObjectCopyResponseResponseDTO> customObjectCopy(CustomObjectCopyRequestRequestDTO customObjectCopyRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 查询对象code对应id
     */
    @ApiPath("/dev/open/v1/object_service/code_to_id")
    public Result<ObjectServiceCodeToIdResponseResponseDTO> objectServiceCodeToId(ObjectServiceCodeToIdRequestRequestDTO objectServiceCodeToIdRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 批量查询对象code对应id
     */
    @ApiPath("/dev/open/v1/object_service/batch_code_to_id")
    public Result<ObjectServiceBatchCodeToIdResponseResponseDTO> objectServiceBatchCodeToId(ObjectServiceBatchCodeToIdRequestRequestDTO objectServiceBatchCodeToIdRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 用户启用
     */
    @ApiPath("/user/open/v1/user/_enable")
    public Result<UpdateFailureListResponseDTO> userEnable(UserIdListRequestDTO userIdListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新增或编辑用户
     */
    @ApiPath("/user/open/v1/user/_doimport")
    public Result userDoimport(UserImportRequestDTO userImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 用户停用
     */
    @ApiPath("/user/open/v1/user/_disable")
    public Result<UpdateFailureListResponseDTO> userDisable(UserIdListRequestDTO userIdListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 角色列表
     */
    @ApiPath("/user/open/v1/role/_list")
    public ResultList<RoleListResponseDTO> roleList(RoleListRequestDTO roleListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * SOP任务详情
     */
    @ApiPath("/sop/open/v1/sop_task/_detail")
    public Result<SopTaskDetailResponseDTO> sopTaskDetail(SopTaskDetailRequestDTO sopTaskDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * SOP任务记录列表
     */
    @ApiPath("/sop/open/v1/sop_task_record/_list")
    public ResultList<SopTaskExecRecordResponseDTO> sopTaskRecordList(SopTaskRecordRequestDTO sopTaskRecordRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工作日历导入
     */
    @ApiPath("/workercalendar/open/v1//worker_calendar_shift/_doimport")
    public Result<Void> workerCalendarShiftDoimport(WorkerCalendarShiftImportRequestDTO workerCalendarShiftImportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工作日历导出
     */
    @ApiPath("/workercalendar/open/v1//worker_calendar_shift/_export")
    public void workerCalendarShiftExport(WorkerCalendarShiftExportRequestDTO workerCalendarShiftExportRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 正向追溯关系查询
     */
    @ApiPath("/trace/open/v1/trace/trace_relationship/inventory/_search_forward_relationship")
    public Result<List<ForwardTraceRelationshipResponseDTO>> traceTraceRelationshipInventorySearchForwardRelationship(ForwardTraceRelationshipSearchRequestDTO forwardTraceRelationshipSearchRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 新建补充追溯关系
     */
    @ApiPath("/trace/open/v1/trace/trace_relationship/inventory/supply/_create")
    public Result<Object> traceTraceRelationshipInventorySupplyCreate(InventorySupplyRelationshipCreateRequestDTO inventorySupplyRelationshipCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 删除补充追溯关系
     */
    @ApiPath("/trace/open/v1/trace/trace_relationship/inventory/supply/_delete")
    public Result<Object> traceTraceRelationshipInventorySupplyDelete(InventorySupplyRelationshipDeleteRequestDTO inventorySupplyRelationshipDeleteRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 分页查询补充追溯关系
     */
    @ApiPath("/trace/open/v1/trace/trace_relationship/inventory/supply/_list")
    public Result<PageResDTO<InventorySupplyRelationshipResponseDTO>> traceTraceRelationshipInventorySupplyList(InventorySupplyRelationshipListRequestDTO inventorySupplyRelationshipListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 计划订单详情
     */
    @ApiPath("/plo/open/v1/plan_order/_detail")
    public Result<PlanOrderFullDetailResponseDTO> planOrderDetail(PlanOrderInfoRequestRequestDTO planOrderInfoRequestRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 计划订单编辑修改
     */
    @ApiPath("/plo/open/v1/plan_order/_update")
    public Result<Object> planOrderUpdate(PlanOrderCreateRequestDTO planOrderCreateRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 计划订单创建
     */
    @ApiPath("/plo/open/v1/plan_order/_doImport")
    public Result<ExcelImportResult> planOrderDoImport(PlanOrderImportRequestDTO planOrderImportRequestDTO){
        throw new UnsupportedOperationException();
    }
}

