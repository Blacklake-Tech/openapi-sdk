package tech.blacklake.dev.openapi.sdk.client.factory;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import tech.blacklake.dev.openapi.sdk.client.config.BlackLakeHttpClientConfig;

import java.util.concurrent.TimeUnit;

/**
 * @author cuiyichen
 * @date 2022/04/23 16:57:19
 */
public class OkHttpClientFactory {
    public static OkHttpClient getHttpClient(BlackLakeHttpClientConfig blackLakeHttpClientConfig) {
        if (blackLakeHttpClientConfig == null) {
            blackLakeHttpClientConfig = BlackLakeHttpClientConfig.getDefault();
        }

        ConnectionPool connectionPool = new ConnectionPool(
                blackLakeHttpClientConfig.getMaxIdleConnections(),
                blackLakeHttpClientConfig.getKeepAliveDurationSecs(),
                TimeUnit.SECONDS
        );

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(blackLakeHttpClientConfig.getConnectTimeoutMillis(), TimeUnit.MILLISECONDS)
                .readTimeout(blackLakeHttpClientConfig.getReadTimeoutMillis(), TimeUnit.MILLISECONDS)
                .writeTimeout(blackLakeHttpClientConfig.getWriteTimeoutMillis(), TimeUnit.MILLISECONDS)
                .connectionPool(connectionPool);

        return builder.build();
    }
}
