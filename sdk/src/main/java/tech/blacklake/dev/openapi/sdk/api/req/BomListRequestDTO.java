package tech.blacklake.dev.openapi.sdk.api.req;

import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomListRequestDTO {
    /**
     * 父项物料快速搜索,物料编号或者物料名称
     */
    private String materialCode;

    /**
     * 父项物料Ids
     */
    private List<Long> materialIds;

    /**
     * 更新开始时间
     */
    private Long updatedAtFrom;

    /**
     * 更新结束时间
     */
    private Long updatedAtTo;

    public String getMaterialCode() {
        return materialCode;
    }

    public List<Long> getMaterialIds() {
        return materialIds;
    }

    public Long getUpdatedAtFrom() {
        return updatedAtFrom;
    }

    public Long getUpdatedAtTo() {
        return updatedAtTo;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialIds(List<Long> materialIds) {
        this.materialIds = materialIds;
    }

    public void setUpdatedAtFrom(Long updatedAtFrom) {
        this.updatedAtFrom = updatedAtFrom;
    }

    public void setUpdatedAtTo(Long updatedAtTo) {
        this.updatedAtTo = updatedAtTo;
    }
}

