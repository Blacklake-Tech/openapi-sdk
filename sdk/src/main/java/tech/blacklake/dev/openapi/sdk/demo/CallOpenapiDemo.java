package tech.blacklake.dev.openapi.sdk.demo;

import tech.blacklake.dev.openapi.sdk.client.BlackLakeHttpClient;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;
import tech.blacklake.dev.openapi.sdk.client.data.BlackLakeResult;
import tech.blacklake.dev.openapi.sdk.constant.UrlEnum;

/**
 * @author cuiyichen
 * @date 2022/04/23 16:47:32
 */
public class CallOpenapiDemo {
    public static void main(String[] args) {
        /* 从黑湖开放平台应用页面获取appKey、appSecret和factoryNumber；从API中心获取请求host */
        String appKey = "interface_002";
        String appSecret = "$argon2id$v=19$m=65536,t=1,p=4$Zm6Bj1FlEdlyw78wlHDUNNeqssGyiECMjGp2u4UekIN38v3gTvF8C68XEEmLwMRjdVhzn35dZ50HxLgBQLIl5UcOUpQIu9XO4xEDDb9EKzfkXm8LQXh/84sr1nDIZJgL5kAFL5537m56TbpoZnQANnqTuO/TXM9AfJXOV0A5i/o$wGQtEBrq6G6x8598FDCFo5qsfUeo0tQ7Y5i5pFngqQUNTaaBm4gP4ixyS+5zHthl5PMcW33O+bC9vSv2V8oeHQNe9d4EzPpjdLKfY129xwvBPu/+DJSe8rkKpGwut4Ua072vld2TNOVGbCyDYmuLR11R5jqAP0/+VUJ1CY4WomlCd2hNOlojAJtTAdMGNzNQ2bcl/yOgpc3Rot0eKunWYsSjQ9C5rwCfipW/NzBgC9tH6dmaYyn4Bi0zQV2OrYldTPnrej228xxJSN4sg38OH0kjA8qrf5tj0aJQes6Xgmkcyi4tehvCTW/pGqKZNJw/uFGGr7yZw6voV/Az3P+6pQ";
        String factoryNumber = "22577057";
        String host = UrlEnum.OPENAPI_HOST.getMessage();

        /* 创建blacklake http客户端 */
        // 支持自定义http client参数
        BlackLakeHttpClientConfig blackLakeHttpClientConfig = new BlackLakeHttpClientConfig.Builder()
                .connectTimeoutMillis(3000)
                .maxIdleConnections(10)
                .build();
        BlackLakeHttpClient blackLakeHttpClient = new BlackLakeHttpClient(appKey, appSecret, factoryNumber, blackLakeHttpClientConfig);

        /* 调用[出入库管理.入库单列表]接口 */
        String path = "/inventory/open/v1/inboundOrder/_list";
        BlackLakeResult result = blackLakeHttpClient.syncInvoke(host + path);
        System.out.println(result);
    }
}
