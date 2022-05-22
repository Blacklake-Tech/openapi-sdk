package tech.blacklake.dev.openapi.sdk.api.common;


public class OrderBy {
    /**
     * 排序字段
     */
    private String field;

    /**
     * 排序规律 默认 asc，asc 升序 desc 降序
     */
    private String order = "asc";


    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
