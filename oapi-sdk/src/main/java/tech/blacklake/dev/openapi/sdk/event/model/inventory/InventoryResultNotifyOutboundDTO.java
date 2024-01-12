package tech.blacklake.dev.openapi.sdk.event.model.inventory;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class InventoryResultNotifyOutboundDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long outboundOrderId;

        private String outboundOrderCode;

        private List<Long> outboundRecordIds;

        public Long getOutboundOrderId() {
            return outboundOrderId;
        }

        public void setOutboundOrderId(Long outboundOrderId) {
            this.outboundOrderId = outboundOrderId;
        }

        public String getOutboundOrderCode() {
            return outboundOrderCode;
        }

        public void setOutboundOrderCode(String outboundOrderCode) {
            this.outboundOrderCode = outboundOrderCode;
        }

        public List<Long> getOutboundRecordIds() {
            return outboundRecordIds;
        }

        public void setOutboundRecordIds(List<Long> outboundRecordIds) {
            this.outboundRecordIds = outboundRecordIds;
        }
    }
}
