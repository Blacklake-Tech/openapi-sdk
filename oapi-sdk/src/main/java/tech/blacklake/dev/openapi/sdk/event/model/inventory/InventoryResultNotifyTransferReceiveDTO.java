package tech.blacklake.dev.openapi.sdk.event.model.inventory;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class InventoryResultNotifyTransferReceiveDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long transferOrderId;

        private String transferOrderCode;

        private List<Long> transferReceiveRecordIds;

        public Long getTransferOrderId() {
            return transferOrderId;
        }

        public void setTransferOrderId(Long transferOrderId) {
            this.transferOrderId = transferOrderId;
        }

        public String getTransferOrderCode() {
            return transferOrderCode;
        }

        public void setTransferOrderCode(String transferOrderCode) {
            this.transferOrderCode = transferOrderCode;
        }

        public List<Long> getTransferReceiveRecordIds() {
            return transferReceiveRecordIds;
        }

        public void setTransferReceiveRecordIds(List<Long> transferReceiveRecordIds) {
            this.transferReceiveRecordIds = transferReceiveRecordIds;
        }
    }
}
