package tech.blacklake.dev.openapi.sdk.event.model.med;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

public class MedResultNotifyProduceTaskDispatchDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long dispatchRequestId;

        public Long getDispatchRequestId() {
            return dispatchRequestId;
        }

        public void setDispatchRequestId(Long dispatchRequestId) {
            this.dispatchRequestId = dispatchRequestId;
        }
    }
}
