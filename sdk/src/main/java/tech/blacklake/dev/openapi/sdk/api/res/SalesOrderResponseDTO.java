package tech.blacklake.dev.openapi.sdk.api.res;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

public class SalesOrderResponseDTO extends CustomFieldBaseVO {
    /**
     * 销售订单id
     */
    private long id = 0;

    /**
     * 销售订单编号
     */
    private String code;

    /**
     * 销售订单状态：1 新建 2 结束
     */
    private int status = 0;

    /**
     * 销售订单明细行
     */
    private List<SalesOrderItemResponseDTO> items;

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }

    public List<SalesOrderItemResponseDTO> getItems() {
        return items;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setItems(List<SalesOrderItemResponseDTO> items) {
        this.items = items;
    }
}

