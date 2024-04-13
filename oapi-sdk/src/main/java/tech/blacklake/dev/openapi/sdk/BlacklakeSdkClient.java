package tech.blacklake.dev.openapi.sdk;

import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
import tech.blacklake.dev.inventory.open.*;
import tech.blacklake.dev.material.domain.openapi.batch.MaterialBatchNoOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialAttributeOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialCategoryOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialOpenV2Api;
import tech.blacklake.dev.material.domain.openapi.storage.StorageAreaOpenApi;
import tech.blacklake.dev.material.domain.openapi.storage.StorageLocationOpenApi;
import tech.blacklake.dev.material.domain.openapi.storage.StorageWarehouseOpenApi;
import tech.blacklake.dev.material.domain.openapi.unit.UnitOpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v1.AlternativePlanOpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v1.BomOpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v1.ProcessOpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v1.ProcessRouteOpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v2.AlternativePlanV2OpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v2.BomV2OpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v2.ProcessRouteV2OpenApi;
import tech.blacklake.dev.med.producedefine.openapi.v2.ProcessV2OpenApi;
import tech.blacklake.dev.med.workorder.openapi.v2.ProcessPlanV2OpenApi;
import tech.blacklake.dev.med.workorder.openapi.v2.WorkOrderV2OpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.feed.FeedOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.feed.FeedRecordOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.feed.FeedRecordOpenApiV2;
import tech.blacklake.dev.mfg.domain.core.openapi.feedretract.FeedRetractOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.feedretract.FeedRetractRecordOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.producetask.ProduceTaskOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.producetask.ProduceTaskOpenApiV2;
import tech.blacklake.dev.mfg.domain.core.openapi.progressreport.ProgressReportOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.progressreport.ProgressReportOpenApiV2;
import tech.blacklake.dev.mfg.domain.core.openapi.rework.ReworkOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.rework.ReworkRecordOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.scrap.ScrapOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.scrap.ScrapRecordOpenApi;
import tech.blacklake.dev.mfg.domain.core.openapi.trace.ProduceTraceOpenApi;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.constants.enums.BaseUrlEnum;
import tech.blacklake.dev.quality.api.open.def.checkitem.QcCheckItemCategoryOpenApi;
import tech.blacklake.dev.quality.api.open.def.checkitem.QcCheckItemOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcConfigOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcDefectRankOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcDefectReasonOpenApi;
import tech.blacklake.dev.quality.api.open.domain.QcMaterialOpenApi;
import tech.blacklake.dev.quality.api.open.domain.QcTaskOpenApi;

public class BlacklakeSdkClient {

    private Config config;

    public File4CustomObjectOpenApi file4CustomObjectOpenApi;
    public QcCheckItemCategoryOpenApi qcCheckItemCategoryOpenApi;
    public QcCheckItemOpenApi qcCheckItemOpenApi;
    public QcConfigOpenApi qcConfigOpenApi;
    public QcDefectRankOpenApi qcDefectRankOpenApi;
    public QcDefectReasonOpenApi qcDefectReasonOpenApi;
    public QcMaterialOpenApi qcMaterialOpenApi;
    public QcTaskOpenApi qcTaskOpenApi;
    public AmountAdjustOpenApi amountAdjustOpenApi;
    public AttributeAdjustOpenApi attributeAdjustOpenApi;
    public InboundOrderOpenApi inboundOrderOpenApi;
    public InboundOrderOpenV2Api inboundOrderOpenV2Api;
    public InventoryConversionOpenApi inventoryConversionOpenApi;
    public InventoryCountingOpenApi inventoryCountingOpenApi;
    public LabelOpenApi labelOpenApi;
    public OpenInventoryMapApi openInventoryMapApi;
    public OpenMaterialContainApi openMaterialContainApi;
    public OpenMaterialInventoryApi openMaterialInventoryApi;
    public OutboundOrderExecuteOpenApi outboundOrderExecuteOpenApi;
    public OutboundOrderOpenApi outboundOrderOpenApi;
    public OutboundOrderOpenV2Api outboundOrderOpenV2Api;
    public TransferOrderOpenApi transferOrderOpenApi;
    public TransferOrderOpenV2Api transferOrderOpenV2Api;

    public MaterialBatchNoOpenApi materialBatchNoOpenApi;
    public MaterialOpenV2Api materialOpenV2Api;
    public MaterialOpenApi materialOpenApi;
    public MaterialCategoryOpenApi materialCategoryOpenApi;
    public MaterialAttributeOpenApi materialAttributeOpenApi;
    public UnitOpenApi unitOpenApi;
    public StorageWarehouseOpenApi storageWarehouseOpenApi;
    public StorageLocationOpenApi storageLocationOpenApi;
    public StorageAreaOpenApi storageAreaOpenApi;

    public AlternativePlanOpenApi alternativePlanOpenApi;
    public BomOpenApi bomOpenApi;
    public ProcessOpenApi processOpenApi;
    public ProcessRouteOpenApi processRouteOpenApi;
    public AlternativePlanV2OpenApi alternativePlanV2OpenApi;
    public BomV2OpenApi bomV2OpenApi;
    public ProcessRouteV2OpenApi processRouteV2OpenApi;
    public ProcessV2OpenApi processV2OpenApi;
    public ProcessPlanV2OpenApi processPlanV2OpenApi;
    public WorkOrderV2OpenApi workOrderV2OpenApi;

    public FeedOpenApi feedOpenApi;
    public FeedRecordOpenApi feedRecordOpenApi;
    public FeedRecordOpenApiV2 feedRecordOpenApiV2;
    public FeedRetractOpenApi feedRetractOpenApi;
    public FeedRetractRecordOpenApi feedRetractRecordOpenApi;
    public ProduceTaskOpenApi produceTaskOpenApi;
    public ProduceTaskOpenApiV2 produceTaskOpenApiV2;
    public ProgressReportOpenApi progressReportOpenApi;
    public ProgressReportOpenApiV2 progressReportOpenApiV2;
    public ReworkOpenApi reworkOpenApi;
    public ReworkRecordOpenApi reworkRecordOpenApi;
    public ScrapOpenApi scrapOpenApi;
    public ScrapRecordOpenApi scrapRecordOpenApi;
    public ProduceTraceOpenApi produceTraceOpenApi;

    public static Builder newBuilder(String appKey, String appSecret) {
        return new Builder(appKey, appSecret);
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public static final class Builder {
        private Config config = new Config();

        public Builder(String appKey, String appSecret) {
            config.setAppKey(appKey);
            config.setAppSecret(appSecret);
            config.setAppTypeEnum(AppTypeEnum.SELF_BUILT);
            config.setBaseUrl(BaseUrlEnum.BLACKLAKE_OPENAPI_ALI_PROD.getUrl());
            config.setLogReqAtDebug(false);
        }

        public Builder appType(AppTypeEnum appTypeEnum) {
            config.setAppTypeEnum(appTypeEnum);
            return this;
        }

        public Builder openBaseUrl(String baseUrl) {
            config.setBaseUrl(baseUrl);
            return this;
        }

        public Builder openBaseUrl(BaseUrlEnum baseUrl) {
            config.setBaseUrl(baseUrl.getUrl());
            return this;
        }

        public Builder logReqAtDebug(boolean logReqRespInfoAtDebugLevel) {
            config.setLogReqAtDebug(logReqRespInfoAtDebugLevel);
            return this;
        }

        public BlacklakeSdkClient build() {
            BlacklakeSdkClient client = new BlacklakeSdkClient();
            client.setConfig(config);
            return client;
        }
    }
}
