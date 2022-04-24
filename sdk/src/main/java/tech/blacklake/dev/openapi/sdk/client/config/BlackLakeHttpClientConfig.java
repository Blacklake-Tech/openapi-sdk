package tech.blacklake.dev.openapi.sdk.client.config;

/**
 * @author cuiyichen
 * @date 2022/4/23 16:58:38
 */
public class BlackLakeHttpClientConfig {
    /**
     * The connect timeout is applied when connecting a TCP socket to the target host.
     */
    private long connectTimeoutMillis = 5000;
    /**
     * The read timeout is applied to both the TCP socket and for individual read IO operations including on Source of the Response.
     */
    private long readTimeoutMillis = 5000;

    /**
     * The write timeout is applied for individual write IO operations.
     */
    private long writeTimeoutMillis = 5000;

    /**
     * The maximum number of idle connections for each address.
     */
    private int maxIdleConnections = 5;

    /**
     * The survival time of idle connections.
     */
    private long keepAliveDurationSecs = 300;

    /**
     * 获取默认http client配置
     */
    public static BlackLakeHttpClientConfig getDefault() {
        return new BlackLakeHttpClientConfig();
    }

    public long getConnectTimeoutMillis() {
        return connectTimeoutMillis;
    }

    public void setConnectTimeoutMillis(long connectTimeoutMillis) {
        this.connectTimeoutMillis = connectTimeoutMillis;
    }

    public long getReadTimeoutMillis() {
        return readTimeoutMillis;
    }

    public void setReadTimeoutMillis(long readTimeoutMillis) {
        this.readTimeoutMillis = readTimeoutMillis;
    }

    public long getWriteTimeoutMillis() {
        return writeTimeoutMillis;
    }

    public void setWriteTimeoutMillis(long writeTimeoutMillis) {
        this.writeTimeoutMillis = writeTimeoutMillis;
    }

    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    public void setMaxIdleConnections(int maxIdleConnections) {
        this.maxIdleConnections = maxIdleConnections;
    }

    public long getKeepAliveDurationSecs() {
        return keepAliveDurationSecs;
    }

    public void setKeepAliveDurationSecs(long keepAliveDurationSecs) {
        this.keepAliveDurationSecs = keepAliveDurationSecs;
    }

    /**
     * HttpClientConfig链式配置
     */
    public static final class Builder {
        private long connectTimeoutMillis = 5000;
        private long readTimeoutMillis = 5000;
        private long writeTimeoutMillis = 5000;
        private int maxIdleConnections = 5;
        private long keepAliveDurationSecs = 300;

        public Builder connectTimeoutMillis(long connectTimeoutMillis) {
            this.connectTimeoutMillis = connectTimeoutMillis;
            return this;
        }

        public Builder readTimeoutMillis(long readTimeoutMillis) {
            this.readTimeoutMillis = readTimeoutMillis;
            return this;
        }

        public Builder writeTimeoutMillis(long writeTimeoutMillis) {
            this.writeTimeoutMillis = writeTimeoutMillis;
            return this;
        }

        public Builder maxIdleConnections(int maxIdleConnections) {
            this.maxIdleConnections = maxIdleConnections;
            return this;
        }

        public Builder keepAliveDurationSecs(long keepAliveDurationSecs) {
            this.keepAliveDurationSecs = keepAliveDurationSecs;
            return this;
        }

        public BlackLakeHttpClientConfig build() {
            BlackLakeHttpClientConfig blackLakeHttpClientConfig = new BlackLakeHttpClientConfig();
            blackLakeHttpClientConfig.setConnectTimeoutMillis(connectTimeoutMillis);
            blackLakeHttpClientConfig.setWriteTimeoutMillis(writeTimeoutMillis);
            blackLakeHttpClientConfig.setReadTimeoutMillis(readTimeoutMillis);
            blackLakeHttpClientConfig.setMaxIdleConnections(maxIdleConnections);
            blackLakeHttpClientConfig.setKeepAliveDurationSecs(keepAliveDurationSecs);
            return blackLakeHttpClientConfig;
        }
    }
}
