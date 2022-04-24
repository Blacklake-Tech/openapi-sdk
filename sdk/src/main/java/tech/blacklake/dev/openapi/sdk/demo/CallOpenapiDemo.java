package tech.blacklake.dev.openapi.sdk.demo;

import tech.blacklake.dev.openapi.sdk.client.BlackLakeHttpClient;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;
import tech.blacklake.dev.openapi.sdk.client.data.BlackLakeRequest;
import tech.blacklake.dev.openapi.sdk.client.data.BlackLakeResult;

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

        // openapi-1地址
        String url1 = "xxx";
        // openapi-2地址
        String url2 = "xxx";
        // 获取token
        String accessToken = blackLakeHttpClient.getAccessToken();

        /*调用openapi-1*/
        A requestBody1 = new A();
        BlackLakeRequest<A, B> request1 = new BlackLakeRequest<>(url1, requestBody1);
        BlackLakeResult<B> result1 = blackLakeHttpClient.syncInvoke(request1, accessToken);

        /*调用openapi-2*/
        C requestBody2 = new C();
        BlackLakeRequest<C, D> request2 = new BlackLakeRequest<>(url2, requestBody2);
        BlackLakeResult<D> result2 = blackLakeHttpClient.syncInvoke(request2, accessToken);
    }

    public static class A {
    }

    public static class B {
    }

    public static class C {
    }

    public static class D {
    }
}
