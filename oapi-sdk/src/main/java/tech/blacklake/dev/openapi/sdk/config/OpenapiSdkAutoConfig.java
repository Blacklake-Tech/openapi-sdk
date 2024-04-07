package tech.blacklake.dev.openapi.sdk.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
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
import tech.blacklake.dev.openapi.sdk.BlacklakeSdkClient;
import tech.blacklake.dev.openapi.sdk.cache.LocalCache;
import tech.blacklake.dev.openapi.sdk.client.OkhttpOpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.OpenapiClient;
import tech.blacklake.dev.openapi.sdk.client.decoder.ClientResDecoder;
import tech.blacklake.dev.openapi.sdk.client.interceptor.ClientReqInterceptor;
import tech.blacklake.dev.openapi.sdk.constants.enums.AppTypeEnum;
import tech.blacklake.dev.openapi.sdk.event.ServletAdapter;
import tech.blacklake.dev.openapi.sdk.token.TokenManager;

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
        blacklakeSdkClient.materialBatchNoOpenApi = materialBatchNoOpenApi(config);
        blacklakeSdkClient.materialOpenApi = materialOpenApi(config);
        blacklakeSdkClient.materialOpenV2Api = materialOpenV2Api(config);
        blacklakeSdkClient.materialCategoryOpenApi = materialCategoryOpenApi(config);
        blacklakeSdkClient.materialAttributeOpenApi = materialAttributeOpenApi(config);
        blacklakeSdkClient.unitOpenApi = unitOpenApi(config);
        blacklakeSdkClient.storageWarehouseOpenApi = storageWarehouseOpenApi(config);
        blacklakeSdkClient.storageLocationOpenApi = storageLocationOpenApi(config);
        blacklakeSdkClient.storageAreaOpenApi = storageAreaOpenApi(config);
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

    private MaterialBatchNoOpenApi materialBatchNoOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(MaterialBatchNoOpenApi.class, "materialBatchNoOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private MaterialOpenV2Api materialOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(MaterialOpenV2Api.class, "materialOpenV2Api")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
    private MaterialOpenApi materialOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(MaterialOpenApi.class, "materialOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
    private MaterialCategoryOpenApi materialCategoryOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(MaterialCategoryOpenApi.class, "materialCategoryOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
    private MaterialAttributeOpenApi materialAttributeOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(MaterialAttributeOpenApi.class, "materialAttributeOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
    private UnitOpenApi unitOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(UnitOpenApi.class, "unitOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }

    private StorageWarehouseOpenApi storageWarehouseOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(StorageWarehouseOpenApi.class, "storageWarehouseOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
    private StorageLocationOpenApi storageLocationOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(StorageLocationOpenApi.class, "storageLocationOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
    private StorageAreaOpenApi storageAreaOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(StorageAreaOpenApi.class, "storageAreaOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + MATERIAL_PREFIX)
            .build();
    }
}
