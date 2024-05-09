package tech.blacklake.dev.openapi.sdk.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
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
import tech.blacklake.dev.supplychain.open.v1.*;
import tech.blacklake.dev.supplychain.open.v2.OpenCusOutsourceSendMaterialV2Api;
import tech.blacklake.dev.supplychain.open.v2.OpenPurchaseAuditV2Api;
import tech.blacklake.dev.supplychain.open.v2.OpenReturnAuditV2Api;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.*;

@Configuration
@EnableConfigurationProperties(Config.class)
public class OpenapiSdkAutoConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public ClientReqInterceptor clientInterceptor(Config config,
        TokenManager tokenManager) {
        return new ClientReqInterceptor(
            tokenManager, config
        );
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
        return blacklakeSdkClient;
    }

    @Bean
    public TokenManager tokenManager(OkhttpOpenapiClient okhttpOpenapiClient) {
        return new TokenManager(LocalCache.getInstance(), okhttpOpenapiClient);
    }

    @Bean
    public OpenapiClient openapiClient(Config config){
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenapiClient.class, "openapiClient")
            .url(config.getBaseUrl())
            .build();
    }

    @Bean
    public OkhttpOpenapiClient okhttpOpenapiClient(Config config) {
        return new OkhttpOpenapiClient(config);
    }

    @Bean
    public Retryer retryer(){
        return new Retryer.Default();
    }

    @Bean
    public ServletAdapter servletAdapter() {
        return new ServletAdapter();
    }

    private File4CustomObjectOpenApi file4CustomObjectOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(File4CustomObjectOpenApi.class, "file4CustomObjectOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + HOLYFILE_PREFIX)
            .build();
    }

    private OpenCustomerApi customerOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenCustomerApi.class, "openCustomerApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenWaitingReceivingListV2Api openWaitingReceivingListV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenWaitingReceivingListV2Api.class, "openWaitingReceivingListV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenWaitingReceivingListApi openWaitingReceivingListApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenWaitingReceivingListApi.class, "openWaitingReceivingListApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSupplierV2Api openSupplierV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSupplierV2Api.class, "openSupplierV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSupplierApi openSupplierApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSupplierApi.class, "openSupplierApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSourceListV2Api openSourceListV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSourceListV2Api.class, "openSourceListV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSourceListApi openSourceListApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSourceListApi.class, "openSourceListApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentRecordV2Api openShipmentRecordV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenShipmentRecordV2Api.class, "openShipmentRecordV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentRecordApi openShipmentRecordApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenShipmentRecordApi.class, "openShipmentRecordApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentNoteV2Api openShipmentNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenShipmentNoteV2Api.class, "openShipmentNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenShipmentNoteApi openShipmentNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenShipmentNoteApi.class, "openShipmentNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderV2Api openSalesOrderV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSalesOrderV2Api.class, "openSalesOrderV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderReturnV2Api openSalesOrderReturnV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSalesOrderReturnV2Api.class, "openSalesOrderReturnV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderReturnApi openSalesOrderReturnApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSalesOrderReturnApi.class, "openSalesOrderReturnApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenSalesOrderApi openSalesOrderApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenSalesOrderApi.class, "openSalesOrderApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReceivingRecordApi openReceivingRecordApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenReceivingRecordApi.class, "openReceivingRecordApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReceiveNoteV2Api openReceiveNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenReceiveNoteV2Api.class, "openReceiveNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenReceiveNoteApi openReceiveNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenReceiveNoteApi.class, "openReceiveNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseReturnOrderV2Api openPurchaseReturnOrderV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseReturnOrderV2Api.class, "openPurchaseReturnOrderV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseReturnOrderApi openPurchaseReturnOrderApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseReturnOrderApi.class, "openPurchaseReturnOrderApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseRequisitionsV2Api openPurchaseRequisitionsV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseRequisitionsV2Api.class, "openPurchaseRequisitionsV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseRequisitionsApi openPurchaseRequisitionsApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseRequisitionsApi.class, "openPurchaseRequisitionsApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchasePlanApi openPurchasePlanApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchasePlanApi.class, "openPurchasePlanApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseOrderV2Api openPurchaseOrderV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseOrderV2Api.class, "openPurchaseOrderV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPurchaseOrderApi openPurchaseOrderApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseOrderApi.class, "openPurchaseOrderApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenPlanFeedbackApi openPlanFeedbackApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPlanFeedbackApi.class, "openPlanFeedbackApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOutsourceSendMaterialV2APi openOutsourceSendMaterialV2APi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenOutsourceSendMaterialV2APi.class, "openOutsourceSendMaterialV2APi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOutsourceSendMaterialApi openOutsourceSendMaterialApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenOutsourceSendMaterialApi.class, "openOutsourceSendMaterialApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOrderChangeNoteV2Api openOrderChangeNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenOrderChangeNoteV2Api.class, "openOrderChangeNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenOrderChangeNoteApi openOrderChangeNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenOrderChangeNoteApi.class, "openOrderChangeNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleV2Api openDeliveryScheduleV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenDeliveryScheduleV2Api.class, "openDeliveryScheduleV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleNoteV2Api openDeliveryScheduleNoteV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenDeliveryScheduleNoteV2Api.class, "openDeliveryScheduleNoteV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleNoteApi openDeliveryScheduleNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenDeliveryScheduleNoteApi.class, "openDeliveryScheduleNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryScheduleApi openDeliveryScheduleApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenDeliveryScheduleApi.class, "openDeliveryScheduleApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryAppointmentV2Api openDeliveryAppointmentV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenDeliveryAppointmentV2Api.class, "openDeliveryAppointmentV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenDeliveryAppointmentApi openDeliveryAppointmentApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenDeliveryAppointmentApi.class, "openDeliveryAppointmentApi")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }

    private OpenCustomerV2Api openCustomerV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenCustomerV2Api.class, "openCustomerV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + ORDER_PREFIX)
                .build();
    }


    private OpenReturnAuditV2Api openReturnAuditV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenReturnAuditV2Api.class, "openReturnAuditV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenCusOutsourceSendMaterialV2Api openCusOutsourceSendMaterialV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenCusOutsourceSendMaterialV2Api.class, "openCusOutsourceSendMaterialV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenPurchaseAuditV2Api openPurchaseAuditV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseAuditV2Api.class, "openPurchaseAuditV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OrderChangeApplicationOpenApi orderChangeApplicationOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OrderChangeApplicationOpenApi.class, "orderChangeApplicationOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenReturnAuditApi openReturnAuditApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenReturnAuditApi.class, "openReturnAuditApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenPurchaseAuditApi openPurchaseAuditApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenPurchaseAuditApi.class, "openPurchaseAuditApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenOutsourceReturnMaterialApi openOutsourceReturnMaterialApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenOutsourceReturnMaterialApi.class, "openOutsourceReturnMaterialApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenCustomerDeliveryScheduleNoteApi openCustomerDeliveryScheduleNoteApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenCustomerDeliveryScheduleNoteApi.class, "openCustomerDeliveryScheduleNoteApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }

    private OpenCusOutsourceSendMaterialApi openCusOutsourceSendMaterialApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenCusOutsourceSendMaterialApi.class, "openCusOutsourceSendMaterialApi")
                .url(config.getBaseUrl() + ROUTE_URL + SUPPLY_CHAIN_PREFIX)
                .build();
    }
}
