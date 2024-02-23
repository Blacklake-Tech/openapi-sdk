package tech.blacklake.dev.openapi.sdk.api.res;

import tech.blacklake.dev.openapi.sdk.api.common.*;
import tech.blacklake.dev.openapi.sdk.api.dto.*;

import java.io.*;
import java.math.*;
import java.time.*;
import java.util.*;

public class QcConfigTriggerRuleWebPageListResponseDTO {
    /**
     * 触发时机（1:入库单下发 2:出库单下发 3:报工）
     */
    private Integer triggerValue;

    /**
     * 触发业务类型（1:采购入库 2:退货入库 3:其他入库 4:销售出库 5:退厂出库 6:其他出库 ）
     */
    private List<Integer> triggerType;

    public Integer getTriggerValue() {
        return triggerValue;
    }

    public List<Integer> getTriggerType() {
        return triggerType;
    }

    public void setTriggerValue(Integer triggerValue) {
        this.triggerValue = triggerValue;
    }

    public void setTriggerType(List<Integer> triggerType) {
        this.triggerType = triggerType;
    }
}
