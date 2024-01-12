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
        private List<Long> qcTaskId;

        public List<Long> getQcTaskId() {
            return qcTaskId;
        }

        public void setQcTaskId(List<Long> qcTaskId) {
            this.qcTaskId = qcTaskId;
        }
    }
}
