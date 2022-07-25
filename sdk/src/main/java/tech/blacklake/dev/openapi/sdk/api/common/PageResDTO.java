package tech.blacklake.dev.openapi.sdk.api.common;

import java.util.List;

public class PageResDTO<T> {

    /**
     * list 信息
     */
    private List<T> list;


    /**
     * 当前第几页
     */
    private Integer page = 0;

    /**
     * 总条数
     */
    private Long total = 0L;

    public PageResDTO() {
    }

    public PageResDTO(List<T> list) {
        this.list = list;
    }

    public PageResDTO(List<T> list, Integer page, Long total) {
        this.list = list;
        this.page = page;
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
