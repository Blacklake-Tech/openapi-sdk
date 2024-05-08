package tech.blacklake.dev.openapi.sdk;

import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.constants.enums.BaseUrlEnum;
import tech.blacklake.dev.order.open.OpenCustomerApi;
import tech.blacklake.dev.order.open.OpenCustomerV2Api;
import tech.blacklake.dev.order.open.*;

public class BlacklakeSdkClient {

    private Config config;

    public File4CustomObjectOpenApi file4CustomObjectOpenApi;
    public OpenCustomerApi openCustomerApi;
    public OpenCustomerV2Api openCustomerV2Api;
    public OpenDeliveryAppointmentApi openDeliveryAppointmentApi;
    public OpenDeliveryAppointmentV2Api openDeliveryAppointmentV2Api;
    public OpenDeliveryScheduleApi openDeliveryScheduleApi;
    public OpenDeliveryScheduleNoteApi openDeliveryScheduleNoteApi;
    public OpenDeliveryScheduleNoteV2Api openDeliveryScheduleNoteV2Api;
    public OpenDeliveryScheduleV2Api openDeliveryScheduleV2Api;
    public OpenOrderChangeNoteApi openOrderChangeNoteApi;
    public OpenOrderChangeNoteV2Api openOrderChangeNoteV2Api;
    public OpenOutsourceSendMaterialApi openOutsourceSendMaterialApi;
    public OpenOutsourceSendMaterialV2APi openOutsourceSendMaterialV2APi;
    public OpenPlanFeedbackApi openPlanFeedbackApi;
    public OpenPurchaseOrderApi openPurchaseOrderApi;
    public OpenPurchaseOrderV2Api openPurchaseOrderV2Api;
    public OpenPurchasePlanApi openPurchasePlanApi;
    public OpenPurchaseRequisitionsApi openPurchaseRequisitionsApi;
    public OpenPurchaseRequisitionsV2Api openPurchaseRequisitionsV2Api;
    public OpenPurchaseReturnOrderApi openPurchaseReturnOrderApi;
    public OpenPurchaseReturnOrderV2Api openPurchaseReturnOrderV2Api;
    public OpenReceiveNoteApi openReceiveNoteApi;
    public OpenReceiveNoteV2Api openReceiveNoteV2Api;
    public OpenReceivingRecordApi openReceivingRecordApi;
    public OpenSalesOrderApi openSalesOrderApi;
    public OpenSalesOrderReturnApi openSalesOrderReturnApi;
    public OpenSalesOrderReturnV2Api openSalesOrderReturnV2Api;
    public OpenSalesOrderV2Api openSalesOrderV2Api;
    public OpenShipmentNoteApi openShipmentNoteApi;
    public OpenShipmentNoteV2Api openShipmentNoteV2Api;
    public OpenShipmentRecordApi openShipmentRecordApi;
    public OpenShipmentRecordV2Api openShipmentRecordV2Api;
    public OpenSourceListApi openSourceListApi;
    public OpenSourceListV2Api openSourceListV2Api;
    public OpenSupplierApi openSupplierApi;
    public OpenSupplierV2Api openSupplierV2Api;
    public OpenWaitingReceivingListApi openWaitingReceivingListApi;
    public OpenWaitingReceivingListV2Api openWaitingReceivingListV2Api;

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
