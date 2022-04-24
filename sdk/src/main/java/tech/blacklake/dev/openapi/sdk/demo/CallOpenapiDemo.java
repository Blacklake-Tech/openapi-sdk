package tech.blacklake.dev.openapi.sdk.demo;

import tech.blacklake.dev.openapi.sdk.client.BlackLakeHttpClient;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;

/**
 * @author cuiyichen
 * @date 2022/04/23 16:47:32
 */
public class CallOpenapiDemo {
    public static void main(String[] args) {
        // 从黑湖开放平台应用页面获取appKey、appSecret和factoryNumber
        String appKey = "xxx";
        String appSecret = "xxx";
        String factoryNumber = "xxx";

        // 支持自定义http client参数
        BlackLakeHttpClientConfig blackLakeHttpClientConfig = new BlackLakeHttpClientConfig.Builder()
                .connectTimeoutMillis(10000)
                .maxIdleConnections(10)
                .build();

        // 获得http客户端
        BlackLakeHttpClient blackLakeHttpClient = new BlackLakeHttpClient(appKey, appSecret, factoryNumber, blackLakeHttpClientConfig);

    }
}
