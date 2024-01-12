package tech.blacklake.dev.openapi.sdk.event.model.plo;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

public class PloResultNotifyProductionWorkOrderLaunchDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long launchId;

        public Long getLaunchId() {
            return launchId;
        }

        public void setLaunchId(Long launchId) {
            this.launchId = launchId;
        }
    }
}
