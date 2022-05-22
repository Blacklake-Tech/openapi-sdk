package tech.blacklake.dev.openapi.sdk.api;

import java.util.*;
import tech.blacklake.dev.openapi.sdk.api.req.*;
import tech.blacklake.dev.openapi.sdk.api.res.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.annotation.ApiPath;

public class TemplateController {
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
     * 物料清单详情
     */
    @ApiPath("/med/open/v1/bom/get")
    public Result<BomDetailResponseDTO> bomGet(BomDetailRequestDTO bomDetailRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单批量启停用
     */
    @ApiPath("/med/open/v1/bom/_bulk_update_status")
    public Result<BomBulkUpdateStatusResponseDTO> bomBulkUpdateStatus(BomBulkUpdateStatusRequestDTO bomBulkUpdateStatusRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单新增或更新
     */
    @ApiPath("/med/open/v1/bom/create_or_update")
    public Result<BomResponseDTO> bomCreateOrUpdate(BomRequestDTO bomRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 物料清单列表
     */
    @ApiPath("/med/open/v1/bom/_list")
    public ResultList<BomListResponseDTO> bomList(BomListRequestDTO bomListRequestDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工序定义新增或更新
     */
    @ApiPath("/med/open/v1/process/create_or_update")
    public Result<Object> processCreateOrUpdate(ProcessDTO processDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工艺路线新增或更新
     */
    @ApiPath("/med/open/v1/process_route/create_or_update")
    public Result<Object> processRouteCreateOrUpdate(ProcessRouteDTO processRouteDTO){
        throw new UnsupportedOperationException();
    }

    /**
     * 工艺路线启用或停用
     */
    @ApiPath("/med/open/v1/process_route/_update_status")
    public Result<BulkOperationResponseDTO> processRouteUpdateStatus(ProcessRouteStatusRequestRequestDTO processRouteStatusRequestRequestDTO){
        throw new UnsupportedOperationException();
    }
}

