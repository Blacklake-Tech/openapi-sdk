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
        String appKey = "interface_002";
        String appSecret = "$argon2id$v=19$m=65536,t=1,p=4$Zm6Bj1FlEdlyw78wlHDUNNeqssGyiECMjGp2u4UekIN38v3gTvF8C68XEEmLwMRjdVhzn35dZ50HxLgBQLIl5UcOUpQIu9XO4xEDDb9EKzfkXm8LQXh/84sr1nDIZJgL5kAFL5537m56TbpoZnQANnqTuO/TXM9AfJXOV0A5i/o$wGQtEBrq6G6x8598FDCFo5qsfUeo0tQ7Y5i5pFngqQUNTaaBm4gP4ixyS+5zHthl5PMcW33O+bC9vSv2V8oeHQNe9d4EzPpjdLKfY129xwvBPu/+DJSe8rkKpGwut4Ua072vld2TNOVGbCyDYmuLR11R5jqAP0/+VUJ1CY4WomlCd2hNOlojAJtTAdMGNzNQ2bcl/yOgpc3Rot0eKunWYsSjQ9C5rwCfipW/NzBgC9tH6dmaYyn4Bi0zQV2OrYldTPnrej228xxJSN4sg38OH0kjA8qrf5tj0aJQes6Xgmkcyi4tehvCTW/pGqKZNJw/uFGGr7yZw6voV/Az3P+6pQ";
        String factoryNumber = "22577057";

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
        System.out.println(accessToken);

//        /*调用openapi-1*/
//        A requestBody1 = new A();
//        BlackLakeRequest<A, B> request1 = new BlackLakeRequest<>(url1, requestBody1);
//        BlackLakeResult<B> result1 = blackLakeHttpClient.syncInvoke(request1, accessToken);
//
//        /*调用openapi-2*/
//        C requestBody2 = new C();
//        BlackLakeRequest<C, D> request2 = new BlackLakeRequest<>(url2, requestBody2);
//        BlackLakeResult<D> result2 = blackLakeHttpClient.syncInvoke(request2, accessToken);
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
