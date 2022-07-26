package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class UnitListResponseDTO {
    /**
     * 总条数
     */
    private Long total;

    /**
     * 当前页数
     */
    private Integer page;

    /**
     * 每页条数
     */
    private Integer size;

    /**
     * 数据
     */
    private List<UnitDetailResponseDTO> list;

    public Long getTotal() {
        return total;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    public List<UnitDetailResponseDTO> getList() {
        return list;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setList(List<UnitDetailResponseDTO> list) {
        this.list = list;
    }
}

