package tech.blacklake.dev.openapi.sdk.config;

import static tech.blacklake.dev.openapi.sdk.constants.Constants.HOLYFILE_PREFIX;
import static tech.blacklake.dev.openapi.sdk.constants.Constants.ROUTE_URL;

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
        return blacklakeSdkClient;
    }

    private OpenWaitingReceivingListV2Api openWaitingReceivingListV2Api(Config config) {
        return null;
    }

    private OpenWaitingReceivingListApi openWaitingReceivingListApi(Config config) {
        return null;
    }

    private OpenSupplierV2Api openSupplierV2Api(Config config) {
        return null;
    }

    private OpenSupplierApi openSupplierApi(Config config) {
        return null;
    }

    private OpenSourceListV2Api openSourceListV2Api(Config config) {
        return null;
    }

    private OpenSourceListApi openSourceListApi(Config config) {
        return null;
    }

    private OpenShipmentRecordV2Api openShipmentRecordV2Api(Config config) {
        return null;
    }

    private OpenShipmentRecordApi openShipmentRecordApi(Config config) {
        return null;
    }

    private OpenShipmentNoteV2Api openShipmentNoteV2Api(Config config) {
        return null;
    }

    private OpenShipmentNoteApi openShipmentNoteApi(Config config) {
        return null;
    }

    private OpenSalesOrderV2Api openSalesOrderV2Api(Config config) {
        return null;
    }

    private OpenSalesOrderReturnV2Api openSalesOrderReturnV2Api(Config config) {
        return null;
    }

    private OpenSalesOrderReturnApi openSalesOrderReturnApi(Config config) {
        return null;
    }

    private OpenSalesOrderApi openSalesOrderApi(Config config) {
        return null;
    }

    private OpenReceivingRecordApi openReceivingRecordApi(Config config) {
        return null;
    }

    private OpenReceiveNoteV2Api openReceiveNoteV2Api(Config config) {
        return null;
    }

    private OpenReceiveNoteApi openReceiveNoteApi(Config config) {
        return null;
    }

    private OpenPurchaseReturnOrderV2Api openPurchaseReturnOrderV2Api(Config config) {
        return null;
    }

    private OpenPurchaseReturnOrderApi openPurchaseReturnOrderApi(Config config) {
        return null;
    }

    private OpenPurchaseRequisitionsV2Api openPurchaseRequisitionsV2Api(Config config) {
        return null;
    }

    private OpenPurchaseRequisitionsApi openPurchaseRequisitionsApi(Config config) {
        return null;
    }

    private OpenPurchasePlanApi openPurchasePlanApi(Config config) {
        return null;
    }

    private OpenPurchaseOrderV2Api openPurchaseOrderV2Api(Config config) {
        return null;
    }

    private OpenPurchaseOrderApi openPurchaseOrderApi(Config config) {
        return null;
    }

    private OpenPlanFeedbackApi openPlanFeedbackApi(Config config) {
        return null;
    }

    private OpenOutsourceSendMaterialV2APi openOutsourceSendMaterialV2APi(Config config) {
        return null;
    }

    private OpenOutsourceSendMaterialApi openOutsourceSendMaterialApi(Config config) {
        return null;
    }

    private OpenOrderChangeNoteV2Api openOrderChangeNoteV2Api(Config config) {
        return null;
    }

    private OpenOrderChangeNoteApi openOrderChangeNoteApi(Config config) {
        return null;
    }

    private OpenDeliveryScheduleV2Api openDeliveryScheduleV2Api(Config config) {
        return null;
    }

    private OpenDeliveryScheduleNoteV2Api openDeliveryScheduleNoteV2Api(Config config) {
        return null;
    }

    private OpenDeliveryScheduleNoteApi openDeliveryScheduleNoteApi(Config config) {
        return null;
    }

    private OpenDeliveryScheduleApi openDeliveryScheduleApi(Config config) {
        return null;
    }

    private OpenDeliveryAppointmentV2Api openDeliveryAppointmentV2Api(Config config) {
        return null;
    }

    private OpenDeliveryAppointmentApi openDeliveryAppointmentApi(Config config) {
        return null;
    }

    private OpenCustomerV2Api openCustomerV2Api(Config config) {
        return null;
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
                .url(config.getBaseUrl() + ROUTE_URL + HOLYFILE_PREFIX)
                .build();
    }
}
