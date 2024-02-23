package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class SalesOrderResponseDTO extends CustomFieldBaseVO {
    /**
     * 销售订单id
     */
    private long id;

    /**
     * 销售订单编号
     */
    private String code;

    /**
     * 销售订单状态：1 新建 2 结束
     */
    private int status;

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
