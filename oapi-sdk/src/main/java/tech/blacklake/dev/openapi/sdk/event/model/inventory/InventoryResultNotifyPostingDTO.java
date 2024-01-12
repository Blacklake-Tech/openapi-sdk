package tech.blacklake.dev.openapi.sdk.event.model.inventory;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

import java.util.List;

public class InventoryResultNotifyPostingDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private List<Long> resultIds;

        public List<Long> getResultIds() {
            return resultIds;
        }

        public void setResultIds(List<Long> resultIds) {
            this.resultIds = resultIds;
        }
    }
}
