package tech.blacklake.dev.openapi.sdk.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
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
import tech.blacklake.dev.openapi.sdk.BlacklakeSdkClient;
import tech.blacklake.dev.openapi.sdk.cache.LocalCache;
import tech.blacklake.dev.openapi.sdk.client.OkhttpOpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.OpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.decoder.ClientResDecoder;
import tech.blacklake.dev.openapi.sdk.client.interceptor.ClientReqInterceptor;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.event.ServletAdapter;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;
import tech.blacklake.dev.quality.api.open.def.checkitem.QcCheckItemCategoryOpenApi;
import tech.blacklake.dev.quality.api.open.def.checkitem.QcCheckItemOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcConfigOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcDefectRankOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcDefectReasonOpenApi;
import tech.blacklake.dev.quality.api.open.domain.QcMaterialOpenApi;
import tech.blacklake.dev.quality.api.open.domain.QcTaskOpenApi;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.*;

@Configuration
@EnableConfigurationProperties(Config.class)
public class OpenapiSdkAutoConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public ClientReqInterceptor clientInterceptor(Config config, TokenManager tokenManager) {
        return new ClientReqInterceptor(tokenManager, config);
    }

    @Primary
    @Bean
    public ClientResDecoder clientResDecoder(Config config, TokenManager tokenManager) {
        return new ClientResDecoder(tokenManager, config);
    }

    @Bean
    public BlacklakeSdkClient blacklakeSdkClient(Config config) {
        BlacklakeSdkClient blacklakeSdkClient = BlacklakeSdkClient.newBuilder(config.getAppKey(),
                config.getAppSecret())
            .appType(AppTypeEnum.SELF_BUILT)
            .openBaseUrl(config.getBaseUrl())
            .logReqAtDebug(true)
            .build();
        blacklakeSdkClient.file4CustomObjectOpenApi = file4CustomObjectOpenApi(config);
        /****quality begin********************/
        blacklakeSdkClient.qcCheckItemCategoryOpenApi = qcCheckItemCategoryOpenApi(config);
        blacklakeSdkClient.qcCheckItemOpenApi = qcCheckItemOpenApi(config);
        blacklakeSdkClient.qcConfigOpenApi = qcConfigOpenApi(config);
        blacklakeSdkClient.qcDefectRankOpenApi = qcDefectRankOpenApi(config);
        blacklakeSdkClient.qcDefectReasonOpenApi = qcDefectReasonOpenApi(config);
        blacklakeSdkClient.qcMaterialOpenApi = qcMaterialOpenApi(config);
        blacklakeSdkClient.qcTaskOpenApi = qcTaskOpenApi(config);
        /****quality end********************/
        /****inventory begin********************/
        blacklakeSdkClient.amountAdjustOpenApi = amountAdjustOpenApi(config);
        blacklakeSdkClient.attributeAdjustOpenApi = attributeAdjustOpenApi(config);
        blacklakeSdkClient.inboundOrderOpenApi = inboundOrderOpenApi(config);
        blacklakeSdkClient.inboundOrderOpenV2Api = inboundOrderOpenV2Api(config);
        blacklakeSdkClient.inventoryConversionOpenApi = inventoryConversionOpenApi(config);
        blacklakeSdkClient.inventoryCountingOpenApi = inventoryCountingOpenApi(config);
        blacklakeSdkClient.labelOpenApi = labelOpenApi(config);
        blacklakeSdkClient.openInventoryMapApi = openInventoryMapApi(config);
        blacklakeSdkClient.openMaterialContainApi = openMaterialContainApi(config);
        blacklakeSdkClient.openMaterialInventoryApi = openMaterialInventoryApi(config);
        blacklakeSdkClient.outboundOrderExecuteOpenApi = outboundOrderExecuteOpenApi(config);
        blacklakeSdkClient.outboundOrderOpenApi = outboundOrderOpenApi(config);
        blacklakeSdkClient.outboundOrderOpenV2Api = outboundOrderOpenV2Api(config);
        blacklakeSdkClient.transferOrderOpenApi = transferOrderOpenApi(config);
        blacklakeSdkClient.transferOrderOpenV2Api = transferOrderOpenV2Api(config);
        /****inventory begin********************/
        blacklakeSdkClient.materialBatchNoOpenApi = materialBatchNoOpenApi(config);
        blacklakeSdkClient.materialOpenApi = materialOpenApi(config);
        blacklakeSdkClient.materialOpenV2Api = materialOpenV2Api(config);
        blacklakeSdkClient.materialCategoryOpenApi = materialCategoryOpenApi(config);
        blacklakeSdkClient.materialAttributeOpenApi = materialAttributeOpenApi(config);
        blacklakeSdkClient.unitOpenApi = unitOpenApi(config);
        blacklakeSdkClient.storageWarehouseOpenApi = storageWarehouseOpenApi(config);
        blacklakeSdkClient.storageLocationOpenApi = storageLocationOpenApi(config);
        blacklakeSdkClient.storageAreaOpenApi = storageAreaOpenApi(config);

        /**** 生产 begin********************/
        blacklakeSdkClient.alternativePlanOpenApi = alternativePlanOpenApi(config);
        blacklakeSdkClient.bomOpenApi = bomOpenApi(config);
        blacklakeSdkClient.processOpenApi = processOpenApi(config);
        blacklakeSdkClient.processRouteOpenApi = processRouteOpenApi(config);
        blacklakeSdkClient.alternativePlanV2OpenApi = alternativePlanV2OpenApi(config);
        blacklakeSdkClient.bomV2OpenApi = bomV2OpenApi(config);
        blacklakeSdkClient.processRouteV2OpenApi = processRouteV2OpenApi(config);
        blacklakeSdkClient.processV2OpenApi = processV2OpenApi(config);
        blacklakeSdkClient.processPlanV2OpenApi = processPlanV2OpenApi(config);
        blacklakeSdkClient.workOrderV2OpenApi = workOrderV2OpenApi(config);

        blacklakeSdkClient.feedOpenApi = feedOpenApi(config);
        blacklakeSdkClient.feedRecordOpenApi = feedRecordOpenApi(config);
        blacklakeSdkClient.feedRecordOpenApiV2 = feedRecordOpenApiV2(config);
        blacklakeSdkClient.feedRetractOpenApi = feedRetractOpenApi(config);
        blacklakeSdkClient.feedRetractRecordOpenApi = feedRetractRecordOpenApi(config);
        blacklakeSdkClient.produceTaskOpenApi = produceTaskOpenApi(config);
        blacklakeSdkClient.produceTaskOpenApiV2 = produceTaskOpenApiV2(config);
        blacklakeSdkClient.progressReportOpenApi = progressReportOpenApi(config);
        blacklakeSdkClient.progressReportOpenApiV2 = progressReportOpenApiV2(config);
        blacklakeSdkClient.reworkOpenApi = reworkOpenApi(config);
        blacklakeSdkClient.reworkRecordOpenApi = reworkRecordOpenApi(config);
        blacklakeSdkClient.scrapOpenApi = scrapOpenApi(config);
        blacklakeSdkClient.scrapRecordOpenApi = scrapRecordOpenApi(config);
        blacklakeSdkClient.produceTraceOpenApi = produceTraceOpenApi(config);
        /**** 生产 end********************/

        return blacklakeSdkClient;
    }

    @Bean
    public TokenManager tokenManager(OkhttpOpenapiClient okhttpOpenapiClient, Config config) {
        return new TokenManager(LocalCache.getInstance(), okhttpOpenapiClient, config);
    }

    @Bean
    public OpenapiClient openapiClient(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OpenapiClient.class, "openapiClient")
            .url(config.getBaseUrl())
            .build();
    }

    @Bean
    public OkhttpOpenapiClient okhttpOpenapiClient(Config config) {
        return new OkhttpOpenapiClient(config);
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default();
    }

    @Bean
    public ServletAdapter servletAdapter() {
        return new ServletAdapter();
    }

    private FeedOpenApi feedOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(FeedOpenApi.class, "feedOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private FeedRecordOpenApi feedRecordOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(FeedRecordOpenApi.class, "feedRecordOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private FeedRecordOpenApiV2 feedRecordOpenApiV2(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(FeedRecordOpenApiV2.class, "feedRecordOpenApiV2")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private FeedRetractOpenApi feedRetractOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(FeedRetractOpenApi.class, "feedRetractOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private FeedRetractRecordOpenApi feedRetractRecordOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(FeedRetractRecordOpenApi.class, "feedRetractRecordOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ProduceTaskOpenApi produceTaskOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProduceTaskOpenApi.class, "produceTaskOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ProduceTaskOpenApiV2 produceTaskOpenApiV2(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProduceTaskOpenApiV2.class, "produceTaskOpenApiV2")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ProgressReportOpenApi progressReportOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProgressReportOpenApi.class, "progressReportOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ProgressReportOpenApiV2 progressReportOpenApiV2(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProgressReportOpenApiV2.class, "progressReportOpenApiV2")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ReworkOpenApi reworkOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ReworkOpenApi.class, "reworkOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ReworkRecordOpenApi reworkRecordOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ReworkRecordOpenApi.class, "reworkRecordOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ScrapOpenApi scrapOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ScrapOpenApi.class, "scrapOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ScrapRecordOpenApi scrapRecordOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ScrapRecordOpenApi.class, "scrapRecordOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private ProduceTraceOpenApi produceTraceOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProduceTraceOpenApi.class, "produceTraceOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MFG_PREFIX)
            .build();
    }

    private AlternativePlanOpenApi alternativePlanOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(AlternativePlanOpenApi.class, "alternativePlanOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private BomOpenApi bomOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(BomOpenApi.class, "bomOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private ProcessOpenApi processOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProcessOpenApi.class, "processOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private ProcessRouteOpenApi processRouteOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProcessRouteOpenApi.class, "processRouteOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private AlternativePlanV2OpenApi alternativePlanV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(AlternativePlanV2OpenApi.class, "alternativePlanV2OpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private BomV2OpenApi bomV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(BomV2OpenApi.class, "bomV2OpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private ProcessRouteV2OpenApi processRouteV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProcessRouteV2OpenApi.class, "processRouteV2OpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private ProcessV2OpenApi processV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProcessV2OpenApi.class, "processV2OpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private ProcessPlanV2OpenApi processPlanV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(ProcessPlanV2OpenApi.class, "processPlanV2OpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private WorkOrderV2OpenApi workOrderV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(WorkOrderV2OpenApi.class, "workOrderV2OpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
            .build();
    }

    private File4CustomObjectOpenApi file4CustomObjectOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(File4CustomObjectOpenApi.class, "file4CustomObjectOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + HOLYFILE_PREFIX)
            .build();
    }

    private QcCheckItemCategoryOpenApi qcCheckItemCategoryOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcCheckItemCategoryOpenApi.class, "qcCheckItemCategoryOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcCheckItemOpenApi qcCheckItemOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcCheckItemOpenApi.class, "qcCheckItemOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcConfigOpenApi qcConfigOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcConfigOpenApi.class, "qcConfigOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcDefectRankOpenApi qcDefectRankOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcDefectRankOpenApi.class, "qcDefectRankOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcDefectReasonOpenApi qcDefectReasonOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcDefectReasonOpenApi.class, "qcDefectReasonOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcMaterialOpenApi qcMaterialOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcMaterialOpenApi.class, "qcMaterialOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcTaskOpenApi qcTaskOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(QcTaskOpenApi.class, "qcTaskOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private AmountAdjustOpenApi amountAdjustOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(AmountAdjustOpenApi.class, "file4CustomObjectOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private AttributeAdjustOpenApi attributeAdjustOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(AttributeAdjustOpenApi.class, "attributeAdjustOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private InboundOrderOpenApi inboundOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(InboundOrderOpenApi.class, "inboundOrderOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private InboundOrderOpenV2Api inboundOrderOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(InboundOrderOpenV2Api.class, "inboundOrderOpenV2Api")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private InventoryConversionOpenApi inventoryConversionOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(InventoryConversionOpenApi.class, "inventoryConversionOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private InventoryCountingOpenApi inventoryCountingOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(InventoryCountingOpenApi.class, "inventoryCountingOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private LabelOpenApi labelOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(LabelOpenApi.class, "labelOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private OpenInventoryMapApi openInventoryMapApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OpenInventoryMapApi.class, "openInventoryMapApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private OpenMaterialContainApi openMaterialContainApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OpenMaterialContainApi.class, "openMaterialContainApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private OpenMaterialInventoryApi openMaterialInventoryApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OpenMaterialInventoryApi.class, "openMaterialInventoryApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private OutboundOrderExecuteOpenApi outboundOrderExecuteOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OutboundOrderExecuteOpenApi.class, "outboundOrderExecuteOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private OutboundOrderOpenApi outboundOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OutboundOrderOpenApi.class, "outboundOrderOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private OutboundOrderOpenV2Api outboundOrderOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(OutboundOrderOpenV2Api.class, "outboundOrderOpenV2Api")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private TransferOrderOpenApi transferOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(TransferOrderOpenApi.class, "transferOrderOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private TransferOrderOpenV2Api transferOrderOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(TransferOrderOpenV2Api.class, "transferOrderOpenV2Api")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private MaterialBatchNoOpenApi materialBatchNoOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(MaterialBatchNoOpenApi.class, "materialBatchNoOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private MaterialOpenV2Api materialOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(MaterialOpenV2Api.class, "materialOpenV2Api")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private MaterialOpenApi materialOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(MaterialOpenApi.class, "materialOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private MaterialCategoryOpenApi materialCategoryOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(MaterialCategoryOpenApi.class, "materialCategoryOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private MaterialAttributeOpenApi materialAttributeOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(MaterialAttributeOpenApi.class, "materialAttributeOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private UnitOpenApi unitOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(UnitOpenApi.class, "unitOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private StorageWarehouseOpenApi storageWarehouseOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(StorageWarehouseOpenApi.class, "storageWarehouseOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private StorageLocationOpenApi storageLocationOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(StorageLocationOpenApi.class, "storageLocationOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private StorageAreaOpenApi storageAreaOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
            .forType(StorageAreaOpenApi.class, "storageAreaOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
}
