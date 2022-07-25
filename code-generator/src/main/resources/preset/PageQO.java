package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.List;

/**
 * 分页基类
 */
public class PageQO<T> {

    /**
     * 当前第几页
     */
    private Integer page;

    /**
     * 每页大小
     */
    private Integer size;

    /**
     * 排序 字段名 排序规律
     */
    private List<OrderBy> sorter;

    /**
     * 查询参数
     */
    private T query;


    public PageQO(BasePage basePage, T query) {
        this.sorter = basePage.getSorter();
        this.page = basePage.getPage();
        this.size = basePage.getSize();
        this.query = query;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<OrderBy> getSorter() {
        return sorter;
    }

    public void setSorter(List<OrderBy> sorter) {
        this.sorter = sorter;
    }

    public T getQuery() {
        return query;
    }

    public void setQuery(T query) {
        this.query = query;
    }
}
