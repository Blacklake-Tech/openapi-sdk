package tech.blacklake.dev.openapi.sdk.event.model.inventory;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class InventoryResultNotifyTransferIssueDTO extends BaseCallbackDTO {
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

        private List<Long> transferIssueRecordIds;

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

        public List<Long> getTransferIssueRecordIds() {
            return transferIssueRecordIds;
        }

        public void setTransferIssueRecordIds(List<Long> transferIssueRecordIds) {
            this.transferIssueRecordIds = transferIssueRecordIds;
        }
    }
}
