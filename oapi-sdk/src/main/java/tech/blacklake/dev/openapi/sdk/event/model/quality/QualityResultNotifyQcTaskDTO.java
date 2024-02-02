package tech.blacklake.dev.openapi.sdk.event.model.quality;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class QualityResultNotifyQcTaskDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long qcTaskId;

        public Long getQcTaskId() {
            return qcTaskId;
        }

        public void setQcTaskId(Long qcTaskId) {
            this.qcTaskId = qcTaskId;
        }
    }
}
