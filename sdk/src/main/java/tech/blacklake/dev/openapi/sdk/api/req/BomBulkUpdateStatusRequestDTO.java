package tech.blacklake.dev.openapi.sdk.api.req;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class BomBulkUpdateStatusRequestDTO {
    /**
     * 物料清单Ids
     */
    private List<Long> ids;

    /**
     * 物料清单状态
     */
    private int active;

    public List<Long> getIds() {
        return ids;
    }

    public int getActive() {
        return active;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
