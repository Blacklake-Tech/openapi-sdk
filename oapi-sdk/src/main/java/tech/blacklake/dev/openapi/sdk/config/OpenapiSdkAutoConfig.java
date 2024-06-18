package tech.blacklake.dev.openapi.sdk.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import tech.blacklake.dev.customobject.open.CustomObjectOpenApi;
import tech.blacklake.dev.customobject.open.ObjectServiceOpenApi;
import tech.blacklake.dev.customobject.open.v2.CustomObjectinstanceOpenApi;
import tech.blacklake.dev.e.report.open.api.DataSetInfoOpenApi;
import tech.blacklake.dev.e.report.open.api.EReportOpenApi;
import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
import tech.blacklake.dev.inventory.open.*;
import tech.blacklake.dev.log.open.api.LogOpenApi;
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
import tech.blacklake.dev.med.workorder.openapi.v1.PickOrderOpenApi;
import tech.blacklake.dev.med.workorder.openapi.v1.ReplenishOrderOpenApi;
import tech.blacklake.dev.med.workorder.openapi.v1.RetractOrderOpenApi;
import tech.blacklake.dev.med.workorder.openapi.v2.ProcessPlanV2OpenApi;
import tech.blacklake.dev.med.workorder.openapi.v2.WorkOrderV2OpenApi;
import tech.blacklake.dev.metadata.openapi.api.CustomFieldOpenApi;
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
import tech.blacklake.dev.mfg.domain.plugin.openapi.FlowCardOpenApi;
import tech.blacklake.dev.openapi.sdk.BlacklakeSdkClient;
import tech.blacklake.dev.openapi.sdk.cache.LocalCache;
import tech.blacklake.dev.openapi.sdk.client.OkhttpOpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.OpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.decoder.ClientResDecoder;
import tech.blacklake.dev.openapi.sdk.client.interceptor.ClientReqInterceptor;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.event.ServletAdapter;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;
import tech.blacklake.dev.order.open.*;
import tech.blacklake.dev.plo.openapi.PlanOrderOpenApi;
import tech.blacklake.dev.quality.api.open.def.checkitem.QcCheckItemCategoryOpenApi;
import tech.blacklake.dev.quality.api.open.def.checkitem.QcCheckItemOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcConfigOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcDefectRankOpenApi;
import tech.blacklake.dev.quality.api.open.def.qcconfig.QcDefectReasonOpenApi;
import tech.blacklake.dev.quality.api.open.domain.QcMaterialOpenApi;
import tech.blacklake.dev.quality.api.open.domain.QcTaskOpenApi;
import tech.blacklake.dev.report.domain.openapi.api.ReportOpenApi;
import tech.blacklake.dev.report.domain.openapi.api.ReportOpenV2Api;
import tech.blacklake.dev.report.domain.openapi.api.ReportOpenV3Api;
import tech.blacklake.dev.resource.openapi.MaintenanceTaskOpenApi;
import tech.blacklake.dev.resource.openapi.RepairTaskOpenApi;
import tech.blacklake.dev.resource.openapi.ResourceLocationOpenApi;
import tech.blacklake.dev.resource.openapi.ResourceOpenApi;
import tech.blacklake.dev.resource.openapi.ResourceOpenV2Api;
import tech.blacklake.dev.resource.openapi.ResourceRecordOpenApi;
import tech.blacklake.dev.sop.domain.openapi.SopOpenV2OpenApi;
import tech.blacklake.dev.sop.domain.openapi.SopTaskOpenV2OpenApi;
import tech.blacklake.dev.supplychain.open.v1.*;
import tech.blacklake.dev.supplychain.open.v2.OpenCusOutsourceSendMaterialV2Api;
import tech.blacklake.dev.supplychain.open.v2.OpenPurchaseAuditV2Api;
import tech.blacklake.dev.supplychain.open.v2.OpenReturnAuditV2Api;
import tech.blacklake.dev.user.open.ExceptionEventOpenApi;
import tech.blacklake.dev.user.open.ExceptionEventOpenApiV2;
import tech.blacklake.dev.user.open.LoginOpenApi;
import tech.blacklake.dev.user.open.RoleOpenApi;
import tech.blacklake.dev.user.open.UserOpenApi;

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
        BlacklakeSdkClient blacklakeSdkClient = BlacklakeSdkClient.newBuilder(config.getAppKey(), config.getAppSecret())
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
        // med
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
        blacklakeSdkClient.pickOrderOpenApi = pickOrderOpenApi(config);
        blacklakeSdkClient.replenishOrderOpenApi = replenishOrderOpenApi(config);
        blacklakeSdkClient.retractOrderOpenApi = retractOrderOpenApi(config);
        // mfg
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
        blacklakeSdkClient.flowCardOpenApi = flowCardOpenApi(config);
        // sop
        blacklakeSdkClient.sopOpenV2OpenApi = sopOpenV2OpenApi(config);
        blacklakeSdkClient.sopTaskOpenV2OpenApi = sopTaskOpenV2OpenApi(config);
        // plo
        blacklakeSdkClient.planOrderOpenApi = planOrderOpenApi(config);
        // resource
        blacklakeSdkClient.maintenanceTaskOpenApi = maintenanceTaskOpenApi(config);
        blacklakeSdkClient.repairTaskOpenApi = repairTaskOpenApi(config);
        blacklakeSdkClient.resourceLocationOpenApi = resourceLocationOpenApi(config);
        blacklakeSdkClient.resourceOpenApi = resourceOpenApi(config);
        blacklakeSdkClient.resourceOpenV2Api = resourceOpenV2Api(config);
        blacklakeSdkClient.resourceRecordOpenApi = resourceRecordOpenApi(config);
        /**** 生产 end********************/
        // log
        blacklakeSdkClient.logOpenApi = logOpenApi(config);
        // metadata
        blacklakeSdkClient.customFieldOpenApi = customFieldOpenApi(config);
        // e-report
        blacklakeSdkClient.dataSetInfoOpenApi = dataSetInfoOpenApi(config);
        blacklakeSdkClient.eReportOpenApi = eReportOpenApi(config);
        // report
        blacklakeSdkClient.reportOpenApi = reportOpenApi(config);
        blacklakeSdkClient.reportOpenV2Api = reportOpenV2Api(config);
        blacklakeSdkClient.reportOpenV3Api = reportOpenV3Api(config);
        // custom-object-domain
        blacklakeSdkClient.customObjectOpenApi = customObjectOpenApi(config);
        blacklakeSdkClient.objectServiceOpenApi = objectServiceOpenApi(config);
        blacklakeSdkClient.customObjectinstanceOpenApi = customObjectinstanceOpenApi(config);

        blacklakeSdkClient.openCustomerApi = customerOpenApi(config);
        blacklakeSdkClient.openCustomerV2Api = openCustomerV2Api(config);
        blacklakeSdkClient.openDeliveryAppointmentApi = openDeliveryAppointmentApi(config);
        blacklakeSdkClient.openDeliveryAppointmentV2Api = openDeliveryAppointmentV2Api(config);
        blacklakeSdkClient.openDeliveryScheduleApi = openDeliveryScheduleApi(config);
        blacklakeSdkClient.openDeliveryScheduleNoteApi = openDeliveryScheduleNoteApi(config);
        blacklakeSdkClient.openDeliveryScheduleNoteV2Api = openDeliveryScheduleNoteV2Api(config);
        blacklakeSdkClient.openDeliveryScheduleV2Api = openDeliveryScheduleV2Api(config);
        blacklakeSdkClient.openOrderChangeNoteApi = openOrderChangeNoteApi(config);
        blacklakeSdkClient.openOrderChangeNoteV2Api = openOrderChangeNoteV2Api(config);
        blacklakeSdkClient.openOutsourceSendMaterialApi = openOutsourceSendMaterialApi(config);
        blacklakeSdkClient.openOutsourceSendMaterialV2APi = openOutsourceSendMaterialV2APi(config);
        blacklakeSdkClient.openPlanFeedbackApi = openPlanFeedbackApi(config);
        blacklakeSdkClient.openPurchaseOrderApi = openPurchaseOrderApi(config);
        blacklakeSdkClient.openPurchaseOrderV2Api = openPurchaseOrderV2Api(config);
        blacklakeSdkClient.openPurchasePlanApi = openPurchasePlanApi(config);
        blacklakeSdkClient.openPurchaseRequisitionsApi = openPurchaseRequisitionsApi(config);
        blacklakeSdkClient.openPurchaseRequisitionsV2Api = openPurchaseRequisitionsV2Api(config);
        blacklakeSdkClient.openPurchaseReturnOrderApi = openPurchaseReturnOrderApi(config);
        blacklakeSdkClient.openPurchaseReturnOrderV2Api = openPurchaseReturnOrderV2Api(config);
        blacklakeSdkClient.openReceiveNoteApi = openReceiveNoteApi(config);
        blacklakeSdkClient.openReceiveNoteV2Api = openReceiveNoteV2Api(config);
        blacklakeSdkClient.openReceivingRecordApi = openReceivingRecordApi(config);
        blacklakeSdkClient.openSalesOrderApi = openSalesOrderApi(config);
        blacklakeSdkClient.openSalesOrderReturnApi = openSalesOrderReturnApi(config);
        blacklakeSdkClient.openSalesOrderReturnV2Api = openSalesOrderReturnV2Api(config);
        blacklakeSdkClient.openSalesOrderV2Api = openSalesOrderV2Api(config);
        blacklakeSdkClient.openShipmentNoteApi = openShipmentNoteApi(config);
        blacklakeSdkClient.openShipmentNoteV2Api = openShipmentNoteV2Api(config);
        blacklakeSdkClient.openShipmentRecordApi = openShipmentRecordApi(config);
        blacklakeSdkClient.openShipmentRecordV2Api = openShipmentRecordV2Api(config);
        blacklakeSdkClient.openSourceListApi = openSourceListApi(config);
        blacklakeSdkClient.openSourceListV2Api = openSourceListV2Api(config);
        blacklakeSdkClient.openSupplierApi = openSupplierApi(config);
        blacklakeSdkClient.openSupplierV2Api = openSupplierV2Api(config);
        blacklakeSdkClient.openWaitingReceivingListApi = openWaitingReceivingListApi(config);
        blacklakeSdkClient.openWaitingReceivingListV2Api = openWaitingReceivingListV2Api(config);
        blacklakeSdkClient.openCusOutsourceSendMaterialApi = openCusOutsourceSendMaterialApi(config);
        blacklakeSdkClient.openCustomerDeliveryScheduleNoteApi = openCustomerDeliveryScheduleNoteApi(config);
        blacklakeSdkClient.openOutsourceReturnMaterialApi = openOutsourceReturnMaterialApi(config);
        blacklakeSdkClient.openPurchaseAuditApi = openPurchaseAuditApi(config);
        blacklakeSdkClient.openReturnAuditApi = openReturnAuditApi(config);
        blacklakeSdkClient.orderChangeApplicationOpenApi = orderChangeApplicationOpenApi(config);
        blacklakeSdkClient.openCusOutsourceSendMaterialV2Api = openCusOutsourceSendMaterialV2Api(config);
        blacklakeSdkClient.openPurchaseAuditV2Api = openPurchaseAuditV2Api(config);
        blacklakeSdkClient.openReturnAuditV2Api = openReturnAuditV2Api(config);
        /**** user-domain********************/
        blacklakeSdkClient.userOpenApi = userOpenApi(config);
        blacklakeSdkClient.exceptionEventOpenApi = exceptionEventOpenApi(config);
        blacklakeSdkClient.exceptionEventOpenApiV2 = exceptionEventOpenApiV2(config);
        blacklakeSdkClient.loginOpenApi = loginOpenApi(config);
        blacklakeSdkClient.roleOpenApi = roleOpenApi(config);
        /**** user-domain end********************/
        return blacklakeSdkClient;
    }

    private CustomObjectinstanceOpenApi customObjectinstanceOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(CustomObjectinstanceOpenApi.class, "customObjectinstanceOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + CUSTOM_OBJECT__PREFIX)
                .build();
    }

    private ObjectServiceOpenApi objectServiceOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ObjectServiceOpenApi.class, "objectServiceOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + CUSTOM_OBJECT__PREFIX)
                .build();
    }

    private CustomObjectOpenApi customObjectOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(CustomObjectOpenApi.class, "customObjectOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + CUSTOM_OBJECT__PREFIX)
                .build();
    }

    private ReportOpenV3Api reportOpenV3Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ReportOpenV3Api.class, "reportOpenV3Api")
                .url(config.getBaseUrl() + ROUTE_URL + REPORT_PREFIX)
                .build();
    }

    private ReportOpenV2Api reportOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ReportOpenV2Api.class, "reportOpenV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + REPORT_PREFIX)
                .build();
    }

    private ReportOpenApi reportOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ReportOpenApi.class, "reportOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + REPORT_PREFIX)
                .build();
    }

    private DataSetInfoOpenApi dataSetInfoOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(DataSetInfoOpenApi.class, "dataSetInfoOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + EREPORT_PREFIX)
                .build();
    }

    private EReportOpenApi eReportOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(EReportOpenApi.class, "eReportOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + EREPORT_PREFIX)
                .build();
    }

    private CustomFieldOpenApi customFieldOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(CustomFieldOpenApi.class, "customFieldOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + METADATA_PREFIX)
                .build();
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

    private LogOpenApi logOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(LogOpenApi.class, "logOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + LOG_PREFIX)
                .build();
    }

    private ResourceRecordOpenApi resourceRecordOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ResourceRecordOpenApi.class, "resourceRecordOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + RESOURCE_PREFIX)
                .build();
    }

    private ResourceOpenV2Api resourceOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ResourceOpenV2Api.class, "resourceOpenV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + RESOURCE_PREFIX)
                .build();
    }

    private ResourceOpenApi resourceOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ResourceOpenApi.class, "resourceOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + RESOURCE_PREFIX)
                .build();
    }

    private ResourceLocationOpenApi resourceLocationOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ResourceLocationOpenApi.class, "resourceLocationOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + RESOURCE_PREFIX)
                .build();
    }

    private RepairTaskOpenApi repairTaskOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(RepairTaskOpenApi.class, "repairTaskOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + RESOURCE_PREFIX)
                .build();
    }

    private MaintenanceTaskOpenApi maintenanceTaskOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(MaintenanceTaskOpenApi.class, "maintenanceTaskOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + RESOURCE_PREFIX)
                .build();
    }

    private PlanOrderOpenApi planOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(PlanOrderOpenApi.class, "planOrderOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + PLO_PREFIX)
                .build();
    }

    private SopOpenV2OpenApi sopOpenV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(SopOpenV2OpenApi.class, "sopOpenV2OpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + SOP_PREFIX)
                .build();
    }

    private SopTaskOpenV2OpenApi sopTaskOpenV2OpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(SopTaskOpenV2OpenApi.class, "sopTaskOpenV2OpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + SOP_PREFIX)
                .build();
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

    private FlowCardOpenApi flowCardOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(FlowCardOpenApi.class, "flowCardOpenApi")
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

    private PickOrderOpenApi pickOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(PickOrderOpenApi.class, "pickOrderOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
                .build();
    }

    private RetractOrderOpenApi retractOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(RetractOrderOpenApi.class, "retractOrderOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + MED_PREFIX)
                .build();
    }

    private ReplenishOrderOpenApi replenishOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ReplenishOrderOpenApi.class, "replenishOrderOpenApi")
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
                .url(config.getBaseUrl() + ROUTE_URL + STORAGE_PREFIX)
                .build();
    }

    private StorageLocationOpenApi storageLocationOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(StorageLocationOpenApi.class, "storageLocationOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + STORAGE_PREFIX)
                .build();
    }

    private StorageAreaOpenApi storageAreaOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(StorageAreaOpenApi.class, "storageAreaOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + STORAGE_PREFIX)
                .build();
    }

    private OpenCustomerApi customerOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenCustomerApi.class, "openCustomerApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenWaitingReceivingListV2Api openWaitingReceivingListV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenWaitingReceivingListV2Api.class, "openWaitingReceivingListV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenWaitingReceivingListApi openWaitingReceivingListApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenWaitingReceivingListApi.class, "openWaitingReceivingListApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSupplierV2Api openSupplierV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSupplierV2Api.class, "openSupplierV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSupplierApi openSupplierApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSupplierApi.class, "openSupplierApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSourceListV2Api openSourceListV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSourceListV2Api.class, "openSourceListV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSourceListApi openSourceListApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSourceListApi.class, "openSourceListApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentRecordV2Api openShipmentRecordV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenShipmentRecordV2Api.class, "openShipmentRecordV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentRecordApi openShipmentRecordApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenShipmentRecordApi.class, "openShipmentRecordApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentNoteV2Api openShipmentNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenShipmentNoteV2Api.class, "openShipmentNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentNoteApi openShipmentNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenShipmentNoteApi.class, "openShipmentNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderV2Api openSalesOrderV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSalesOrderV2Api.class, "openSalesOrderV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderReturnV2Api openSalesOrderReturnV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSalesOrderReturnV2Api.class, "openSalesOrderReturnV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderReturnApi openSalesOrderReturnApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSalesOrderReturnApi.class, "openSalesOrderReturnApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderApi openSalesOrderApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenSalesOrderApi.class, "openSalesOrderApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReceivingRecordApi openReceivingRecordApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenReceivingRecordApi.class, "openReceivingRecordApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReceiveNoteV2Api openReceiveNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenReceiveNoteV2Api.class, "openReceiveNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReceiveNoteApi openReceiveNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenReceiveNoteApi.class, "openReceiveNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseReturnOrderV2Api openPurchaseReturnOrderV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseReturnOrderV2Api.class, "openPurchaseReturnOrderV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseReturnOrderApi openPurchaseReturnOrderApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseReturnOrderApi.class, "openPurchaseReturnOrderApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseRequisitionsV2Api openPurchaseRequisitionsV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseRequisitionsV2Api.class, "openPurchaseRequisitionsV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseRequisitionsApi openPurchaseRequisitionsApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseRequisitionsApi.class, "openPurchaseRequisitionsApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchasePlanApi openPurchasePlanApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchasePlanApi.class, "openPurchasePlanApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseOrderV2Api openPurchaseOrderV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseOrderV2Api.class, "openPurchaseOrderV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseOrderApi openPurchaseOrderApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseOrderApi.class, "openPurchaseOrderApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPlanFeedbackApi openPlanFeedbackApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPlanFeedbackApi.class, "openPlanFeedbackApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOutsourceSendMaterialV2APi openOutsourceSendMaterialV2APi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenOutsourceSendMaterialV2APi.class, "openOutsourceSendMaterialV2APi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOutsourceSendMaterialApi openOutsourceSendMaterialApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenOutsourceSendMaterialApi.class, "openOutsourceSendMaterialApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOrderChangeNoteV2Api openOrderChangeNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenOrderChangeNoteV2Api.class, "openOrderChangeNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOrderChangeNoteApi openOrderChangeNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenOrderChangeNoteApi.class, "openOrderChangeNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleV2Api openDeliveryScheduleV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenDeliveryScheduleV2Api.class, "openDeliveryScheduleV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleNoteV2Api openDeliveryScheduleNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenDeliveryScheduleNoteV2Api.class, "openDeliveryScheduleNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleNoteApi openDeliveryScheduleNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenDeliveryScheduleNoteApi.class, "openDeliveryScheduleNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleApi openDeliveryScheduleApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenDeliveryScheduleApi.class, "openDeliveryScheduleApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryAppointmentV2Api openDeliveryAppointmentV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenDeliveryAppointmentV2Api.class, "openDeliveryAppointmentV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryAppointmentApi openDeliveryAppointmentApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenDeliveryAppointmentApi.class, "openDeliveryAppointmentApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenCustomerV2Api openCustomerV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenCustomerV2Api.class, "openCustomerV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReturnAuditV2Api openReturnAuditV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenReturnAuditV2Api.class, "openReturnAuditV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenCusOutsourceSendMaterialV2Api openCusOutsourceSendMaterialV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenCusOutsourceSendMaterialV2Api.class, "openCusOutsourceSendMaterialV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenPurchaseAuditV2Api openPurchaseAuditV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseAuditV2Api.class, "openPurchaseAuditV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OrderChangeApplicationOpenApi orderChangeApplicationOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OrderChangeApplicationOpenApi.class, "orderChangeApplicationOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenReturnAuditApi openReturnAuditApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenReturnAuditApi.class, "openReturnAuditApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenPurchaseAuditApi openPurchaseAuditApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenPurchaseAuditApi.class, "openPurchaseAuditApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenOutsourceReturnMaterialApi openOutsourceReturnMaterialApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenOutsourceReturnMaterialApi.class, "openOutsourceReturnMaterialApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenCustomerDeliveryScheduleNoteApi openCustomerDeliveryScheduleNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenCustomerDeliveryScheduleNoteApi.class, "openCustomerDeliveryScheduleNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenCusOutsourceSendMaterialApi openCusOutsourceSendMaterialApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(OpenCusOutsourceSendMaterialApi.class, "openCusOutsourceSendMaterialApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private UserOpenApi userOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(UserOpenApi.class, "userOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + USER_PREFIX)
                .build();
    }

    private ExceptionEventOpenApi exceptionEventOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ExceptionEventOpenApi.class, "exceptionEventOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + USER_PREFIX)
                .build();
    }

    private ExceptionEventOpenApiV2 exceptionEventOpenApiV2(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(ExceptionEventOpenApiV2.class, "exceptionEventOpenApiV2")
                .url(config.getBaseUrl() + ROUTE_URL + USER_PREFIX)
                .build();
    }

    private LoginOpenApi loginOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(LoginOpenApi.class, "loginOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + USER_PREFIX)
                .build();
    }

    private RoleOpenApi roleOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder
                .forType(RoleOpenApi.class, "roleOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + USER_PREFIX)
                .build();
    }
}
