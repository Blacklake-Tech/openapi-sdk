package tech.blacklake.dev.openapi.sdk.event.model.quality;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class QualityResultNotifyChangeQcStatusDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private List<Long> changeLogId;

        public List<Long> getChangeLogId() {
            return changeLogId;
        }

        public void setChangeLogId(List<Long> changeLogId) {
            this.changeLogId = changeLogId;
        }
    }
}
