package tech.blacklake.dev.openapi.sdk.event.model.inventory;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class InventoryResultNotifyInboundDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long inboundOrderId;

        private String inboundOrderCode;

        private List<Long> inboundRecordIds;

        public Long getInboundOrderId() {
            return inboundOrderId;
        }

        public void setInboundOrderId(Long inboundOrderId) {
            this.inboundOrderId = inboundOrderId;
        }

        public String getInboundOrderCode() {
            return inboundOrderCode;
        }

        public void setInboundOrderCode(String inboundOrderCode) {
            this.inboundOrderCode = inboundOrderCode;
        }

        public List<Long> getInboundRecordIds() {
            return inboundRecordIds;
        }

        public void setInboundRecordIds(List<Long> inboundRecordIds) {
            this.inboundRecordIds = inboundRecordIds;
        }
    }
}
