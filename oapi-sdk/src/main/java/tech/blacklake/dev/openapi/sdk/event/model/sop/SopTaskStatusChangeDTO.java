package tech.blacklake.dev.openapi.sdk.event.model.sop;

import tech.blacklake.dev.openapi.sdk.event.model.BaseCallbackDTO;

public class SopTaskStatusChangeDTO extends BaseCallbackDTO {
    private DataItem data;

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }

    public static class DataItem {
        private Long sopTaskId;

        private String code;

        private String name;

        private Integer bizType;

        private Integer status;

        private SopInfoItem sopInfo;

        public Long getSopTaskId() {
            return sopTaskId;
        }

        public void setSopTaskId(Long sopTaskId) {
            this.sopTaskId = sopTaskId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getBizType() {
            return bizType;
        }

        public void setBizType(Integer bizType) {
            this.bizType = bizType;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public SopInfoItem getSopInfo() {
            return sopInfo;
        }

        public void setSopInfo(SopInfoItem sopInfo) {
            this.sopInfo = sopInfo;
        }
    }

    public static class SopInfoItem {
        private Long id;

        private Boolean snapshotFlag;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Boolean getSnapshotFlag() {
            return snapshotFlag;
        }

        public void setSnapshotFlag(Boolean snapshotFlag) {
            this.snapshotFlag = snapshotFlag;
        }
    }
}
