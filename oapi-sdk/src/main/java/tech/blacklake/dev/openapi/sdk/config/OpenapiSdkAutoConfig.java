package tech.blacklake.dev.openapi.sdk.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import tech.blacklake.dev.holyfile.open.File4CustomObjectOpenApi;
import tech.blacklake.dev.inventory.open.*;
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

    private AmountAdjustOpenApi amountAdjustOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(AmountAdjustOpenApi.class, "file4CustomObjectOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
            .build();
    }

    private AttributeAdjustOpenApi attributeAdjustOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(AttributeAdjustOpenApi.class, "attributeAdjustOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private InboundOrderOpenApi inboundOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(InboundOrderOpenApi.class, "inboundOrderOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private InboundOrderOpenV2Api inboundOrderOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(InboundOrderOpenV2Api.class, "inboundOrderOpenV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private InventoryConversionOpenApi inventoryConversionOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(InventoryConversionOpenApi.class, "inventoryConversionOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private InventoryCountingOpenApi inventoryCountingOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(InventoryCountingOpenApi.class, "inventoryCountingOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private LabelOpenApi labelOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(LabelOpenApi.class, "labelOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private OpenInventoryMapApi openInventoryMapApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenInventoryMapApi.class, "openInventoryMapApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private OpenMaterialContainApi openMaterialContainApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenMaterialContainApi.class, "openMaterialContainApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private OpenMaterialInventoryApi openMaterialInventoryApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OpenMaterialInventoryApi.class, "openMaterialInventoryApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private OutboundOrderExecuteOpenApi outboundOrderExecuteOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OutboundOrderExecuteOpenApi.class, "outboundOrderExecuteOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private OutboundOrderOpenApi outboundOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OutboundOrderOpenApi.class, "outboundOrderOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private OutboundOrderOpenV2Api outboundOrderOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(OutboundOrderOpenV2Api.class, "outboundOrderOpenV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private TransferOrderOpenApi transferOrderOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(TransferOrderOpenApi.class, "transferOrderOpenApi")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }

    private TransferOrderOpenV2Api transferOrderOpenV2Api(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(TransferOrderOpenV2Api.class, "transferOrderOpenV2Api")
                .url(config.getBaseUrl() + ROUTE_URL + INVENTORY_PREFIX)
                .build();
    }
}
