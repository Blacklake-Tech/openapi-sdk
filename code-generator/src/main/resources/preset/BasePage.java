package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.List;

public abstract class BasePage {

    /**
     * 当前第几页
     */
    private Integer page = 1;

    /**
     * 每页大小
     */
    private Integer size = 20;

    /**
     * 排序 字段名 排序规律
     */
    private List<OrderBy> sorter;

    /**
     * 筛选标识 1 全选 0 不全选 默认为 0
     */
    private Integer selectFlag = 0;

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

    public Integer getSelectFlag() {
        return selectFlag;
    }

    public void setSelectFlag(Integer selectFlag) {
        this.selectFlag = selectFlag;
    }
}
