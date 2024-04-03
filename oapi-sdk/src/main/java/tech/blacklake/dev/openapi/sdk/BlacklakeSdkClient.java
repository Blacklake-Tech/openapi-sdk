package tech.blacklake.dev.openapi.sdk;

import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
import tech.blacklake.dev.inventory.open.*;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.constants.enums.BaseUrlEnum;

public class BlacklakeSdkClient {

    private Config config;

    public File4CustomObjectOpenApi file4CustomObjectOpenApi;
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
