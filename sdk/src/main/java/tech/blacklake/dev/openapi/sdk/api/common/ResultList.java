package tech.blacklake.dev.openapi.sdk.api.common;

public class ResultList<T> extends Result<PageResDTO<T>> {
    
    public ResultList() {}

    public ResultList(PageResDTO<T> data) {
        super.data = data;
    }

    public void setData(PageResDTO<T> data) {
        super.data = data;
    }
}

