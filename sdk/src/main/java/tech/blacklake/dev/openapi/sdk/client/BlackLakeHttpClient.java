package tech.blacklake.dev.openapi.sdk.client;

import com.google.common.base.Preconditions;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;
import okhttp3.OkHttpClient;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:40:54
 */
public class BlackLakeHttpClient {
    private final OkHttpClient okHttpClient;
    private final String appKey;
    private final String appSecret;
    private final String factoryNumber;

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber) {
        this(appKey, appSecret, factoryNumber, null);
    }

    public BlackLakeHttpClient(String appKey, String appSecret, String factoryNumber, BlackLakeHttpClientConfig blackLakeHttpClientConfig) {
        Preconditions.checkNotNull(appKey);
        Preconditions.checkNotNull(appSecret);

        this.appKey = appKey;
        this.appSecret = appSecret;
        this.factoryNumber = factoryNumber;
        okHttpClient = OkHttpClientFactory.getHttpClient(blackLakeHttpClientConfig);
    }
}
