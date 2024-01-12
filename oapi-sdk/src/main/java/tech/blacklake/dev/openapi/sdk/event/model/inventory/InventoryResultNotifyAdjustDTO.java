package tech.blacklake.dev.openapi.sdk.event.model.inventory;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class InventoryResultNotifyAdjustDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long amountAdjustOrderId;

        private List<Long> amountAdjustRecordIds;

        public Long getAmountAdjustOrderId() {
            return amountAdjustOrderId;
        }

        public void setAmountAdjustOrderId(Long amountAdjustOrderId) {
            this.amountAdjustOrderId = amountAdjustOrderId;
        }

        public List<Long> getAmountAdjustRecordIds() {
            return amountAdjustRecordIds;
        }

        public void setAmountAdjustRecordIds(List<Long> amountAdjustRecordIds) {
            this.amountAdjustRecordIds = amountAdjustRecordIds;
        }
    }
}
