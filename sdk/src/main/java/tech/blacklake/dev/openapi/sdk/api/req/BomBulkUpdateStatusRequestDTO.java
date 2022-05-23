package tech.blacklake.dev.openapi.sdk.api.req;

import java.time.*;
import java.util.*;
import java.math.*;
import java.io.*;
import tech.blacklake.dev.openapi.sdk.api.common.*;

public class BomBulkUpdateStatusRequestDTO  {
    /**
     * 物料清单Ids
     */
    private List<Long> ids;

    /**
     * 物料清单状态
     */
    private int active = 0;

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

