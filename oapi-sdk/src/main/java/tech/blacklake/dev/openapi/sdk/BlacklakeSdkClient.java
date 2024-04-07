package tech.blacklake.dev.openapi.sdk;

import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
import tech.blacklake.dev.material.domain.openapi.batch.MaterialBatchNoOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialAttributeOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialCategoryOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialOpenApi;
import tech.blacklake.dev.material.domain.openapi.material.MaterialOpenV2Api;
import tech.blacklake.dev.material.domain.openapi.storage.StorageAreaOpenApi;
import tech.blacklake.dev.material.domain.openapi.storage.StorageLocationOpenApi;
import tech.blacklake.dev.material.domain.openapi.storage.StorageWarehouseOpenApi;
import tech.blacklake.dev.material.domain.openapi.unit.UnitOpenApi;
import tech.blacklake.dev.openapi.sdk.config.Config;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.constants.enums.BaseUrlEnum;

public class BlacklakeSdkClient {

    private Config config;

    public File4CustomObjectOpenApi file4CustomObjectOpenApi;

    public MaterialBatchNoOpenApi materialBatchNoOpenApi;
    public MaterialOpenV2Api materialOpenV2Api;
    public MaterialOpenApi materialOpenApi;
    public MaterialCategoryOpenApi materialCategoryOpenApi;
    public MaterialAttributeOpenApi materialAttributeOpenApi;
    public UnitOpenApi unitOpenApi;
    public StorageWarehouseOpenApi storageWarehouseOpenApi;
    public StorageLocationOpenApi storageLocationOpenApi;
    public StorageAreaOpenApi storageAreaOpenApi;
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
