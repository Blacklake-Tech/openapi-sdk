package tech.blacklake.dev.openapi.sdk.client.data;

import tech.blacklake.dev.openapi.sdk.constant.ErrorCodeEnum;
import tech.blacklake.dev.openapi.sdk.util.Preconditions;

/**
 * @param <T> request body类型
 * @param <U> response body类型
 * @author cuiyichen
 * @date 2022/04/23 20:12:37
 */
public class BlackLakeRequest<T, U> {
    private final String url;

    private T requestBody;

    public BlackLakeRequest(String url) {
        this(url, null);
    }

    public BlackLakeRequest(String url, T requestBody) {
        Preconditions.checkNotNull(url, ErrorCodeEnum.URL_IS_NOT_NULLABLE);

        this.url = url;
        this.requestBody = requestBody;
    }

    public String getUrl() {
        return url;
    }

    public T getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(T requestBody) {
        this.requestBody = requestBody;
    }
}
