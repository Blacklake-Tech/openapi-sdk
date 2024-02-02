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
        /****quality begin********************/
        blacklakeSdkClient.qcCheckItemCategoryOpenApi = qcCheckItemCategoryOpenApi(config);
        blacklakeSdkClient.qcCheckItemOpenApi = qcCheckItemOpenApi(config);
        blacklakeSdkClient.qcConfigOpenApi = qcConfigOpenApi(config);
        blacklakeSdkClient.qcDefectRankOpenApi = qcDefectRankOpenApi(config);
        blacklakeSdkClient.qcDefectReasonOpenApi = qcDefectReasonOpenApi(config);
        blacklakeSdkClient.qcMaterialOpenApi = qcMaterialOpenApi(config);
        blacklakeSdkClient.qcTaskOpenApi = qcTaskOpenApi(config);
        /****quality end********************/

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

    private QcCheckItemCategoryOpenApi qcCheckItemCategoryOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcCheckItemCategoryOpenApi.class, "qcCheckItemCategoryOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }
    private QcCheckItemOpenApi qcCheckItemOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcCheckItemOpenApi.class, "qcCheckItemOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcConfigOpenApi qcConfigOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcConfigOpenApi.class, "qcConfigOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcDefectRankOpenApi qcDefectRankOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcDefectRankOpenApi.class, "qcDefectRankOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcDefectReasonOpenApi qcDefectReasonOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcDefectReasonOpenApi.class, "qcDefectReasonOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcMaterialOpenApi qcMaterialOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcMaterialOpenApi.class, "qcMaterialOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }

    private QcTaskOpenApi qcTaskOpenApi(Config config) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(this.applicationContext);
        return feignClientBuilder.forType(QcTaskOpenApi.class, "qcTaskOpenApi")
            .url(config.getBaseUrl() + ROUTE_URL + QUALITY_PREFIX)
            .build();
    }
}
