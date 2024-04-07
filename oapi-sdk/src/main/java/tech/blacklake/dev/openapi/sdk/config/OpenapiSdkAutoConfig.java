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

import static tech.blacklake.dev.openapi.sdk.constants.Constants.*;

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
